import java.util.Scanner;
class Pattern6{
  public static void getBoundryPattern(int n){
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n;j++)
       {
         if(i==1||i==n||j==1||j==n)
           System.out.print("* ");

         else
           System.out.print("  ");
       }
     System.out.println();
    }
 
 }

 public static void getOneMoreBoundryPattern(int n){
   for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
       if(i==1||i==n||i==n-1||i==2||j==1||j==2||j==n-1||j==n){
          System.out.print("* ");
       }
       else{
         System.out.print("  ");
       }
    }
   System.out.println();
   }
 }

 public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the no of rows:=");
     int n=sc.nextInt();
     getBoundryPattern(n);
     System.out.println("=============");
     getOneMoreBoundryPattern(n);
 }

}