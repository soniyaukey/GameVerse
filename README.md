# 🚀 GameVerse Hub - Ultimate Gaming Platform

<div align="center">

🎮 **Your Ultimate Gaming Universe Awaits!**

GameVerse Hub is a full-stack gaming platform that combines a powerful **Spring Boot backend** with interactive **HTML5 browser games** and external game integrations.

✨ Play offline classics • 🌐 Explore online games • 🏆 Track scores • ⭐ Leave reviews • 👨‍💻 Showcase your own games

**14+ Games • JWT Auth • MySQL/H2 • Responsive UI**

</div>

---

## ✨ Key Features

| Feature | Description | Status |
|--------|-------------|--------|
| 🎯 Offline Games | Snake, Tic-Tac-Toe, Memory Match, RPS, Quiz, Breakout & more | ✅ Live |
| 🌐 Online Games | Integration with Poki, CrazyGames | ✅ Live |
| 🔐 Authentication | Secure JWT Login/Register | ✅ Live |
| 🏆 Leaderboards | Track high scores | 🔄 Planned |
| ⭐ Reviews | Rate & review games | 🔄 Planned |
| ❤️ Favorites | Save games | 🔄 Planned |
| 👨‍💻 Developer Hub | Upload your own games | 🔄 Planned |
| 📱 Responsive UI | Works on all devices | ✅ Live |

---

## 🛠 Tech Stack

### 🔹 Backend
- Spring Boot 3.2.0  
- Java 21  
- Spring Security  
- JWT Authentication  
- JPA / Hibernate  

### 🔹 Database
- MySQL (Production)  
- H2 (Development)  

### 🔹 Frontend
- HTML5  
- Tailwind CSS  
- JavaScript  
- Canvas API  

---

## ⚡ Quick Start

### 📌 Prerequisites
- Java 21+
- Maven 3.8+
- MySQL (optional)

---

### 🚀 Setup Steps

```bash
git clone https://github.com/soniyaukey/gameversehub.git
cd gameversehub
mvn clean install🚀 GameVerse Hub - Ultimate Gaming Platform

🎮 Your Ultimate Gaming Universe Awaits!

GameVerse Hub is a full-stack gaming platform that combines a powerful Spring Boot backend with interactive HTML5 browser games and external game integrations.

✨ Play offline classics
🌐 Explore online games
🏆 Track scores
⭐ Leave reviews
👨‍💻 Showcase your own games

14+ Games • JWT Auth • MySQL/H2 • Responsive UI

✨ Key Features
| Feature             | Description                                                  | Status     |
| ------------------- | ------------------------------------------------------------ | ---------- |
| 🎯 Offline Games    | Snake, Tic-Tac-Toe, Memory Match, RPS, Quiz, Breakout & more | ✅ Live     |
| 🌐 Online Games     | Integration with Poki, CrazyGames                            | ✅ Live     |
| 🔐 Authentication   | Secure JWT Login/Register                                    | ✅ Live     |
| 🏆 Leaderboards     | Track high scores                                            | 🔄 Planned |
| ⭐ Reviews           | Rate & review games                                         | 🔄 Planned |
| ❤️ Favorites        | Save games                                                   | 🔄 Planned |
| 👨‍💻 Developer Hub | Upload your own games                                           | 🔄 Planned |
| 📱 Responsive UI    | Works on all devices                                         | ✅ Live     |

🛠 Tech Stack
🔹 Backend
Spring Boot 3.2.0
Java 21
Spring Security
JWT Authentication
JPA / Hibernate
🔹 Database
MySQL (Production)
H2 (Development)
🔹 Frontend
HTML5
Tailwind CSS
JavaScript
Canvas API
⚡ Quick Start
📌 Prerequisites
Java 21+
Maven 3.8+
MySQL (optional)
🚀 Setup Steps
git clone https://github.com/soniyaukey/gameversehub.git
cd gameversehub
mvn clean install
⚙️ Configure Database

Edit:
src/main/resources/application.properties

MySQL Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/gameverse
spring.datasource.username=root
spring.datasource.password=root
H2 (Development)
# spring.datasource.url=jdbc:h2:mem:gameverse
# spring.h2.console.enabled=true
▶️ Run the Project
mvn spring-boot:run

Server runs at:
👉 http://localhost:8082

🔗 Application Links
🎮 Home: http://localhost:8082/
🕹️ Games: http://localhost:8082/pages/games.html
🔐 Login: http://localhost:8082/pages/login.html
📊 H2 Console: http://localhost:8082/h2-console
📸 Screenshots
🏠 Landing Page
🎮 Games Grid
🐍 Snake Game
🔌 API Documentation

Base URL:

http://localhost:8082/api
| Endpoint       | Method | Description   |
| -------------- | ------ | ------------- |
| /auth/register | POST   | Register user |
| /auth/login    | POST   | Login user    |
| /games         | GET    | Get all games |
| /games/{id}    | GET    | Game details  |
| /scores        | POST   | Submit score  |
| /reviews       | POST   | Add review    |

🔐 Auth Header
Authorization: Bearer <JWT_TOKEN>
📂 Project Structure
gameversehub/
├── src/main/java/com/gameversehub/
│   ├── controller/
│   ├── service/
│   ├── model/
│   └── security/
├── src/main/resources/
│   ├── static/games/
│   ├── static/pages/
│   └── application.properties
└── pom.xml

🐳 Docker (Coming Soon)
FROM openjdk:21-jdk-slim
COPY target/gameversehub.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/app.jar"]

📋 Future Enhancements
1.Leaderboards
2.Reviews & Ratings
3.Favorites System
4.Multiplayer Games
5.Developer Upload System
6.PWA Support
7.React Frontend

🤝 Contributing
1.Fork the repository
2.Create a branch
3.Commit changes
4.Push to GitHub
5.Open Pull Request

👩‍💻 Author

Soniya Ukey
🔗 GitHub: https://github.com/soniyaukey


📄 License

This project is licensed under the MIT License.


⭐ Support

If you like this project, give it a ⭐ on GitHub!



Made with ❤️ for gamers 🎮
![image Alt](https://github.com/soniyaukey/GameVerse/blob/8ce8a8523ad3d9f583f9ce7bfb41933ead9290ba/Screenshot%202026-04-14%20185238.png)
