**Task:** Create a Spring Boot 3 project using Java 17 with a `pom.xml` in the root directory.

### Project Structure:
1. **Root Directory**:
   - Include a `pom.xml` file configured for a Spring Boot 3 project setup.
2. **Java Package**: `examples.azure.albumapi` located at `src/main/java/examples/azure/albumapi/`
   - **`AlbumApplication.java`**: The main application class to run the Spring Boot application.
   - **`AlbumController.java`**: A REST controller with specified endpoints.
   - **`Album.java`**: An entity class representing an album.
   - **`DemoClass.java`**: A Java class demonstrating the usage of various JDK features from JDK 8 to JDK 22.

### Requirements:
1. **`pom.xml`** should:
   - Be configured to use **Java 17** and the **Spring Boot 3.0.0** dependency.
   - Include dependencies for Spring Boot Starter Web, Spring Boot Starter Actuator, and Spring Boot Starter Test.

2. **`AlbumApplication.java`** should:
   - Be annotated with `@SpringBootApplication`.
   - Contain the `main` method to start the Spring Boot application.

3. **`Album.java`** should have the following fields:
   - `int id`
   - `String title`
   - `String artist`
   - `double price`
   - `String imageUrl`

4. **`AlbumController.java`** should include the following endpoints:
   - **GET `/`**: Returns an HTML string with a welcome message and a list of available endpoints.
   - **GET `/albums`**: Accepts optional query parameters `owner` (String), `lowPrice` (Double), and `highPrice` (Double). Filters albums based on these parameters.
   - **GET `/albums/{id}/owner`**: Returns the owner of the album with the specified ID.

5. **Private Helper Methods** in `AlbumController`:
   - `filterAlbumsByOwner(String owner, List<Album> albums)`: Filters albums by owner.
   - `filterAlbumsByPrice(Double lowPrice, Double highPrice, List<Album> albums)`: Filters albums by price range.
   - `loadAllAlbums()`: Loads a predefined list of albums.

6. **`DemoClass`** should contain:
   - Examples of lambda expressions, optional class, stream API, repeating annotations, modules, private interface methods, diamond operator enhancements, `var` for local variables and lambda parameters, new `String` methods, `Optional.isEmpty()`, switch expressions, text blocks, records, pattern matching for `instanceof`, `Stream.toList()`, record patterns, pattern matching for switch, sequenced collections, enhanced switch, and generic main method.

### Additional Requirements:
- Ensure the repository contains all the necessary Java files and is structured properly as a Spring Boot project.
- Include a `README.md` that describes the project setup, how to build, and run the application.
- Add a section to the `README.md` explaining the migration to the JDK 17 language features.