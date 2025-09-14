-- k. Display Details of Clerks in Descending order of Salaries whose salary>800.
SELECT *
FROM EMP
WHERE JOB = 'CLERK' AND SAL > 800
ORDER BY SAL DESC;