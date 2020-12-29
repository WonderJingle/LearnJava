package bijiao;

import java.util.Scanner;

public class assignment21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bjt;
//	initialization
        Scanner time = new Scanner(System.in);
		// Read Beijing time, output UTC time
	int utc;
        bjt = time.nextInt();
        if ( bjt >= 800 )
        {
        	utc = bjt-800;
        }
        else
        {
        	utc = 2400-(800/100-bjt/100)*100+bjt%100;
        }
        System.out.println(utc);
	}

}
