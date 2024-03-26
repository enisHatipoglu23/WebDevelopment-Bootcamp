-- 5 longest movies in the movie table whose title ends with the character 'n'
SELECT title, length FROM film
WHERE title ILIKE '%n'
ORDER BY length DESC
LIMIT 5;

-- The second 5 shortest movies in the movie table whose movie names end with the character 'n'
SELECT title, length FROM film
WHERE title ILIKE '%n'
ORDER BY length ASC
OFFSET 1
LIMIT 5;

-- The first 4 data in the descending order according to
--the last_name column in the customer table, provided that store_id is 1;
SELECT * FROM customer
WHERE store_id = 1
ORDER BY last_name DESC
LIMIT 4;