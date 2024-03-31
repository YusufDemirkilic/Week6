SELECT rental_rate,length FROM film
WHERE  rental_rate=0.99
ORDER BY length DESC
LIMIT 5