SELECT city.city, country.country FROM city
LEFT JOIN country
ON city.city_id = country.country_id ;
