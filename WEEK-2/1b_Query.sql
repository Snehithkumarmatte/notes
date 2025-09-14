-- b. Display Dept-wise Maximum Salary.
SELECT DEPTNO, MAX(SAL) AS MaximumSalary
FROM EMP
GROUP BY DEPTNO;