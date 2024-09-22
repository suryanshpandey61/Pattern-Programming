import java.util.Scanner;
class Pattern9
{
  public static void printPattern1(int n){
    int star=n;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=star;j++)
      {
         System.out.print(j%2+" ");
      }
     star--;
     System.out.println();
    }

  }

 public static void printPattern2(int n){
   int star=n;
   for(int i=1;i<=n;i++)
   {
     for(int j=1;j<=star;j++)
     {
       System.out.print(i%2+" ");
     }
    star--;
    System.out.println();
   }
 
 }

public static void printPattern3(int n){
   int space=n-1;
   int star=1;
   for(int i=1;i<=n;i++){
        for(int j=1;j<=space;j++)
          {
             System.out.print("  ");
          }
        for(int j=1;j<=star;j++)
          {
            System.out.print(j+" ");
          }
        System.out.println();
        star++;
        space--;
    }
 }

 public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the no of rows: ");
     int n=sc.nextInt();
    // printPattern1(n);
     //  printPattern2(n);
         printPattern3(n);
 }
}