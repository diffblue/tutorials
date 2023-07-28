package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
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
