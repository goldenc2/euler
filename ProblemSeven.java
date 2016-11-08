/*
By listing the first six prime numbers: 
2, 3, 5, 7, 11, and 13, 
we can see that the 6th prime is 13.
What is the 10 001st prime number?
*/
public class ProblemSeven{
    public static void main (String[] args){
	int count = 0;	
	for (int n = 2; count < 10002; n++){
	    boolean prime = true;	
	    for (int i=2; i<n; i++){
	        if (n%i==0){
		    prime = false;		   
	        }		
	    }
	    if (prime == true){
		count++;
		if (count == 10001){
		    System.out.println(n);
		}
	    }
	}
    }
}