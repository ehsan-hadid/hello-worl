package basic;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		String name ;
//		name = p.nextLine();
		
		int i=0; 
		while(i<=1000){
			
			name = p.nextLine();
			
			if(name.equals("right")){
				System.out.println("wall??");
				if(p.nextBoolean()){
					System.out.println("there is a wall go another way");
				}
				else
				System.out.println("1cm right");
			}
			System.out.println(i);
			i++;
			name = p.nextLine();
			
		}
	}

}
