package sa;

import java.io.StringWriter;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;

public class CreateJsonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();
		 
        // create Json array with only values
        JsonArrayBuilder builder1 = Json.createArrayBuilder();
        builder1.add("Tom");
        builder1.add("John");
        JsonArray array1 = builder1.build();
        jsonObjectBuilder.add("people", array1);
 
        // create an array of key-value pairs
        JsonArrayBuilder builder2 = Json.createArrayBuilder();
        // create each key-value pair as seperate object and add it to the array
        builder2.add(Json.createObjectBuilder().add("email", "javacodex@yahoo.com").build());
        builder2.add(Json.createObjectBuilder().add("mobile", "123-456-7890").build());
 
        JsonArray array2 = builder2.build();
        // add contacts array object
        jsonObjectBuilder.add("contacts", array2);
 
        JsonObject empObj = jsonObjectBuilder.build();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = Json.createWriter(stringWriter);
        jsonWriter.writeObject(empObj);
        jsonWriter.close();
 
        System.out.println(stringWriter.toString());
	}

}
