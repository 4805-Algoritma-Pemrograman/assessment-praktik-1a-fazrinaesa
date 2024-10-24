import java.util.Scanner;

public class Nomor1{
    public static void main(String[] args){
        int jamLembur;
        double honorLembur;
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Masukkan total JamLembur: ");
       int durasiLembur = sc.nextInt();
         
       double HonorLembur;
        if (durasiLembur <+ 16) {
            honorLembur = durasiLembur * 10000;
        } else {
            honorLembur = 16 * 10000 + (durasiLembur - 16) * 15000;
        }
        System.out.println("Total honor lembur: " + honorLembur);
       
    }

}

Psedocode 
Program MenghitungJumlahHonor;
Deklarasi 
    int jamLembur;
    double honorLembur;

Algoritma 
    Menghitung durasi lembur
    Memasukan honor lembur
    Menghasilkan total honor lembur
END 
