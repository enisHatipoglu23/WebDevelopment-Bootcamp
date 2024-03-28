-- LEFT JOIN query where we can see the city and country names
-- in the city table and the country table together.
SELECT country.country_id, city.city_id, city.city, country.country FROM country
LEFT OUTER JOIN city ON country.country_id = city.city_id;


-- RIGHT JOIN query where we can see the payment id in the customer table
-- and the payment table and the first_name and last_name in the customer table together.
SELECT customer.customer_id, payment.customer_id, customer.first_name, customer.last_name FROM payment
RIGHT JOIN customer ON payment.customer_id = customer.customer_id;


-- FULL JOIN query where we can see the customer table, the rental id in the rental table,
-- and the first_name and last_name in the customer table together.
SELECT customer.customer_id, rental.customer_id first_name, last_name FROM customer
FULL JOIN rental ON rental.customer_id = customer.customer_id;