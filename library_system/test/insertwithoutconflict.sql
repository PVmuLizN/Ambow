-- Insert 50 records into the Readers table
INSERT INTO Readers (Name, IDCardNumber, PhoneNumber, Address)
SELECT
    CONCAT('Reader ', ID),
    CONCAT('IDCard', LPAD(ID, 3, '0')),
    CONCAT('123-456-', LPAD(ID, 4, '0')),
    CONCAT(ID, ' Main St')
FROM seq_1_to_50;

-- Insert 50 records into the Books table
INSERT INTO Books (Title, Author, Publisher, PublicationDate, ISBN, Status)
SELECT
    CONCAT('Book ', ID),
    CONCAT('Author ', ID),
    CONCAT('Publisher ', ID),
    DATE_ADD('2023-01-01', INTERVAL ID DAY),
    CONCAT('ISBN', LPAD(ID, 3, '0')),
    IF(ID % 2 = 0, 'Available', 'Checked Out')
FROM seq_1_to_50;
ALTER TABLE table_name
MODIFY column_name data_type AUTO_INCREMENT;
-- Insert 50 records into the BorrowRecords table
INSERT INTO BorrowRecords (BookID, ReaderID, BorrowDate, DueDate, Returned)
SELECT
    FLOOR(1 + RAND() * 50),
    FLOOR(1 + RAND() * 50),
    DATE_ADD('2023-03-01', INTERVAL ID DAY),
    DATE_ADD('2023-03-01', INTERVAL ID + 10 DAY),
    IF(ID % 4 = 0, '是', '否')
FROM seq_1_to_50;

-- Insert 50 records into the ReservationRecords table
INSERT INTO ReservationRecords (BookID, ReaderID, ReservationDate, BookTaken)
SELECT
    FLOOR(1 + RAND() * 50),
    FLOOR(1 + RAND() * 50),
    DATE_ADD('2023-03-01', INTERVAL ID DAY),
    IF(ID % 5 = 0, '是', '否')
FROM seq_1_to_50;

-- Insert 50 records into the Fines table
INSERT INTO Fines (BorrowID, Amount, Reason, PaymentStatus)
SELECT
    FLOOR(1 + RAND() * 50),
    ROUND(1 + RAND() * 10, 2),
    CASE
        WHEN ID % 2 = 0 THEN 'Late return'
        WHEN ID % 3 = 0 THEN 'Damaged book'
        ELSE 'Overdue'
    END,
    IF(ID % 4 = 0, '已缴纳', '未缴纳')
FROM seq_1_to_50;