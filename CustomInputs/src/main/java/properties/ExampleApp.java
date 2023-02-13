package properties;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.Properties;

public class ExampleApp {
    private final URI baseUri;

    public ExampleApp(Properties properties) throws MalformedURLException {
        baseUri = URI.create(properties.getProperty("baseUri"));
    }

    public URI getBaseUri() {
        return baseUri;
    }
}
