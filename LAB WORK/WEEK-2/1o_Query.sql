-- o. Display dept-wise Average Salaries.
SELECT DEPTNO, AVG(SAL) AS AverageSalary
FROM EMP
GROUP BY DEPTNO;