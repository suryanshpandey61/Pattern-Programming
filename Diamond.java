 import java.util.Scanner;
 class Diamond{
    public static void getDiamond(int n){
       if(n%2==0)
          System.out.println("Enter odd no of rows");
       else{
          int star=1;
          int space=n/2;
          int mid=n/2+1;
          for(int i=1;i<=n;i++){
             for(int j=1;j<=space;j++)
               System.out.print("  ");
             for(int j=1;j<=star;j++)
               System.out.print("* ");
             if(i<mid)
             {
               star=star+2;
               space--;
             }
             else{
               star=star-2;
               space++;
             }
            System.out.println();
          }

       }
    }

   public static void newPattern(int n){
       if(n%2==0)
         System.out.println("Enter the odd no of rows");
       else{
         int star=1;
         int space=n/2;
         int mid=n/2+1;
         for(int i=1;i<=n;i++)
         {
            for(int j=1;j<=space;j++)
               System.out.print("  ");
            for(int j=1;j<=star;j++)
               System.out.print("*   ");
            if(i<mid){
              space--;
              star++;
            }
            else{
             star--;
             space++;
            } 
            System.out.println();
  
         }
 
       }
   }
    
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the no of  rows:=");
      int n=sc.nextInt();
     // getDiamond(n);
        newPattern(n);
   }
  
 
 }











