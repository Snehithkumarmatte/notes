SELECT e.ename, e.sal 
FROM emp e 
JOIN dept d ON e.deptno = d.deptno 
WHERE e.job = 'CLERK' AND d.loc = 'DALLAS';