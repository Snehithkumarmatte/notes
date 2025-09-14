SELECT * 
FROM emp e 
JOIN dept d ON e.deptno = d.deptno 
WHERE d.dname = 'ACCOUNTING';