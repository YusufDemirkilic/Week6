SELECT customer.first_name,customer.last_name ,payment.payment_id FROM customer
JOIN payment on customer.customer_id = payment.payment_id;
