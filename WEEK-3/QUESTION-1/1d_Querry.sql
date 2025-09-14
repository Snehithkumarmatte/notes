SELECT e.empno, e.ename, e.job, e.sal + 1000 AS updated_salary, d.dname 
FROM emp e 
JOIN dept d ON e.deptno = d.deptno 
WHERE e.job = 'CLERK' AND d.dname = 'RESEARCH';