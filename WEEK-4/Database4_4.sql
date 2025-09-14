-- Create the STUDENT table
CREATE TABLE STUDENT (
    StudentID SERIAL PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    DOB DATE NOT NULL,
    Major VARCHAR(50) NOT NULL
);

-- Create the PHONE table (Multivalued Attribute)
CREATE TABLE PHONE (
    StudentID INT,
    PNumber VARCHAR(15) NOT NULL,
    Type VARCHAR(20),
    PRIMARY KEY (StudentID, PNumber),
    FOREIGN KEY (StudentID) REFERENCES STUDENT(StudentID) ON DELETE CASCADE
);

-- Create the CLASS table
CREATE TABLE CLASS (
    ClassID SERIAL PRIMARY KEY,
    Description TEXT NOT NULL,
    NumCredits INT CHECK (NumCredits > 0)
);

-- Create the PREREQUISITE table (Self-Referencing CLASS)
CREATE TABLE PREREQUISITE (
    ClassID INT,
    PrereqID INT,
    PRIMARY KEY (ClassID, PrereqID),
    FOREIGN KEY (ClassID) REFERENCES CLASS(ClassID) ON DELETE CASCADE,
    FOREIGN KEY (PrereqID) REFERENCES CLASS(ClassID) ON DELETE CASCADE
);

-- Create the PROFESSOR table
CREATE TABLE PROFESSOR (
    Emp_no SERIAL PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Dept_code VARCHAR(20) NOT NULL
);

-- Create the SECTION table
CREATE TABLE SECTION (
    SecNo SERIAL PRIMARY KEY,
    ClassID INT NOT NULL,
    ClassRoom VARCHAR(50) NOT NULL,
    Semester VARCHAR(20) NOT NULL,
    TimeOffered TIME NOT NULL,
    FOREIGN KEY (ClassID) REFERENCES CLASS(ClassID) ON DELETE CASCADE
);

-- Create the TEACH table (Relationship between PROFESSOR and SECTION)
CREATE TABLE TEACH (
    Emp_no INT NOT NULL,
    SecNo INT NOT NULL,
    PRIMARY KEY (Emp_no, SecNo),
    FOREIGN KEY (Emp_no) REFERENCES PROFESSOR(Emp_no) ON DELETE CASCADE,
    FOREIGN KEY (SecNo) REFERENCES SECTION(SecNo) ON DELETE CASCADE
);

-- Create the ENROLLED table (Relationship between STUDENT and SECTION)
CREATE TABLE ENROLLED (
    StudentID INT NOT NULL,
    SecNo INT NOT NULL,
    Grade VARCHAR(5),
    DropDate DATE,
    PRIMARY KEY (StudentID, SecNo),
    FOREIGN KEY (StudentID) REFERENCES STUDENT(StudentID) ON DELETE CASCADE,
    FOREIGN KEY (SecNo) REFERENCES SECTION(SecNo) ON DELETE CASCADE
);
