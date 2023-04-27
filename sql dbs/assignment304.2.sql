show tables;

-- Write a query to display the name, product line, and buy price
-- of all products. The output columns should display as “Name,”
-- “Product Line,” and “Buy Price.” The output should display the
-- most expensive items first.

select* from products;
select productName as'Name',
productline as 'Product Line', 
buyPrice as 'Buy Price'
from products
order by buyPrice desc
;


-- Write a query to display the first name, last name, and city
-- name of all customers from Germany. Columns should display
-- as “First Name,” “Last Name,” and “City.” The output should
-- be sorted by “Last Name” (ascending).
select * from customers;

select contactFirstName as 'First Name',
contactLastName as 'Last Name',
city as 'City'
from customers
where country= 'Germany'
order by contactLastName asc
;

-- Write a query to display each of the unique values of the
-- status field in the orders table. The output should be sorted
-- alphabetically, increasing. Hint: The output should show
-- exactly six rows.
select * from orders;

SELECT DISTINCT
    status
FROM
    orders
ORDER BY status;


-- Select all fields from the payments table for payments made
-- on or after January 1, 2005. The output should be sorted by the
-- payment date from highest to lowest.

select * from payments;
select * from payments
where paymentDate>'2005-01-01'
order by paymentDate desc;

-- Write a query to display the Last Name, First Name, Email
-- Address, and Job Title of all employees working out of the San
-- Francisco office. Output should be sorted by “Last Name.”
select * from employees;
select * from offices;
SELECT 
    lastName, firstName, email, jobTitle
FROM
    employees
WHERE
    officeCode = 1
ORDER BY lastName
;

-- Write a query to display the Name, Product Line, Scale, and
-- Vendor of all of the Car products – both classic and vintage.
-- The output should display all vintage cars first (sorted
-- alphabetically by name), and all classic cars last (also sorted
-- alphabetically by name)

select * from products;
select productName, productLine, productScale, productVendor 
 from products
 where productLine like '%car%'
 order by productline desc, productName
 ;