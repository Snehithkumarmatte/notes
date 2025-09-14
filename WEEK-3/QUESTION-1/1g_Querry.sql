SELECT d.dname 
FROM emp e 
JOIN dept d ON e.deptno = d.deptno 
WHERE e.ename = 'SCOTT';