package sa;

import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;

import org.json.simple.JSONObject;

public class SampleNestedJsonArrayRequest {

	public static void main(String[] args) {
		
		JSONObject jo = new JSONObject(); 
		JSONObject jo1 = new JSONObject(); 
		JSONObject jo2 = new JSONObject();
		/* Map<String, String> ordMap = new LinkedHashMap<String, String>(31);
		 ordMap.put("bussUnit", "ESND");
		 ordMap.put("srcOrdNo", "ORDESND");
		 ordMap.put("custOrdNo", "CUSTESND10152019123459");
		 ordMap.put("spltOrdNo", "9876543222");
		 ordMap.put("ordNo", "ESND");
		 ordMap.put("tranDt", "2019-09-21T16:16:10");
		 ordMap.put("ordDt", "2019-09-21T16:16:10");
		 ordMap.put("ordTot", "999.99");
		 ordMap.put("node", "085");
		 ordMap.put("splsNode", "972");
		 ordMap.put("scac", "ABCDEF");
		 ordMap.put("scacCode", "GROUND");
		 ordMap.put("hub", "3909");
		 ordMap.put("zone", "UP");
		 ordMap.put("logoId", "11111111");
		 ordMap.put("shpLblId", "11111111");
		 ordMap.put("snglLblReq", "N");
		 ordMap.put("pckLstReq", "Y");
		 ordMap.put("reqShpDt", "2019-10-21T16:16:10");
		 ordMap.put("dlrRteTag", "11111");
		 ordMap.put("dlrRte", "DLRRTE2345");
		 ordMap.put("dlrRefTag", "11111");
		 ordMap.put("dlrRef", "DLRREF12345");
		 ordMap.put("dlrShrtRte", "DS001");
		 ordMap.put("dlrMemoPO", "11vtl");
		 ordMap.put("endConPOTag", "epo");
		 ordMap.put("endConPONum", "POBrderBridge");
		 ordMap.put("barCd1", "NJ001");
		 ordMap.put("barCd2", "1001");
		 ordMap.put("barCd3", "DSROUTE");
		 ordMap.put("barCd4", "Department001");*/
		 
		 // jo.put("ord", ordMap);
		// System.out.println("J1:"+jo);
		 
		 JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();
		 JsonArrayBuilder builder1 = Json.createArrayBuilder();
	        // create each key-value pair as seperate object and add it to the array
	        builder1.add(Json.createObjectBuilder().add("lnNo", "000000001").add("rsrvId", "CUSTESND101520191234510")
	        		.add("ordQty", "5").add("rsrvdQty", "").add("unitPrice", "9.99")
	        		.add("lnPrice", "9.99").add("srlNoReq", "Y").build());
	       /* builder1.add(Json.createObjectBuilder().add("rsrvId", "CUSTESND101520191234510").build());
	        builder1.add(Json.createObjectBuilder().add("ordQty", "5").build());
	        builder1.add(Json.createObjectBuilder().add("rsrvdQty", "").build());
	        builder1.add(Json.createObjectBuilder().add("unitPrice", "9.99").build());
	        builder1.add(Json.createObjectBuilder().add("lnPrice", "9.99").build());
	        builder1.add(Json.createObjectBuilder().add("srlNoReq", "Y").build());
	        */
	        
	        JsonArray array2 = builder1.build();
	        // add contacts array object
	        jsonObjectBuilder.add("ordLn", array2);
	        
	        
	        
	        JsonObject empObj = jsonObjectBuilder.build();
	        StringWriter stringWriter = new StringWriter();
	        JsonWriter jsonWriter = Json.createWriter(stringWriter);
	        jsonWriter.writeObject(empObj);
	        jsonWriter.close();
	 
	       
	        
	        //jo1.put("ordLns", empObj);
	        //jo.putAll(ordMap);
	       
	        jo.put("ordLns", empObj);
	        
	        
	        
	        
	        jo.put("bussUnit", "ESND");
	        jo.put("srcOrdNo", "ORDESND");
	        jo.put("custOrdNo", "CUSTESND10152019123459");
	        jo.put("spltOrdNo", "9876543222");
	        jo.put("ordNo", "ESND");
	        jo.put("tranDt", "2019-09-21T16:16:10");
	        jo.put("ordDt", "2019-09-21T16:16:10");
	        jo.put("ordTot", "999.99");
	        jo.put("node", "085");
	        jo.put("splsNode", "972");
	        jo.put("scac", "ABCDEF");
	        jo.put("scacCode", "GROUND");
	        jo.put("hub", "3909");
	        jo.put("zone", "UP");
	        jo.put("logoId", "11111111");
	        jo.put("shpLblId", "11111111");
	        jo.put("snglLblReq", "N");
	        jo.put("pckLstReq", "Y");
	        jo.put("reqShpDt", "2019-10-21T16:16:10");
	        jo.put("dlrRteTag", "11111");
	        jo.put("dlrRte", "DLRRTE2345");
	        jo.put("dlrRefTag", "11111");
	        jo.put("dlrRef", "DLRREF12345");
	        jo.put("dlrShrtRte", "DS001");
	        jo.put("dlrMemoPO", "11vtl");
	        jo.put("endConPOTag", "epo");
	        jo.put("endConPONum", "POBrderBridge");
	        jo.put("barCd1", "NJ001");
	        jo.put("barCd2", "1001");
	        jo.put("barCd3", "DSROUTE");
	        jo.put("barCd4", "Department001");
	        
	        
	        
	        jo1.put("ord", jo);
	       // jo1.put("ord", ordMap);
	       // jo1.put("ere", jo);
	        
	        //jo2.put(jo,jo1);
	        //jo2.put("ord", jo1);
	       // jo2.put("1111", "value");
	       // jo2.put("222222", "value2");
	       // jo.putAll(jo1);
	        System.out.println("EEEEEEEEEEEE::::"+jo1);
	        
	}
	
}
