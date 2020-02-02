package linton_p1;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		// create scanner to get input from user
		Scanner input = new Scanner(System.in);
		// make print statement to prompt user to enter 4 numbers	
		System.out.println("Enter a 4 digits number to be encrypted: ");
		int encryptNumber = input.nextInt();
		// call encrypter class into main	
		Encrypter number1 = new Encrypter();
		number1.encrypt(encryptNumber);	
			
		System.out.println("\nEnter a 4 digit number to be decrypted: ");
		int decryptNumber = input.nextInt();
		// call decrypter class into main	
		Decrypter number2 = new Decrypter();
		number2.decrypt(decryptNumber);
	}
}

