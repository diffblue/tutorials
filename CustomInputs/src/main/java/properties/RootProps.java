package properties;

import java.net.URI;
import java.util.Properties;

public class RootProps {

    private final URI baseUri;

    public RootProps(Properties properties) {
        baseUri = URI.create(properties.getProperty("baseUri"));
    }

    public String getBaseUri() {
        return baseUri.toString();
    }
}
