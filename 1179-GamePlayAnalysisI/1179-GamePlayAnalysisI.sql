-- Last updated: 7/29/2026, 6:00:26 PM
# Write your MySQL query statement below
select  distinct player_id , min(event_date) as first_login from Activity group by player_id;