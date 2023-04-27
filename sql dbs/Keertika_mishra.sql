SELECT 
    productName AS 'Name',
    productline AS 'Product Line',
    buyPrice AS 'Buy Price'
FROM
    products
ORDER BY buyPrice DESC
;

SELECT 
    contactFirstName AS 'First Name',
    contactLastName AS 'Last Name',
    city AS 'City'
FROM
    customers
WHERE
    country = 'Germany'
ORDER BY contactLastName ASC
;

SELECT DISTINCT
    status
FROM
    orders
ORDER BY status;

SELECT 
    *
FROM
    payments
WHERE
    paymentDate > '2005-01-01'
ORDER BY paymentDate DESC;


SELECT 
    lastName, firstName, email, jobTitle
FROM
    employees
WHERE
    officeCode = 1
ORDER BY lastName
;

SELECT 
    productName, productLine, productScale, productVendor
FROM
    products
WHERE
    productLine LIKE '%car%'
ORDER BY productline DESC , productName
;