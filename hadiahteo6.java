import java.util.Scanner;
class lingkaran{
	int r;
	double phi;
	
	public int getR(){
		return r;
	}
	public void setR(int jarijari){
		this.r = jarijari;
	}
	public double getPhi(){
		return phi;
	}
	public void setPhi(double phi){
		this.phi = phi;
	}
}

class kubus{
	int s;
	
	public int getS(){
		return s;
	}
	public void setS(int sisi){
		this.s = sisi;
	}
}

public class hadiahteo6{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		lingkaran a = new lingkaran();
		kubus b = new kubus();
		double luas;
		double volume;
		
		System.out.println("Menghitung Luas Lingkaran");
		System.out.print("Masukkan jari-jari lingkaran = ");
		a.r = input.nextInt();
		a.setPhi(3.14);
		luas = a.getPhi() * a.r * a.r;
		System.out.println("Luas Lingkarang adalah "+luas);
		System.out.println();
		System.out.println("Menghitung Volume Kubus");
		System.out.print("Masukkan Panjang Sisi Kubus = ");
		b.s = input.nextInt();
		volume = b.s * b.s * b.s;
		System.out.println("Volume Kubus adalah "+volume);
	}
}