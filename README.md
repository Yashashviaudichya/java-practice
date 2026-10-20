# ☕ Advanced Java Lab

### Advanced Java Laboratory Experiments & Project Repository

This repository contains a comprehensive collection of practical assignments, laboratory experiments, and an enterprise-grade project developed as part of the **Advanced Java** coursework.

The repository demonstrates core and advanced Java enterprise technologies, including:
- **GUI Programming & Event Handling:** Java Swing & AWT (MVC Architecture).
- **Database Connectivity:** JDBC with MySQL Connector/J and PreparedStatement.
- **Networking & Socket Programming:** TCP Client-Server communication using `ServerSocket` and `Socket`.
- **Distributed Computing:** Java Remote Method Invocation (RMI) with registry and remote interfaces.
- **Server-Side Web Development:** Jakarta Servlets, `HttpSession`, `@WebFilter`, and `@WebListener`.
- **Dynamic Web Presentation:** JavaServer Pages (JSP), Request Dispatching, and Expression Language (EL).
- **Full-Stack Enterprise Project:** **ShopSphere** — an e-commerce platform with a dual web storefront and desktop inventory management interface.

---

## 👤 Author Details

| Field      | Details                                                    |
| ---------- | ---------------------------------------------------------- |
| **Name**   | Yashashvi Audichya                                         |
| **Section**| E                                                          |
| **Roll No.**| 24EGJAD060                                                |
| **Subject**| Advanced Java                                              |
| **Repository**| [java-practice](https://github.com/Yashashviaudichya/java-practice) |

---

## 📂 Repository Structure

```text
java-practice/
│
├── LAB-1/                          # Student Registration Form
│   └── StudentRegistration.java    # Swing GUI with input validation & event handling
│
├── LAB-2/                          # Calculator Application (MVC Pattern)
│   ├── CalculatorModel.java        # Arithmetic logic and zero-division handling
│   ├── CalculatorView.java         # Swing graphical interface components
│   ├── CalculatorController.java   # Event listener binding Model and View
│   └── Main.java                   # Application entry point
│
├── LAB-3/                          # JDBC (Java Database Connectivity)
│   ├── lib/
│   │   └── mysql-connector-j-26.7.0.jar # MySQL JDBC Driver
│   └── src/
│       ├── App.java                # Runner entry point
│       └── JdbcDemo.java           # Connection, PreparedStatement, and ResultSet handling
│
├── LAB-4/                          # Client-Server Socket Programming
│   ├── client.java                 # TCP Client sending and receiving messages
│   └── server.java                 # Multi-stream TCP Server listening on port 5000
│
├── LAB-5/                          # Java RMI (Remote Method Invocation)
│   ├── MyInterface.java            # Remote interface extending java.rmi.Remote
│   ├── MyRemote.java               # Remote object implementation (UnicastRemoteObject)
│   ├── Server.java                 # RMI Registry host on port 1099 with naming rebind
│   └── Client.java                 # Remote lookup and distributed method execution
│
├── LAB-6/                          # Servlets: Session, Filters & Listeners
│   └── servlet/
│       ├── pom.xml                 # Maven WAR configuration (Tomcat 10 / Jakarta EE)
│       └── src/main/
│           ├── java/com/servlet/
│           │   ├── AppListener.java    # @WebListener ServletContext lifecycle handler
│           │   ├── AuthFilter.java     # @WebFilter checking user authentication
│           │   ├── HelloServlet.java   # HTTP GET/POST servlet
│           │   ├── HomeServlet.java    # Authenticated session landing page
│           │   └── LoginServlet.java   # Authentication handler and session creator
│           └── webapp/
│               └── index.html          # Login portal page
│
├── LAB-7/                          # Servlets & JSP Integration (MVC & Dispatching)
│   └── servlet/
│       ├── pom.xml                 # Maven build file
│       └── src/main/
│           ├── java/com/servlet/
│           │   └── HelloServlet.java   # Controller forwarding request attributes
│           └── webapp/
│               ├── index.html          # Entry page redirecting to student.jsp
│               ├── student.jsp         # Form collecting student details
│               └── result.jsp          # View rendering details with Expression Language (${...})
│
├── JAVA_PROJECT/                   # ShopSphere E-Commerce System
│   ├── ShopSphere/                 # Multi-Tier Enterprise Web Application
│   │   ├── database/
│   │   │   └── shopsphere.sql      # Database schema and seed data
│   │   ├── pom.xml                 # Maven project descriptor
│   │   └── src/main/
│   │       ├── java/com/shopsphere/
│   │       │   ├── controller/     # Servlets (Auth, Cart, Checkout, Admin, Orders)
│   │       │   ├── dao/            # Data Access Objects (UserDAO, ProductDAO, etc.)
│   │       │   ├── desktop/        # SwingInventoryViewer desktop GUI
│   │       │   ├── filter/         # Authentication & Admin authorization filters
│   │       │   ├── listener/       # Application lifecycle listener
│   │       │   ├── model/          # Domain models (User, Product, Order, CartItem)
│   │       │   └── util/           # DBConnection pool / MySQL helper
│   │       └── webapp/             # JSP storefront, admin portal, and fragments
│   ├── import_database.bat         # Windows script to import shopsphere.sql to MySQL
│   ├── run_desktop_swing.bat       # Windows script to launch Desktop Inventory Viewer
│   └── start_tomcat.bat            # Windows script to deploy WAR & launch Apache Tomcat
│
└── README.md
```

---

## 🛠️ Technologies Used

| Technology             | Purpose                                           | Used In                  |
| ---------------------- | ------------------------------------------------- | ------------------------ |
| **Java (JDK 17/21)**   | Core programming language                         | All Labs & Project       |
| **Java Swing & AWT**   | Desktop GUI development                           | LAB-1, LAB-2, ShopSphere |
| **JDBC**               | Relational database connectivity via MySQL Driver | LAB-3, ShopSphere        |
| **MySQL**              | Relational database management system             | LAB-3, ShopSphere        |
| **Socket Programming** | Low-level TCP/IP network communication            | LAB-4                    |
| **Java RMI**           | Distributed object computing & method invocation  | LAB-5                    |
| **Jakarta Servlet**    | Server-side HTTP request/response processing      | LAB-6, LAB-7, ShopSphere |
| **Servlet Filters**    | Intercepting HTTP requests for authentication     | LAB-6, ShopSphere        |
| **Servlet Listeners**  | Application and session lifecycle events          | LAB-6, ShopSphere        |
| **JSP & JSTL / EL**    | Dynamic server-side rendering & MVC presentation  | LAB-7, ShopSphere        |
| **Apache Maven**       | Build automation and dependency management        | LAB-6, LAB-7, ShopSphere |
| **Apache Tomcat 10+**  | Jakarta EE compatible servlet container           | LAB-6, LAB-7, ShopSphere |
| **Git & GitHub**       | Version control and repository management         | Entire Repository        |

---

# 📚 Laboratory Experiments

## LAB-1: Student Registration Form

### Objective
To develop a graphical user interface using Java Swing that allows users to enter student information through an interactive registration form with real-time validation.

### Description
Demonstrates fundamental Java Swing components and event-driven programming. It presents a registration window with fields for Name, Roll Number, Gender (radio group), Branch, and Terms & Conditions acceptance. Validates required fields before displaying a formatted confirmation dialog.

### Key Features & Concepts
- **Swing Components:** `JFrame`, `JLabel`, `JTextField`, `JRadioButton`, `ButtonGroup`, `JCheckBox`, `JButton`.
- **Event Handling:** Implementation of `ActionListener` on `actionPerformed(ActionEvent e)`.
- **Validation:** Alert dialogs (`JOptionPane.showMessageDialog`) for empty fields and unaccepted terms.
- **State Reset:** Clear and reset form controls to default state.

---

## LAB-2: Calculator Application (MVC Architecture)

### Objective
To design and implement a desktop calculator application using Java Swing structured with the **Model-View-Controller (MVC)** architectural pattern.

### Description
Decouples application logic into three distinct layers:
1. **Model (`CalculatorModel.java`):** Encapsulates numerical calculation logic (`add`, `subtract`, `multiply`, `divide`) and catches arithmetic exceptions (division by zero).
2. **View (`CalculatorView.java`):** Renders inputs, operator action buttons, and result display with an intuitive layout.
3. **Controller (`CalculatorController.java`):** Intercepts user button interactions, extracts inputs from the View, delegates computations to the Model, and updates the View with results.

### Key Features & Concepts
- Separation of concerns using the MVC design pattern.
- Arithmetic exception handling (`ArithmeticException: Cannot divide by zero`).
- Clean user interface built using Swing components.

---

## LAB-3: Database Connectivity (JDBC & MySQL)

### Objective
To connect a Java standalone application to a MySQL database using JDBC, performing table insertions and result set queries.

### Description
Illustrates the standard JDBC lifecycle using `mysql-connector-j-26.7.0.jar`. It establishes a connection to a MySQL database (`college`), prepares parameterized queries using `PreparedStatement` to insert student records, and traverses the `ResultSet` using `Statement` to print records in tabular format.

### Key Concepts Covered
- **Driver Loading:** `Class.forName("com.mysql.cj.jdbc.Driver")`.
- **Connection Management:** `DriverManager.getConnection()`.
- **Parameterized Queries:** `PreparedStatement` (`insert into student values(?,?,?)`) preventing SQL injection.
- **Data Retrieval:** `Statement.executeQuery()` and `ResultSet.next()` iteration.
- **Resource Management:** Closing connections and statements.

---

## LAB-4: Client-Server Socket Programming

### Objective
To implement network communication between independent Java applications using TCP sockets.

### Description
Demonstrates bidirectional client-server interaction across a TCP/IP network connection:
- **Server (`server.java`):** Binds a `ServerSocket` to port `5000`, blocks on `serverSocket.accept()` awaiting incoming client requests, reads the client's message via `BufferedReader`, and responds with an acknowledgment via `PrintWriter`.
- **Client (`client.java`):** Establishes a `Socket` connection to `localhost:5000`, sends `"Hello Server"`, and prints the server's reply.

### Communication Flow

```text
[Client]                                           [Server]
   │                                                  │
   │  ─── TCP Connection Request (Port 5000) ───────> │ serverSocket.accept()
   │  ─── "Hello Server\n" ─────────────────────────> │ input.readLine()
   │  <── "Hello Client\n" ────────────────────────── │ output.println(...)
   │                                                  │
[Socket Closed]                                    [Socket Closed]
```

---

## LAB-5: Java RMI (Remote Method Invocation)

### Objective
To implement distributed object computing in Java using Remote Method Invocation (RMI), allowing a client program to invoke methods on an object residing in a different JVM.

### Description
Implements a distributed calculation service (`Add`):
1. **Remote Interface (`MyInterface.java`):** Declares remote methods (`add(int a, int b)`) extending `java.rmi.Remote` with `throws RemoteException`.
2. **Remote Implementation (`MyRemote.java`):** Implements `MyInterface` and extends `java.rmi.server.UnicastRemoteObject`.
3. **Server Host (`Server.java`):** Creates an in-process RMI registry on port `1099` using `LocateRegistry.createRegistry(1099)` and registers the remote object via `Naming.rebind("rmi://localhost/Add", obj)`.
4. **Client (`Client.java`):** Looks up the remote reference with `Naming.lookup("rmi://localhost/Add")` and invokes `obj.add(10, 20)` transparently.

### Architecture Workflow

```text
+-----------------------+              +-----------------------+
|        Client         |              |        Server         |
|  (Client.java)        |              |  (Server.java)        |
+-----------┬-----------+              +-----------┬-----------+
            │                                      │
            │  1. Naming.lookup("rmi://.../Add")   │  (registers object)
            v                                      v
    +──────────────────────────────────────────────────────+
    |           RMI Registry (Port 1099)                   |
    +──────────────────────────────────────────────────────+
            │                                      │
            │  2. Returns Remote Stub Reference    │
            v                                      │
    +───────────────────+                          │
    |  Remote Method    | 3. Remote Invocation     v
    |  obj.add(10, 20)  |──────────────────────> [MyRemote]
    |                   |<────────────────────── returns 30
    +───────────────────+
```

---

## LAB-6: Java Servlets — Filters, Sessions & Listeners

### Objective
To build an enterprise Java web application with Jakarta Servlets showcasing session management, request filtering, and application lifecycle events.

### Description
Developed as a Maven web project using the Jakarta Servlet API (`jakarta.servlet`):
- **Session Tracking (`LoginServlet.java`):** Authenticates user credentials and initiates an HTTP session using `request.getSession()`, storing the logged-in username in session scope.
- **Request Filtering (`AuthFilter.java`):** Uses `@WebFilter("/home")` to intercept requests to protected endpoints. Checks for an active session and redirects unauthorized access attempts back to `index.html`.
- **Protected Endpoint (`HomeServlet.java`):** Displays a personalized dashboard utilizing the session attribute.
- **Application Listener (`AppListener.java`):** Implements `ServletContextListener` with `@WebListener` to log application initialization and shutdown events.

---

## LAB-7: Java Servlets & JSP Integration (MVC Pattern)

### Objective
To implement the Model-View-Controller (MVC) pattern by integrating Java Servlets with JavaServer Pages (JSP) using Request Dispatching and Expression Language (EL).

### Description
Demonstrates clean presentation-controller separation:
1. **Input View (`student.jsp`):** HTML form collecting student details (`name`, `email`, `course`, `age`) posting to servlet endpoint `/hello`.
2. **Controller (`HelloServlet.java`):**
   - `doGet`: Redirects users to `student.jsp`.
   - `doPost`: Extracts request parameters, stores them in request scope using `request.setAttribute()`, and forwards the request to the view using `RequestDispatcher.forward()`.
3. **Output View (`result.jsp`):** Dynamically displays student information rendered cleanly with JSP Expression Language syntax: `${name}`, `${email}`, `${course}`, `${age}`.

---

# 🛍️ JAVA_PROJECT — ShopSphere E-Commerce System

## Project Overview

**ShopSphere** is a full-featured, multi-tier e-commerce and inventory management application. It uniquely combines a **Web-based storefront & administration portal** (Jakarta Servlets + JSP + MySQL) with a **Desktop Swing Inventory Viewer**, providing unified business management across web and desktop environments.

### Core Modules & Features

```text
ShopSphere/
├── Web Storefront (Customer Facing)
│   ├── User Registration & Login with Password Hashing
│   ├── Product Catalog & Category Browsing
│   ├── Product Details & Stock Status
│   ├── Persistent Shopping Cart Management
│   ├── Checkout & Multi-Item Order Placement
│   └── Customer Order History Tracking
│
├── Web Admin Portal (Management)
│   ├── Protected by AdminFilter (Role-based security)
│   ├── Administrative Dashboard (Metrics & KPIs)
│   ├── Product Management (CRUD: Add, Edit, Delete, Update Stock)
│   ├── Order Management (View orders, Update status: Pending/Shipped/Delivered)
│   └── User Management (View registered users)
│
└── Desktop Swing Application (Inventory Viewer)
    ├── SwingInventoryViewer.java
    ├── Live database connection to MySQL
    ├── Tabular inventory display with real-time stock levels
    └── Quick refresh and desktop administration capabilities
```

### Architecture & Design Patterns
- **Architectural Pattern:** Model-View-Controller (MVC).
- **Data Access:** Data Access Object (DAO) pattern (`UserDAO`, `ProductDAO`, `CategoryDAO`, `OrderDAO`).
- **Database Layer:** Centralized connection manager (`DBConnection.java`) connecting to MySQL `shopsphere` database.
- **Security:** `AuthenticationFilter` for logged-in user routes; `AdminFilter` for restricted `/admin/*` operations.
- **Persistence:** Relational schema defined in `JAVA_PROJECT/ShopSphere/database/shopsphere.sql`.

---

# ⚙️ System Requirements & Prerequisites

| Software                          | Minimum Version | Purpose                                              |
| --------------------------------- | --------------- | ---------------------------------------------------- |
| **Java Development Kit (JDK)**    | JDK 17 or 21    | Compile and execute Java applications                |
| **Apache Maven**                  | Maven 3.8+      | Building LAB-6, LAB-7, and ShopSphere web packages   |
| **Apache Tomcat**                 | Tomcat 10 or 11 | Servlet container supporting `jakarta.servlet` (EE9+) |
| **MySQL Server**                  | MySQL 8.0+      | Relational database for LAB-3 and ShopSphere         |
| **Git**                           | Latest          | Version control                                      |

Verify your local environment:

```bash
java -version
javac -version
mvn -version
```

---

# 🚀 Compilation and Execution Guide

## Clone the Repository

```bash
git clone https://github.com/Yashashviaudichya/java-practice.git
cd java-practice
```

---

## 1. Running LAB-1 (Student Registration Form)

```bash
cd LAB-1
javac StudentRegistration.java
java StudentRegistration
```

---

## 2. Running LAB-2 (Calculator Application - MVC)

```bash
cd LAB-2
javac *.java
java Main
```

---

## 3. Running LAB-3 (JDBC & MySQL)

Ensure MySQL is running locally and contains a database named `college` with a table `student`:
```sql
CREATE DATABASE IF NOT EXISTS college;
USE college;
CREATE TABLE IF NOT EXISTS student (
    roll INT PRIMARY KEY,
    name VARCHAR(50),
    branch VARCHAR(50)
);
```

Compile and run including the bundled MySQL Connector jar:

**On Linux/macOS:**
```bash
cd LAB-3
javac -cp "lib/*:src" -d bin src/*.java
java -cp "bin:lib/*" App
```

**On Windows:**
```cmd
cd LAB-3
javac -cp "lib/*;src" -d bin src/*.java
java -cp "bin;lib/*" App
```

---

## 4. Running LAB-4 (Client-Server Sockets)

Open two terminal windows:

**Terminal 1 (Start Server):**
```bash
cd LAB-4
javac server.java
java Server
```

**Terminal 2 (Start Client):**
```bash
cd LAB-4
javac client.java
java Client
```

---

## 5. Running LAB-5 (Java RMI Distributed Computing)

Open two terminal windows:

**Terminal 1 (Start Server & RMI Registry):**
```bash
cd LAB-5
javac *.java
java Server
```
*The server automatically initializes the RMI registry on port 1099 and prints `Server is ready...`*

**Terminal 2 (Run Client):**
```bash
cd LAB-5
java Client
```
*Expected output: `Result = 30`*

---

## 6. Running LAB-6 & LAB-7 (Maven Servlet Webapps)

Both experiments are standard Maven web applications configured for Tomcat 10/11.

### For LAB-6:
```bash
cd LAB-6/servlet
mvn clean package
```
Deploy the generated `target/servlet.war` to your Tomcat `webapps/` directory, start Tomcat, and open:
```text
http://localhost:8080/servlet/
```

### For LAB-7:
```bash
cd LAB-7/servlet
mvn clean package
```
Deploy `target/servlet.war` to your Tomcat `webapps/` directory, start Tomcat, and open:
```text
http://localhost:8080/servlet/student.jsp
```

---

## 7. Running JAVA_PROJECT (ShopSphere)

### Step A: Import Database
1. Make sure MySQL service is running.
2. Run the provided script or import via CLI:
   - **Using Batch Script (Windows):** Run `JAVA_PROJECT/import_database.bat`
   - **Using MySQL CLI:**
     ```bash
     mysql -u root -p < JAVA_PROJECT/ShopSphere/database/shopsphere.sql
     ```

### Step B: Build Web Application
```bash
cd JAVA_PROJECT/ShopSphere
mvn clean package
```
This generates `JAVA_PROJECT/ShopSphere/target/ShopSphere.war`.

### Step C: Run on Apache Tomcat
- **Using Batch Script (Windows):** Run `JAVA_PROJECT/start_tomcat.bat`
- **Manual Deployment:** Copy `ShopSphere.war` to your Apache Tomcat `webapps/` directory and start Tomcat.
- Access the web store in your browser:
  ```text
  http://localhost:8080/ShopSphere/
  ```

### Step D: Launch Desktop Swing Inventory Viewer
- **Using Batch Script (Windows):** Run `JAVA_PROJECT/run_desktop_swing.bat`
- **Manual Launch:**
  ```bash
  cd JAVA_PROJECT/ShopSphere
  java -cp "target/classes:target/ShopSphere/WEB-INF/lib/*" com.shopsphere.desktop.SwingInventoryViewer
  ```

---

# 🖥️ Available Automation Scripts

Located inside the `JAVA_PROJECT/` directory for Windows environments:

| Script Name                         | Location        | Purpose                                                         |
| ----------------------------------- | --------------- | --------------------------------------------------------------- |
| `import_database.bat`               | `JAVA_PROJECT/` | Automatically imports `shopsphere.sql` into local MySQL service |
| `run_desktop_swing.bat`             | `JAVA_PROJECT/` | Configures classpath and launches Desktop Swing Inventory GUI   |
| `start_tomcat.bat`                  | `JAVA_PROJECT/` | Deploys `ShopSphere.war` to Tomcat and launches the server      |

---

# 🎯 Learning Outcomes

1. **GUI & MVC Architecture:** Developing interactive desktop interfaces using Java Swing and separating concerns with MVC.
2. **Database Integration:** Working with JDBC drivers, connection handling, parameterized queries, and result sets.
3. **Network Programming:** Establishing low-level TCP client-server communication using Java Sockets.
4. **Distributed Computing:** Building RPC/RMI applications using remote interfaces, registries, and stubs.
5. **Modern Server-Side Java:** Developing scalable web backends with Jakarta Servlets, session management, and filters.
6. **Dynamic Web Presentation:** Coordinating Servlets and JSP views through Request Dispatching and Expression Language.
7. **Enterprise Engineering:** Architecting full-stack solutions with dual web and desktop clients, DAOs, and database automation.

---

## 📄 License & Academic Note

This repository is maintained for educational and academic purposes as part of the **Advanced Java Laboratory** curriculum.

**Developed with ☕ by Yashashvi Audichya.**
