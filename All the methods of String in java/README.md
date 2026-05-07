# 📚 Java String Methods — Custom Implementation

A hands-on Java project where all the important methods of the `String` class are **re-implemented from scratch** without using the built-in `String` methods. This project helps you understand what goes on *under the hood* when you call methods like `.length()`, `.charAt()`, `.indexOf()`, etc.

---

## 🚀 What is This Project?

In Java, the `String` class comes with a rich set of built-in methods. But do you know how they actually work internally?

This project manually implements the most commonly used `String` methods using a **character array (`char[]`)** as the underlying data structure — just like how Java's own `String` class works internally!

---

## 🗂️ Project Structure

```
Java-String-Methods/
├── src/
│   ├── Allstringmethods.java   # Main class to test all methods
│   └── Totalmethods.java       # Custom implementation of String methods
└── README.md
```

---

## 🛠️ Methods Implemented

| Method | Description |
|---|---|
| `length()` | Returns the number of characters in the string |
| `charAt(int index)` | Returns the character at the given index |
| `indexOf(char x)` | Returns the first index of a given character |
| `indexOf(String x)` | Returns the first index of a given substring |
| `lastIndexOf(char x)` | Returns the last index of a given character |
| `toUpperCase()` | Converts the string to upper case |
| `toLowerCase()` | Converts the string to lower case |
| `substring(int start, int end)` | Returns a portion of the string |
| `contains(String word)` | Checks if the string contains a given substring |
| `startsWith(String word)` | Checks if the string starts with a given prefix |
| `endsWith(String word)` | Checks if the string ends with a given suffix |

---

## 💡 How It Works

The `Totalmethods` class takes a `String` in its constructor and converts it to a `char[]` array:

```java
public Totalmethods(String s) {
    value = s.toCharArray();
}
```

All methods then operate on this `char[]` array — no built-in String methods used!

---

## 📖 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/Uttkarshchambiyal/java-mini-projects.git
   ```
2. Open the project in **IntelliJ IDEA** or any Java IDE.
3. Navigate to `Java-String-Methods/src/`.
4. Run `Allstringmethods.java`.

---

## 🎯 Learning Objectives

- Understand how Java's `String` class works internally
- Practice working with character arrays
- Improve Java fundamentals and OOP skills
- Great practice for **interview questions** on Strings!

---

## 👨‍💻 Author

**Uttkarsh Chambiyal**  
🔗 [GitHub Profile](https://github.com/Uttkarshchambiyal)
