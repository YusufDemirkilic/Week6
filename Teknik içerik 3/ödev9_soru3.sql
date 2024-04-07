SELECT customer.first_name,customer.last_name ,rental.rental_id FROM customer
JOIN rental on customer.customer_id = rental.rental_id;
