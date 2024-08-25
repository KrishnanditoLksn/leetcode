-- Write your PostgreSQL query statement below
SELECT Department.name as "Department" , 
        Employee.name as "Employee" , 
        Employee.salary as "Salary"
FROM Department 
INNER JOIN Employee  ON Department.id = Employee.departmentId
WHERE Employee.salary IN (
    SELECT MAX(e.salary)
    FROM Employee e
    WHERE e.departmentId = Department.id
);