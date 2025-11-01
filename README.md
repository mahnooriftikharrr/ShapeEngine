<!-- 🎨 Animated Header -->

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=26&duration=3000&pause=800&color=FF69B4&center=true&vCenter=true&width=800&lines=🎨+Game+Engine;Inheritance;Object-Oriented+Design+in+Java;Polymorphism+%7C+Inheritance+%7C+JUnit+Testing+💻✨" alt="Typing Animation" />
</p>

---

# 🧩 Inheritance and Shapes – Object-Oriented Java Project

This project showcases **object-oriented programming (OOP)** principles through the design of a **2D game engine** component that models, renders, and interacts with geometric shapes like rectangles and ellipses.

It demonstrates practical applications of **inheritance, polymorphism, method overriding, abstract classes, and JUnit testing**, forming the foundation of reusable and scalable software design.

---

## 💡 Overview

The program defines a shape hierarchy used to build a simple **scene-rendering engine** capable of:

* Loading shape data from input files
* Drawing scenes using Java’s **Graphics** API
* Handling click detection through the `contains()` method
* Using **polymorphism** to render and manage multiple shape types dynamically

The project simulates how a **game engine or graphics editor** might manage and render shapes efficiently while allowing easy extension for new shape types.

---

## ⚙️ Core Concepts Implemented

| Concept                              | Description                                                                                                                |
| ------------------------------------ | -------------------------------------------------------------------------------------------------------------------------- |
| 🧱 **Inheritance Hierarchies**       | `Ellipse` and `Rectangle` extend the abstract superclass `Shape`. Common properties (color, position, fill) are inherited. |
| 🔁 **Polymorphism**                  | Methods like `draw()` and `contains()` are called dynamically depending on object type (`Ellipse` or `Rectangle`).         |
| 🧮 **Abstract Classes & Methods**    | The `Shape` class defines abstract methods (`draw()`, `contains()`) implemented differently by each subclass.              |
| 🎨 **Encapsulation**                 | All attributes (position, color, fill state) are protected/private with controlled access through getter/setter methods.   |
| 🧠 **Method Overriding**             | Subclasses override `toString()` and `draw()` for shape-specific behavior.                                                 |
| 🧩 **Downcasting & Dynamic Binding** | Safely converts generic `Shape` objects to their specific subclasses when needed.                                          |
| ⚙️ **File I/O**                      | Reads shape data from text files and reconstructs complete scenes dynamically.                                             |
| 🧪 **JUnit Testing**                 | Used for unit-testing each class and verifying correctness of `toString()`, `contains()`, and other methods.               |

---

## 🧠 Data Structures Used

| Data Structure                    | Purpose                                                                                   |
| --------------------------------- | ----------------------------------------------------------------------------------------- |
| 📋 **ArrayList<Shape>**           | Stores all shapes loaded into the `Scene` — enabling dynamic size and polymorphic access. |
| 🧱 **2D Coordinate System**       | Shape positions (`x`, `y`) are used for placement and hit detection.                      |
| 🎨 **Graphics Object (Java AWT)** | Renders visual output of shapes on a canvas using polymorphic `draw()` calls.             |
| 🧾 **Strings & File Readers**     | Parse input lines from `.txt` files and generate shape instances dynamically.             |

---

## 🧰 Classes Overview

| Class              | Role                                                                                                    |
| ------------------ | ------------------------------------------------------------------------------------------------------- |
| **Shape.java**     | Abstract superclass defining common fields and abstract methods (`draw()`, `contains()`, `toString()`). |
| **Rectangle.java** | Subclass representing rectangular shapes; implements custom `contains()` and `draw()` logic.            |
| **Ellipse.java**   | Subclass representing ellipses, defined by half-width (`a`) and half-height (`b`).                      |
| **Scene.java**     | Manages a list of shapes, loads data from files, and draws scenes using polymorphism.                   |
| **Main.java**      | Entry point – loads a scene, renders it to an image, and saves it as a `.png` file.                     |

---

## 🖼️ Example Input File

Example: `simple.txt`

```
R 0 0 true 255 255 255 1024 768
R 200 200 true 0 255 0 200 300
E 300 500 false 255 0 0 200 100
R 350 300 false 0 0 0 500 300
```

Each line defines:
`<ShapeType> <x> <y> <filled> <R> <G> <B> <width> <height>`

* **R** = Rectangle
* **E** = Ellipse

---

## 🧮 How the Algorithm Works

1. **File Parsing:**
   The `Scene.load()` method reads each line, determines the shape type (`E` or `R`), and constructs the corresponding object.

2. **Polymorphic Rendering:**
   The `Scene.draw()` method loops through each shape and calls its `draw(Graphics g)` method — automatically invoking the correct version.

3. **Click Detection:**
   The `contains(x, y)` method in each subclass determines whether a point lies inside that shape.

4. **Saving Scenes:**
   The `save()` method writes shape data back into a file in the same format, using each shape’s overridden `toString()` method.

---

## 🧩 Sample Output

<p align="center">
  <img width="1024" height="768" alt="image" src="https://github.com/user-attachments/assets/47dba3dc-07ad-4f00-97b2-b1fad4aade39" />

</p>

Each shape is drawn using its color, fill state, and coordinates. The image is then saved as a `.png` file via `ImageIO.write()`.

---

## 🧪 Testing

The project includes **JUnit test cases** for each class:

| Test File            | Purpose                                                                                                                  |
| -------------------- | ------------------------------------------------------------------------------------------------------------------------ |
| `EllipseTest.java`   | Tests shape construction, `toString()`, and `contains()` correctness.                                                    |
| `RectangleTest.java` | Tests geometry logic and proper `toString()` formatting.                                                                 |
| `SceneTest.java`     | Ensures all shapes load correctly, `findAllContaining()` returns correct results, and `save()` preserves data integrity. |

---

## 🧭 Learning Outcomes

✅ Deepened understanding of **object-oriented software design**
✅ Mastered **inheritance hierarchies** and **method overriding**
✅ Applied **polymorphism** to simplify and generalize rendering logic
✅ Implemented **mathematical logic** for hit detection (ellipse equation)
✅ Strengthened skills in **Java file I/O**, **unit testing**, and **code documentation (Javadoc)**
✅ Practiced **code reusability**, **abstraction**, and **encapsulation** in a scalable system

---

## 💻 Technical Skills Gained

* Java Programming (OOP, Inheritance, Abstract Classes)
* Data Structures: ArrayList, 2D Coordinate Modeling
* Algorithms: Greedy Traversal, Geometric Containment
* Graphics Rendering with Java AWT
* Software Testing with JUnit
* File Parsing & String Manipulation
* UML Diagram Interpretation & Implementation

---

## 👩🏻‍💻 Author

**Mahnoor Iftikhar**
📍 *Pacific Lutheran University* — CS & Economics Double Major, Data Science Minor
💡 Enthusiastic about **software engineering, graphics programming, and algorithmic design.**

📫 [LinkedIn](https://www.linkedin.com/in/mahnooriftikharrr)
📧 [mahnooriftikharr@gmail.com](mailto:mahnooriftikharr@gmail.com)
