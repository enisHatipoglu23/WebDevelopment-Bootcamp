-- The movies in the movie table are listed according to their rating values.
SELECT rating, COUNT(*) FROM film
GROUP BY rating
ORDER BY rating;

-- When we group the movies in the movie table according to the replacement cost column,
-- we get the replacement_cost value with more than 50 movies and the corresponding number of movies.
SELECT replacement_cost, COUNT(*) FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50
ORDER BY replacement_cost;

-- Customer numbers corresponding to store_id values in the customer table.
SELECT store_id, COUNT(*) FROM customer
GROUP BY store_id;

-- After grouping the city data in the city table according to the country_id column,
-- the country_id information and the number of cities containing the highest number of cities are displayed.
SELECT country_id, COUNT(city) FROM city
GROUP BY country_id
ORDER BY COUNT(city) DESC
LIMIT 1;
-- 44/60