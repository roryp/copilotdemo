# fordemo

## Project Setup

This project is a Spring Boot 3 application using Java 17. It includes a REST API for managing albums.

### Project Structure

1. **Root Directory**:
   - `pom.xml`: Contains the project setup for a Spring Boot 3 application.

2. **Java Package**: `examples.azure.containerappsalbumapi` located at `src/main/java/examples/azure/containerappsalbumapi/`
   - **`AlbumController.java`**: A REST controller with specified endpoints.
   - **`Album.java`**: An entity class representing an album.

### Requirements

1. **`Album.java`** has the following fields:
   - `int id`
   - `String title`
   - `String artist`
   - `double price`
   - `String imageUrl`

2. **`AlbumController.java`** includes the following endpoints:
   - **GET `/`**: Returns an HTML string with a welcome message and a list of available endpoints.
   - **GET `/albums`**: Accepts optional query parameters `owner` (String), `lowPrice` (Double), and `highPrice` (Double). Filters albums based on these parameters.
   - **GET `/albums/{id}/owner`**: Returns the owner of the album with the specified ID.

3. **Private Helper Methods** in `AlbumController`:
   - `filterAlbumsByOwner(String owner, List<Album> albums)`: Filters albums by owner.
   - `filterAlbumsByPrice(Double lowPrice, Double highPrice, List<Album> albums)`: Filters albums by price range.
   - `loadAllAlbums()`: Loads a predefined list of albums.

## Running the Project

To run the project, follow these steps:

1. Ensure you have Java 17 installed on your machine.
2. Clone the repository.
3. Navigate to the root directory of the project.
4. Run the following command to start the Spring Boot application:

   ```bash
   ./mvnw spring-boot:run
   ```

5. The application will start, and you can access the API at `http://localhost:8080`.

### Endpoints

- **GET `/`**: Returns a welcome message and a list of available endpoints.
- **GET `/albums`**: Retrieves a list of albums with optional filtering by owner and price range.
- **GET `/albums/{id}/owner`**: Retrieves the owner of the album with the specified ID.
