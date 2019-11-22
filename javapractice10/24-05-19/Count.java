import java.util.Scanner;
class Count1
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int n=sc.nextInt();
        int  sum=0,ecount=0,ocount=0;
        while(n!=0)
         {     
              int r=n%10;
              if(r%2==0)
                 {
                       ecount++;
                 }
            else
                 {
                      ocount++;
                }
              n=n/10;
            }  
            System.out.println(ecount+"is count of  even num ");
            System.out.println(ocount+"is count of  odd num ");
     }
}