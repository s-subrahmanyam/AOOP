public class Main {
    public static void main(String[] args) {
        // Create an instance of URLShortener
        URLShortener urlShortener = new URLShortener();
        
        // Shorten a URL
        String originalURL = "http://example.com";
        String shortURL = urlShortener.shortenURL(originalURL);
        System.out.println("Shortened URL: " + shortURL);
        
        // Retrieve the original URL using the short URL
        String retrievedURL = urlShortener.getOriginalURL(shortURL);
        System.out.println("Original URL: " + retrievedURL);

        // Additional example
        String anotherOriginalURL = "http://example.org";
        String anotherShortURL = urlShortener.shortenURL(anotherOriginalURL);
        System.out.println("Another Shortened URL: " + anotherShortURL);

        String anotherRetrievedURL = urlShortener.getOriginalURL(anotherShortURL);
        System.out.println("Another Original URL: " + anotherRetrievedURL);
    }
}
