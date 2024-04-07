-- city ile country tablo birleştir.
SELECT city.city,country.country FROM city
JOIN country on country.country_id=city.city_id;
