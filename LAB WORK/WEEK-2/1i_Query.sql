-- i. Display no of employees Dept no-wise.
SELECT DEPTNO, COUNT(*) AS NumberOfEmployees
FROM EMP
GROUP BY DEPTNO;