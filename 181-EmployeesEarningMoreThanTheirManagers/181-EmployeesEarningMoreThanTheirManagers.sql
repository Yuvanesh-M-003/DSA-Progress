-- Last updated: 7/29/2026, 6:02:52 PM
select e.name as Employee 
 from Employee e join Employee m 
 on e.managerId=m.id 
 where e.salary>m.salary;