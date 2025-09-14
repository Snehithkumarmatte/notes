-- e. Display Senior Most Manager Details who having maximum salary among All Managers.
SELECT *
FROM EMP
WHERE JOB = 'MANAGER'
ORDER BY HIREDATE ASC, SAL DESC
LIMIT 1;