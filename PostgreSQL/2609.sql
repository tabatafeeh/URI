SELECT categories.name, SUM(amount) AS sum
FROM products, categories 
WHERE categories.id = products.id_categories
GROUP BY categories.id