import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int omzetTertinggi = 0, totalTrip = 0;
        String driverTerbaik = "";

        String lagi;
        do {
            System.out.print("Masukan nama driver [Beliau/Mereka/Kita]: ");
            String driver = scanner.nextLine();
            System.out.print("lama trip (km): ");
            int jarak = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            int omzet = jarak * 13000;
            totalTrip++;

            if (omzet > omzetTertinggi) {
                omzetTertinggi = omzet;
                driverTerbaik = driver;
            }

            System.out.print("Input lagi (Y/N)?: ");
            lagi = scanner.nextLine();
        } while (lagi.equalsIgnoreCase("Y"));

        System.out.println("Total trip yang dilakukan driver = " + totalTrip);
        System.out.println("Omzet tertinggi diperoleh oleh " + driverTerbaik + " dengan total Omzet = " + omzetTertinggi);
    }
}



