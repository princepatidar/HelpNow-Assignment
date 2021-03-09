package com.funfactory.helper;

import java.util.Scanner;

import com.funfactory.counter.Card;

public class Validation {
	
	
	public static void swipeIn(Card card,int pricePerGame)
	{
		while(card.balance<pricePerGame)
		{
			if(card.balance<pricePerGame) 
				System.out.println("Your balance is not sufficient");
			
			System.out.println("Would you like to add more amount in card say Y or N");
			Scanner input=new Scanner(System.in);
			char value=input.next().charAt(0);		
			if(value=='Y')
			{
				card.balance=Card.addAmount(card.balance);
			}
			else if(value=='N')
				System.out.println("Sorry! you can't exit.");
			else
				System.out.println("Invalid entry! try again");
			
		}
	}
	
	public static void swipeOut(Card card,int pricePerGame)
	{
		card.balance=Card.removeAmount(card.balance,pricePerGame);
		
	}

}
