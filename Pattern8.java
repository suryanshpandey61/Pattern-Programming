import java.util.Scanner;
class Pattern8{
  public static void getPattern(int n)
  {
    int star=1;
    for(int i=1;i<=n;i++)
    {
       for(int j=1;j<=star;j++)
       {
         System.out.print("* ");
       }
      star++;
      System.out.println();
    }
  }

 public static void spaceIncludePattern(int n){
    int star=1;
    int space=n-1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=space;j++){
         System.out.print("  ");
      }
      for(int j=1;j<=star;j++){
         System.out.print("* ");
      }
      System.out.println();
      star++;
      space--;
    }

 }

 public static void opposteT(int n){
   int star=n;
   int space=0;
   for(int i=1;i<=n;i++){
     for(int j=1;j<=space;j++)
      {
        System.out.print("  ");
      }
     for(int j=1;j<=star;j++){
         System.out.print("* ");
      }
      space++;
      star--;
      System.out.println();
   }
 }

 public static void printP(int n){
   int star=n;
   for(int i=1;i<=n;i++){
         for(int j=1;j<=star;j++)
         {
            System.out.print("* ");
         }
         star--;
        System.out.println();

   }
 }

 public static void main(String[] args)
 {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no of rows: ");
    int n=sc.nextInt();
   // getPattern(n);
   //   spaceIncludePattern(n);
     //  opposteT(n);
         printP(n);
 }


}