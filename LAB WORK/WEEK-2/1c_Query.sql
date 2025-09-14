-- c. Display Highest paid Salesman Details.
SELECT *
FROM EMP
WHERE JOB = 'SALESMAN'
ORDER BY SAL DESC
LIMIT 1;