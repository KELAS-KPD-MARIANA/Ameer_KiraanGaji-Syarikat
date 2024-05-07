import java.util.Scanner;
public class Kiraangaji {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double bonus;
        double gaji_asas = 1100;
        int pelanggan;
        double gaji;
        
        
        System.out.println("Masukkan bilangan pelanggan");
        pelanggan = input.nextInt();
        
       if(pelanggan ==0) {
            bonus = 0;
            
        } else if(pelanggan>=1 && pelanggan<=9) {
            bonus = 2000;
            
        } else if(pelanggan>=10 && pelanggan<=19) {
            bonus = 4000;
            
        } else if(pelanggan>=20 && pelanggan<=29) {
            bonus= 6000;
            
        } else if(pelanggan>=30 && pelanggan<=39) {
            bonus= 8000;
            
        } else {
            bonus =10000;
        }
       
        gaji=gaji_asas+bonus;
        System.out.println("Bilangan pelanggan anda :   "+pelanggan);
        System.out.println("Gaji anda ialah : RM" +gaji);
        
    
    }
    }

