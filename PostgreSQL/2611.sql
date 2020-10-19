SELECT movies.id, movies.name 
FROM movies, genres 
WHERE genres.description = 'Action' 
AND movies.id_genres = genres.id