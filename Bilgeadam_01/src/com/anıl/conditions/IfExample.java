package com.anýl.conditions;
import java.util.Locale;
import java.util.Scanner;

public class IfExample {
public static void main(String[] args) {
	
	// this program will calculate user body mass index.
	
	Scanner input = new Scanner(System.in);
	input.useLocale(Locale.ENGLISH);
	
	double weight;
	double height;
	
	System.out.println("Please enter your weight:");
	
	
	weight = input.nextDouble();
	
	System.out.println("Please enter your height:");
	
	height = input.nextDouble();
	
	double result = weight / (height*height);
	System.out.println("result"+ result);
	if(result < 18.5) {
		 System.out.println("underweight");
		}
	else if(result >= 18.5 && result < 24.9) {
		 System.out.println("normal");
		}
	else if(result >= 25 && result < 29.9) {
		 System.out.println("overweight");
		}
	else if(result > 30) {
		 System.out.println("very overweight");
		}
	
	
	
	
}
}
