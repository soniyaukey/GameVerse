const API_BASE = "/api";

// 🔹 GET ALL GAMES
async function getGames() {
    const res = await fetch(`${API_BASE}/games`);
    return res.json();
}

// 🔹 GET GAME BY ID
async function getGameById(id) {
    const res = await fetch(`${API_BASE}/games/${id}`);
    return res.json();
}

// 🔹 SAVE SCORE
async function saveScore(data) {
    await fetch(`${API_BASE}/scores`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    });
}

// 🔹 GET REVIEWS
async function getReviews(gameId) {
    const res = await fetch(`${API_BASE}/reviews/game/${gameId}`);
    return res.json();
}

// 🔹 ADD REVIEW
async function addReview(data) {
    await fetch(`${API_BASE}/reviews`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    });
}