<div align="center">

<!-- Animated Banner using SVG -->
<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,11,20&height=200&section=header&text=Java%20String%20Methods&fontSize=50&fontColor=fff&animation=twinkling&fontAlignY=35&desc=Custom%20Implementation%20from%20Scratch&descAlignY=60&descSize=18" width="100%"/>

<!-- Typing animation -->
[![Typing SVG](https://readme-typing-svg.demolab.com?font=Fira+Code&size=22&pause=1000&color=00D9FF&center=true&vCenter=true&width=600&lines=📚+Java+String+Methods;🔧+Re-implemented+from+Scratch;⚡+No+Built-in+Methods+Used!;🎯+Deep+Dive+into+Java+Internals)](https://git.io/typing-svg)

<br/>

<!-- Badges -->
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Concepts-blueviolet?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

</div>

---

## 🚀 What is This Project?

> A hands-on Java project where all the important methods of the `String` class are **re-implemented from scratch** — without using the built-in `String` methods.

This project helps you understand what goes on **under the hood** when you call methods like `.length()`, `.charAt()`, `.indexOf()`, etc.

The `Totalmethods` class takes a `String` in its constructor and converts it to a `char[]` array:
```java
public Totalmethods(String s) {
    value = s.toCharArray();
}
```
> All methods then operate on this `char[]` array — **no built-in String methods used!**

---

## 🗂️ Project Structure

```
Java-String-Methods/
├── src/
│   ├── Allstringmethods.java    # Main class to test all methods
│   └── Totalmethods.java        # Custom implementation of String methods
└── README.md
```

---

## 🛠️ Methods Implemented

<div align="center">

| Method | Description |
|:---|:---|
| `length()` | 📏 Returns the number of characters in the string |
| `charAt(int index)` | 🔍 Returns the character at the given index |
| `indexOf(char x)` | 📌 Returns the first index of a given character |
| `indexOf(String x)` | 📌 Returns the first index of a given substring |
| `lastIndexOf(char x)` | 🔚 Returns the last index of a given character |
| `toUpperCase()` | 🔠 Converts the string to upper case |
| `toLowerCase()` | 🔡 Converts the string to lower case |
| `substring(int start, int end)` | ✂️ Returns a portion of the string |
| `contains(String word)` | ✅ Checks if the string contains a given substring |
| `startsWith(String word)` | ▶️ Checks if the string starts with a given prefix |
| `endsWith(String word)` | ⏹️ Checks if the string ends with a given suffix |

</div>

---

## 📖 How to Run

```bash
# 1️⃣ Clone the repository
git clone https://github.com/Uttkarshchambiyal/java-mini-projects.git

# 2️⃣ Navigate to the project folder
cd java-mini-projects/Java-String-Methods/src

# 3️⃣ Compile the Java files
javac Allstringmethods.java

# 4️⃣ Run the main class
java Allstringmethods
```

> Or open the project in **IntelliJ IDEA** / any Java IDE and run `Allstringmethods.java` directly.

---

## 🎯 Learning Objectives

- 🧠 Understand how Java's `String` class works **internally**
- 🔢 Practice working with **character arrays**
- 💡 Improve **Java fundamentals** and **OOP skills**
- 🏆 Great practice for **interview questions** on Strings!

---

## 👨‍💻 Author

<div align="center">

[![GitHub](https://img.shields.io/badge/GitHub-Uttkarshchambiyal-181717?style=for-the-badge&logo=github)](https://github.com/Uttkarshchambiyal)

</div>

---

<div align="center">

<!-- Animated footer wave -->
<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,11,20&height=120&section=footer" width="100%"/>

<sub>⭐ If you found this helpful, give it a star! ⭐</sub>

</div>
