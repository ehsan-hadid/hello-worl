package basic;

import java.util.Scanner;

public class Basic_algorytm {

	public static void main(String[] args) {
		
	Scanner p = new Scanner(System.in);
		
	System.out.println("oponent is start going to flag");
	
	boolean getFlag = false;
	
	boolean wall;
	String goWay ;
	System.out.println("now you are stop go a way");
	for (int i = 0; i <= 3 ; i++) {
		
		goWay = p.nextLine();
		if(goWay.equals("right")){
			System.out.println("wall?");
			wall = p.nextBoolean();
			if(!wall){
				System.out.println("1cm right");
				}
			else
				System.out.println("there is wall. go next way");
		
		}
		
		if(goWay.equals("left")){
			System.out.println("wall?");
			wall = p.nextBoolean();
			if(!wall){
				System.out.println("1cm left");
				}
			else
				System.out.println("there is wall. go next way");
		}
		
		if(goWay.equals("top")){
			System.out.println("wall?");
			wall = p.nextBoolean();
			if(!wall){
				System.out.println("1cm top");
				}
			else
				System.out.println("there is wall. go next way");
		}
		
		if(goWay.equals("down")){
			System.out.println("wall?");
			wall = p.nextBoolean();
			if(!wall){
				System.out.println("1cm down");
				}
			else
				System.out.println("there is wall. go next way");
		}
		else
		System.out.println("now you are stop go a way");
		
		
		System.out.println(i);
		goWay = p.nextLine();
	}
	

	
	}

}
