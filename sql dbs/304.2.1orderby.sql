SELECT 
    customerName
FROM
    customers
WHERE
    country IN ('USA' , 'France')
;

SELECT 
    customerNumber, country, creditLimit
FROM
    customers
WHERE
    country IN ('USA' , 'France')
        AND creditLimit > 100000
ORDER BY creditLimit
;

SELECT 
    productName
FROM
    PRODUCTS
WHERE
    buyprice BETWEEN '90' AND '100'
;

SELECT 
    productcode, productName, buyprice
FROM
    PRODUCTS
WHERE
    buyprice >= '90' AND buyprice <= '100'
ORDER BY buyprice
;

SELECT 
    productcode, productName, buyprice
FROM
    PRODUCTS
WHERE
    buyprice NOT BETWEEN '20' AND '100'
ORDER BY buyprice
;


SELECT 
    country, customername, salesrepemployeenumber
FROM
    customers
WHERE
    salesrepemployeenumber IS NULL
ORDER BY customername
;


SELECT 
    customername, salesrepemployeenumber, country
FROM
    customers
WHERE
    salesrepemployeenumber IS NOT NULL
ORDER BY customername;