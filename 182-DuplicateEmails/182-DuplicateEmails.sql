-- Last updated: 7/29/2026, 6:02:50 PM
SELECT Email
FROM Person
GROUP BY Email
HAVING COUNT(Email) > 1;