import java.util.*;
public class traffic {

	public static  void main(String[] args) {
		System.out.println("This programe can tell you the Traffic Situation in Nairobi");
		System.out.println("Press 1 for all roads");
		   System.out.println("Press 2 for specific roads ");
		   
		   Scanner num = new Scanner(System.in);
		   
			int a = num.nextInt();
			if (a == 1){
				System.out.println("Press 1 for roads with traffic");
				System.out.println("Press 2 for roads without traffic");
				
				int b = num.nextInt();
				if (b == 1){
					System.out.println("Ngong' Road, Mombasa Road, Jogoo Road");
				}
				else if (b == 2) {
					System.out.println("Waiyaki Way, Mbagathi Way");
				}
				else {
					System.out.println("Number not in menu!");
				}
			} 
		
			else if (a == 2){
				
	   System.out.println("Press 1 for Ngong' Road");
	   System.out.println("Press 2 for Waiyaki Way ");
	   System.out.println("Press 3 for Mombasa Road");
	   System.out.println("Press 4 for Mbagathi Way");
	   System.out.println("Press 5 for Jogoo Road");
	   
	   	   
		int x = num.nextInt();
		if (x == 1){
			System.out.println("There is traffic on Ngong' Road");
		}
		else if (x == 2){
			System.out.println("There is no traffic on Waiyaki Way ");
		}
		else if (x == 3){
			System.out.println("There is traffic on Mombasa Road ");
		}
		else if (x == 4){
			System.out.println("There is no traffic on Mbagathi Way ");
		}
		else if (x == 5){
			System.out.println("There is traffic on Jogoo Road ");
		}
		
		else {
			System.out.println("Number not in the system");
		}
	   
	}

}
}