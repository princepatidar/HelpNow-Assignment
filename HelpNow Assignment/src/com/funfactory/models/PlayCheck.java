package com.funfactory.models;

import java.util.Scanner;

public class PlayCheck {

	public static void check(int gameNumber,String direction)
	{
		 boolean flag=true;
		 while(flag){
			 if((gameNumber==10 && direction.equalsIgnoreCase("front"))||(gameNumber==1 && direction.equalsIgnoreCase("back")))
			 {
				 System.out.println("Thank you for coming!");
				 flag=false;
				 return;
			 }
			 System.out.println("Would you like to play another game say Y or N");
				Scanner input=new Scanner(System.in);
				char value=input.next().charAt(0);
				if(value=='Y')
				{
					flag=false;	
				}
				else if(value=='N')
					System.out.println("You can't exit in between");
				else
					System.out.println("Invalid entry! try again");
		 }
	}
}
