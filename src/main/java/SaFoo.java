import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.spi.json.JacksonJsonNodeJsonProvider;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

public class SaFoo {

	public static void main(String[] args) {
String yourActualJSONString = null;
		
		
		Configuration config= Configuration.builder()
			    .jsonProvider(new JacksonJsonNodeJsonProvider())
			    .mappingProvider(new JacksonMappingProvider())
			    .build();
		
		try {
			 yourActualJSONString = new String(Files.readAllBytes(Paths.get("D:\\workspaceSprint13\\RestAssuredBasics\\src\\jsonfile\\SampleInput.json")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("yourActualJSONString::"+yourActualJSONString);
	}
	
}
