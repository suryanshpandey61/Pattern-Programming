import java.util.Scanner;
class Alphabet{
  public static void getE(int n)
  {
      int star=n;
      
      int mid=n/2+1;
      for(int i=1;i<=n;i++)
      {
          for(int j=1;j<=star;j++)
          {
              if(i==1||i==n||i==mid||j==1)
                 System.out.print("* ");
              else
                 System.out.print("  ");
     
          }
        System.out.println();
      }
  }

  public static void getN(int n)
  {
     for(int i=1;i<=n;i++){
          for(int j=1;j<=n;j++){
              if(j==1||j==n||i==j)
                System.out.print("* ");
              else
                System.out.print("  ");
          }
           System.out.println();
     }
  }

  public static void getB(int n){
    int mid=n/2+1;
     for(int i=1;i<=n;i++){
         for(int j=1;j<=n;j++)
         {
            if(i==1||i==n||j==1||(i==mid && j!=n)||(j==n && i!=mid))
             System.out.print("* ");
            else
             System.out.print("  ");
         }
        System.out.println();
     }
  }

 public static void getV(int n)
 {
   
 }

  public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the no of rows");
       int n=sc.nextInt();
      // getE(n);
       //  getN(n);
        getB(n);
  }

}








