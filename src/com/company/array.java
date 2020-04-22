public class array {

    public static void main(String[] args) {

        String namadepan = "Rezky";
        String namatengah = "Putri";
        String namabelakang = "Amalia";
        int usia = 20;
        int targetTahunKuliah = 4;
        double ipk = 3.8976512;
        char nilaiAbjad = 'A';
        boolean cantik = true;

        System.out.println(namadepan + namatengah + namabelakang);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);
        String namaLengkap = namadepan + " " + namatengah + " " + namabelakang;
        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("NIS"));
        System.out.println(namaLengkap.substring(9));
        System.out.println(namaLengkap.substring(9,11));
        System.out.println(namaLengkap.replace("Put","put"));
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(6));

        String[] namaArray = namaLengkap.split("");
        for (String nama : namaArray){
            System.out.println(nama);
        }
    }
}
