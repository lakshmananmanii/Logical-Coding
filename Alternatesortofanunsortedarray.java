package arrayProblems;
import java.util.*;
public class Alternatesortofanunsortedarray {
	int maximum(int n,int a[]) {
		int max= a[0];
		for(int i=0;i<n;i++) {
		if(a[i]>max) {
			max = a[i];
		}}
		return max;
	}
	public void result(int max,int n,int a[]) {
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Alternatesortofanunsortedarray aa = new Alternatesortofanunsortedarray();
		System.out.print("Enter the size of an Array :");
		int n = s.nextInt();
		System.out.print("Enter the Array :");
		int a[]= new int[100];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int max = aa.maximum(n, a);
		//aa.result(max, n, a);
		int []b = new int[max+1];
		for(int i=0;i<max+1;i++) {
			b[i]=0;
		}
		for(int i=0;i<n;i++)
		{
			int k = a[i];
			b[k]++;
		}
		int i=0;int j=max;
		while(i<j) {
			while(b[i]==0) {
				i++;
			}
			while(b[j]==0) {
				j--;
			}
			if(i<j) {
				System.out.print(j+" "+i+" ");
				i++;
				j--;
			}
		}
		if(i==j) {
			System.out.print(i);
		}
		
		
	}

}
