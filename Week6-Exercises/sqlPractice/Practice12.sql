-- In the movie table, the movie length is shown in the length column.
-- How many movies are longer than the average movie length?
SELECT COUNT(*) FROM film
WHERE film.length > (SELECT AVG(film.length) FROM film);
-- 489

-- How many movies have the highest rental rates in the movie table?
SELECT COUNT(*) FROM film
WHERE film.rental_rate = (SELECT MAX(rental_rate) FROM film) ;
-- 336

-- Movies with the lowest rental rates and lowest replacement cost values in the movie table
(
	SELECT title, rental_rate, replacement_cost FROM film
	WHERE film.rental_rate = (SELECT MIN(rental_rate) FROM film)
)
UNION ALL
(
	SELECT title, rental_rate, replacement_cost FROM film
	WHERE film.replacement_cost = (SELECT MIN(replacement_cost) FROM film)
);

-- Customers who made the most purchases in the payment table
SELECT customer_id, COUNT(*) AS num FROM payment
GROUP BY customer_id
ORDER BY num desc
LIMIT 10;