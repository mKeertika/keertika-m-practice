show tables;

SELECT 
    T1.productCode, T1.productName, T2.textDescription
FROM
    products T1
        INNER JOIN
    productlines T2 USING (productline);
    -- productlines T2 on T1.productline=T2.productline ;
    
SELECT 
    orderNumber,
    orderDate,
    orderLineNumber,
    productName,
    quantityOrdered,
    priceEach
FROM
    orders
        INNER JOIN
    orderdetails USING (orderNumber)
        INNER JOIN
    products USING (productCode)
ORDER BY orderNumber , orderLineNumber;
    
SELECT 
    orderNumber, SUM(priceEach * quantityOrdered) AS total
FROM
    orderdetails
        INNER JOIN
    orders USING (orderNumber)
GROUP BY orderNumber
HAVING SUM(priceEach * quantityOrdered) > 60000;

select c.customerNumber, c.customerName, o.orderNumber, o.orderDate,
p.productCode, p.productName, sum(od.priceEach * od.quantityOrdered)  price
from customers c
inner join orders o using (customerNumber)
inner join orderDetails od using (orderNumber)
inner join products p using (productCode);

SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));

select c.customerNumber, c.customerName, o.orderNumber, o.orderDate,
p.productCode, p.productName, sum(od.priceEach * od.quantityOrdered)  price
from customers c
inner join orders o using (customerNumber)
inner join orderDetails od using (orderNumber)
inner join products p using (productCode)
group by p.productCode;
