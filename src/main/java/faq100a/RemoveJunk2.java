package faq100a;

public class RemoveJunk2 {
      //How do you remove junk characters from a String??
	public static void main(String[] args) {
		//using regular expression:[^a-zA-Z0-9]
		
		String s = "@#$%^& Telugu *&^%$ tamil @#$% malayalam";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
