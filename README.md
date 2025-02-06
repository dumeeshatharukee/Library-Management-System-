# Library Management System (LMS)

## Introduction  
The Library Management System (LMS) is a console-based Java application that allows users to manage a library's collection of books. Users can add books, view books, borrow books, and search for books by author. This system simulates the basic functionalities of a library, providing an easy-to-use interface for managing books.

## Functionality  
### 1. Add Books
- This option allows the user to add new books to the library by entering the book's title, author, and ISBN.  
- Once a book is added, it is stored in the system, and the user receives a confirmation message.

### 2. View Books
- This option displays all the books currently available in the library. The list includes the title, author, ISBN, and availability status.

### 3. Borrow Books
- Users can borrow books by entering the ISBN of the book they wish to borrow.  
- If the book is available, it will be marked as borrowed, and the user will receive a success message.  
- If the book is already borrowed, an appropriate message will be shown to the user.

### 4. Return Books
- This option allows users to return a book they borrowed.  
- By entering the ISBN of the book they want to return, the availability status will be updated to "available."

### 5. Exit
- This option allows the user to exit the system gracefully.

## Screenshots  
### 1. Main Menu
The main menu, where the user selects an option:  
![Main Menu](![Image](https://github.com/user-attachments/assets/7c8bc8a2-a6bb-4e80-a5ea-50601b7315a7)

### 2. Adding a New Book
The prompt when adding a new book:  
![Add Book]![Image](https://github.com/user-attachments/assets/4c9a0602-4e79-4a87-8dc1-488894a2374c)
)

### 3. Viewing the List of Books
The output when viewing the list of books:  
![View Books]![Image](https://github.com/user-attachments/assets/c07a98a2-4511-402e-8957-062b9e6db70e)

### 4. Borrowing and Returning a Book
The process of borrowing and returning a book:  
![Borrow and Return]![Image](https://github.com/user-attachments/assets/5010d034-4517-44f9-81da-2d922bbdabcf)
)![Image](https://github.com/user-attachments/assets/a7367d3a-fea1-4939-919d-96098dcc9d41)

## How to Run the System  
To run the Library Management System locally, follow these steps:

1. Clone the repository:
   - Use the following command to clone the repository:  
     bash
     git clone [:https://github.com/dumeeshatharukee/Library-Management-System-.git
     ](https://github.com/dumeeshatharukee/Library-Management-System-.git)
2. Navigate to the project folder:
   - Change to the project directory:
     bash
     cd Library-Management-System
     
3. Run the Application:
   - Compile and run the Library Management System in your IDE or command line:
     bash
     
     javac LibraryManagementSystem.java
     
     java LibraryManagementSystem
