package examples.azure.containerappsalbumapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AlbumController {

    @GetMapping("/")
    public String welcome() {
        return "<html><body><h1>Welcome to the Album API</h1><p>Available endpoints:</p><ul><li>GET /</li><li>GET /albums</li><li>GET /albums/{id}/owner</li></ul></body></html>";
    }

    @GetMapping("/albums")
    public List<Album> getAlbums(@RequestParam(required = false) String owner,
                                 @RequestParam(required = false) Double lowPrice,
                                 @RequestParam(required = false) Double highPrice) {
        List<Album> albums = loadAllAlbums();
        if (owner != null) {
            albums = filterAlbumsByOwner(owner, albums);
        }
        if (lowPrice != null || highPrice != null) {
            albums = filterAlbumsByPrice(lowPrice, highPrice, albums);
        }
        return albums;
    }

    @GetMapping("/albums/{id}/owner")
    public String getAlbumOwner(@PathVariable int id) {
        List<Album> albums = loadAllAlbums();
        for (Album album : albums) {
            if (album.getId() == id) {
                return album.getArtist();
            }
        }
        return "Owner not found";
    }

    private List<Album> filterAlbumsByOwner(String owner, List<Album> albums) {
        return albums.stream()
                .filter(album -> album.getArtist().equalsIgnoreCase(owner))
                .collect(Collectors.toList());
    }

    private List<Album> filterAlbumsByPrice(Double lowPrice, Double highPrice, List<Album> albums) {
        return albums.stream()
                .filter(album -> (lowPrice == null || album.getPrice() >= lowPrice) &&
                        (highPrice == null || album.getPrice() <= highPrice))
                .collect(Collectors.toList());
    }

    private List<Album> loadAllAlbums() {
        List<Album> albums = new ArrayList<>();
        albums.add(new Album(1, "Album 1", "Artist 1", 10.99, "url1"));
        albums.add(new Album(2, "Album 2", "Artist 2", 12.99, "url2"));
        albums.add(new Album(3, "Album 3", "Artist 1", 15.99, "url3"));
        return albums;
    }
}
