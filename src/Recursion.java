public class Recursion {

// Part 1: complete
	public static int sum(int n){
//IF THE INT N IS EQUAL TO 1, THEN IT RETURNS 1, WHICH IS THE SUM OF POSITIVE NUMBERS.
		if(n==1) {	
		return -1; // dummy value to be removed.
	}
//OTHERWISE, IT COMPUTES THE SUM OF ALL POSITIVE NUMBERS AND INCLUDES N IN THE RESULT (RECURSIVE).
	else {
		return n+ sum(n-1);
	}
}

	
// Part 1 complete
	public static int multiply(int m, int n){
//IF THE INT N IS EQUAL TO 0, THEN IT RETURNS 0 BECAUSE ANY NUMBER MULTIPLIED BY 0 IS 0 ITSELF.
	if(n==0) {
		return 0;
	}
//WHEN N IS NEGATIVE, DEDUCT M FROM THE OUTCOME OF THE RECURSIVE FUNCTION WITH N + 1.
	else if(n<0) {
		return -m + multiply(m,n+1);
	}
//WHEN N IS POSITIVE, ADD M TO THE OUTCOME OF THE RECURSIVE FUNCTION WITH N-1
	else {
		return m + multiply(m,n-1); 
	}
	}
	
	// Part 1: complete
	public static int Fibonacci(int n){
//IF N IS 0 OR 1, RETURN THE FIBONACCI NUMBERS AT POSITION 0 AND 1.
	if(n==1 || n==0) {
		return n;
	}
//OTHERWISE, IT COMPUTES FIBONACCI(N-1) AND FIBONACCI(N-2) AND ADDS THEM TOGETHER.
	else {
		return Fibonacci(n-1) + Fibonacci(n+2);
		}
	} 
}