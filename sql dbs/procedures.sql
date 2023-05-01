use classicmodels;

delimiter $$
create procedure GetOfficeUSA()
begin
select * from offices where country='USA'
end 
delimiter ;


call GetOfficeUSA();
