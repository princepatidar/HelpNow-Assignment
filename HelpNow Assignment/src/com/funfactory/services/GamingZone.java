package com.funfactory.services;

import java.util.Calendar;
import java.util.Scanner;

import com.funfactory.counter.Card;
import com.funfactory.helper.Validation;
import com.funfactory.models.PlayCheck;

public class GamingZone {
	
	public static void main(String[] args)
	{
		
		Card card=new Card();
		card.initialBalance();
		int pricePerGame;
		Calendar calendar = Calendar.getInstance();
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);  //0 for sunday
		if(dayOfWeek==0 || dayOfWeek==6)
			pricePerGame=20;
		else
			pricePerGame=10;
		
		Scanner input=new Scanner(System.in);
		//select a direction from where customer want to go
		String direction;
		boolean flag=true;
		do{
			System.out.println("Enter direction:");
			direction=input.nextLine();
			if(direction.equalsIgnoreCase("front")||direction.equalsIgnoreCase("back"))
					flag=false;
			else
				System.out.println("No valid way!");
			
		}while(flag);
		
		
		//assuming he is playing for each game one time only.
		if(direction.equalsIgnoreCase("front"))
		{
			int gameNumber=1;  
			do
			{
				Validation.swipeIn(card,pricePerGame);
				if(card.balance>=pricePerGame) {
					
					System.out.println("You are playing game "+gameNumber);
					System.out.println("Your game "+gameNumber+ " is completed");
				}
				
				 Validation.swipeOut(card,pricePerGame);
				 
				PlayCheck.check(gameNumber,direction);
				gameNumber++;
			}while(gameNumber<=10);
			
			
		}
		else if(direction.equalsIgnoreCase("back"))
		{
			int gameNumber=10;
			do{
				Validation.swipeIn(card,pricePerGame);
				if(card.balance>=pricePerGame) {
					
					System.out.println("You are playing game :"+gameNumber);
					System.out.println("Your game "+gameNumber+ " is completed");
				}
				
				 Validation.swipeOut(card,pricePerGame);
				 
				PlayCheck.check(gameNumber,direction);
				gameNumber--;
			}while(gameNumber>=1);
			
			}
		}
}
