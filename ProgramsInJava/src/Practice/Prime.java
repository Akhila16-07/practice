package Practice;

public class Prime {
	static String s="This is java akhila";
//count and get prime numbers from 2-100
	public static void main(String[] args) {
//		int primecount=0;
//		int evencount=0;
//		int oddcOUNT=0;
//		for(int num=1;num<=100;num++) {
//			int count=0;
//			for(int i=1;i<=num;i++) {
//				if(num%i==0) {
//					count++;
//				}
//			}
//			if(count ==2 ) {
//			//	System.out.println(num);
//				if(num%2==0) {
//					System.out.println(num);
//					evencount++;
//				}else {
//					System.out.println(num);
//					oddcOUNT++;
//				}
//				primecount++;
//			}
//		}
//		System.out.println("even number count " +evencount);
//		System.out.println("odd number count " +oddcOUNT);
//		System.out.println(" total count of prime numbers " + primecount);
		

		//System.out.println(s.toString());
		//System.out.println(s.);
		for(int i=s.length()-1;i>=0;i--) {
			Character ch = s.charAt(i);
			System.out.print(ch);
		}
	}
}
