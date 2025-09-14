-- j. Display Maximum salaries of employees Job-wise.
SELECT JOB, MAX(SAL) AS MaximumSalary
FROM EMP
GROUP BY JOB;