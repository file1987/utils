package com.studio.elephant.utils;

import java.sql.Connection;


/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) throws Exception {

			/*
		  Interpreter bsh = new Interpreter(); 
		  StringBuilder builder = new  StringBuilder();
		  builder.append("boolean result = 1 < 2 ;");
		  
		  try {
		  Object t = bsh.eval(builder.toString());
		  System.out.println(bsh.get("result"));
		  } catch (EvalError e) {
			  e.printStackTrace(); 
		 }
		 */
		/*
		String money = "999";
		System.out.println(Float.valueOf(money)/100);
		*/
		
		/*
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("javascript");
		
		
		String jsFileName = App.class.getClassLoader().getResource("containsLocation.js").getFile();
		
		FileReader reader = new FileReader(jsFileName);
		
		
		engine.eval(reader);
		engine.eval(new FileReader("https://maps.googleapis.com/maps/api/js?key=AIzaSyCDSfGzpWWpNrzSN_1GCHZfl_Jd3UaScgw&amp;signed_in=true&amp;libraries=geometry&amp;callback=initMap"));
		
		
		Invocable invoke = (Invocable)engine;    

		boolean c = (Boolean) invoke.invokeFunction("containsLocation", "[18.466,-66.118]", "[{lat: 25.774, lng: -80.19},{lat: 18.466, lng: -66.118},{lat: 32.321, lng: -64.757}]");    

		System.out.println("c:"+c);
		*/
		
		/*
		
		GeoApiContext context = null;
		String origin = null;
		String destination = null;
		
		DirectionsApiRequest requst = DirectionsApi.getDirections(context, origin, destination);
		*/
		
		/*
		LatLng point = LatLng.newInstance(18.466, -66.118);
		
		PolygonOptions options = PolygonOptions.newInstance();
		Polygon polygon = Polygon.newInstance(options );
		// build our poly
	    LatLng[] a2 = new LatLng[3];
	    a2[0] = LatLng.newInstance(25.774, -80.19);
	    a2[1] = LatLng.newInstance(18.466, 18.466);
	    a2[2] = LatLng.newInstance(32.321, -64.757);
	  
	    
	    JsArray<LatLng> path1 = ArrayHelper.toJsArray(a2);

	    JsArray<JsArray<LatLng>> left = JsArray.createArray().cast();
	    left.push(path1);
	    polygon.setPathss(left);
	    
		PolyUtils.containsLocation(point, polygon);*/
		
		
		/*
		Location point = Location.newInstance(21.289, -59.340);
		
		
		// build our poly
		Location[] polygon = new Location[3];
		polygon[0] = Location.newInstance(25.774, -80.19);
		polygon[1] = Location.newInstance(18.466, -66.118);
		polygon[2] = Location.newInstance(32.321, -64.757);
	  
	 
	    
		System.out.println(MyPolyUtils.containsLocation(point, polygon));
		
		*/

		/*
		 * Map<Long,Map<Long,List<Long>>> paramsMap = Maps.newHashMap();
		 * 
		 * List<Long> paramsList = Lists.newArrayList();
		 * 
		 * List<String> of = ImmutableList.of("a", "b", "c", "d");
		 */

		/*
		 * Cache<Long, Long> longCache =
		 * CacheBuilder.newBuilder().removalListener(new RemovalListener<Long,
		 * Long>() {
		 * 
		 * public void onRemoval(RemovalNotification<Long, Long> notification) {
		 * System.out.println("remove ~~~~" + notification.getKey());
		 * 
		 * } }).build();
		 * 
		 * longCache.put(1l, 2l); System.out.println(longCache.toString());
		 * System.out.println(longCache.size()); longCache.invalidate(1l);
		 * System.out.println(longCache.toString());
		 * System.out.println(longCache.size());
		 */

		/*
		 * 
		 * String url ="http://localhost:8080/OneMenu/app/toptags/listMenu";
		 * 
		 * Map<String, String> params = Maps.newHashMap();
		 * params.put("type","A"); params.put("startNum","0");
		 * params.put("range","20"); params.put("tags","abc,egf");
		 * params.put("latitude","10.10"); params.put("longitude","20.55");
		 * 
		 * String respond = HttpClientUtil.doPostMethod(url, params );
		 * 
		 * System.out.println(respond);
		 */

		// System.out.println("3".compareTo("2"));

		// NumberFormat nf = NumberFormat.getInstance();
		// System.out.print(nf.format(BigDecimal.valueOf(3.10500000)));
		/*
		 * float f = 0.99f; DecimalFormat df = new DecimalFormat("#0.00");
		 * 
		 * double d =Double.valueOf(df.format(f)); System.out.println(d);
		 */

		// sk_test_I61ZVKQAPjXPGOhwCJO4ZxbF
		/*
		Stripe.apiKey = "sk_test_I61ZVKQAPjXPGOhwCJO4ZxbF";

		Map<String, Object> customerParams = new HashMap<String, Object>();
		customerParams.put("limit", 3);
		// ---cus_6waUhPSytBNIst
		// --card_16ihJvDmp0phDjZrN4xBEdjF
		System.out.println(Customer.all(customerParams));

		
		Map<String, Object> defaultCardParams = new HashMap<String, Object>();
		defaultCardParams.put("number", "4242424242424242");
		defaultCardParams.put("exp_month", 12);
		defaultCardParams.put("exp_year", 2015);
		defaultCardParams.put("cvc", "123");
		defaultCardParams.put("name", "file Cardholder");
		defaultCardParams.put("address_line1", "140 2nd Street");
		defaultCardParams.put("address_line2", "4th Floor");
		defaultCardParams.put("address_city", "San Francisco");
		defaultCardParams.put("address_zip", "94105");
		defaultCardParams.put("address_state", "CA");
		defaultCardParams.put("address_country", "USA");
		
		Map<String, Object> defaultChargeParams = new HashMap<String, Object>();
		defaultChargeParams.put("amount", 100);
		defaultChargeParams.put("currency", "usd");
		//defaultChargeParams.put("card", defaultCardParams);
		defaultChargeParams.put("customer", "cus_6waUhPSytBNIst");
		Charge createdCharge = Charge.create(defaultChargeParams);
		System.out.println(createdCharge);
		*/
		/*
		Map<String, Object> tokenParams = new HashMap<String, Object>();
		Map<String, Object> cardParams = new HashMap<String, Object>();
		cardParams.put("number", "4242424242424242");
		cardParams.put("exp_month", 9);
		cardParams.put("exp_year", 2016);
		cardParams.put("cvc", "314");
		tokenParams.put("card", cardParams);

		Token token = Token.create(tokenParams);
		System.out.println(token);
		
		//Customer customer = Customer.retrieve("cus_6waUhPSytBNIst");
		//customer.setDefaultSource((token.getId());
		Map<String, Object> defaultCustomerParams = new HashMap<String, Object>();
		//defaultCustomerParams.put("card", defaultCardParams);
		defaultCustomerParams.put("description", "file Customer");
		defaultCustomerParams.put("source", token.getId());
		Customer customer = Customer.create(defaultCustomerParams);
		System.out.println(customer);
		
		
		Map<String, Object> defaultChargeParams = new HashMap<String, Object>();
		defaultChargeParams.put("amount", 100);
		defaultChargeParams.put("currency", "usd");
		//defaultChargeParams.put("card", defaultCardParams);
		defaultChargeParams.put("customer", customer.getId());
		Charge createdCharge = Charge.create(defaultChargeParams);
		System.out.println(createdCharge);
		
		
		
		
		/*
		Map<String, Object> defaultBankAccountParams = new HashMap<String, Object>();
		defaultBankAccountParams.put("country", "US");
		defaultBankAccountParams.put("routing_number", "110000000");
		defaultBankAccountParams.put("account_number", "000123456789");*/
		/*
		Map<String, Object> defaultDebitCardParams = new HashMap<String, Object>();
		
		defaultDebitCardParams.put("number", "4000056655665556");
		defaultDebitCardParams.put("exp_month", 12);
		defaultDebitCardParams.put("exp_year", 2015);
		defaultDebitCardParams.put("cvc", "123");
		defaultDebitCardParams.put("name", "J Bindings Debitholder");
		defaultDebitCardParams.put("address_line1", "140 2nd Street");
		defaultDebitCardParams.put("address_line2", "4th Floor");
		defaultDebitCardParams.put("address_city", "San Francisco");
		defaultDebitCardParams.put("address_zip", "94105");
		defaultDebitCardParams.put("address_state", "CA");
		defaultDebitCardParams.put("address_country", "USA");
		
		
		Map<String, Object> defaultRecipientParams = new HashMap<String, Object>();
		defaultRecipientParams.put("name", "J Test");
		defaultRecipientParams.put("type", "individual");
		defaultRecipientParams.put("tax_id", "000000000");
		defaultRecipientParams.put("bank_account", defaultBankAccountParams);
		defaultRecipientParams.put("card", defaultDebitCardParams);
		
		Recipient recipient = Recipient.create(defaultRecipientParams);
		
		System.out.println(recipient);
		*/
		//Account.retrieve(id, options)
		
		/*		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("amount", 100);
		params.put("currency", "usd");
		params.put("destination", "");
		
		Transfer createdTransfer = Transfer.create(params);
		
		System.out.println(createdTransfer);
		*/
		/*
		Map<String, Object> defaultCustomerParams = new HashMap<String, Object>();
		defaultCustomerParams.put("card", defaultCardParams);
		defaultCustomerParams.put("description", "file Customer");
		Customer customer = Customer.create(defaultCustomerParams);
		*/
		/****
		 * {
		 * 
		 * "type":1, //返回的界面 "content":"", //界面内容 "unshow":[] //界面里面有些内容不显示的id }
		 * 
		 * { "type":2, //错误提示 "msg" :"" ; //提示信息 }
		 * 
		 * { "type":3, //返回数据 "data":"", //返回需要的数据 }
		 ***/
		
		//System.out.println(Double.valueOf("49.99"));
		
	

	}
}
