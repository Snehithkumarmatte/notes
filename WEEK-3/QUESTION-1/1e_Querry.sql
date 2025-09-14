SELECT e.ename, e.sal 
FROM emp e 
JOIN dept d ON e.deptno = d.deptno 
WHERE d.loc = 'CHICAGO' AND e.hiredate = (SELECT MIN(hiredate) FROM emp WHERE deptno = d.deptno);