package properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.jupiter.api.Test;

class ResourcesPropsTest {
    /**
     * Method under test: {@link ResourcesProps#ResourcesProps(Properties)}
     */
    @Test
    void testConstructor() throws IOException {
        Properties properties = new Properties();
        Class<ResourcesProps> forNameResult = ResourcesProps.class;
        try (InputStream resourceAsStream = forNameResult.getResourceAsStream("/Resources.properties")) {
            properties.load(resourceAsStream);
        }
        assertEquals("https://app.resources.com/", (new ResourcesProps(properties)).getBaseUri());
    }

    /**
     * Method under test: {@link ResourcesProps#getBaseUri()}
     */
    @Test
    void testGetBaseUri() throws IOException {
        Properties properties = new Properties();
        Class<ResourcesProps> forNameResult = ResourcesProps.class;
        try (InputStream resourceAsStream = forNameResult.getResourceAsStream("/Resources.properties")) {
            properties.load(resourceAsStream);
        }
        assertEquals("https://app.resources.com/", (new ResourcesProps(properties)).getBaseUri());
    }
}

