package oldjavasessionsgeneralNa;

public class ThrowsKeyword {

	public static void main(String[] args) throws ArithmeticException {
		ThrowsKeyword obj = new ThrowsKeyword();
        obj.sum();
	}

	public void sum() throws ArithmeticException {
         div();
	}

	public void div() {
		int i = 9 / 0;
	}
}
