package sa;


import java.util.HashMap;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import org.json.simple.JSONObject;

public class SampleBckp {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject jo = new JSONObject();
		JSONObject jo1 = new JSONObject();
		Map jo2 = new HashMap();

		JSONObject jo4 = new JSONObject();

		jo2.put("custSKU", "CUSTSKU123");
		jo2.put("custUOM", "UM");
		jo2.put("srcSKU", "ESD-192609");
		jo2.put("splsSKU", "");
		jo2.put("splsUOM", "");
		jo2.put("skuDesc", "BINDER,DURIABLE,VW,5BK");
		jo2.put("hazmatInd", "Y");

		

		JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();
		JsonObjectBuilder jsonObjectBuilder2 = Json.createObjectBuilder();
		JsonObjectBuilder jsonObjectBuilder3 = Json.createObjectBuilder();
		JsonArrayBuilder builder1 = Json.createArrayBuilder();
		JsonArrayBuilder builder2 = Json.createArrayBuilder();
		JsonArrayBuilder builder3 = Json.createArrayBuilder();
		JsonArrayBuilder builder4 = Json.createArrayBuilder();
		/************************************************************/

		jsonObjectBuilder2.add("custSKU", "CUSTSKU123");
		jsonObjectBuilder2.add("custUOM", "UM");
		jsonObjectBuilder2.add("srcSKU", "ESD-192609");
		jsonObjectBuilder2.add("srcUOM", "EA");
		jsonObjectBuilder2.add("splsSKU", "");
		jsonObjectBuilder2.add("splsUOM", "");
		jsonObjectBuilder2.add("skuDesc", "BINDER,DURIABLE,VW,5BK");
		jsonObjectBuilder2.add("hazmatInd", "Y");
		/************************************************************/

		builder2.add(Json.createObjectBuilder().add("seqNo", "1")
				.add("lnTxtDesc", "this can have anything related to product of fields 81 characters").build());
		builder2.add(Json.createObjectBuilder().add("seqNo", "2")
				.add("lnTxtDesc", "this can have anything related to product of fields 81 characters").build());

		JsonArray array3 = builder2.build();
		jsonObjectBuilder3.add("lnTxt", array3);

	

		/************************************************************/

		builder1.add(Json.createObjectBuilder().add("lnNo", "000000001").add("rsrvId", "CUSTESND101520191234510")
				.add("ordQty", "5").add("rsrvdQty", "").add("unitPrice", "9.99").add("lnPrice", "9.99")
				.add("srlNoReq", "Y").add("lnTxts", jsonObjectBuilder3.build()).add("item", jsonObjectBuilder2)
				.build());

		JsonArray array2 = builder1.build();
		jsonObjectBuilder.add("ordLn", array2);

		JsonObject empObj = jsonObjectBuilder.build();

		/************************************************************/

		builder3.add(Json.createObjectBuilder().add("type", "Dealer-Label").add("txt1", "DEALER INSTRUCTION LINE1")
				.add("txt2", "DEALER INSTRUCTION LINE2").add("txt3", "DEALER INSTRUCTION LINE3")
				.add("txt4", "DEALER INSTRUCTION LINE4").add("txt5", "DEALER INSTRUCTION LINE5")
				.add("txt6", "DEALER INSTRUCTION LINE6").build());

		builder3.add(Json.createObjectBuilder().add("type", "Dealer-PackList")
				.add("txt1", "Dealer-PackList INSTRUCTION LINE 1").add("txt2", "Dealer-PackList INSTRUCTION LINE 2")
				.add("txt3", "Dealer-PackList INSTRUCTION LINE 3").add("txt4", "Dealer-PackList INSTRUCTION LINE 4")
				.add("txt5", "Dealer-PackList INSTRUCTION LINE 5").add("txt6", "Dealer-PackList INSTRUCTION LINE 6")
				.build());

		builder3.add(Json.createObjectBuilder().add("type", "Marketing-PackList")
				.add("txt1", "Marketing-PackList INSTRUCTION LINE 1")
				.add("txt2", "Marketing-PackList INSTRUCTION LINE 2")
				.add("txt3", "Marketing-PackList INSTRUCTION LINE 3")
				.add("txt4", "Marketing-PackList INSTRUCTION LINE 4")
				.add("txt5", "Marketing-PackList INSTRUCTION LINE 5")
				.add("txt6", "Marketing-PackList INSTRUCTION LINE 6").build());

		builder3.add(
				Json.createObjectBuilder().add("type", "Special-Label").add("txt1", "Special-Label INSTRUCTION LINE 1")
						.add("txt2", "Special-Label INSTRUCTION LINE 2").add("txt3", "Special-Label INSTRUCTION LINE 3")
						.add("txt4", "Special-Label INSTRUCTION LINE 4").add("txt5", "Special-Label INSTRUCTION LINE 5")
						.add("txt6", "Special-Label INSTRUCTION LINE 6").build());

		builder3.add(Json.createObjectBuilder().add("type", "Special-PackList")
				.add("txt1", "Special-PackList INSTRUCTION LINE 1").add("txt2", "Special-PackList INSTRUCTION LINE 2")
				.add("txt3", "Special-PackList INSTRUCTION LINE 3").add("txt4", "Special-PackList INSTRUCTION LINE 4")
				.add("txt5", "Special-PackList INSTRUCTION LINE 5").add("txt6", "Special-PackList INSTRUCTION LINE 6")
				.build());

		builder3.add(Json.createObjectBuilder().add("type", "Return-PackList")
				.add("txt1", "Return-PackList INSTRUCTION LINE 1").add("txt2", "Return-PackList INSTRUCTION LINE 2")
				.add("txt3", "Return-PackList INSTRUCTION LINE 3").add("txt4", "Return-PackList INSTRUCTION LINE 4")
				.add("txt5", "Return-PackList INSTRUCTION LINE 5").build());

		builder3.add(Json.createObjectBuilder().add("type", "Miscl-PackList")
				.add("txt1", "Miscl-PackList INSTRUCTION LINE 1").add("txt2", "Miscl-PackList INSTRUCTION LINE 2")
				.add("txt3", "Miscl-PackList INSTRUCTION LINE 3").add("txt4", "Miscl-PackList INSTRUCTION LINE 4")
				.build());

		builder3.add(Json.createObjectBuilder().add("type", "Single-Label")
				.add("txt1", "Single-Label INSTRUCTION LINE 1").add("txt2", "Single-Label INSTRUCTION LINE 2")
				.add("txt3", "Single-Label INSTRUCTION LINE 3").add("txt4", "Single-Label INSTRUCTION LINE 4")
				.add("txt5", "Single-Label INSTRUCTION LINE 5").add("txt6", "Single-Label INSTRUCTION LINE 6").build());

		JsonArray array4 = builder3.build();
		jsonObjectBuilder.add("inst", array4);
		JsonObject ordObj = jsonObjectBuilder.build();
	

		/************************************************************/

		builder4.add(Json.createObjectBuilder().add("type", "ShipTo").add("name", "HiTouch Best Office Products Comp")
				.add("addLn1", "26 Boulder Run").add("addLn2", "1st Floor").add("city", "Oakland").add("state", "NJ")
				.add("zip", "074362352").add("country", "US").build());

		builder4.add(Json.createObjectBuilder().add("type", "ShipFrom-PackList")
				.add("name", "Essendand Edison Packlist").add("addLn1", "60 Saw Mill Pond RD").add("addLn2", "suite")
				.add("city", "Edison").add("state", "NJ").add("zip", "08817").add("country", "US").build());

		builder4.add(Json.createObjectBuilder().add("type", "ShipFrom-Label").add("name", "Essendand Edison Label")
				.add("addLn1", "60 Saw Mill Pond RD").add("addLn2", "suite").add("city", "Edison").add("state", "NJ")
				.add("zip", "08817").add("country", "US").build());

		builder4.add(Json.createObjectBuilder().add("type", "Return").add("name", "Essendand Edison Return")
				.add("addLn1", "60 Saw Mill Pond RD").add("addLn2", "suite").add("city", "Edison").add("state", "NJ")
				.add("zip", "08817").add("country", "US").build());

		JsonArray array5 = builder4.build();
		jsonObjectBuilder.add("addr", array5);
		JsonObject ordObjAddr = jsonObjectBuilder.build();
	

		/************************************************************/
		

		jo.put("ordLns", empObj);
		jo.put("insts", ordObj);
		jo.put("addrLst", ordObjAddr);

		jo.put("bussUnit", "ESND");
		jo.put("srcOrdNo", "ORDESND");
		jo.put("custOrdNo", "CUSTESND10152019123459");
		jo.put("spltOrdNo", "9876543222");
		jo.put("ordNo", "");
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

		System.out.println("My Final Json object::::" + jo1);
	}

}
