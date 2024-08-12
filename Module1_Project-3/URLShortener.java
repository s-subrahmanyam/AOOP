import java.util.HashMap;
import java.util.Map;

public class URLShortener {
    private Map<String, String> urlMap;
    private int id;

    public URLShortener() {
        urlMap = new HashMap<>();
        id = 1;
    }

    // Method to shorten a given URL
    public String shortenURL(String originalURL) {
        String shortURL = "http://short.url/" + id++;
        urlMap.put(shortURL, originalURL);
        return shortURL;
    }

    // Method to retrieve the original URL from a shortened URL
    public String getOriginalURL(String shortURL) {
        return urlMap.get(shortURL);
    }
}
