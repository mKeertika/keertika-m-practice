use classicmodels;

SELECT 
    c.customername AS 'Customer Name',
    CONCAT(e.lastname, ' ', e.firstname) AS 'Sales Rep'
FROM
    customers c
        INNER JOIN
    employees e ON c.salesRepEmployeeNumber = e.employeeNumber
ORDER BY c.customerName ASC;

SELECT 
    p.productname AS 'Product Name',
    od.quantityOrdered AS 'Total # Ordered',
    SUM(od.quantityOrdered * od.priceEach) AS 'Total Sale'
FROM
    products p
        LEFT JOIN
    orderdetails od ON p.productCode = od.productCode
GROUP BY p.productname , p.buyPrice
ORDER BY 3 DESC;

SELECT 
    status AS 'Order Status', COUNT(status) AS 'Total Orders'
FROM
    orders
GROUP BY status
ORDER BY status;


-- SELECT 
--     o.status AS 'Order Status',
--     sum(od.quantityordered) AS 'Total Orders'
-- FROM
--     orders o
--         JOIN
--     orderdetails od USING (ordernumber)
-- GROUP BY o.status
-- ORDER BY o.status;


SELECT 
    p.productline AS 'Product Line',
    COUNT(p1.productcode) AS 'Total Sold'
FROM
    productlines p
        JOIN
    products p1 USING (productLine)
        JOIN
    orderdetails od using (productcode)
GROUP BY p.productLine
ORDER BY 2 DESC;

SELECT 
    MONTHNAME(paymentdate) AS 'Month',
    YEAR(paymentdate) AS 'Year',
    FORMAT(SUM(amount), 2) AS 'Payments Received'
FROM
    payments
GROUP BY MONTHNAME(paymentdate) , YEAR(paymentdate)
ORDER BY 2,1;


SELECT 
    productname Name,
    productLine 'Product Line',
    productscale AS 'Scale',
    productvendor AS 'Vendor'
FROM
    products
WHERE
    productLine LIKE '%car%'
ORDER BY productLine DESC , productName ASC
;

