package bijiao;

import java.util.Scanner;

public class assignment22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      initialization  
	Scanner in = new Scanner(System.in);
		// Read an integer, output signal status
	int i;
        String r = null;        
        String s = null;
        i = in.nextInt();
        switch (i/10)
        {
        case 1:
        	r = "Unreadable";
        	break;
        case 2:
        	r = "Barely readable occasional words distinguishable";
        	break;
        case 3:
        	r = "Readable with considerable difficulty";
        	break;
        case 4:
        	r= "Readable with practically no difficulty";
        	break;
        case 5:
        	r= "Perfectly readable";
        	break;
        }
        switch (i%10)
        {
        case 1:
        	s = "Faint signals barely perceptible";
        	break;
        case 2:
        	s = "Very weak signals";
        	break;
        case 3:
        	s = "Weak signals";
        	break;
        case 4:
        	s = "Fair signals";
        	break;
        case 5:
        	s = "Fairly good signals";
        	break;
        case 6:
        	s= "Good signals";
        	break;
        case 7:
        	s = "Moderately strong signals";
        	break;
        case 8:
        	s = "Strong signals";
        	break;
        case 9:
        	s = "Extremely strong signals";
        	break;
        }
        System.out.println(s+", "+r);
	}

}
