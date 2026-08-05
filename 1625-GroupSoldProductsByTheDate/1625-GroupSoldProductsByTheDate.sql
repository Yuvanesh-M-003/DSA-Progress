-- Last updated: 8/5/2026, 12:34:21 PM
# Write your MySQL query statement below
select sell_date ,
 count(distinct product) as num_sold, 
 group_concat(distinct product separator ',') as products
from Activities group by sell_date order by sell_date asc;