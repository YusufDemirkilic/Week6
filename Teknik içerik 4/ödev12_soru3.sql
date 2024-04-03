SELECT rental_rate,replacement_cost FROM film
WHERE rental_rate =any
(
	SELECT  min(rental_rate)FROM film

)
AND replacement_cost=
(
	SELECT min(replacement_cost) from film
);
