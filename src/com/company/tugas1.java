import javax.swing.JOptionPane;
import java.util.Scanner;
public class tugas1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String namadepan = "Rezky";
        String namatengah = "Putri";
        String namabelakang = "Amalia";
        int usia = 20;
        int targetTahunKuliah = 4;
        double ipk = 3.8976512;
        char nilaiAbjad = 'A';
        boolean cantik = true;

        System.out.print("Input Nama Depan : ");
        namadepan = scanner.nextLine();
        System.out.print("Input Nama Tengah : ");
        namatengah = scanner.nextLine();
        System.out.print("Input Nama Belakang : ");
        namabelakang = scanner.nextLine();
        System.out.print("Input Usia : ");
        usia = scanner.nextInt();
        System.out.print("Input IPK : ");
        ipk = scanner.nextDouble();
        System.out.print("");
        System.out.print("Input Nilai Abjad : ");
        nilaiAbjad = scanner.next().charAt(0);
        System.out.print("Cantik ? ");
        cantik = scanner.nextBoolean();

        System.out.println("Nama depan : " +namadepan);
        System.out.println("Nama tengah : " +namatengah);
        System.out.println("Nama belakang : " +namabelakang);
        System.out.println("Usia : " +usia);
        System.out.println("Target kuliah : " +targetTahunKuliah+ " tahun");
        System.out.println("IPK : " +ipk);
        System.out.println("Nilai PBO : " +nilaiAbjad);
        System.out.println("Cantik : " +cantik);

        JOptionPane.showMessageDialog(null,"Hai"+namadepan+namatengah+namabelakang);

    }
}
