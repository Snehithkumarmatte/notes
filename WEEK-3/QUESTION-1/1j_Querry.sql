SELECT d.loc, COUNT(e.empno) AS employee_count 
FROM emp e 
JOIN dept d ON e.deptno = d.deptno 
GROUP BY d.loc;