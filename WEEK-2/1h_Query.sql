-- h. Display no of employees Job-wise.
SELECT JOB, COUNT(*) AS NumberOfEmployees
FROM EMP
GROUP BY JOB;