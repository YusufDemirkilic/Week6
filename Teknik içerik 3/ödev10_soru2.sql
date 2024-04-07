SELECT customer.first_name,customer.last_name, payment.payment_id FROM customer
RIGHT JOIN payment
ON customer.customer_id = payment.payment_id;
