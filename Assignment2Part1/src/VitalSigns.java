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
public class VitalSigns {
         int rr;
	 int hr;
	 int bp;
	 double w;
	 double w_kg;
	 
	 
	 static Scanner input =new Scanner(System.in);
	 
	public boolean  ReadInputs(Patient test)
	{
		// TODO Auto-generated constructor stub
                
		
                    System.out.println("Enter "+test.name+ "'s respiration rate");
                    rr=input.nextInt();


                    System.out.println("Enter "+test.name+ "'s heart rate");
                    hr=input.nextInt();
                    System.out.println("Enter "+test.name+ "'s blood pressure");
                    bp=input.nextInt();
                    System.out.println("Enter "+test.name+ "'s weight (in pounds)");
                    w=input.nextDouble();
                    System.out.println("Enter "+test.name+ "'s weight (in kilos)");
                    w_kg=input.nextDouble();
                
                
                
               
		// Calulation for age part
		if (test.age==0)
		{
			boolean result=newborn();
			return result;
		}
		else if (test.age<12)
		{
			boolean result=infant();
			return result;
		}
		else if (test.age<36)
		{
			boolean result=toddler();
			return result;
		}
		else if (test.age <60)
		{
			boolean result=preschooler();
			return result;
		}
		else if (test.age <144)
		{
			boolean result=school();
			return result;
		}
		else
		{
			boolean result=adolescent();
			return result;
		}
	}
	
	public boolean newborn()
	{
		return ((rr>=30 && rr<=50) && (hr>=120 && hr<=160) && (bp>=50 && bp<=70)&& (w>=4.5&& w <=7) && (w_kg>=2 && w_kg<=3));
	}
	public boolean infant()
	{
		return ((rr>=20 && rr<=30) && (hr>=80 && hr<=140) && (bp>=70 && bp<=100)&& (w>=9&& w <=22)&& (w_kg>=4 && w_kg<=10));
	}
	public boolean toddler()
	{
		return ((rr>=20 && rr<=30) && (hr>=80 && hr<=130) && (bp>=80 && bp<=110)&& (w>=22&& w <=31)&& (w_kg>=11 && w_kg<=14));
	}
	public boolean preschooler()
	{
		return ((rr>=20 && rr<=30) && (hr>=80 && hr<=120) && (bp>=80 && bp<=110)&& (w>=31 && w <=40)&& (w_kg>=14 && w_kg<=18));
	}
	public boolean school()
	{
		return ((rr>=20 && rr<=30) && (hr>=70 && hr<=110) && (bp>=80 && bp<=120)&& (w>=41&& w <=92)&& (w_kg>=20 && w_kg<=42));
	}
	public boolean adolescent()
	{
		return ((rr>=10 && rr<=30) && (hr>=55 && hr<=105) && (bp>=110 && bp<=120)&& (w>=110)&& (w_kg>=50));
	}
}
