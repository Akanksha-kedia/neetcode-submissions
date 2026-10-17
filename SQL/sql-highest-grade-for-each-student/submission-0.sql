-- Write your query below
WITH cte1 AS (
    SELECT *,
           ROW_NUMBER() OVER (
               PARTITION BY student_id
               ORDER BY score DESC, exam_id ASC
           ) AS rn
    FROM exam_results
)
SELECT student_id, exam_id, score
FROM cte1
WHERE rn = 1;