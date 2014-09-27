import java.util.Scanner;
public class programBilangan
{
    public static void main(String[]args)
	{
		System.out.println("");
		System.out.println("Bilangan Genap 20");
		System.out.println("==================");
		int bil,n,x=0,y=1,z=0,i;
        for(bil=1;bil<=20;bil++)
		{
		if(bil%2==0)
			{
				System.out.print(bil+",");
			}
		}
		
		System.out.println("");
		System.out.println("Bilangan Ganjil 7");
		System.out.println("==================");
		Scanner scan=new Scaner(System.in);
		System.out.print("Masukkan Nilai:");
        n=scan.nextInt();
        for(bil=0;bil<=n*1;bil+=)
		{
			System.out.print(bil+",");
		}
		
		
	}
}