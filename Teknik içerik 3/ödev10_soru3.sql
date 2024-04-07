SELECT customer.first_name,customer.last_name,rental.rental_id FROM customer
FULL JOIN rental
ON customer.customer_id = rental.rental_id;
