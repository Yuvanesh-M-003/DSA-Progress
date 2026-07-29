-- Last updated: 7/29/2026, 6:01:24 PM
# Write your MySQL query statement below
select customer_number 
from Orders 
group by customer_number 
order by count(customer_number) desc
limit 1;