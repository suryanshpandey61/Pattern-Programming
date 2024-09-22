import java.util.Scanner;
class Pattern10
{
  public static void getPattern(int n)
  {
    int star=2*n-1;
    int space=0;
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
        star=star-2;
        space++;
        System.out.println();
    }
  }

 public static void getSpaceTriangle(int n){
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
         System.out.print("*   ");
      }
      star++;
      space--;
      System.out.println();
    }
 }

 public static void invertedTriangle(int n)
 {
   int star=n;
   int space=0;
   for(int i=1;i<=n;i++)
   {
       for(int j=1;j<=space;j++){
          System.out.print("  ");
       }
       for(int j=1;j<=star;j++){
          System.out.print("*   ");
       }
     star--;
     space++;
     System.out.println();
   }
 }

 public static void rightTriangle(int n){
    if(n%2==0)
       System.out.println("Enter odd no of rows");
    else{
       int star=1;
       int mid=n/2+1;
       for(int i=1;i<=n;i++)
       {
          for(int j=1;j<=star;j++)
          {
             System.out.print("* ");
          }
          if(i<mid)
             star++;
          else
             star--;
          System.out.println();
       }
    }
 }

 public static void leftTriangle(int n){
    if(n%2==0)
        System.out.print("Enter the no of rows");
    else{
       int star=1;
       int space=n/2;
       int mid=n/2+1;
       for(int i=1;i<=n;i++)
       {
          for(int j=1;j<=space;j++)
            System.out.print("  ");
          for(int j=1;j<=star;j++)
            System.out.print("* ");
         if(i<mid)
          {  
           star++;
           space--;
          }
         else{
            star--;
            space++;
         }
        System.out.println();
       }
    }
 }
 
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the no of rows:=");
   int n=sc.nextInt();
  // getPattern(n);
   //  getSpaceTriangle(n);
    // invertedTriangle(n);
     //  rightTriangle(n);
    leftTriangle(n);
 }
}









