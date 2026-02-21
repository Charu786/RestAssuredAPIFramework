package charusagarapiutils;

import charusagarapipayload.PostPayload;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class JsonUtils {

    public static String prettyPrint(String jsonString) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);

            Object json = mapper.readValue(jsonString, Object.class);
            return mapper.writeValueAsString(json);

        } catch (Exception e) {
            e.printStackTrace();
            return jsonString;
        }
    }
    public static Object[][] getJSONData(String filePath) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        List<PostPayload>datalist = Arrays.asList(
                mapper.readValue(
                        new File(filePath),
                        PostPayload[].class
                )
        );
        Object[][] data = new Object[datalist.size()][1];
        for (int i = 0; i < datalist.size(); i++) {
            data[i][0] = datalist.get(i);
        }
        return data;
    }
}
