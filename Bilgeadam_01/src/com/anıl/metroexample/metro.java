package com.an�l.metroexample;

import java.util.Scanner;

public class metro {

	static double bakiye = 0;
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {

		int secim = 0;

		do {

			System.out.println("1- Kart�ma para y�kle");
			System.out.println("2- Kart�m bakiyemi g�r�nt�le");
			System.out.println("3- Metroya bin");
			System.out.println("4- Sistemden ��k");
			
			secim = input.nextInt();

			switch (secim) {
			case 1:
				bakiyeYukle();

				break;
			case 2:
				bakiyeGoruntule();

				break;
			case 3:
				metroyabin();

				break;
			case 4:
				System.exit(0);

				break;

			default:
				break;
			}

		} while (secim != 4);

	}
	
	

	


	static void bakiyeYukle() {
		
		System.out.println("Y�klemek istedi�iniz miktar� giriniz: ");
		double yuklenecekBakiye = input.nextDouble();
		bakiye += yuklenecekBakiye;
	}
	 static void bakiyeGoruntule() {
		 System.out.println("Kart bakiyeniz:" + bakiye);
			
			
		}
	 static void metroyabin() {
		 
		 
		 System.out.println("1- Tam Kart");
		 System.out.println("2- �ndirimli Kart");
		
		int secim = input.nextInt();
		
		if (secim == 1) {
			
			
			if (bakiye >= 2.60) {
				
				bakiye = bakiye - 2.60;
				System.out.println("Kalan bakiyeniz  :" + bakiye);
				System.out.println("Kadik�y-Tav�antepe Metrosu... L�tfen �nenlere �ncelik veriniz!");
			}else {
				System.out.println("Kalan bakiyeniz  :" + bakiye);
				System.out.println("Yetersiz bakiye!");
				
			}
			
		} else if (secim == 2) {
			
	if (bakiye >= 1.25) {
				
				bakiye = bakiye - 1.25;
				System.out.println("Kalan bakiyeniz  :" + bakiye);
				System.out.println("Kadik�y-Tav�antepe Metrosu... L�tfen �nenlere �ncelik veriniz!");
			}else {
				System.out.println("Kalan bakiyeniz  :" + bakiye);
				System.out.println("Yetersiz bakiye!");
				
			}
			
			
		}
			
		}

}
