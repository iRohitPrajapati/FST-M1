-- Write a query that produces the name and number of each salesman and each customer with more than one current order. Put the results in alphabetical order.
select salesman_id, salesman_name from salesman s 
where 1<(Select count(*) from orders o where o.salesman_id=s.salesman_id) 
union 
select customer_id, customer_name from customers c 
where 1<(Select count(*) from orders o where o.salesman_id=c.salesman_id) order by salesman_name;

-- Write a query to make a report of which salesman produce the largest and smallest orders on each date. Also add a column that shows "highest on" and "lowest on" values.
select s.salesman_id, s.salesman_name, order_no, 'highest on', order_date from salesman s, orders o1
where s.salesman_id=o1.salesman_id
and o1.purchase_amount=(select max(purchase_amount) from orders o2 where o1.order_date = o2.order_date)
union
select s.salesman_id, s.salesman_name, order_no, 'lowest on', order_date from salesman s, orders o1
where s.salesman_id=o1.salesman_id
and o1.purchase_amount=(select min(purchase_amount) from orders o2 where o1.order_date = o2.order_date);