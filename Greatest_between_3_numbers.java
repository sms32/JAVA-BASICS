import java.util.Scanner;
public class De {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter A");
	    int a = sc.nextInt();
	    System.out.println("Enter B");
	    int b = sc.nextInt();
	    System.out.println("Enter C");
	    int c = sc.nextInt();
	    if(a>b && a>c) {
	    		System.out.println(a);
	    	
	    }
	    if(b>a && b>c) {
	    	
	    		System.out.println(b);
	    	
	    }
	    if(c>a && a>b) {
	    	 	System.out.println(a);
	    	}
	    }
	

}
