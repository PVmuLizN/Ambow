-- Insert 10 records into the Books table
INSERT INTO Books (Title, Author, Publisher, PublicationDate, ISBN, Status)
VALUES
    ('Book 1', 'Author 1', 'Publisher A', '2023-01-01', 'ISBN001', 'Available'),
    ('Book 2', 'Author 2', 'Publisher B', '2023-02-15', 'ISBN002', 'Available'),
    -- ... repeat for 8 more records ...
    ('Book 10', 'Author 3', 'Publisher A', '2023-06-20', 'ISBN010', 'Checked Out');

-- Insert 10 records into the Readers table
INSERT INTO Readers (Name, IDCardNumber, PhoneNumber, Address)
VALUES
    ('Reader 1', 'IDCard001', '123-456-7890', '123 Main St'),
    ('Reader 2', 'IDCard002', '987-654-3210', '456 Elm St'),
    -- ... repeat for 8 more records ...
    ('Reader 10', 'IDCard010', '555-555-5555', '789 Oak St');

-- Insert 10 records into the BorrowRecords table
INSERT INTO BorrowRecords (BookID, ReaderID, BorrowDate, DueDate, ReturnDate, Returned)
VALUES
    (1, 1, '2023-03-10', '2023-03-20', '2023-03-18', '是'),
    (2, 2, '2023-03-12', '2023-03-22', NULL, '否'),
    -- ... repeat for 8 more records ...
    (10, 10, '2023-04-01', '2023-04-11', NULL, '否');

-- Insert 10 records into the ReservationRecords table
INSERT INTO ReservationRecords (BookID, ReaderID, ReservationDate, BookTaken)
VALUES
    (3, 3, '2023-03-15', '否'),
    (4, 4, '2023-03-16', '否'),
    -- ... repeat for 8 more records ...
    (8, 8, '2023-03-20', '否');

-- Insert 10 records into the Fines table
INSERT INTO Fines (BorrowID, Amount, Reason, PaymentStatus)
VALUES
    (1, 5.00, 'Late return', '已缴纳'),
    (2, 3.00, 'Damaged book', '未缴纳'),
    -- ... repeat for 8 more records ...
    (10, 2.50, 'Overdue', '未缴纳');