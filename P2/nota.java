package Questões;

public abstract class nota {
	public static void main(String[] args) {
		count(91.01);
	}

	public static void count(double n) {
	//NOTAS
		
		int nCem = (int)(n / 100);
		n = n % 100;
		int nCinquenta = (int)(n / 50);
		n = n %50;
		int nVinte = (int)(n / 20);
		n = n % 20;
		int nDez = (int)(n / 10);
		n = n % 10;
		int nCinco = (int)(n / 5);
		n = n % 5;
		int nDois = (int)(n / 2);
		n = n % 2;
				
	//MOEDAS
				
		n *= 100;
		int mUmReal = (int)(n/100);
		n = n % 100;
		int mCinquenta = (int)(n/50);
		n = n % 50;
		int mVinteCinco = (int)(n/25);
		n = n % 25;
		int mDez = (int)(n/10);
		n = n % 10;
		int mCinco = (int)(n/5);
		n = n % 5;
		int mUmCentavo = (int)(n);
				
		System.out.println("NOTAS:");
		System.out.println(nCem+" nota(s) de R$ 100.00");
		System.out.println(nCinquenta +" nota(s) de R$ 50.00");
		System.out.println(nVinte +" nota(s) de R$ 20.00");
		System.out.println(nDez +" nota(s) de R$ 10.00");
		System.out.println(nCinco +" nota(s) de R$ 5.00");
		System.out.println(nDois +" nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(mUmReal +" moeda(s) de R$ 1.00");
		System.out.println(mCinquenta +" moeda(s) de R$ 0.50");
		System.out.println(mVinteCinco +" moeda(s) de R$ 0.25");
		System.out.println(mDez +" moeda(s) de R$ 0.10");
		System.out.println(mCinco +" moeda(s) de R$ 0.05");
		System.out.println(mUmCentavo +" moeda(s) de R$ 0.01");		
				
	}

}

