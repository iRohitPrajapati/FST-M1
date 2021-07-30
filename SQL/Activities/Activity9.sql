-- Write an SQL statement to know which salesman are working for which customer.
select c.customer_id, c.customer_name, o.salesman_id from customers c inner join orders o on c.salesman_id=o.salesman_id;

-- Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman.
SELECT c.customer_name, c.city, c.grade, o.salesman_id AS "Salesman" FROM customers c left outer join orders o on c.salesman_id=o.salesman_id where c.grade<300 order by c.grade desc;

-- Write an SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%.
select c.customer_name, c.city, s.salesman_id, s.commission from customers c inner join salesman s on c.salesman_id=s.salesman_id where s.commission >12;

-- Write an SQL statement to find the details of a order i.e. order number, order date, amount of order, which customer gives the order and which salesman works for that customer and commission rate he gets for an order.
select o.order_no, o.order_date, o.purchase_amount, c.customer_name, s.salesman_id, s.commission from orders o inner join customers c on c.customer_id=o.customer_id inner join salesman s on c.salesman_id=s.salesman_id