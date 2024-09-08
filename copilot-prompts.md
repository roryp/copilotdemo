# GitHub Copilot Prompts for Project Files

## Prompt for `pom.xml`

```
Create a `pom.xml` file for a Spring Boot 3 project using Java 17. The project should include dependencies for Spring Boot Starter Web, Spring Boot Starter Actuator, and Spring Boot Starter Test. The groupId should be `com.example`, the artifactId should be `containerappsalbumapi`, and the version should be `0.0.1-SNAPSHOT`.
```

## Prompt for `AlbumApplication.java`

```
Create a Java class named `AlbumApplication` in the package `examples.azure.albumapi`. This class should be annotated with `@SpringBootApplication` and contain a `main` method to start the Spring Boot application.
```

## Prompt for `AlbumController.java`

```
Create a Java class named `AlbumController` in the package `examples.azure.albumapi`. This class should be annotated with `@RestController` and include the following endpoints:

- **GET `/`**: Returns an HTML string with a welcome message and a list of available endpoints.
- **GET `/albums`**: Accepts optional query parameters `owner` (String), `lowPrice` (Double), and `highPrice` (Double). Filters albums based on these parameters.
- **GET `/albums/{id}/owner`**: Returns the owner of the album with the specified ID.

Additionally, include the following private helper methods:

- `filterAlbumsByOwner(String owner, List<Album> albums)`: Filters albums by owner.
- `filterAlbumsByPrice(Double lowPrice, Double highPrice, List<Album> albums)`: Filters albums by price range.
- `loadAllAlbums()`: Loads a predefined list of albums.
```

## Prompt for `Album.java`

```
Create a Java class named `Album` in the package `examples.azure.albumapi`. This class should have the following fields:

- `int id`
- `String title`
- `String artist`
- `double price`
- `String imageUrl`

Include getter and setter methods for each field and a constructor to initialize all fields.
```
