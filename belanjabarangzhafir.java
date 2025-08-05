import java.util.Scanner;

public class belanjabarangzhafir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama barang1 ");
        String namaBarang1 = input.nextLine();
        System.out.print("harga barang1 ");
        double hargaBarang1 = input.nextDouble();
        System.out.print("Masukkan nama barang2 ");
        String namaBarang2 = input.next();
        System.out.print("harga barang2 ");
        double hargaBarang2 = input.nextDouble();

        System.out.print("===; ");
        System.out.println("Barang 1: " + namaBarang1 + " dengan harga " + hargaBarang1);
        System.out.println("Barang 2: " + namaBarang2 + " dengan harga " + hargaBarang2);

}
}