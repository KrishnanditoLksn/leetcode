-- Write your PostgreSQL query statement below
SELECT U.unique_id  AS "unique_id", E.name
FROM EmployeeUNI U
FULL OUTER JOIN Employees E ON  U.id = E.id
WHERE E.name IS NOT NULL
ORDER BY "unique_id" DESC;