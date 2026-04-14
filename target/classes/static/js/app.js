// ===============================
// 🎮 LOAD ALL GAMES (games.html)
// ===============================
async function loadGames() {

    const games = await getGames();
    const container = document.getElementById("gamesContainer");

    container.innerHTML = "";

    games.forEach(game => {

        const card = `
            <div class="card fade-in">
                <img src="${game.thumbnail}" class="game-img"/>
                <h3 class="text-xl font-bold mt-2">${game.title}</h3>
                <p class="text-gray-400">${game.category}</p>

                <button onclick="playGame(${game.id})"
                        class="play-btn">
                        ▶ Play
                </button>
            </div>
        `;

        container.innerHTML += card;
    });
}

// ===============================
// ▶ PLAY BUTTON LOGIC
// ===============================
async function playGame(id) {

    const game = await getGameById(id);

    if (game.gameType === "OFFLINE") {
        // 👉 go to play page
        window.location.href = `play.html?id=${id}`;
    } else {
        // 👉 open external site
        window.open(game.gameUrl, "_blank");
    }
}

// ===============================
// 🎮 LOAD GAME (play.html)
// ===============================
async function loadGame() {

    const params = new URLSearchParams(window.location.search);
    const id = params.get("id");

    const game = await getGameById(id);

    const container = document.getElementById("gameContainer");

    if (game.gameType === "OFFLINE") {

        container.innerHTML = `
            <iframe 
                src="../games/${game.gamePath}/index.html"
                width="100%" 
                height="500px"
                style="border:none;">
            </iframe>
        `;

    } else {

        container.innerHTML = `
            <h2>Redirecting to game...</h2>
        `;

        window.open(game.gameUrl, "_blank");
    }
}

// ===============================
// 🏆 SAVE SCORE (call from game)
// ===============================
function submitScore(score, gameId) {

    const userId = 1; // 🔥 replace with logged-in user later

    saveScore({
        userId: userId,
        gameId: gameId,
        score: score
    });

    alert("Score Saved!");
}