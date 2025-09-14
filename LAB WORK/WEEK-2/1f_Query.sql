-- f. Display Junior Most Clerk Details whose salary is least among all Clerks.
SELECT *
FROM EMP
WHERE JOB = 'CLERK'
ORDER BY HIREDATE DESC, SAL ASC
LIMIT 1;