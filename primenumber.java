import java.util.Scanner;

public  class primenumber {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			boolean res =true;
			if(n<=1)
				res =false;
			else {
				for(int i=2;i<=n/2;i++) {
					if(n%i==0) {
						res = false;
			    	    break;
			    	    }
			    	}
			    }
			    if(res) {
			    	System.out.println("PRIMENUMBER");
			    }
			    else {
			    	System.out.println("NOT A PRIME NUMBER");
			    }
	}
}