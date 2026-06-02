/* 4. Peak Session Hours
Count how many sessions are scheduled between 10 AM to 12 PM for each event.*/
SELECT e.title, COUNT(s.session_id) AS session_count
FROM Events e
JOIN Sessions s ON e.event_id = s.event_id
WHERE HOUR(s.start_time) >= 10 AND HOUR(s.start_time) < 12
GROUP BY e.event_id, e.title;