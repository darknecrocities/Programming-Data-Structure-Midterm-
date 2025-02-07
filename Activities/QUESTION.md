# Library Management System 📚

## Problem Statement

You are tasked with creating a **Library Management System** for a small public library. The system will allow the library staff to manage books, customers, and checkouts. It should handle various tasks like adding books, searching for books, tracking customer details, and managing checkout transactions.

---

## Requirements 📝

### 1. **Book Management 📖**

- **Store Book Information**:
  - You need to store information about books, including the **title**, **author**, and a **unique book ID**.
  
- **Search Books**:
  - The system should allow staff to **search for books** by **title** or **author** using string methods.

### 2. **Customer Management 👥**

- **Store Customer Information**:
  - Store customer details: **name**, **membership ID**, and **contact information**.
  
- **Manage Customers**:
  - You should be able to **add a new customer**, **remove a customer**, and **view customer details**.

### 3. **Checkout Management 📅**

- **Book Checkout**:
  - The system should handle the **checkout** of books, with a transaction storing which book was borrowed by which customer and the **due date**.

- **Track Overdue Books**:
  - The system should also allow staff to **track overdue books**.

### 4. **Collections 🗂️**

- **Books and Customers Collection**:
  - Use a **List** to store customers and a **Set** to store available books.

- **Book Removal**:
  - When a book is checked out, it should be **removed from the available books set**.

### 5. **Tuple Usage 🏷️**

- **Checkout Transaction Tuple**:
  - Use a **Tuple** to represent a **checkout transaction**, which stores a book ID, customer ID, and the **due date**.

### 6. **Array and String Operations 🧮**

- **Fixed Inventory**:
  - Use **arrays** to store a fixed list of books for a limited inventory.
  
- **String Operations**:
  - Strings should be used for book titles, customer names, etc.
  - Implement **search functionality** using **String methods** to find books based on title or author.

---

## Additional Requirements ✨

1. **Display Available Books**:
   - The system should **display a list** of all available books.

2. **Book Duplication Check**:
   - When adding a book, ensure that the system checks if the book **already exists** in the library.

3. **Error Handling**:
   - Handle user input with **error messages** for invalid data (e.g., invalid book IDs or customer names).

---

## Sample Features ⚙️

- **Add New Book** 📘
- **Search Book by Title or Author** 🔍
- **Add New Customer** 👤
- **Checkout a Book** 📅
- **View Checkout Transactions** 📋
- **Display Available Books** 📚

---

## Technologies Used 💻

- **Java** for implementing the system logic
- **Set** and **List** for storing books and customers
- **Tuple-like structure** for representing checkout transactions
- **Array** for fixed book inventory

---
