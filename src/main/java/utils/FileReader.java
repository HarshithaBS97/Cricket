package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;

public class FileReader {

    private static final String TEMPLATES = "templates/";
    private static final String JSON_DATA_PATH = "src/main/resources/templates/";


    public static Object loadTemplate(ResourceName resourceName, Class containerClass) {
        return load(resourceName, containerClass, TEMPLATES, FileType.JSON);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private static Object load(ResourceName resourceName, Class containerClass, String directory, FileType fileType) {
        String resourceFile = resourceName.toString() + fileType.toString();
        try (InputStream templateStream = FileReader.class.getResourceAsStream("/" + directory + resourceFile)) {
            if (templateStream == null)
                throw new IOException("Invalid Resource Name: " + resourceName);
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            return (Object) mapper.readValue(templateStream, containerClass);
        } catch (IOException e) {
            System.out.println("Unable to load the fie: [{}] " +  e.getStackTrace());
        }
        return null;
    }

    public static String getResourcePathForJSON(String fileName) {
        return Paths.get(JSON_DATA_PATH, fileName).toAbsolutePath().toString() + FileType.JSON;
    }
}
