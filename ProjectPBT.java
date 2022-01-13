import java.io.*;

class Banner//declare superclassimport java.io.*;

class Banner//declare superclass
{
	public void dispW()throws IOException
	{
	System.out.println("[SELAMAT DATANG KE SISTEM PINJAMAN BUKU]");
	}
}
class PinjamanBuku extends Banner//declare superclass
{
  public void PinjamanBukuInfo()throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
    	int a;
	System.out.println("Sila Pilih Nombor:\n[1 : Meminjam	]\n[2 : Merekod	]\n[3 : Memulang	]");
		a=Integer.parseInt(br.readLine());
	
	double b;
	System.out.println("Sila Masukkan Tarikh: ");
		b=Double.parseDouble(br.readLine());

    	switch (a)
	{

      	case 1:
        System.out.println("[MEMINJAM]");
	System.out.println("[Permintaan Diluluskan]");
        break;

      	case 2:
        System.out.println("[MEREKOD]");
	System.out.println("[Permintaan Diluluskan]");
        break;

      	case 3:
        System.out.println("[MEMULANG]");
	System.out.println("[Permintaan Diluluskan]");
        break;

      	default:
        System.out.println("[Unknown]");
	System.out.println("[Permintaan Ditolak]");
        break;

    	}
    	System.out.println("\n[Terima Kasih]");
  }
}

class Meminjam extends PinjamanBuku//declare subclass
{
	
	public void MeminjamInfo()throws IOException
{
	BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\n[SELAMAT DATANG KE SISTEM PINJAMAN BUKU]");//banner

	String name;
	System.out.println("\nMasukkan Nama Anda: ");//user memasukkan nama
	name=obj.readLine();

	String book_name;
	System.out.println("Masukkan Nama Buku: ");//user memasukkan nama buku
	book_name=obj.readLine();

	String date;
	System.out.println("Masukkan Tarikh Semasa: ");//user memasukkan tarikh semasa
	date=obj.readLine();

	System.out.println("\nAnda: "+name+"\nBuku: "+book_name+"\nPada Tarikh: "+date);//sistem mengeluarkan maklumat peminjam
}
}

class Merekod extends Meminjam
{
	String name;
	double day;

	public void MerekodInfo()throws IOException
	{
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\n[SELAMAT DATANG KE SISTEM PINJAMAN BUKU]");

		System.out.print("\nMasukkan Nama: ");
		name=bfr.readLine();
		
		System.out.print("\nMasukkan Bilangan Hari Meminjam: ");
		day=Double.parseDouble(bfr.readLine());
	}
	
	public void checkday()
	{
		if (day<3)
		{
			System.out.println(name+"\nAnda Meminjam 3 Hari");
		}
		else if (day<7)
		{
			System.out.println(name+"\nAnda Meminjam 7 Hari");
		}
		else if (day<10)
		{
			System.out.println(name+"\nAnda Meminjam 10 Hari");
		}
		else
		{
			System.out.println("Harap Maaf Pinjaman Tidak Dibenarkan");
		}
	}
	
	public static void main(String args[]) throws IOException
	{

		Selection sc=new Selection();
		sc.inputInfo();
		sc.checkday();

	}
}

class Memulang extends Merekod
{
	public void MemulangInfo()throws IOException
	{
	BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\n[SELAMAT DATANG KE SISTEM PINJAMAN BUKU]");

	String name;
	System.out.println("\nMasukkan Nama Anda: ");
	name=obj.readLine();

	String book_name;
	System.out.println("Masukkan Nama Buku: ");
	book_name=obj.readLine();

	String date;
	System.out.println("Masukkan Tarikh Memulang: ");
	date=obj.readLine();

	System.out.println("\nAnda: "+name+"\nBuku: "+book_name+"\nTarikh Memulang: "+date);
	
	}
}

class ProjectPBT
{
public static void main(String args[])throws IOException
{
	PinjamanBuku pb=new PinjamanBuku();
	pb.dispW();

	System.out.println("[SELAMAT DATANG KE SISTEM PINJAMAN BUKU]");

	PinjamanBuku PinjamanBuku=new PinjamanBuku();
	PinjamanBuku.PinjamanBukuInfo();

	Meminjam Meminjam=new Meminjam();
	Meminjam.MeminjamInfo();

	Merekod Merekod=new Merekod();
	Merekod.MerekodInfo();

	Memulang Memulang=new Memulang();
	Memulang.MemulangInfo();
}
}