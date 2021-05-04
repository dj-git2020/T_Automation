package experiments;

import java.awt.Toolkit;

public class Myexperiments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int beepCount = 10;
		for (int i = 0; i < beepCount; ++i) {
			System.out.println("Beep : " + i);
			// Ring the bell again using the Toolkit 
			Toolkit.getDefaultToolkit().beep();
			try {
				Thread.sleep(1000); // introduce delay
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		//Test changes

	}

}
