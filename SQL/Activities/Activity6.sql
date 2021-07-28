-- Get all salesman ids without any repeated values
Select distinct SALESMAN_ID from orders;

-- Display the order number ordered by date in ascending order
Select Order_no, order_date from orders order by order_date;

-- Display the order number ordered by purchase amount in descending order
Select order_no, purchase_amount from orders order by purchase_amount desc;

-- Display the full data of orders that have purchase amount less than 500.
Select * from orders where purchase_amount < 500;

-- Display the full data of orders that have purchase amount between 1000 and 2000.
Select * from orders where purchase_amount between 1000 and 2000;