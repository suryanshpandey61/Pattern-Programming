import java.util.Scanner;
class Pattern2
{
  public static void getPattern(int n){
   for(int i=1;i<=n;i++){
     for(int j=1;j<=n;j++){
         System.out.print("* ");
      }
    System.out.println();
   }

  }

  public static void main(String[] args){
   
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the value of n:=");
   int n=sc.nextInt();
   getPattern(n);

  }

 

}