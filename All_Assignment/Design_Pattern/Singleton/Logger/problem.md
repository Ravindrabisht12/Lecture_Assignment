# Logger Module (Singleton Design Pattern)

## 📌 Problem Statement
You are tasked with developing a **logging module** for a complex software application.  
The logging module must:
- Maintain a **single log file** throughout the application's execution to avoid file access conflicts.
- Ensure **thread-safe access** and prevent multiple instances of the logger.
- Use the **Singleton design pattern** to manage logging operations consistently.

---

## 🎯 Assignment Overview
Your task is to implement the **Logger interface** that:
1. Follows the **Singleton design pattern**.
2. Provides core **logging operations** to record log messages into a file.

---

## 🛠️ Part 1: Singleton + Logger
- **Singleton Design Pattern**  
  - Only **one instance** of the logger can exist.  
  - Enforced with a **private constructor** and a `getInstance()` method.  

- **Required Methods**  
  - `getInstance()` → Returns the singleton instance.  
  - `resetInstance()` → Resets the singleton instance (useful for testing).  

---

## 📝 Part 2: Logging Operations
The logger acts as a **centralized logging utility**.  
All messages (INFO, DEBUG, ERROR, etc.) go to **one log file**.  

### Required Methods:
1. **`void setLogFile(String filePath)`**  
   - Sets the log file path.  
   - Initializes `PrintWriter` with `FileWriter` (append mode).  

2. **`void log(LogLevel level, String message)`**  
   - Logs a message with:
     - Timestamp  
     - Log level  
     - Provided message  
   - Example log entry:  
     ```
     [2025-08-20 22:15:12] [INFO] Application started
     ```
   - Throws `IllegalStateException` if `setLogFile()` is not called before logging.  

3. **`String getLogFile()`**  
   - Returns the current log file path.  

4. **`void flush()`**  
   - Flushes any buffered log entries using `PrintWriter.flush()`.  

5. **`void close()`**  
   - Closes the logger and releases resources using `PrintWriter.close()`.  

---

## ✅ Example Usage
```java
LoggerImpl logger = LoggerImpl.getInstance();
logger.setLogFile("app.log");

logger.log(LogLevel.INFO, "Application started");
logger.log(LogLevel.ERROR, "An error occurred");

logger.flush();
logger.close();
