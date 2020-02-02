/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shrey
 */

import java.util.Scanner;
public class Patient {
    static Scanner input=new Scanner(System.in);
		int age;
		String name;
		static Patient test= new Patient();
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter patient's name");
		test.name=input.nextLine();
		System.out.println("Enter "+test.name+ "'s age (in months)");
		test.age=input.nextInt();
		boolean result= isPatientNormal();
		if (result==true)
		{
			System.out.println(test.name +" is healthy");
		}
		else
		{
			System.out.println(test.name +" is not healthy");
		}
		
		

	}
	
	static boolean isPatientNormal() {
		VitalSigns v=new VitalSigns();
		boolean result=v.ReadInputs(test);
		return result;
		
		
		}
}
