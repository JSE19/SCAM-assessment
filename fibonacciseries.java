class fibonacciseries {
	public static void main(String[] args) {
		fibonacciseries objfibonacci = new fibonacciseries();
		objfibonacci.fibonacci();
	}
	public void fibonacci()  {
		int num1=0, num2=1, count=20, num3, i;
		System.out.println(num1 + " \n" + num2);

		for(i=2; i<=count; ++i){
			num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
	}
	
}