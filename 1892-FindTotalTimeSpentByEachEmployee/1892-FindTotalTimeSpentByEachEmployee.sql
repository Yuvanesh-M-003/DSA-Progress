-- Last updated: 8/5/2026, 12:34:09 PM
select event_day as day , emp_id , sum(out_time-in_time) as total_time
from Employees
group by emp_id,event_day;

-- select event_day as day , emp_id , sum(out_time-in_time) as total_time
-- from Employees
-- group by emp_id,event_day;