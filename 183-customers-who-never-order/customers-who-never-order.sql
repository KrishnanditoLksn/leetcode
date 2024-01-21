/* Write your PL/SQL query statement below */
SELECT C.name as Customers
FROM Customers C
FULL OUTER JOIN Orders O ON (C.id=O.customerId)
WHERE O.customerId is null