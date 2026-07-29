-- Last updated: 7/29/2026, 6:02:58 PM
select p.firstName , p.lastName ,a.city ,a.state 
from Person p 
left join Address a on p.personId = a.personId ;