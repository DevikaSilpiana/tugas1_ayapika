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
		Scanner scanner=new Scaner(System.in);
		System.out.print("Masukkan Nilai:");
        	n=scan.nextInt();
        		for(bil=1;bil<=n*2;bil+=2)
		{
			System.out.print(bil+",");
		}
		
		System.out.println("");
		System.out.println("Bilangan fibonanci");
		System.out.println("===================");
		System.out.print("Masukan nilai : ");
		int N=scan.nextInt();
		System.out.println("Deret Fibonaci : ");
			for(i=0; n<i; i++)
			{
				x=x+y;
				System.out.printf(x+ " ");
				y=x-y;
				z=z+1;
			}

	}
}
