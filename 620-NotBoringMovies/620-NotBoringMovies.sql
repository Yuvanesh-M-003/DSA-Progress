-- Last updated: 8/11/2026, 11:50:38 AM
# Write your MySQL query statement below
select * from Cinema 
where id % 2 != 0 and description != 'boring'
order by rating desc;