
public class Recursion  {

	//Print 1 to N using recursion
//	static void fun(int n)  {
//		if(n<1) {
//			return;
//		}
//		fun(n-1);
//		System.out.print(n+" ");
//	}
//	public static void main(String[] args)  {
//		fun(10);
//
//	}

	//Print Name N times using recursion
//	public static void fun(int i,int n)  {
//		if(i>n) {
//			return;
//		}
//		System.out.println(i);     // output: 1 2 3 4 5 6 7 8 9 10
//		fun(i+1,n);
//		
//	}
//	public static void main(String[] args)  {
//		int n=10;
//		fun(1,n);
//
//	}
	
//	//Print  N to 1 
//	public static void fun(int i,int n)  {
//		if(i>n) {
//			return;
//		}
//		
//		fun(i+1,n);
//	    System.out.print(i+" "); // output: 10 9 8 7 6 5 4 3 2 1
//		
//	}
//	public static void main(String[] args)  {
//		int n=10;
//		fun(1,n);
//
//	}
	
	//Print 1 to N and N to 1
//		public static void fun(int i,int n)  {
//			if(i>n) {
//				return;
//			}
//			System.out.print(i+" ");
//			fun(i+1,n);
//			System.out.print(i+" ");	//output = 1 2 3 4 5 6 6 5 4 3 2 1 
//			
//		}
//		public static void main(String[] args)  {
//			int n=6;
//			fun(1,n);
//		}
	
//	// Print N to 1
//	public static void fun(int i,int n)  {
//		if(i<1) return;
//		System.out.print(i+" "); //output: 10 9 8 7 6 5 4 3 2 1 
//		fun(i-1,n);
//		
//	}
//	public static void main(String[] args)  {
//		int n=10;
//		fun(n,n);
//
//	}
	
	//print 1 to N
	// Print N to 1
//		public static void fun(int i,int n)  {
//			if(i<1) return;
//			fun(i-1,n);
//			System.out.print(i+" "); //output: 10 9 8 7 6 5 4 3 2 1 
//
//			
//		}
//		public static void main(String[] args)  {
//			int n=10;
//			fun(n,n);
//		}
	
//	  Print Sum of N terms
//	 static int result=0;
//	public static int fun(int n)  {
//		if(n>1) {
//			result=fun(n-1);
//		}
//		
//		int temp=(int)Math.pow(n, 3);
//		
//		return temp+result;
//		
//	}
//	public static void main(String[] args)  {
//		int n=5;
//		System.out.println(fun(n));
//
//	}
	
	  //Print Sum of N numbers
//		public static int sum(int n)  {
//			if(n==0) return 0;
//			return n+sum(n-1);
//			
//		}
//		public static void main(String[] args)  {
//			int n=5;
//			System.out.println(sum(n));
//
//		}
	
	//Print Sum of N numbers
//		public static void fun(int i, int sum)  {
//			if(i<1) {
//				System.out.println(sum);
//				return;
//			}
//			fun(i-1,sum+i);
//			
//		}
//		public static void main(String[] args)  {
//			int n=5;
//			int sum=0;
//			fun(n,sum);
//		}
	
	//Print factorial of N numbers using recursion
//	public static int fun(int n)  {
//		if(n==0) return 1;
//		return n * fun(n-1);
//		
//		
//	}
//	public static void main(String[] args)  {
//		int n=5;
//		System.out.println(fun(n));
//	}
	
	
	//Print factorial of N numbers using recursion
	public static void fun(int i,int fact) {
		if(i<1) {
			System.out.println(fact);
			return;
		}
		fun(i-1,fact*i);
	}
	public static void main(String[] args) {
		int n=5;
		int fact=1;
		fun(5,fact);
	}
}
