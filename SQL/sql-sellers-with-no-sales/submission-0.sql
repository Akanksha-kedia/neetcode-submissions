-- Write your query below

SELECT s.seller_name
FROM seller s
WHERE s.seller_id NOT IN (
    SELECT o.seller_id
    FROM orders o
    WHERE EXTRACT(YEAR FROM o.sale_date) = 2020
)
ORDER BY s.seller_name;