package selclassesNav;

public class StringUtility {
	
	private String UUID;

	private StringUtility() {};
	
	public static String getRandomEmail() {
		return "BinAuto"+System.currentTimeMillis()+"@appName.com";
		
		
		//return "BinAuto"+UUID+"@app123.com";
	}

}
