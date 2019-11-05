package sa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONTokener;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.testng.Assert;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.json.JacksonJsonNodeJsonProvider;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

import io.restassured.response.Response;

public class LibFunction {

	Properties propConfig = new Properties();
	String configPath = "src/test/resources";
	Properties propresorceURL = new Properties();
	static JSONObject request;

	/* Generic function for Fetching the Property value */

	public Map<String, String> fetchProp() {
		try {
			propConfig.load(new FileInputStream(configPath + "File.properties"));
			// propConfig.load(new FileInputStream(f));
			propresorceURL.load(new FileInputStream(configPath + "File.properties"));
			propConfig.putAll(propresorceURL);

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Map<String, String> mapProp = propConfig.entrySet().stream()
				.collect(Collectors.toMap(e -> (String) e.getKey(), e -> (String) e.getValue()));

		// logger.info("Map :"+mapProp);
		return mapProp;

	}

	/*
	 * Generic method to fetch the dynamic request json
	 * 
	 */

	public JSONObject requestJson(String filepath, String reqName) {

		String configPath = "src/test/resources/" + filepath;
		File folder = new File(configPath);
		File[] listOfFiles = folder.listFiles();

		for (File f : listOfFiles) {
			if (f.getName().toLowerCase().contains(reqName)) {
				try {
					request = (JSONObject) new JSONParser().parse(new FileReader(f.getPath()));
				} catch (IOException | ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

		return request;

	}

	/**
	 * Generic method to get the current date
	 **/

	public static String getCurrentDate() {
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
				.format(Calendar.getInstance().getTime());
		return timeStamp;
	}

	/*
	 * We configure the jsonProvider using Configuration builder.
	 */

	public Configuration setConfigIntialize() {
		Configuration config = Configuration.builder().jsonProvider(new JacksonJsonNodeJsonProvider())
				.mappingProvider(new JacksonMappingProvider()).build();
		return config;

	}

	/*
	 * Generic method for dynamically change the request values in json file and
	 * write in file
	 * 
	 */

	public ObjectNode dynamicJsonRequestFile(String jsonPathTraverse, String jsonSetVal, String readFilePath,
			String writeFilePath) {

		String yourActualJSONString = null;
		ObjectNode newJson = null;
		Configuration config = setConfigIntialize();

		try {
			yourActualJSONString = new String(Files.readAllBytes(Paths.get(readFilePath)), StandardCharsets.UTF_8);
			newJson = JsonPath.using(config).parse(yourActualJSONString).set(jsonPathTraverse, jsonSetVal).json();
			FileWriter writer = new FileWriter(new File(writeFilePath));
			writer.append(newJson.toString());
			writer.flush();
			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return newJson;

	}

	/*
	 * Generic method to fetch the dynamic request json
	 * 
	 */

	public JSONObject requestJson(String filepath) {

		String configPath = "src/test/resources/" + filepath;
		File folder = new File(configPath);
		File[] listOfFiles = folder.listFiles();

		for (File f : listOfFiles) {
			if (f.getName().toLowerCase().contains("request")) {
				try {
					request = (JSONObject) new JSONParser().parse(new FileReader(f.getPath()));
				} catch (IOException | ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

		return request;

	}

	/*
	 * Function to generate the random created by data
	 * 
	 */
	public static int createdBy() {
		Random rand = new Random();
		int num = rand.nextInt(9000000) + 1000000000;
		return num;

	}

	/**
	 * Method for converting JSON object into HashMap
	 * 
	 * @param object
	 * @return
	 */
	public static Map<String, Object> toMap(JSONObject object) {
		Map<String, Object> map = new HashMap<String, Object>();

		Iterator<String> keysItr = object.keySet().iterator();
		while (keysItr.hasNext()) {
			String key = keysItr.next();
			Object value = object.get(key);

			if (value instanceof JSONArray) {
				value = toList((JSONArray) value);
			}

			else if (value instanceof JSONObject) {
				value = toMap((JSONObject) value);
			}
			map.put(key, value);
		}
		return map;
	}

	/**
	 * Converting JSON object into Map
	 * 
	 * @param json
	 * @return
	 */
	public static Map<String, Object> jsonToMap(JSONObject json) {
		Map<String, Object> retMap = new HashMap<String, Object>();

		if (json != null) {
			retMap = toMap(json);
		}
		return retMap;
	}

	/**
	 * Method for converting JSONArray into List
	 * 
	 * @param array
	 * @return
	 */
	public static List<Object> toList(JSONArray array) {
		List<Object> list = new ArrayList<Object>();
		for (int i = 0; i < array.size(); i++) {
			Object value = array.get(i);
			if (value instanceof JSONArray) {
				value = toList((JSONArray) value);
			}

			else if (value instanceof JSONObject) {
				value = toMap((JSONObject) value);
			}
			list.add(value);
		}
		return list;
	}

	/*
	 * Generic method to compare Values
	 * 
	 */
	public void compareValues(String actual, String expected) {
		try {
			Assert.assertEquals(actual, expected);
			System.out.println("values are equal");
		} catch (Exception e) {
			System.out.println("values are not equal");
		}
	}

	/**
	 * @param requestJson
	 * @param responseJson
	 * @return this method is for comapring 2 json, and return boolean value
	 *         accordingly.
	 * @throws AdminTestException
	 */
	public boolean jsonComparator(String expectedJson, String responseJson) throws ExceptionHandling {
		try {
			JSONAssert.assertEquals(expectedJson, responseJson, false);
			return true;
		} catch (JSONException | AssertionError e) {
			// TODO Auto-generated catch block
			System.out.println("EXPECTED AND ACTUAL DATA MISMATCH");
			System.out.println("MISMATCH DETAILS:");
			System.out.println(e.getMessage());
			System.out.println("Obtained ACTUAL RESPONSE is:== " + responseJson);
			throw new ExceptionHandling("Failed at output validation");
		}
	}

	public JSONObject objectToJSONObject(Object object) {
		Object json = null;
		JSONObject jsonObject = null;
		try {
			json = new JSONTokener(object.toString()).nextValue();
		} catch (JSONException e) {
			e.printStackTrace();
		}
		if (json instanceof Object) {
			jsonObject = (JSONObject) json;
		}
		return jsonObject;
	}

	/**
	 * method to fetch the specific value from response
	 * 
	 * @param response
	 * @return
	 */
	public String getValueFromResponse(Response response) {

		String val = "{\r\n" + "   \"name\": \"Lavanya Ranganathan\",\r\n"
				+ "   \"job\": \"Automation Test Engineer\",\r\n" + "   \"id\": \"445\",\r\n"
				+ "   \"createdAt\": \"2019-11-04T10:08:05.239Z\"\r\n" + "}";

		String value = null;
		try {
			value = response.jsonPath().get("name").toString();
		} catch (NullPointerException e) {
			Assert.assertTrue(false, "Exception occured while getting error message from response  " + e.getMessage());
		}
		return value;
	}

	/**
	 * The method to remove the json element from the json file
	 * 
	 * @return String
	 * @throws ParseException
	 */

	public String removeJsonElement(String readFilePath, ArrayList<String> eleToRemove) throws ParseException {
		String jsnString = null;
		String val = null;

		try {
			String yourActualJSONString = new String(Files.readAllBytes(Paths.get(readFilePath)),
					StandardCharsets.UTF_8);
			DocumentContext jsonContext = JsonPath.parse(yourActualJSONString);

			for (int i = 0; i < eleToRemove.size(); i++) {
				val = eleToRemove.get(i);
				jsonContext.delete(val);
				jsnString = jsonContext.jsonString();
				/*
				 * JSONParser parser = new JSONParser(); jsnObject =
				 * (JSONObject) parser.parse(myOutput);
				 */
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsnString;

	}

	public String setValueToJsonNode(String JSONString, Map<String, String> map) {
		Configuration config = setConfigIntialize();
		ObjectNode newJson = null;
		int count = 0;
		
		for (Entry<String, String> entry : map.entrySet()) {
			// System.out.println("My Key:"+entry.getKey() + "=" + "My
			// value:"+entry.getValue());

			if (count == 0) {
				newJson = JsonPath.using(config).parse(JSONString).set(entry.getKey(), entry.getValue()).json();
			} else {
				newJson = JsonPath.using(config).parse(newJson).set(entry.getKey(), entry.getValue()).json();
			}
			

			count++;
		}

		
		return newJson.toString();

	}

	public String setValueToJsnNode(String JSONString, String key, String val) {
		Configuration config = setConfigIntialize();
		ObjectNode newJson = null;

		newJson = JsonPath.using(config).parse(JSONString).set(key, val).json();

		return newJson.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
