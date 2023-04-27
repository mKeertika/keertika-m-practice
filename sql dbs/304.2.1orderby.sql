show tables;

SELECT 
    customerName
FROM
    customers
WHERE
    country IN ('USA' , 'France')
;

select customerNumber, country, creditLimit
from customers
where country in ('USA','France') and creditLimit>100000
order by creditLimit
;

select productName
from PRODUCTS
where buyprice between '90' and '100'
;

select productcode, productName, buyprice
from PRODUCTS
where buyprice >= '90' and buyprice<='100'
order by buyprice
;

select productcode, productName, buyprice
from PRODUCTS
where buyprice  not between '20' and '100'
order by buyprice
;


select country, customername, salesrepemployeenumber
from customers
where salesrepemployeenumber is null
order by customername
;


select customername, salesrepemployeenumber, country
from customers
where salesrepemployeenumber is not null
order by customername;

