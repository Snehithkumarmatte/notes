SELECT d.dname, d.loc 
FROM emp e 
JOIN dept d ON e.deptno = d.deptno 
WHERE e.job = 'SALESMAN';