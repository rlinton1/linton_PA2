package linton_p1;

public class Decrypter {
	
	public void decrypt(int decryptNumber) {
		
		int a, b, c, d;
		a = (decryptNumber % 10);
		b = (decryptNumber / 10) % 10;
		c = (decryptNumber / 100) % 10;
		d = (decryptNumber / 1000) % 10;
		
		int x, r, s, t;	
		 // Replace each digit with the result and
		 // getting the remainder after dividing the 
		 // new value by 10.
		x = (a + 3) % 10;
		r = (b + 3) % 10;
		s = (c + 3) % 10;
		t = (d + 3) % 10;	
		System.out.println("The decrypted number is: " + r + x + t + s);		
	}
}

