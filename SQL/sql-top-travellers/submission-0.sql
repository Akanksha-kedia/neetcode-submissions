-- Write your query below

WITH cte AS (
    SELECT user_id, SUM(distance) AS distance
    FROM rides
    GROUP BY user_id
)
SELECT u.name, COALESCE(r.distance, 0) AS travelled_distance
FROM users u
LEFT JOIN cte r
    ON u.id = r.user_id
    order by travelled_distance DESC, u.name ASC;