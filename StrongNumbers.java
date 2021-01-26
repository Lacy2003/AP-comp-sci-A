package lowercaseletters;

public class StrongNumbers{
	
		public static boolean isPrime(int num) {
			boolean prime = true;
			for (int i = 2; i <= num / 2; i++) {
				if(num % i ==0) {
					prime = false;
				}
			}
			
			
			return prime;
		}
		
		public static int divisorSum(int num) {
			int sum = 0;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					if (i == (num / i)) {
						sum += i;
					}
					else {
						sum += (i + num / i);
					}
				}
			}
			
			
			return (sum + 1);
		}
		
		public static int numDivisors(int num) {
			int count = 0;
			for (int i=1; i < num; i++) {
				if (num % i == 0) {
					count++;
				}
				
			}
			return count;	
		}
		
		public static boolean isStrong(int num) {
			boolean strong = false;
			if (divisorSum(num) < num) {
				if(isPrime(num) != true) {
					if (numDivisors(num) != 1) {
						strong = true;
					}
				}
			}
			
			
			
			return strong;
		}
		
		public static void printDivisors(int num) {
			System.out.print("1 ");
			for (int i = 2; i <= num; i++) {
				if ( num % i == 0) {
					if ( num > i) {
						System.out.print( + i + " ");
					}
				}
			}
			System.out.println();
		}
		
		public static void printPrimes(int num) {
			for (int i = 2; i < num; i++) {
				if (isPrime(i) == true) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
		
		public static void printComposites(int num) {
		
			for (int i = 1; i < num; i++) {
				if (isPrime(i) == false) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
		
		public static void printStrong(int num) {
			for (int i = 1; i < num; i++) {
				if (isStrong(i) == true) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
		
		public static void printWeak(int num) {
			for (int i = 1; i < num; i++) {
				if(numDivisors(i) > 2) {
					if (isStrong(i) == false) {
						System.out.print(i + " ");
					}
				}
			}
			System.out.println();
		}
		
		
		public static int sum(int num) {
			//n = 5
			int sum = 0;
			for (int i = 1; i < num; i++ ) {
				sum = sum +i;
				
			}
			return sum;
		}
		
		
		public static void main(String[] args) {
			printPrimes(30);
			printComposites(30);
			printStrong(30);
			printWeak(30);
		}

	}


