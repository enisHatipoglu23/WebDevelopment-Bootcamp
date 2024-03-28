-- The average of the values in the rental rate column in the movie table
SELECT ROUND(AVG(rental_rate), 3) FROM film;
-- 2.980

-- How many of the verbs in the movie table start with the character 'C'?
SELECT COUNT(title) FROM film
WHERE title LIKE 'C%';
-- 92

-- Among the movies in the movie table,
-- how many minutes is the longest movie with a rental rate equal to 0.99?
SELECT MAX(length) FROM film
WHERE rental_rate = 0.99;
-- 184

-- How many different replacement_cost values are there
-- for movies in the movie table that are longer than 150 minutes?
SELECT COUNT(DISTINCT replacement_cost) FROM film
WHERE length > 150;
-- 21
