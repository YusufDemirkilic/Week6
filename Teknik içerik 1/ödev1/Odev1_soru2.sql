SELECT title,length FROM film
WHERE title LIKE '%n'
ORDER by length 
OFFSET 2
LIMIT 5