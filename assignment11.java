package nihao;

import java.util.Scanner;

public class weekone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	initialization	
        Scanner in = new Scanner(System.in);
//		Read the temperature of F and output the temperature of C after calculation
	int f;
        double c;
        f = in.nextInt();
        c = (f-32)*(5/9.0);
        System.out.println((int)c);
        
	}

}
