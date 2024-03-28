-- All data for first_name columns in actor and customer tables
SELECT first_name FROM customer
UNION
SELECT first_name FROM actor;

-- Intersecting data for first_name columns in actor and customer tables
SELECT first_name FROM customer
INTERSECT
SELECT first_name FROM actor;

-- For the first_name columns in the actor and customer tables,
-- data that is present in the first table but not in the second table
SELECT first_name FROM customer
EXCEPT
SELECT first_name FROM actor;
