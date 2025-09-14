-- p. Display Year wise hired employees count in descending order.
SELECT EXTRACT(YEAR FROM HIREDATE) AS HireYear, COUNT(*) AS NumberOfEmployees
FROM EMP
GROUP BY HireYear
ORDER BY HireYear DESC;