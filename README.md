```markdown
# 🛍️ Simple E-Commerce (Spring + Loose Coupling)

A layered **Spring-based E-Commerce simulation app** demonstrating **loose coupling** and **dependency injection** using annotations like `@Controller`, `@Service`, `@Repository`, and `@Autowired`.

---

## 🚀 Overview

This project simulates a simple E-Commerce system built using **Spring Core** (no Spring Boot).  
It showcases **layered architecture** and **dynamic payment handling** while keeping the system modular and loosely coupled.

---

## 🧩 Architecture

| Layer | Description |
|-------|--------------|
| **Controller** | Handles user input and orchestrates service calls |
| **Service** | Contains business logic and communicates with repository |
| **Repository** | Provides data access (mocked for simplicity) |
| **Payment** | Strategy-based payment handling with multiple methods (UPI / Credit Card) |

---

## 💡 Key Spring Concepts Used

- `@Controller`, `@Service`, `@Repository`, `@Component`
- `@Autowired` for automatic dependency injection
- `@Qualifier` / `@Primary` for resolving ambiguity between beans
- `ApplicationContext` configuration via XML

---

## ⚙️ Tech Stack

- **Language:** Java 21  
- **Framework:** Spring Core 7 (Context + Core Modules)  
- **Build Tool:** Maven  
- **IDE:** IntelliJ IDEA (or any Java IDE)

---

## 📂 Folder Structure

```

simpleECommerce/
├── src/main/java/org/example/
│   ├── Main.java
│   ├── controller/
│   │   └── ProductController.java
│   ├── service/
│   │   └── ProductService.java
│   ├── repository/
│   │   └── ProductRepository.java
│   ├── payment/
│   │   ├── PaymentMethod.java
│   │   ├── UpiPayment.java
│   │   └── CreditCardPayment.java
│   └── model/
│       └── Product.java
│
├── src/main/resources/
│   └── applicationContext.xml
│
└── pom.xml

```

---

## 🪄 How It Works

1. User chooses a product from the list.  
2. User selects a payment method (UPI / Credit Card).  
3. `ProductController` delegates to `ProductService`, which fetches product data from `ProductRepository`.  
4. Appropriate payment bean is injected dynamically using Spring.  
5. The order is processed and confirmation is displayed.

---

## 🧠 Example Console Run

```

🛍 Welcome to Simple E-Commerce!
Choose a product to buy:

1. Laptop - ₹79999
2. Smartphone - ₹49999
3. Headphones - ₹2999
   Enter product ID: 2

Select Payment Method:

1. UPI
2. Credit Card
   Enter choice (1/2 or name): upi

📱 Payment of ₹49999.0 done via UPI.
✅ Order placed successfully!

````

---

## 🧰 Setup & Run

1. Clone the repository  
   ```bash
   git clone https://github.com/your-username/simpleECommerce.git
   cd simpleECommerce
````

2. Build the project

   ```bash
   mvn clean install
   ```

3. Run the application

   ```bash
   java -cp target/classes org.example.Main
   ```

---

## 🧾 Learning Goals

* Understand **loose coupling** in layered design
* Use **Spring annotations** effectively
* Handle **bean ambiguity** using `@Primary` / `@Qualifier`
* Work with **ApplicationContext** manually

---

## 👨‍💻 Author

**Prakash Kumar**
🔗 [GitHub](https://github.com/Prakashkumar88)

---

```

```
