(
	SELECT first_name FROM actor
ORDER BY first_name
LIMIT 10)
EXCEPT
(
	SELECT first_name FROM customer
ORDER BY first_name
LIMIT 10);
