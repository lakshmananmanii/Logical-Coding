package arrayProblems;
import java.util.Scanner;
public class Bubblesort {
	public void bubble(int n,int a[]) {
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("The sorted array :");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Bubblesort b = new Bubblesort();
		System.out.println("Enter the size of an array :");
		int n = s.nextInt();
		System.out.println("Enter the Array :");
		int []a = new int[100];
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		b.bubble(n, a);
		
		
	}

}
