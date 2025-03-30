# 🎯 Homework 4: Advanced Structural Patterns – Singleton & Adapter 🎯

## 📌 Project Overview  

This project demonstrates the application of two important structural design patterns: **Singleton** and **Adapter**.

- **Singleton** 🏆 is used to implement a global configuration manager (`ConfigurationManager`), ensuring a single instance that provides access to configuration settings.  
- **Adapter** 🔄 is applied to integrate a legacy chat system (`LegacyChatService`) into a modern chat interface (`ChatService`), converting calls from the new interface to the legacy system.

---

## 📂 Project Structure  

The project consists of the following files:

- **`ConfigurationManager.java`** 🛠️  
  Implements the Singleton pattern for a global configuration manager. It loads and stores key-value configuration settings and provides methods for retrieving and printing them.

- **`ConfigManagerDemo.java`** 🖥️  
  A demo class to test the functionality of `ConfigurationManager`.

- **`ChatService.java`** 💬  
  Defines the interface for the modern chat system with a `sendMessage(String message)` method.

- **`LegacyChatService.java`** 🏛️  
  Simulates an old chat system. The `sendLegacyMessage(String message)` method outputs messages with the prefix `"Legacy Chat:"`.

- **`ChatServiceAdapter.java`** 🔧  
  An adapter that implements `ChatService` and wraps around `LegacyChatService`, converting calls from the new interface to the legacy system.

- **`ChatAdapterDemo.java`** 🎭  
  A demo class to test the adapter, sending a message through `ChatServiceAdapter`.

---

## ✅ Prerequisites  

- Installed **Java Development Kit (JDK)**  
- Access to a **terminal/command prompt**  

---

## ⚙️ Compilation and Setup  

1. Place all files in a single directory (e.g., `src`).  
2. Open a terminal and navigate to the directory:  
   ```bash
   cd path/to/src
