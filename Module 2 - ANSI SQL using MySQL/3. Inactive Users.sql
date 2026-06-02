/* 3. Inactive Users
Retrieve users who have not registered for any events in the last 90 days.*/
SELECT u.user_id, u.full_name, u.email
FROM Users u
WHERE u.user_id NOT IN (
    SELECT DISTINCT r.user_id FROM Registrations r
    WHERE r.registration_date >= CURDATE() - INTERVAL 90 DAY
);