SELECT contactLastname, contactFirstname 
ORDER BY contactLastname
FROM customers;

SELECT Country, count(*) FROM customers GROUP BY country;
SELECT DISTINCT(Country) FROM customers;
select *
from orders;
select year(orderDate) as year, count(orderNumber) from orders
group by year;

