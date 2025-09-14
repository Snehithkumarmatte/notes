CREATE TABLE Users (
    UserID INT PRIMARY KEY,
    Name VARCHAR(50),
    Address VARCHAR(100),
    Phone VARCHAR(15),
    Email VARCHAR(50)
);
----------------------------------------------------------------------------------
CREATE TABLE Books (
    BookID INT PRIMARY KEY,
    Title VARCHAR(100),
    Author VARCHAR(50),
    Publisher VARCHAR(50),
    ISBN VARCHAR(20),
    Category VARCHAR(30),
    Status VARCHAR(20)
);
----------------------------------------------------------------------------------
CREATE TABLE Members (
    MemberID INT PRIMARY KEY,
    Name VARCHAR(50),
    Address VARCHAR(100),
    Phone VARCHAR(15),
    Email VARCHAR(50),
    MembershipDate DATE,
    MembershipStatus VARCHAR(20)
);
----------------------------------------------------------------------------------
CREATE TABLE Transaction (
    TransactionID INT PRIMARY KEY,
    BookID INT,
    UserID INT,
    IssueDate DATE,
    ReturnDate DATE,
    Fine DECIMAL(10,2),
    Status VARCHAR(20),
    FOREIGN KEY (BookID) REFERENCES Books(BookID),
    FOREIGN KEY (UserID) REFERENCES Users(UserID)
);
----------------------------------------------------------------------------------
CREATE TABLE BookBorrowing (
    BookID INT,
    MemberID INT,
    BorrowDate DATE,
    DueDate DATE,
    PRIMARY KEY (BookID, MemberID, BorrowDate),
    FOREIGN KEY (BookID) REFERENCES Books(BookID),
    FOREIGN KEY (MemberID) REFERENCES Members(MemberID)
);
------------------------------------------------------------------------------------
CREATE TABLE Staffed (
    StaffID INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);
-------------------------------------------------------------------------------------
CREATE TABLE StaffManagesBook (
    StaffID INT,
    BookID INT,
    ManagementDate DATE,
    PRIMARY KEY (StaffID, BookID),
    FOREIGN KEY (StaffID) REFERENCES Staffed(StaffID),
    FOREIGN KEY (BookID) REFERENCES Books(BookID)
);
-------------------------------------------------------------------------------------
CREATE TABLE StaffManagesMember (
    StaffID INT,
    MemberID INT,
    ManagementDate DATE,
    PRIMARY KEY (StaffID, MemberID),
    FOREIGN KEY (StaffID) REFERENCES Staffed(StaffID),
    FOREIGN KEY (MemberID) REFERENCES Members(MemberID)
);