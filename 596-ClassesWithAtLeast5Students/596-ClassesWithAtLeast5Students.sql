-- Last updated: 7/29/2026, 6:01:19 PM
# Write your MySQL query statement below
select class from Courses group by class having count(*)>=5;