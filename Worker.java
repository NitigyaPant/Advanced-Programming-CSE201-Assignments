import java.util.Scanner;

public class Worker // Employee
{
	int skill;
	int hoursWorked = 0;
	int insurance = 0; //only for 2 and 3 skill level
	int payRate;
	int pay40; // pay for 40 hours
	int OverPay = 0; // overtime pay
	
	double deduct = 0;
	int GrossPay; // without deductions
	double NetPay; // with deductions
	
	public Worker(int s, int h, int ins)
	{
		skill = s;
		hoursWorked = h;
		insurance = ins;
		
		if(skill == 1)
			payRate = 170;
		if(skill == 2)
			payRate = 200;
		if(skill == 3)
			payRate = 450;
		
		pay40 = payRate*40;
		
		if(hoursWorked > 40)
			OverPay = (hoursWorked-40)*(payRate*((int)1.5));
		
		GrossPay = pay40+OverPay; 
		
		if(skill == 2 || skill ==3)
		{
			if(insurance == 1)
			{
				deduct = 32.5;
			}
			if(insurance == 2)
			{
				deduct = 20;
			}
			if(insurance == 3)
			{
				deduct = 10;
			}		
		}
		else
		{
			// for skill level 1 
			System.out.println("Sorry, Option not available!!!");
			System.out.println(" ");
		}
		NetPay = (double)GrossPay - deduct;
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number = 2; //input strength of factory workers
		
		while( number > 0)
		{	
			System.out.println("Skill level: ");
			int skill = input.nextInt();
			System.out.println("Number of hours worked: ");
			int hoursWorked = input.nextInt();
			System.out.println("Insurance type: ");
			int insurance = input.nextInt();
			
			Worker w = new Worker(skill, hoursWorked, insurance);
			
			System.out.println(" The hours worked:" + w.hoursWorked);
			System.out.println(" The hourly pay rate:" + w.payRate );
			System.out.println(" The regular pay for 40 hours:" + w.pay40);
			System.out.println(" The overtime pay:" + w.OverPay );
			System.out.println(" The total of regular and overtime pay:" + w.GrossPay);
			
			if(w.deduct > w.NetPay)
				System.out.println("ERROR");
			else	
				System.out.println(" The total itemized deductions:" + w.deduct);
			
			System.out.println(" The net pay after all the deduction: " + w.NetPay);

			number--;
		}
	}	

}
