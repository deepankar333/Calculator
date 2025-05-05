package Calculator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		double ans=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		double firstNumber=sc.nextDouble();
		
		System.out.print("Enter Operation :");
		char op=sc.next().charAt(0);
		
		System.out.print("Enter Second Number : ");
		double secondNumber=sc.nextDouble();
		
		switch(op) {
		case ('+'):
			ans=firstNumber+secondNumber;
		System.out.println("The Answer is : "+ans);
		break;
		
		case ('-'):
			ans=firstNumber-secondNumber;
		System.out.println("The Answer is : "+ans);
		break;
		
		case ('*'):
			ans=firstNumber*secondNumber;
		System.out.println("The Answer is : "+ans);
		break;
		
		case ('/'):
			ans=firstNumber/secondNumber;
		System.out.println("The Answer is : "+ans);
		break;
		
		case ('%'):
			ans=firstNumber%secondNumber;
		System.out.println("The Answer is : "+ans);
		break;
		
		default:System.out.println("Enter Valid Operator");
		}
		sc.close();
	}

}
