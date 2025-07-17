import java.util.Scanner;
public class towerofhanoi {
    public static void tower(int n,String source , String helper, String destination  ){
        if(n==1){
            System.out.println("disk "+n+" transferd from "+source+" to "+destination);
            return;
        }
        tower(n-1, source, destination, helper);
        System.out.println("disk "+n+" transferd from "+source+" to "+destination);
        tower(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter number of disk : ");
        n=sc.nextInt();
        tower(n, "S","H","D");
    }
}
