# Desing Pattern in Java

This repository contains major design patterns. A running example with a simple implementation of the **Iterator Design Pattern**, based on the "BookShelf" example from *Design Patterns: Elements of Reusable Object-Oriented Software (GoF)*.

## 📦 Project Structure

```
DESIGN-PATTERN-JAVA/
├── out/                  # Compiled .class files go here
├── src/
│   └── iterator/
│       ├── Book.java
│       ├── BookShelf.java
│       ├── BookShelfIterator.java
│       └── Main.java
├── UML.png               # Class diagram (UML)
├── sumup.png             # Summary or output image
└── .gitignore
```

* Java source files are under `src/iterator/`
* Output (`.class`) files are generated in `out/iterator/`
* The main class is `iterator.Main`

---

## 💡 What is the Iterator Pattern?

> The **Iterator Pattern** provides a way to access the elements of an aggregate object **sequentially without exposing its underlying representation**.

In this project:

* `BookShelf` is a collection of `Book` objects.
* `BookShelf` implements `Iterable<Book>`, so you can use a `for-each` loop.
* `BookShelfIteratorimplements `Iterator<Book>` to define how to traverse the shelf.

---

## 💪 How to Compile and Run

### Easiest (Main does not have package name)

```
# すべて out にコンパイル
javac -d out Sample/*.java

# out/Main.class ができる
# -cp はclass pathということoutからバイナリファイル(.class)を探し始めると言う意味。
java -cp out Main
```

## Alternate method
### ✅ Step 1: Compile all Java files

From the root of the project directory:

```bash
javac -d out src/iterator/*.java
```

* `-d out`: puts compiled `.class` files under the `out/` directory.
* The output will be in: `out/iterator/Main.class`, `out/iterator/Book.class`, etc.

### ✅ Step 2: Run the Main class

Still in the project root:

```bash
java -cp out iterator.Main
```

* `-cp out`: adds the `out/` folder to the classpath.
* `iterator.Main`: refers to the class `Main` in the package `iterator`.

---

## 🧪 Sample Output

When you run the program, it will display:

```
Around the World in 80 Days
Bible
Cinderella
Daddy-Long-Legs

Around the World in 80 Days
Bible
Cinderella
Daddy-Long-Legs
```

* The first block is using a manual `Iterator`
* The second block is using a `for-each` loop

---

## 🧹 .gitignore (Example)

Make sure your `.gitignore` includes the following to keep your repo clean:

```gitignore
# Compiled classes
*.class

# Output directory
/out/

# IntelliJ / VSCode
.idea/
*.iml
.vscode/

# macOS
.DS_Store
```

---

## ✅ Next Steps

You can follow the same folder structure and compilation method for implementing other design patterns such as:

* `singleton/`
* `factory/`
* `observer/`

Each in its own subpackage under `src/`, compiled to the same `out/` directory.

---

## 📚 References

* GoF: *Design Patterns – Elements of Reusable Object-Oriented Software*
* [Java Docs: Iterable & Iterator](https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html)
