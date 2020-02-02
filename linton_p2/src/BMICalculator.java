package linton_p2;

import java.util.Scanner;

public class BMICalculator {
	//declare variables to be used in methods
	private double weight;
	private double height;
	private int data;
	private double bmi;

	
	public void readUserData() {
		
		//declare scanner class to take input
		Scanner sc = new Scanner(System.in);
		
		//make a loop to prompt user to select unit of measurement.
		//get input from user and store it.
		while(true) {
		
			System.out.println("Please select unit of measurement.");
			System.out.println("Enter 1 for imperial or 2 for metric:");
			data = sc.nextInt();
			
			if(data == 1) {
				System.out.println("You have selected imperial");
				System.out.println("Enter your weight in pounds:");
				weight = sc.nextDouble();
				
				System.out.println("Enter your height in inches:");
				height = sc.nextDouble();
				
				break;
			} 
			else if(data == 2) {
				System.out.println("You have selected metric");
				System.out.println("Enter your weight in kilograms:");
				weight = sc.nextDouble();
				
				System.out.println("Enter your height in meters:");
				height = sc.nextDouble();
				
				break;
			}
			else {
				//if invalid input prompt message will be displayed
				System.out.println("Invalid response.");
				continue;	
				 }		
		}
		}
//create method to calculate bmi based on formula below
 public void calculateBmi() {
	 // 
	 if(data == 1) {
		 bmi = (weight * 703) / (height * height);
		
	 }
	 else {
		 bmi = weight / (height * height);
	 }	 
	 }
 // create method to display bmi category based 
 // on calculations above
 public void displayBmi() {
	 String category = "";
	  if (bmi < 18.5)
          category = "Under Weight";
	  
      else if (bmi >= 18.5 && bmi <= 24.9)
          category = "Normal Weight:)";
	  
      else if (bmi >= 25 && bmi <= 29.9)
          category = "Over Weight";
	  
      else if (bmi >= 30)
          category = "Obese :(";
	  
      System.out.println("Your BMI is: " + bmi);
      System.out.println("You are " + category);
  }
 }
 