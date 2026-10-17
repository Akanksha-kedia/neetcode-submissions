-- Write your query below

select c.customer_id, c.customer_name
from customers c 
LEFT JOIN orders o
ON c.customer_id = o.customer_id
group by c.customer_id
HAVING SUM(CASE WHEN o.product_name = 'C' THEN 1 ELSE 0 END) =0 and SUM(CASE WHEN o.product_name = 'A' THEN 1 ELSE 0 END)>0 and SUM(CASE WHEN o.product_name = 'B' THEN 1 ELSE 0 END)>0
ORDER BY c.customer_name;