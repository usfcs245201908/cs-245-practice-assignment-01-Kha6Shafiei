public class Practice01MathIterative implements Practice01Math{

  public int fact (int n){
	if (n < 0) {
		throw new IllegalArgumentException ("n must be positive");
		}
	int fact = 1;
    for(int i = 1; i <= n ; i++){
      fact = fact * i;
    }
    return fact;
  }

  public int fib(int n){
	  if (n < 0) {
		  throw new IllegalArgumentException ("n must be positive");
	    }
	  int prefib = 0;
	  int currentfib = 1;
	  if(n == 0 || n == 1) return n;
	  for(int i = 1; i < n ; i++){
      int dummy = prefib;
      prefib = currentfib;
      currentfib = dummy + prefib;
    }

    return currentfib;
  }



}
