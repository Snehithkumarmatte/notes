SELECT d.dname, SUM(e.sal) AS total_salary 
FROM emp e 
JOIN dept d ON e.deptno = d.deptno 
GROUP BY d.dname;