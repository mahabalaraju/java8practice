package general;

public class isprime {

	public static void main(String[] args) {
		isprime m = new isprime();
		
       m.findprimesbelow(22);
       m.isprime(12);
	}

	private void findprimesbelow(int num) {
		int total=0;
		for(int i=2;i<num;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0)
					count++;
			}
			if (count==0) {
				total++;
				System.out.print(" "+i);
		}}
		System.out.println(" \n the total number of prime numbers below the given number "+num+"  are  :"+  total);
	}

	private void isprime(int num) {
		int count = 0;
		System.out.println("the given number is:");
		if (num > 0) {
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
				if (count == 2) {
					System.out.println("prime number");
				} else {
					System.out.print("non prime or composite number");
				}
			}
		 else {
			System.out.print("non prime or composite number");
		}
	}
}
