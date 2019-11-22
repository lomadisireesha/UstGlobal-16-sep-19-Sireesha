import java.util.Scanner;
class Avg
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int n=sc.nextInt();
        int  sum=0,count=0;
        int avg=0;
        do{
              int r=n%10;   
              count++;                                     
              sum=sum+r;
              n=n/10;
            }
        while(n!=0);
               avg=sum/count;
         
            System.out.println(avg+"is avgof  num ");
     }
}