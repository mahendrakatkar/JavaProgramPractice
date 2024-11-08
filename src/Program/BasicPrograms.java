package Program;

import java.nio.file.spi.FileSystemProvider;

public class BasicPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// fabo
		/*int n1=0, n2=1, n3,num=10;
		System.out.print(n1+" "+n2 +" ");
				for(int i=2; i<=num;i++) {
					n3=n1+n2;
					System.out.print(n3 +" ");
					n1=n2;
					n2=n3; } 
					*/
					
// prime number p
		/*
		 * int i, n=13, m; m=n/2; int flag=0; if(n==0 || n==1) {
		 * System.out.println("number is not prime"); } else { for(i=2;i<=m;i++) { if
		 * (n%i==0) { System.out.println("not prime"); flag=1; break; } } if (flag==0){
		 * System.out.println("number is prime"); } }
		 */
					
//pallindrom
		/*
		 * int n, temp,r, sum=0; n=141141; temp =n; while(n>0) { r=n%10; sum=sum*10+r;
		 * 
		 * n=n/10; } if(temp==sum) { System.out.println("pal"); } else {
		 * System.out.println("not pal");
		 * 
		 * }
		 */
					
// factorial nu
		/*
		 * int n=4, fact=1, i; for (i=1; i<=n; i++) { fact=fact*i; }
		 * System.out.println("fact is " +fact);
		 */
					
	}			
					
				
	

}
