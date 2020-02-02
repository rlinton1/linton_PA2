package linton_p1;

public class Encrypter {
	public void encrypt(int encryptNumber) {
			
		int a, b, c, d;
		a = (encryptNumber % 10);
		b = (encryptNumber / 10) % 10;
		c = (encryptNumber / 100) % 10;
		d = (encryptNumber / 1000) % 10;
		
		int x, r, s, t;
	    // Replace each digit with the result of adding 7 to 
		// the digit and getting the remainder after dividing 
		// the new value by 10.
		x = (a + 7) % 10;
		r = (b + 7) % 10;
		s = (c + 7) % 10;
		t = (d + 7) % 10;
		System.out.println("The encrypted number is: " + r + x + t + s);		
	}	
}

