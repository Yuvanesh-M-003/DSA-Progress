-- Last updated: 8/3/2026, 5:11:20 PM
# Write your MySQL query statement below
select teacher_id , count(distinct subject_id) as cnt
from Teacher 
group by teacher_id;