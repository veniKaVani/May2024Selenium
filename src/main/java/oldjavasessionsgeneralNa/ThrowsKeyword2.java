package oldjavasessionsgeneralNa;

public class ThrowsKeyword2 {

	public static void main(String[] args) {
		ThrowsKeyword2 obj = new ThrowsKeyword2();
        obj.sum();
        System.out.println("ABC");
	}

	public void sum()  {
		try {
         div();
		}catch(Throwable e) {
			
		}
	}

	public void div() throws ArithmeticException {
		int i = 9 / 0;
	}


	}


