package dci.j24e01;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

public class JavaNetHTTPService implements NetworkService{
    @Override
    public String getContent(String url) {
        try {
            URL contentURL = URI.create(url).toURL();
            InputStream inputStream = (InputStream) contentURL.getContent();
            String result = new String(inputStream.readAllBytes());
            return result;
        } catch (IOException e) {
            return null;
        }
    }
}
