import java.util.*;
public class ChalkReplacer {
    public void chalkReplacer(int[] chalk, int k) {
        long sum=0;
        for(int i=0;i<chalk.length;i++){
            sum+=chalk[i];
        }
        int rc = (int)(k%sum);
        for(int i=0;i<chalk.length;i++){
            if(rc<chalk[i]){
                System.out.println("Student no "+ (i+1) +" needs to replace the chalks");
                break;
            }
            rc-=chalk[i];
        }
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        ChalkReplacer cr = new ChalkReplacer();
        System.out.println("Enter the number of elemnts in 1D array : ");
        int n = sc.nextInt();
        int oneD[] = new int[n];
        System.out.println("Enter the elemnts in to the array : ");
        for(int i=0 ; i<n ;i++){
            oneD[i] = sc.nextInt();
        }
        System.out.println("Enter total chalk pieces : ");
        int k = sc.nextInt();
        cr.chalkReplacer(oneD, k);
    }
}
