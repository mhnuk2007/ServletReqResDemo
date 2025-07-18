# 🚀 ServletReqResDemo

This project demonstrates how to use `HttpServletRequest` and `HttpServletResponse` in a Java Servlet using form submission. It includes concepts like request parameters, request dispatcher, and `HttpSession`.

---

## 🧰 Technologies Used

- Java 17+
- Jakarta Servlet API (Tomcat 10+)
- Eclipse IDE (Dynamic Web Project)
- Git
- HTML (for frontend form)

---

## 📥 Clone the Project

```bash
git clone https://github.com/mhnuk2007/ServletReqResDemo.git
```

---

## 🛠️ Import Project in Eclipse

1. Open Eclipse IDE.
2. Go to: `File` → `Import` → `Existing Projects into Workspace`.
3. Select the project root folder: `ServletReqResDemo`.
4. Finish the import.

---

## 🖥️ Run on Tomcat Server

1. Make sure Apache Tomcat 10+ is configured in Eclipse.
2. Right-click on the project → `Run As` → `Run on Server`.
3. Access in browser:  
   [http://localhost:8080/ServletReqResDemo/index.html](http://localhost:8080/ServletReqResDemo/index.html)

---

## 📂 Project Structure

```
ServletReqResDemo/
├── src/
│   └── main/java/com/learning/srrd/MyServlet.java
├── WebContent/
│   └── index.html
├── .gitignore
└── README.md
```

---

## 📚 Key Concepts Demonstrated

- **HttpServletRequest**
  - Used to retrieve request data from the client (e.g., form fields).
- **HttpServletResponse**
  - Used to generate dynamic content (HTML) and respond to the client.
- **RequestDispatcher**
  - Used to forward requests to another resource (like JSP or another servlet).
- **HttpSession**
  - Used to store user data between multiple requests.

---

## 🙋 Author

- 👤 [Mohan Lal](https://www.linkedin.com/in/mohan-lal-b79790126/)
- 📂 GitHub: [mhnuk2007](https://github.com/mhnuk2007)

---

## 🪪 License

This project is licensed under the [MIT License](LICENSE).
