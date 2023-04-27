select c.customername as 'Customer Name', concat(e.lastname,' ',e.firstname) as 'Sales Rep'
from customers c
inner join employees e
on c.salesRepEmployeeNumber=e.employeeNumber
order by c.customerName asc;

