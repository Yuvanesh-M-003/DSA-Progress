-- Last updated: 7/29/2026, 6:00:28 PM
select p.product_name , s.year , s.price 
from Sales s left join Product p
on s.product_id = p.product_id;