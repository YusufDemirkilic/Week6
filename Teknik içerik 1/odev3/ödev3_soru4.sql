SELECT country_id,COUNT(city)FROM city
GROUP BY country_id
ORDER BY country_id
