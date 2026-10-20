# ☕ Advance Java Lab

### Advanced Java Laboratory Experiments & Project Repository

This repository contains a collection of practical assignments, laboratory experiments, and project work developed as part of the **Advanced Java** coursework.

The repository demonstrates the implementation of various Java programming concepts, including graphical user interface development, event handling, database connectivity using JDBC, client-server communication, server-side programming, and Java Servlet technology.

It also includes **ShopSphere**, a Java project developed as part of the coursework.

---

## 👤 Author Details

| Field      | Details            |
| ---------- | ------------------ |
| Name       | Yashashvi Audichya |
| Section    | E                  |
| Roll No.   | 24EGJAD06O         |
| Subject    | Advanced Java      |
| Repository | java practice      |

---

## 📂 Repository Structure

```text
Advance-Java-lab/
│
├── LAB-1/                  # Student Registration Form
│
├── LAB-2/                  # Calculator Application
│
├── LAB-3/                  # JDBC
│
├── LAB-4/                  # Client-Server Programming
│
├── LAB-5/                  # Server Class
│
├── LAB-6/                  # Java Servlet
│
├── LAB-7/                  # Java Servlet
│
├── JAVA_PROJECT/           # ShopSphere
│
├── import_database.bat
│
├── run_desktop_swing.bat
│
├── start_tomcat.bat
│
└── README.md
```

---

## 🛠️ Technologies Used

The laboratory experiments cover different aspects of Java development.

| Technology         | Purpose                                   |
| ------------------ | ----------------------------------------- |
| Java               | Core programming language                 |
| Java Swing         | Desktop GUI development                   |
| Java AWT           | GUI components and event handling         |
| JDBC               | Database connectivity                     |
| SQL                | Database operations                       |
| Socket Programming | Client-server communication               |
| Jakarta Servlet    | Server-side web development               |
| JSP                | Dynamic web pages                         |
| Apache Tomcat      | Servlet container                         |
| Git & GitHub       | Version control and repository management |

---

# 📚 Laboratory Experiments

## LAB-1: Student Registration Form

### Objective

To develop a graphical user interface using Java Swing that allows users to enter student information through a registration form.

### Description

This experiment demonstrates GUI development using Java Swing. It provides an interactive student registration interface where users can enter their details.

The application demonstrates the use of form components, event handling, input validation, and user interaction.

### Features

- Student registration interface.
- Input fields for student information.
- Form validation.
- Reset button functionality.
- Submission confirmation dialog.
- Formatted display of submitted details.

### Concepts Covered

- Java Swing components.
- Event handling.
- ActionListener.
- Form validation.
- GUI layout management.
- Dialog boxes.

---

## LAB-2: Calculator Application

### Objective

To design and implement a GUI-based calculator application using Java Swing.

### Description

This experiment focuses on developing a calculator that performs basic arithmetic operations through a graphical interface.

Users can enter numeric values, select an arithmetic operation, and view the calculated result.

### Features

- Addition (+).
- Subtraction (-).
- Multiplication (\*).
- Division (/).
- Numeric input fields.
- Result display.
- Invalid input handling.
- Division by zero error handling.

### Concepts Covered

- Java Swing.
- ActionListener.
- Arithmetic operations.
- Exception handling.
- Event-driven programming.
- GUI components.

---

## LAB-3: JDBC (Java Database Connectivity)

### Objective

To understand database connectivity in Java using JDBC.

### Description

This experiment introduces JDBC, which allows Java applications to communicate with relational database management systems.

It focuses on understanding how Java programs establish database connections and interact with databases.

### Concepts Covered

- JDBC architecture.
- Database connectivity.
- JDBC drivers.
- Connection management.
- SQL integration with Java.
- Database interaction.

### General JDBC Workflow

1. Configure the required JDBC driver.
2. Establish a database connection.
3. Create a SQL statement.
4. Execute the required database operation.
5. Process the result, if applicable.
6. Close database resources.

---

## LAB-4: Client-Server Programming

### Objective

To understand communication between client and server applications using Java.

### Description

This experiment introduces client-server architecture, where two applications communicate over a network.

The client initiates communication, while the server listens for incoming connection requests.

It demonstrates fundamental networking concepts and communication between separate Java programs.

### Concepts Covered

- Java networking.
- Client-server architecture.
- Socket programming.
- Communication protocols.
- Data transmission.
- Input and output streams.

### Basic Communication Flow

```text
        CLIENT
           |
           | Connection Request
           |
           v
        SERVER
           |
           | Response
           |
           v
        CLIENT
```

---

## LAB-5: Server Class

### Objective

To study and implement server-side programming concepts using Java.

### Description

This experiment focuses on the implementation of a server class and its role in client-server communication.

It provides practical exposure to the server-side components of a Java networking application.

### Concepts Covered

- Server-side programming.
- Java networking.
- ServerSocket class.
- Socket communication.
- Connection handling.
- Input/output streams.

### General Server Workflow

```text
Start Server
     |
     v
Initialize Server Socket
     |
     v
Wait for Client Connection
     |
     v
Accept Connection
     |
     v
Perform Communication
     |
     v
Close Resources
```

---

## LAB-6: Java Servlet

### Objective

To understand server-side web application development using Java Servlet technology.

### Description

This experiment introduces Java Servlets and their role in handling HTTP requests and generating responses.

Servlets execute on the server and allow Java applications to process requests received from web browsers or other HTTP clients.

### Concepts Covered

- Servlet architecture.
- Servlet lifecycle.
- HttpServlet class.
- HTTP request and response.
- GET and POST methods.
- Servlet URL mapping.
- Apache Tomcat.

### Servlet Lifecycle

```text
Servlet Loading
      |
      v
Initialization
    init()
      |
      v
Request Processing
   service()
      |
      v
Destruction
   destroy()
```

---

## LAB-7: Java Servlet

### Objective

To gain further practical experience in Java Servlet-based web application development.

### Description

This experiment continues the study of Java Servlet technology and its application in server-side request processing.

It provides additional practice with Java web application concepts and servlet-based development.

### Relevant Concepts

- Jakarta Servlet API.
- HTTP request handling.
- HttpServletRequest.
- HttpServletResponse.
- Servlet mapping.
- Web application deployment.
- Apache Tomcat.

---

# 🛍️ JAVA_PROJECT — ShopSphere

## Project Overview

**ShopSphere** is the main Java project included in this Advanced Java repository.

The project is maintained separately from the individual laboratory experiments under the `JAVA_PROJECT` directory.

### Project Information

| Field                | Description      |
| -------------------- | ---------------- |
| Project Name         | ShopSphere       |
| Programming Language | Java             |
| Project Category     | Advanced Java    |
| Project Directory    | JAVA_PROJECT     |
| Purpose              | Academic Project |

### Project Directory

```text
JAVA_PROJECT/
    |
    └── ShopSphere Project Files
```

The project source files and supporting resources are maintained within the `JAVA_PROJECT` directory.

---

# ⚙️ System Requirements

To compile and execute the laboratory experiments, the following software may be required depending on the experiment.

| Software                          | Purpose                        |
| --------------------------------- | ------------------------------ |
| Java Development Kit (JDK)        | Java compilation and execution |
| VS Code / Eclipse / IntelliJ IDEA | Development environment        |
| Apache Tomcat                     | Running Servlet applications   |
| JDBC Driver                       | Database connectivity          |
| Database Server                   | JDBC experiments               |
| Git                               | Version control                |

Verify Java installation using:

```bash
java -version
javac -version
```

---

# 🚀 Installation and Execution

## Step 1: Clone the Repository

Open a terminal and execute:

```bash
git clone https://github.com/yashvar001/Advance-Java-lab.git
```

Navigate to the project directory:

```bash
cd Advance-Java-lab
```

## Step 2: Open in VS Code

```bash
code .
```

## Step 3: Run Java Swing Experiments

Navigate to the required lab directory and compile its Java source files.

For example:

```bash
cd LAB-1
```

Compile the relevant Java file:

```bash
javac YourClassName.java
```

Run the compiled application:

```bash
java YourClassName
```

Replace `YourClassName` with the actual class containing the main method.

## Step 4: Run JDBC Experiments

For database-related experiments:

1. Configure the required database server.
2. Add the appropriate JDBC driver.
3. Configure the database connection settings.
4. Compile and execute the relevant Java program.

The repository also includes a database import script:

```bat
import_database.bat
```

Review its configuration and database requirements before executing it.

## Step 5: Run Client-Server Experiments

For client-server applications:

1. Open the server-side program.
2. Compile the required Java files.
3. Start the server.
4. Open a separate terminal.
5. Run the client program.
6. Observe the communication between the applications.

**Note:** Start the server before initiating the client connection.

## Step 6: Run Servlet Experiments

For LAB-6 and LAB-7:

1. Install a compatible version of Apache Tomcat.
2. Configure the Java web application.
3. Ensure the required Servlet API dependencies are available.
4. Deploy the application to Tomcat.
5. Start the Tomcat server.
6. Access the application through a web browser using its configured context path and servlet mapping.

For projects using `jakarta.servlet`, use Tomcat 10 or a compatible newer version.

The repository includes the following startup script:

```bat
start_tomcat.bat
```

Check its configured Tomcat installation path before running it.

---

# 🖥️ Available Batch Scripts

The repository contains batch scripts intended to simplify certain setup and execution tasks on Windows.

| Script                  | Purpose                          |
| ----------------------- | -------------------------------- |
| `import_database.bat`   | Database import                  |
| `run_desktop_swing.bat` | Launch desktop Swing application |
| `start_tomcat.bat`      | Start Apache Tomcat              |

These scripts may require configuration based on the local system environment.

---

# 🎯 Learning Outcomes

Through these laboratory experiments, the following Advanced Java concepts are explored:

1. Designing interactive desktop applications using Java Swing.
2. Understanding event-driven programming.
3. Implementing input validation and exception handling.
4. Establishing database connectivity using JDBC.
5. Understanding client-server communication.
6. Exploring Java networking concepts.
7. Implementing server-side Java programs.
8. Understanding Servlet architecture and lifecycle.
9. Processing HTTP requests and responses.
10. Developing practical Java programming skills.

---

## 📝 Repository Notes

- This repository is maintained for Advanced Java laboratory coursework.
- Each lab focuses on a different Java programming concept.
- Laboratory experiments are organized into separate directories.
- ShopSphere is maintained under the `JAVA_PROJECT` directory.
- Additional improvements and experiments may be added as coursework progresses.

---

## 📄 License

This repository is intended for educational and academic purposes.

---

### ⭐ Thank You for Visiting!

If you find this repository helpful, consider giving it a star.

**Developed as part of Advanced Java Laboratory Coursework.**

