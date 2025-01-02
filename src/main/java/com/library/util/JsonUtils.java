import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonUtils {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static <T> List<T> readFromFile(String filePath, Class<T> clazz) throws IOException {
        return objectMapper.readValue(new File(filePath), objectMapper.getTypeFactory().constructCollectionType(List.class, clazz));
    }

    public static <T> void writeToFile(String filePath, List<T> list) throws IOException {
        objectMapper.writeValue(new File(filePath), list);
    }
}