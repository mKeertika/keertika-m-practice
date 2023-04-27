SELECT 
    orderNumber, 
    orderlinenumber, 
    quantityOrdered * priceEach as priceTotal
FROM
    orderdetails
ORDER BY priceTotal ;

select firstname, lastname, reportsTo
FROM employees
order by reportsTo
;

select state, count(*)
from customers
group by state
;

SELECT 
    orderNumber, SUM(quantityOrdered * priceEach) AS total
FROM
    orderdetails
GROUP BY orderNumber;

SELECT 
    *
FROM
    orderdetails
WHERE
    orderNumber = 10101;

SELECT 
    Month(orderDate) AS perMonth, 
    COUNT(orderNumber)
FROM
    orders
WHERE year(orderDate)=2004
GROUP BY perMonth
having count(orderNumber)between 5 and 10;

show tables;
show full tables;


SELECT concat(contactFirstName,' ',contactLastName) as cName,
UPPER(cName) as Fullname
FROM customers;

select *
FROM customers;

select city, count(*)
from customers
group by city
having city like 'l%'
;

SELECT
 SUM(IF(status = 'Shipped', 1, 0)) AS Shipped,
 SUM(IF(status = 'Cancelled', 1, 0)) AS Cancelled
FROM
orders;
 
SELECT status 
FROM orders
group by status;

SELECT status , count(*)
FROM orders
where status='Shipped' or status='Cancelled'
group by status
 ;

SELECT status , count(*)
FROM orders
group by status
 having status in('Shipped', 'Cancelled');
 