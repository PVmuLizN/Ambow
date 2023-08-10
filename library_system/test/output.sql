CREATE TABLE Books (
    BookID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Title VARCHAR(255),
    Author VARCHAR(100),
    Publisher VARCHAR(100),
    PublicationDate DATE,
    ISBN VARCHAR(20),
    Status VARCHAR(20)
);
CREATE TABLE Readers (
    ReaderID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Name VARCHAR(100),
    IDCardNumber VARCHAR(20),
    PhoneNumber VARCHAR(15),
    Address VARCHAR(255)
);
CREATE TABLE BorrowRecords (
    BorrowID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    BookID INT,
    ReaderID INT,
    BorrowDate DATE,
    DueDate DATE,
    ReturnDate DATE,
    Returned ENUM('是', '否'),
    FOREIGN KEY (BookID) REFERENCES Books(BookID),
    FOREIGN KEY (ReaderID) REFERENCES Readers(ReaderID)
);
CREATE TABLE ReservationRecords (
    ReservationID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    BookID INT,
    ReaderID INT,
    ReservationDate DATE,
    BookTaken ENUM('是', '否'),
    FOREIGN KEY (BookID) REFERENCES Books(BookID),
    FOREIGN KEY (ReaderID) REFERENCES Readers(ReaderID)
);
CREATE TABLE Fines (
    FineID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    BorrowID INT,
    Amount DECIMAL(10, 2),
    Reason VARCHAR(255),
    PaymentStatus ENUM('已缴纳', '未缴纳'),
    FOREIGN KEY (BorrowID) REFERENCES BorrowRecords(BorrowID)
);