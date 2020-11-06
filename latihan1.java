import java.util.Scanner;
class Siswa{
	String nama;
	String jurusan;
	String nim;
		
		public String getNama(){
			return nama;
		}
		public void setnama(String namasiswa){
			this.nama = namasiswa;
		}
		public String getJurusan(){
			return jurusan;
		}
		public void setjurusan(String jurusansiswa){
			this.jurusan = jurusansiswa;
		}
		public String getNim(){
			return nim;
		}
		public void setnim(String nimsiswa){
			this.nim = nimsiswa;
		}
}

public class latihan1{
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		
		Siswa a = new Siswa();
		System.out.print("Masukkan Nama = ");
		a.nama = input.nextLine();
		System.out.print("Masukkan Jurusan = ");
		a.jurusan = input.nextLine();
		System.out.print("Masukkan NIM = ");
		a.nim = input.nextLine();
		System.out.println("Nama saya adalah "+a.getNama()+" jurusan saya adalah "+a.getJurusan()+" dan nim saya adalah "+a.getNim());
	}
}