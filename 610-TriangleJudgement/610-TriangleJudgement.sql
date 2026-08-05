-- Last updated: 8/5/2026, 12:35:29 PM
# Write your MySQL query statement below
select x , y , z ,
case 
when (x + y >z) and (x + z > y) and (y + z > x) then 'Yes'
else 'No'
end as triangle 
from Triangle;