package com.funfactory.counter;

import java.util.Scanner;

public class Card {
	public int balance;
	public void initialBalance()
	{
		System.out.println("Enter Initial Balance");
		Scanner input=new Scanner(System.in);
		balance=input.nextInt();
	}
	public static int addAmount(int balance)
	{
		System.out.println("Enter amount to add");
		Scanner input=new Scanner(System.in);
		int amount=input.nextInt();
		balance=balance+amount;
		
		return balance;
		
	}
	public static int removeAmount(int balance,int pricePerGame)
	{
		balance=balance-pricePerGame;
		System.out.println("balance remaining "+balance);
		return balance;
	}

}
