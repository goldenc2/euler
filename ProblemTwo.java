public class ProblemTwo{
    public static void main (String[] args){
	int sum = 0;
        for (int i = 1, j = 1; j<4000001 || i<4000001; i+=j, j+=i){
	    if ((i<4000001) && (i%2==0)){	        
		    sum += i;		
	    }
	    if ((j<4000001) && (j%2==0)){
	        sum += j;		
	    }
        }
	System.out.println(sum);
    }
}