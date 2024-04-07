SELECT rental_rate FROM film
WHERE rental_rate =
(
	SELECT  max(rental_rate) FROM film
);