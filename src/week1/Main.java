package week1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double hourlyRate = 15;
		double hoursWorked = 40;
		double grossPay = hoursWorked * hourlyRate;
		System.out.println(grossPay);
		
		double taxRate = .25;
		double netPay = grossPay - (grossPay * taxRate );
		System.out.println(netPay);
		
		
	}
	
	
}
		
	
			