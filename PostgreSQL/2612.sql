SELECT movies.id, movies.name
FROM movies
INNER JOIN genres ON movies.id_genres = genres.id
WHERE genres.description = 'Action'
AND movies.id in(
SELECT DISTINCT movies_actors.id_movies
FROM movies_actors
INNER JOIN actors ON actors.id = movies_actors.id_actors
WHERE actors.name = 'Miguel Silva' OR actors.name = 'Marcelo Silva'
)