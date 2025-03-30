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
Compile all Java files:

bash
Копировать
Редактировать
javac *.java
🚀 Usage
🎯 Running the ConfigurationManager Demo
Run the following command:

bash
Копировать
Редактировать
java ConfigManagerDemo
📌 Expected Output:

rust
Копировать
Редактировать
maxPlayers: 100
Configuration settings:
maxPlayers -> 100
defaultLanguage -> en
gameDifficulty -> medium
💬 Running the ChatServiceAdapter Demo
Run the following command:

bash
Копировать
Редактировать
java ChatAdapterDemo
📌 Expected Output:

yaml
Копировать
Редактировать
Legacy Chat: Hello world!
📝 Class Descriptions
ConfigurationManager.java
Implements the Singleton pattern with lazy initialization. Stores configuration settings as key-value pairs and provides methods to retrieve and display them.

ConfigManagerDemo.java
Demonstrates how to retrieve configuration values and print all settings using ConfigurationManager.

ChatService.java
Defines an interface for a modern chat system.

LegacyChatService.java
Simulates an outdated chat system, which outputs messages prefixed with "Legacy Chat:".

ChatServiceAdapter.java
Adapts calls from the ChatService interface to the LegacyChatService, allowing modern systems to interact with old implementations.

ChatAdapterDemo.java
Shows how the adapter can be used to send messages via the legacy chat system while maintaining compatibility with the new interface.

🏗️ Best Practices & Design Patterns
Singleton Pattern 🏆

Ensures a single, globally accessible instance of ConfigurationManager.

Prevents unnecessary object creation and ensures centralized configuration management.

Adapter Pattern 🔄

Acts as a bridge between incompatible interfaces.

Enables seamless integration of legacy code into modern applications without modifying the original source code.

Separation of Concerns ✅

Each class is designed with single responsibility, making the code more modular, maintainable, and scalable.

📜 License
This project is licensed under the MIT License. See the LICENSE file for details.
