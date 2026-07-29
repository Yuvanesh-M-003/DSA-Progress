-- Last updated: 7/29/2026, 6:01:27 PM
select e.name , b.bonus 
from Employee e left join 
Bonus b 
on e.empId = b.empId 
where b.bonus < 1000 or b.bonus is null;


