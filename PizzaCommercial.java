import java.util.Scanner;
    
public class RadioCommercial {
    int n,p;
    Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        RadioCommercial rc = new RadioCommercial();
        System.out.println(rc.maxProfits());
    }
    public int maxProfits(){
        n = scan.nextInt();
        p = scan.nextInt();
        int m1=0;
        int m2=0;
        int[] listening = new int[n];
        for(int i=0;i<n;i++){
            listening[i] = scan.nextInt();
            listening[i] = listening[i]-p; //Profit is calculated here
            m1 = listening[i] > listening[i] + m1 ? listening[i] : listening[i]+m1; //comparing the profit with previous profit   
            m2 = m1> m2 ? m1 : m2; //max profit so far is stored in m2
             
            }
        return m2;
    }
}

