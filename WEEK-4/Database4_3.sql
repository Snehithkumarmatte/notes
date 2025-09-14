-- Create the EMPLOYEE table
CREATE TABLE EMPLOYEE (
    EmployeeID SERIAL PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    Initials CHAR(2),
    LastName VARCHAR(50) NOT NULL,
    Gender CHAR(1) CHECK (Gender IN ('M', 'F')),
    Birthdate DATE NOT NULL,
    Street VARCHAR(100),
    City VARCHAR(50),
    PostalCode VARCHAR(10)
);

-- Create the DEPARTMENT table
CREATE TABLE DEPARTMENT (
    DepartmentID SERIAL PRIMARY KEY,
    Name VARCHAR(100) UNIQUE NOT NULL,
    Locations VARCHAR(100) NOT NULL
);

-- Create the PROJECT table
CREATE TABLE PROJECT (
    ProjectID SERIAL PRIMARY KEY,
    Name VARCHAR(100) NOT NULL
);

-- Create the WORKS_FOR table (N:1 Relationship between Employee and Department)
CREATE TABLE WORKS_FOR (
    EmployeeID INT PRIMARY KEY,
    DepartmentID INT NOT NULL,
    FOREIGN KEY (EmployeeID) REFERENCES EMPLOYEE(EmployeeID) ON DELETE CASCADE,
    FOREIGN KEY (DepartmentID) REFERENCES DEPARTMENT(DepartmentID) ON DELETE CASCADE
);

-- Create the MANAGES table (1:N Relationship between Employee and Department)
CREATE TABLE MANAGES (
    EmployeeID INT,
    DepartmentID INT,
    StartDate DATE NOT NULL,
    PRIMARY KEY (EmployeeID, DepartmentID),
    FOREIGN KEY (EmployeeID) REFERENCES EMPLOYEE(EmployeeID) ON DELETE CASCADE,
    FOREIGN KEY (DepartmentID) REFERENCES DEPARTMENT(DepartmentID) ON DELETE CASCADE
);

-- Create the WORKS_ON table (M:N Relationship between Employee and Project)
CREATE TABLE WORKS_ON (
    EmployeeID INT,
    ProjectID INT,
    Hours DECIMAL(5,2) NOT NULL,
    PRIMARY KEY (EmployeeID, ProjectID),
    FOREIGN KEY (EmployeeID) REFERENCES EMPLOYEE(EmployeeID) ON DELETE CASCADE,
    FOREIGN KEY (ProjectID) REFERENCES PROJECT(ProjectID) ON DELETE CASCADE
);

-- Create the CONTROLS table (1:N Relationship between Department and Project)
CREATE TABLE CONTROLS (
    DepartmentID INT,
    ProjectID INT,
    PRIMARY KEY (DepartmentID, ProjectID),
    FOREIGN KEY (DepartmentID) REFERENCES DEPARTMENT(DepartmentID) ON DELETE CASCADE,
    FOREIGN KEY (ProjectID) REFERENCES PROJECT(ProjectID) ON DELETE CASCADE
);
