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
GROUP BY perMonth;
