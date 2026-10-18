SELECT e.left_operand,
       e.operator,
       e.right_operand,
       CASE
           WHEN e.operator = '<' AND l.value < r.value THEN TRUE
           WHEN e.operator = '>' AND l.value > r.value THEN TRUE
           WHEN e.operator = '=' AND l.value = r.value THEN TRUE
           ELSE FALSE
       END AS value
FROM expressions e
JOIN variables l
    ON e.left_operand = l.name
JOIN variables r
    ON e.right_operand = r.name;