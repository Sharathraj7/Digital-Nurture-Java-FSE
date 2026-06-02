/* 15. Event Session Time Conflict
Identify overlapping sessions within the same event (i.e., session start and end times that
conflict).
*/
SELECT a.event_id, a.session_id AS session_1, a.title AS title_1,
       b.session_id AS session_2, b.title AS title_2
FROM Sessions a
JOIN Sessions b ON a.event_id = b.event_id
  AND a.session_id < b.session_id
  AND a.start_time < b.end_time
  AND a.end_time > b.start_time;