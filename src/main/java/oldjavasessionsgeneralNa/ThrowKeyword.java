package oldjavasessionsgeneralNa;

public class ThrowKeyword {

	public static void main(String[] args) {
		// what is the diff between throw and throws??

		System.out.println("ABC");
		try {
			throw new Exception("Binkas exception-custom created");
		} catch (Exception e) {

		}
		System.out.println("PQR");

		String Exec_Flag = "";
		if (Exec_Flag.equals("")) {
			try {
				throw new Exception("Exec_Flag is Blank Exception");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("handled");
	}

}
