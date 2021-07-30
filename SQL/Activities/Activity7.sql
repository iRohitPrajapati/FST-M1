-- Write an SQL statement to find the total purchase amount of all orders.
Select sum(purchase_amount) as "Total Amount" from orders;

-- Write an SQL statement to find the average purchase amount of all orders.
Select avg(purchase_amount) as "Average Total Amount" from orders;

-- Write an SQL statement to get the maximum purchase amount of all the orders.
Select max(purchase_amount) as "Maximum Total Amount" from orders;

-- Write an SQL statement to get the minimum purchase amount of all the orders.
Select min(purchase_amount) as "Maximum Total Amount" from orders;

-- Write an SQL statement to find the number of salesmen listed in the table.
Select count(distinct salesman_id) as "Total Count" from orders;