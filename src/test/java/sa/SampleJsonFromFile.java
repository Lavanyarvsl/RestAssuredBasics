package sa;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.log4j.BasicConfigurator;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.json.JacksonJsonNodeJsonProvider;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

public class SampleJsonFromFile {

	
	
	/*https://github.com/json-path/JsonPath
*/	
	public static void main(String[] args) {
		
		String yourActualJSONString = null;
		
		BasicConfigurator.configure();
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
		
		

			ObjectNode newJson=JsonPath.using(config).parse(yourActualJSONString).set("$.ord.bussUnit","abcd").json();
			System.out.println("Value::"+newJson.toString());
		
		
		
		

	}

}
