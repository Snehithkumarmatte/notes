CREATE TABLE DEPT (
    DEPTNO INT PRIMARY KEY,
    DNAME VARCHAR(14),
    LOC VARCHAR(13)
);

CREATE TABLE EMP (
    EMPNO INT PRIMARY KEY,
    ENAME VARCHAR(10),
    JOB VARCHAR(9),
    MGR INT,
    HIREDATE DATE,
    SAL INT,
    COMM INT,
    DEPTNO INT,
    FOREIGN KEY (DEPTNO) REFERENCES DEPT(DEPTNO)
);

-- Insert data into DEPT table
INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES
(10, 'ACCOUNTING', 'NEW YORK'),
(20, 'RESEARCH', 'DALLAS'),
(30, 'SALES', 'CHICAGO'),
(40, 'OPERATIONS', 'BOSTON');

-- Insert data into EMP table
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES
(7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800, NULL, 20),
(7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600, 300, 30),
(7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250, 500, 30),
(7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975, NULL, 20),
(7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250, 1400, 30),
(7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850, NULL, 30),
(7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450, NULL, 10),
(7788, 'SCOTT', 'ANALYST', 7566, '1987-04-19', 3000, NULL, 20),
(7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000, NULL, 10),
(7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08', 1500, 0, 30),
(7876, 'ADAMS', 'CLERK', 7788, '1987-05-23', 1100, NULL, 20),
(7900, 'JAMES', 'CLERK', 7698, '1981-12-03', 950, NULL, 30),
(7902, 'FORD', 'ANALYST', 7566, '1981-12-03', 3000, NULL, 20),
(7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300, NULL, 10);


-- a. Display the Sum of Salaries of Clerks Dept wise.
SELECT DEPTNO, SUM(SAL) AS TotalSalary
FROM EMP
WHERE JOB = 'CLERK'
GROUP BY DEPTNO;

-- b. Display Dept-wise Maximum Salary.
SELECT DEPTNO, MAX(SAL) AS MaximumSalary
FROM EMP
GROUP BY DEPTNO;

-- c. Display Highest paid Salesman Details.
SELECT *
FROM EMP
WHERE JOB = 'SALESMAN'
ORDER BY SAL DESC
LIMIT 1;

-- d. Display Senior Most Clerk Salary.
SELECT SAL
FROM EMP
WHERE JOB = 'CLERK'
ORDER BY HIREDATE ASC
LIMIT 1;

-- e. Display Senior Most Manager Details who having maximum salary among All Managers.
SELECT *
FROM EMP
WHERE JOB = 'MANAGER'
ORDER BY HIREDATE ASC, SAL DESC
LIMIT 1;

-- f. Display Junior Most Clerk Details whose salary is least among all Clerks.
SELECT *
FROM EMP
WHERE JOB = 'CLERK'
ORDER BY HIREDATE DESC, SAL ASC
LIMIT 1;

-- g. Display details of 4 recently hired employees.
SELECT *
FROM EMP
ORDER BY HIREDATE DESC
LIMIT 4;

-- h. Display no of employees Job-wise.
SELECT JOB, COUNT(*) AS NumberOfEmployees
FROM EMP
GROUP BY JOB;

-- i. Display no of employees Dept no-wise.
SELECT DEPTNO, COUNT(*) AS NumberOfEmployees
FROM EMP
GROUP BY DEPTNO;

-- j. Display Maximum salaries of employees Job-wise.
SELECT JOB, MAX(SAL) AS MaximumSalary
FROM EMP
GROUP BY JOB;

-- k. Display Details of Clerks in Descending order of Salaries whose salary>800.
SELECT *
FROM EMP
WHERE JOB = 'CLERK' AND SAL > 800
ORDER BY SAL DESC;

-- l. Display Senior most employee name dept no-wise
SELECT DEPTNO, ENAME
FROM EMP
WHERE (DEPTNO, HIREDATE) IN (SELECT DEPTNO, MIN(HIREDATE) FROM EMP GROUP BY DEPTNO);

-- m. Display Senior most employee name Job-wise
SELECT JOB, ENAME
FROM EMP
WHERE (JOB, HIREDATE) IN (SELECT JOB, MIN(HIREDATE) FROM EMP GROUP BY JOB);

-- n. Display Employee details in alphabetical order of enames whose job is Clerk.
SELECT *
FROM EMP
WHERE JOB = 'CLERK'
ORDER BY ENAME ASC;

-- o. Display dept-wise Average Salaries.
SELECT DEPTNO, AVG(SAL) AS AverageSalary
FROM EMP
GROUP BY DEPTNO;

-- p. Display Year wise hired employees count in descending order.
SELECT EXTRACT(YEAR FROM HIREDATE) AS HireYear, COUNT(*) AS NumberOfEmployees
FROM EMP
GROUP BY HireYear
ORDER BY HireYear DESC;