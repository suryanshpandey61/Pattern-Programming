import java.util.Scanner;
class Pattern3{
 public static void getPattern(int n){
  for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
      System.out.print(j+" ");
    }
   System.out.println();
  }
  
 }

 public static void colSamePattern(int n){
  for(int i=1;i<=n;i++){
   for(int j=1;j<=n;j++){
    // System.out.print(i+" ");
    // we use "%-3d" for allign the items on left side
       System.out.printf("%3d",i);
    }
   System.out.println();
  }

 }
 
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the no of rows:=");
  int n=sc.nextInt();
 // getPattern(n);
  colSamePattern(n);
 }
}