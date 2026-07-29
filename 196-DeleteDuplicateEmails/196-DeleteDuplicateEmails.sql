-- Last updated: 7/29/2026, 6:02:47 PM
delete p1
from Person p1
join Person p2 
on p1.email = p2.email and p1.id>p2.id;