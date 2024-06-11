-- INNER JOIN query where we can see the city
-- and country names in the city table and the country table together.
SELECT country.country_id, city.city_id ,city.city, country.country FROM city
INNER JOIN country ON country.country_id = city.city_id;

-- INNER JOIN query where we can see the payment id in the customer table
-- and the payment table and the first_name and last_name in the customer table together.
SELECT customer.customer_id, payment.customer_id first_name, last_name FROM customer
INNER JOIN payment ON payment.customer_id = customer.customer_id;

-- INNER JOIN query where we can see the customer table, the rental id in the rental table,
-- and the first_name and last_name in the customer table together.
SELECT customer.customer_id, rental.customer_id first_name, last_name FROM customer
INNER JOIN rental ON rental.customer_id = customer.customer_id;
