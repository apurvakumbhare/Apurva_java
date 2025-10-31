public class Codec {
 String store;
   public String encode(String longUrl) {
        store= longUrl;

        return "tinyurl";
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String ans=null;

        return store;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));