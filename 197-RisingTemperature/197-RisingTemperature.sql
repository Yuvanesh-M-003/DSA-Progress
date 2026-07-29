-- Last updated: 7/29/2026, 6:02:45 PM
select w1.id from Weather w1
join Weather w2 
ON DATEDIFF(w1.recordDate, w2.recordDate) = 1
where w1.temperature > w2.temperature;