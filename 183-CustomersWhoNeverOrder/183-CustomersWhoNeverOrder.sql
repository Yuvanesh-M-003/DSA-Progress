-- Last updated: 7/29/2026, 6:02:48 PM
select name as Customers from Customers c 
left outer join Orders o 
on c.id = o.customerId
where o.customerId is null;