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

		jo2.put("stockUnit", "YYYYRRRR");
		jo2.put("stockUOM", "TM");
		jo2.put("srcETY", "RETET34535435");
		jo2.put("srcTUU", "");
		jo2.put("spls", "");
		jo2.put("splsUOM", "Los Angeles KingsK");
		jo2.put("hazmatInd", "TR");

		

		JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();
		JsonObjectBuilder jsonObjectBuilder2 = Json.createObjectBuilder();
		JsonObjectBuilder jsonObjectBuilder3 = Json.createObjectBuilder();
		JsonArrayBuilder builder1 = Json.createArrayBuilder();
		JsonArrayBuilder builder2 = Json.createArrayBuilder();
		JsonArrayBuilder builder3 = Json.createArrayBuilder();
		JsonArrayBuilder builder4 = Json.createArrayBuilder();
		/************************************************************/

		jsonObjectBuilder2.add("slnNo", "TYUUSUU123");
		jsonObjectBuilder2.add("sustUOM", "TM");
		jsonObjectBuilder2.add("mrcU", "KBD-192609");
		jsonObjectBuilder2.add("itemUOM", "TA");
		jsonObjectBuilder2.add("itmeFU", "");
		jsonObjectBuilder2.add("scolt", "");
		jsonObjectBuilder2.add("stuDesc", "TINDER,WATBQT,QBTMVW,2323BK");
		jsonObjectBuilder2.add("hazmatInd", "Y");
		/************************************************************/

		builder2.add(Json.createObjectBuilder().add("seqNo", "1")
				.add("itemTxtDesc", "this can have anything related to Transaction of fields 81 characters").build());
		builder2.add(Json.createObjectBuilder().add("seqNo", "2")
				.add("itemTxtDesc", "this can have anything related to Transaction of fields 81 characters").build());

		JsonArray array3 = builder2.build();
		jsonObjectBuilder3.add("qnTxt", array3);

	

		/************************************************************/

		builder1.add(Json.createObjectBuilder().add("lnNo", "000000001").add("qrId", "EUTTWEWREUYEYWU42736843264624")
				.add("stnty", "5").add("sntrdQty", "").add("unitPrice", "349.99").add("kluPrice", "9.99")
				.add("srlNoReq", "Y").add("qnnTxts", jsonObjectBuilder3.build()).add("item", jsonObjectBuilder2)
				.build());

		JsonArray array2 = builder1.build();
		jsonObjectBuilder.add("qndLn", array2);

		JsonObject empObj = jsonObjectBuilder.build();

		/************************************************************/

		builder3.add(Json.createObjectBuilder().add("type", "Dealer-Smqrk Label").add("label1", "SWORTh INSTRUCTION LINE1")
				.add("label2", "MARCO INSTRUCTION LINE2").add("label3", "MARCO INSTRUCTION LINE3")
				.add("label4", "MARCO INSTRUCTION LINE4").add("label5", "MARCO INSTRUCTION LINE5")
				.add("label6", "MARCO INSTRUCTION LINE6").build());

		builder3.add(Json.createObjectBuilder().add("type", "Dealer-SmqrkList")
				.add("label1", "Marco-PackList SUGGEST LINE 1").add("label2", "Marco-PackList SUGGEST LINE 2")
				.add("label13", "Marco-PackList SUGGEST LINE 3").add("labe4", "Marco-PackList SUGGEST LINE 4")
				.add("label5", "Marco-PackList SUGGEST LINE 5").add("label6", "Marco-PackList SUGGEST LINE 6")
				.build());

		builder3.add(Json.createObjectBuilder().add("transactiontype 1", "Bank Acc")
				.add("label1", "Querting-PackList INDUCTION LINE 1")
				.add("label2", "Querting-PackList INDUCTION LINE 2")
				.add("label3", "Querting-PackList INDUCTION LINE 3")
				.add("label4", "Querting-PackList INDUCTION LINE 4")
				.add("label5", "Querting-PackList INDUCTION LINE 5")
				.add("label6", "Querting-PackList INDUCTION LINE 6").build());

		builder3.add(
				Json.createObjectBuilder().add("transactiontype 2", "Bank Acc")
				        .add("label1", "Marc Wan-Label INSTRUCTION LINE 1")
						.add("label2", "Marc Wan-Label INSTRUCTION LINE 2")
						.add("label3", "Marc Wan-Label INSTRUCTION LINE 3")
						.add("label4", "Marc Wan-Label INSTRUCTION LINE 4")
						.add("label5", "Marc Wan-Label INSTRUCTION LINE 5")
						.add("label6", "Marc Wan-Label INSTRUCTION LINE 6").build());

		builder3.add(Json.createObjectBuilder().add("transactiontype 3", "Bank Acc")
				.add("label1", "QuasLa-TrackList INSTRUCTION LINE 1")
				.add("label2", "QuasLa-TrackList INSTRUCTION LINE 2")
				.add("label3", "QuasLa-TrackList INSTRUCTION LINE 3")
				.add("label4", "QuasLa-TrackList INSTRUCTION LINE 4")
				.add("label5", "QuasLa-TrackList INSTRUCTION LINE 5")
				.add("label6", "QuasLa-TrackList INSTRUCTION LINE 6")
				.build());

		builder3.add(Json.createObjectBuilder().add("transactiontype 4", "Bank Acc")
				.add("label1", "Remote-TrackList INSTRUCTION LINE 1")
				.add("label2", "Remote-TrackList INSTRUCTION LINE 2")
				.add("label3", "Remote-TrackList INSTRUCTION LINE 3")
				.add("label4", "Remote-TrackList INSTRUCTION LINE 4")
				.add("label5", "Remote-TrackList INSTRUCTION LINE 5").build());

		builder3.add(Json.createObjectBuilder().add("transactiontype 5", "Bank Acc")
				.add("txt1", "Cront-PackList INSTRUCTION LINE 1").add("txt2", "Cront-PackList INSTRUCTION LINE 2")
				.add("txt3", "Cront-PackList INSTRUCTION LINE 3").add("txt4", "Cront-PackList INSTRUCTION LINE 4")
				.build());

		builder3.add(Json.createObjectBuilder().add("transactiontype 6", "Bank Acc")
				.add("txt1", "Quater-Label INSTRUCTION LINE 1").add("txt2", "Quater-Label INSTRUCTION LINE 2")
				.add("txt3", "Quater-Label INSTRUCTION LINE 3").add("txt4", "Quater-Label INSTRUCTION LINE 4")
				.add("txt5", "Quater-Label INSTRUCTION LINE 5").add("txt6", "Quater-Label INSTRUCTION LINE 6").build());

		JsonArray array4 = builder3.build();
		jsonObjectBuilder.add("inst", array4);
		JsonObject ordObj = jsonObjectBuilder.build();
	

		/************************************************************/

		builder4.add(Json.createObjectBuilder().add("type", "LiftTo").add("name", "Berkshire Hathaway")
				.add("addLn1", "Huston Rocket").add("addLn2", "1st Floor").add("city", "Muskut").add("state", "UYTJ")
				.add("zip", "35252234").add("country", "IN").build());

		builder4.add(Json.createObjectBuilder().add("type", "Mosq-PackList")
				.add("name", "Qualitest Mark").add("addLn1", "60 Workwal RD").add("addLn2", "suite")
				.add("city", "Floako").add("state", "NJRT").add("zip", "34234").add("country", "TASCO").build());

		builder4.add(Json.createObjectBuilder().add("type", "Mosq-Label").add("name", "Mosqo Label")
				.add("addLn1", "Quart RD").add("addLn2", "quite").add("city", "Emision").add("state", "NRTJ")
				.add("zip", "0824213817").add("country", "UK").build());

		builder4.add(Json.createObjectBuilder().add("type", "Mortwan").add("name", "Quanto Return")
				.add("addLn1", "Romoc to RD").add("addLn2", "qiur").add("city", "Plango").add("state", "NJUII")
				.add("zip", "08817").add("country", "UK").build());

		JsonArray array5 = builder4.build();
		jsonObjectBuilder.add("addr", array5);
		JsonObject ordObjAddr = jsonObjectBuilder.build();
	

		/************************************************************/
		

		jo.put("items", empObj);
		jo.put("insts", ordObj);
		jo.put("addrLst", ordObjAddr);

		jo.put("SortAs", "PWT");
		jo.put("GlossTerm", "TDSND");
		jo.put("custOrdNo", "EUUYUUYU7311273213");
		jo.put("Acronym", "2323231312");
		jo.put("mrdNo", "");
		jo.put("tranDt", "2019-09-21T16:16:10");
		jo.put("ordDt", "2019-09-21T16:16:10");
		jo.put("ordTot", "3213123.99");
		jo.put("Abbrev", "1414");
		jo.put("splsNode", "972");
		jo.put("scac", "ABCDEF");
		jo.put("scacCode", "GROUND");
		jo.put("hub", "3909");
		jo.put("zone", "TP");
		jo.put("logoId", "11111111");
		jo.put("spotCol", "11111111");
		jo.put("snowwall", "N");
		jo.put("pckLan", "Y");
		jo.put("ResDate", "2019-10-21T16:16:10");
		jo.put("qualTa", "11111");
		jo.put("darSa", "DLRRTE2345");
		jo.put("darTag", "11111");
		jo.put("tarRef", "DLRREF12345");
		jo.put("datShipcla", "MS001");
		jo.put("memopal", "11vtl");
		jo.put("princq", "epo");
		jo.put("econom", "Trequi");
		jo.put("plac1", "GH001");
		jo.put("matrk2", "1001");
		jo.put("mAtrkswa", "MSQuote");
		jo.put("smark", "Questment001");

		jo1.put("spa", jo);

		System.out.println("My Final Json object::::" + jo1);
	}

}
