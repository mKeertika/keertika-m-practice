use banking;

-- For each product, show the product name "Product" and the product type name
-- "Type..
SELECT 
    p.name AS 'Product', pt.NAME AS 'Type'
FROM
    product p
        JOIN
    product_type pt ON p.product_type_cd = pt.PRODUCT_TYPE_CD;

-- 2: Problem Statement:
-- For each branch, list the branch name and city, plus the last name and title of each
-- employee who works in that branch.
SELECT 
    b.name, b.city, e.last_name, e.title
FROM
    branch b
        JOIN
    employee e ON b.BRANCH_ID = e.ASSIGNED_BRANCH_ID;

-- 3:  Problem statement:
-- Show a list of each unique employee title.

SELECT DISTINCT
    title, CONCAT(FIRST_NAME, ' ', LAST_NAME) AS Name
FROM
    employee;

-- 4: Problem statement:
-- Show the last name and title of each employee, along with the last name and title
-- of that employee's boss.
SELECT 
    e.last_name employee, e.title, m.last_name, m.title
FROM
    employee e
        JOIN
    employee m ON m.employeenumber = e.reportsTo
;


-- 5: Problem Statement:
-- For each account, show the name of the account's product, the available balance,
-- and the customer's last name.

SELECT 
    p.name, a.AVAIL_BALANCE, i.LAST_NAME
FROM
    account a
        JOIN
    product p USING (product_cd)
        JOIN
    customer c USING (cust_id)
        JOIN
    individual i USING (cust_id)
    order by 1
;


-- 6:  Problem Statement:
-- List all account transaction details for individual customers whose last name starts
-- with 'T'.

select i.last_name, a.ACCOUNT_ID, a.LAST_ACTIVITY_DATE
from account a join customer c
using (cust_id)
join individual i using (cust_id)
where i.last_name like 'T%' 
;