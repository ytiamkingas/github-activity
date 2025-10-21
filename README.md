# 🚀 GitHub User Activity Viewer

A Spring Boot application to fetch and display **recent GitHub activity** for any user — via REST API or CLI.  
It supports filtering, caching, pagination, and graceful error handling.

---

## ✨ Features

- 🔍 Fetch GitHub activity by username
- 🎯 Filter by event type (`PushEvent`, `ForkEvent`, etc.)
- 📄 Pagination support
- ⚡ In-memory caching (with TTL)
- ⏱️ Simple rate limiting to prevent API abuse
- 🧩 Clean error messages for invalid usernames
- 💻 CLI mode — run from terminal directly!

---

## 🧰 Technologies

- Spring Boot 3.x  
- Java 17+  
- REST API (GitHub)  
- Spring Caching (SimpleCache/Caffeine)  

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the repository
```bash
git clone https://github.com/<your-username>/github-activity.git
cd github-activity
