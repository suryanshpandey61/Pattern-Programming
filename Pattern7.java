import java.util.Scanner;
class Pattern7{
  public static void printPlus(int n)
  {
    if(n%2==0)
      System.out.println("Enter the odd no of rows");
   
    else{
       int mid=n/2+1;
       for(int i=1;i<=n;i++)
       {
          for(int j=1;j<=n;j++)
          {
            if(i==mid||j==mid)
              System.out.print("* ");
            else
              System.out.print("  ");
          }
         System.out.println();
       }
 
    }
  }

 public static void printMultiply(int n){
   if(n%2==0)
      System.out.println("Enter the odd no of rows");
   else{
           for(int i=1;i<=n;i++)
            {
              for(int j=1;j<=n;j++)
               {
                 if(i==j ||i+j==n+1)
                    System.out.print("* ");
                 else
                    System.out.print("  ");
               }
             System.out.println();
            }
       }

 }

 public static void printFullCross(int n)
 {
    if(n%2==0)
     System.out.println("enter the odd no of rows");
    else{
      int mid=n/2+1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
           if(i==1||i==n||j==1||j==n||i==mid||j==mid||i==j||i+j==n+1)
            System.out.print("* ");
           else
            System.out.print("  ");
        } 
       System.out.println();
      }
    }
 }

 public static void getSwastik(int n)
 {
   if(n%2==0)
     System.out.println("Enter the odd no of rows");
   else{
      int mid=n/2+1;
      for(int i=1;i<=n;i++)
       {
         for(int j=1;j<=n;j++)
          {
            if(i==mid||j==mid || (j==1 &&i<mid) || (j==n && i>mid) || (i==n && j<mid) || (i==1&&j>mid))
              System.out.print("* ");
            else
              System.out.print("  ");
          }
         System.out.println();
       }
   }

 }
  
 public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the value of n:=");
     int n=sc.nextInt();
    // printPlus(n);
    // System.out.println("=============");
    // printMultiply(n);
    // printFullCross(n);
      getSwastik(n);
   
 }


}