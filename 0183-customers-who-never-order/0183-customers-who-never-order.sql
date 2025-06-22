# Write your MySQL query statement below
select name as "Customers" from Customers WHERE id NOT IN (SELECT customerId FROM Orders);