# Background
My Journey with VS Code Insider: Rewriting with New Java Syntax

I started my journey in software development way back in 1998, using Microsoft Access. At the time, it was revolutionary, offering a simple, procedural approach to coding. Yet, as time moved on, I realized that procedural coding, while effective, didn’t evolve to meet the growing needs of modern software development.

Fast forward to 2013, and I found myself diving into JBoss Forge. Here, I got more exposed to patterns and reusable code, but something was missing—it didn’t quite prepare me for the future of software development, especially as the industry was moving toward greater automation and abstraction.

In 2017, my perspective changed when I encountered WindUp and OpenRewrite. These tools introduced me to AST (Abstract Syntax Trees), and I started working more with OpenJDK migrations. I realized then that software wasn’t just about writing code anymore; it was about migrating and modernizing to keep pace with the world of cloud and container-based architectures.

Things took a major turn in 2021 when GitHub Copilot came into the picture. This was a game-changer, especially for greenfield projects. Developers' workflows were transforming, and it was all about the mantra to "Do it better." GitHub Copilot helped me:

Generate new projects in seconds.
Generate classes with simple prompts.
Even come up with commit messages, freeing up more time for me to focus on logic and architecture.
One of the key advancements Copilot introduced is the CodeLens feature, which shows suggestions for improvements directly in the code. For every suggestion, additional CodeLens will appear, displaying what the solution is and highlighting areas for improvement. By clicking on the CodeLens, the user is brought into the GitHub Copilot inline chat dialog, where they can view the code diff and choose to “Accept” or “Discard” the changes. Once accepted, the workflow is completed.

Partial Inspection is another great feature. Sometimes, we don’t want to inspect the entire class because the code is too complex. Instead, we can select a portion of the code, click the lightbulb icon, and choose "Rewrite with new Java syntax".

These features allow developers to inspect their code in a much more flexible way.

However, not all my work was in greenfield projects. I had to deal with brownfield projects—older codebases that needed modernization. With Java Version 23 on the horizon, it was time to take a fresh look at how we migrate and modernize legacy applications, ensuring they are ready for the future.

Looking ahead to 2025, we’re entering a new era with GitHub Workspaces, providing more seamless collaboration and development environments tailored to the evolving needs of teams.

To utilize this refactoring feature, developers need to install both the Insider (Pre-release) Extension Pack for Java and the GitHub Copilot extensions (with a GitHub Copilot license).

In essence, my journey to using VS Code Insider to rewrite with new Java syntax is one of constant evolution—learning from past technologies and tools, adopting new ones, and always striving to make coding more efficient and modern. This feature aims to leverage AI to offer helpful suggestions and seamless refactoring for Java developers. I truly believe this will boost developer productivity, and if you have any feedback, feel free to open an issue on our GitHub repo!

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
