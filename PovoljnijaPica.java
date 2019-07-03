package domaci;

public class Zadatak1 {

	public static void main(String[] args) {
		int r1, r2, c1, c2;
	    r1=23;
	    r2=40;
	    c1=170;
	    c2=150;
		double pi=3.14; 
		double p1, p2, x1, x2;
		p1=Math.pow(r1,2)*Math.PI;
		p2=Math.pow(r2,2)*Math.PI/5;
		x1=c1/p1;
		x2=c2/p2;
		System.out.println("Povrsina-Capricciosa Mala: "+p1);
		System.out.println("Povrsina-Capricciosa Parce: "+p2);
		System.out.println("Cena-Capricciosa Mala: 170din");
		System.out.println("Cena-Capricciosa Parce: 150din");
		System.out.println("cm2 po dinaru-Capricciosa Mala: "+x1);
		System.out.println("cm2 po dinaru-Capricciosa Parce: "+x2);
	
		if(x1<x2) {
			System.out.println("Mala pica je isplativija.");
		}else {
			System.out.println("Parce pice je isplativije.");
		}	
	}
}
