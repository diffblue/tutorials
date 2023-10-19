package properties;

import java.net.URI;
import java.util.Properties;

public class ResourcesProps {
    private final URI baseUri;

    public ResourcesProps(Properties properties) {
        baseUri = URI.create(properties.getProperty("baseUri"));
    }

    public String getBaseUri() {
        return baseUri.toString();
    }

}