import java.util.Scanner;
class Pyramid{
  public static void printPyramid(int n)
  {
     int star=1;
     int space=n-1;
     for(int i=1;i<=n;i++)
     {
        for(int j=1;j<=space;j++)
        {
          System.out.print("  ");
        }
        for(int j=1;j<=star;j++)
        {
           System.out.print("* ");
        }
       star=star+2;
       space--;
       System.out.println();
     }
  }
  
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the no of rows:=");
     int n=sc.nextInt();
     printPyramid(n);
 }
 

}













