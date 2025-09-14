-- n. Display Employee details in alphabetical order of enames whose job is Clerk.
SELECT *
FROM EMP
WHERE JOB = 'CLERK'
ORDER BY ENAME ASC;