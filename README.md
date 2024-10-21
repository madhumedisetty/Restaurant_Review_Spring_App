## Restaurant Review Spring App  
### N-Tier Architecture Flow Explanation

This project follows an **N-Tier Architecture** to ensure separation of concerns, modularity, and scalability.

---

### **Architecture Overview**

1. **Client (Frontend/UI)**  
   - The client sends **HTTP requests** to the Spring Boot backend.

2. **Controller Layer (Presentation Layer)**  
   - This layer handles client requests and directs them to the appropriate service.  
     **Examples:**  
     - **RestaurantController** forwards restaurant-related requests to **RestaurantService**.  
     - **ReviewController** forwards review-related requests to **ReviewService**.

3. **Service Layer (Business Logic Layer)**  
   - This layer contains the main business logic and interacts with the repository layer for data access.  
     **Examples:**  
     - **RestaurantService** handles operations related to restaurants.  
     - **ReviewService** handles operations related to reviews.

4. **Data Access Layer (DAL)**  
   - This layer contains repositories that extend JPA to perform **CRUD operations** (Create, Read, Update, Delete) on the database.  
     **Examples:**  
     - **RestaurantRepository** interacts with the **Restaurant** table in the database.  
     - **ReviewRepository** interacts with the **Review** table.

5. **Database (MySQL)**  
   - Stores all **restaurant** and **review** data.

---

### **Flow Diagram**  

1. **Frontend/UI**  
    Sends HTTP requests →  

2. **Controller Layer (Presentation Layer)**  
    - **RestaurantController**  
    - **ReviewController**  
      |
      ↓  

3. **Service Layer (Business Logic Layer)**  
    - **RestaurantService**  
    - **ReviewService**  
      |
      ↓  

4. **Data Access Layer (DAL)**  
    - **RestaurantRepository**  
    - **ReviewRepository**  
      |
      ↓  

5. **Database (MySQL)**  
    - Stores **Restaurant** and **Review** data.  

---

### **Architecture in a Simple Diagram**  
```
Client (Frontend/UI)  
      |  
      | (HTTP Request)  
      v  
+------------------------+  
|   Controller Layer     |  <-- Presentation Layer  
|------------------------|  
| RestaurantController   | --> RestaurantService  
| ReviewController       | --> ReviewService  
+------------------------+  
          |                           |  
          v                           v  
+---------------------+     +---------------------+  
|  RestaurantService  |     |  ReviewService      |  <-- Business Logic Layer  
+---------------------+     +---------------------+  
          |                           |  
          v                           v  
+----------------------+     +----------------------+  
| RestaurantRepository |     | ReviewRepository     |  <-- Data Access Layer  
+----------------------+     +----------------------+  
          | (JPA)                     | (JPA)  
          v                           v  
+-------------------------------------------------+  
|                  MySQL Database                 |  
+-------------------------------------------------+  
```

---

### **Spring Boot Components Used**  
- **Configuration Layer**: Links controllers, services, and repositories together.  
- **Component Management**: Handles Spring Beans' lifecycle automatically.

---
