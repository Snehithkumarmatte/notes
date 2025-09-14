-- a. Display the Sum of Salaries of Clerks Dept wise.
SELECT DEPTNO, SUM(SAL) AS TotalSalary
FROM EMP
WHERE JOB = 'CLERK'
GROUP BY DEPTNO;