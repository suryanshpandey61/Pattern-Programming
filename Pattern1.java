import java.util.Scanner;
class Pattern1
{
  public static void getPattern(int n){
   for(int i=1;i<=n;i++){
        System.out.println("* ");
    }
  }
 
  public static void rowPattern(int n){
   for(int i=1;i<=n;i++){
    System.out.print("* ");
   }

  }

 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no of rows:=");
    int n=sc.nextInt();
   // getPattern(n);
   rowPattern(n);
  }
}