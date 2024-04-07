(
	SELECT first_name FROM actor
ORDER BY first_name
LIMIT 10)
UNION
(
	SELECT first_name FROM customer
ORDER BY first_name
LIMIT 10);
