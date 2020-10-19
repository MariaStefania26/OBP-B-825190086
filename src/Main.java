public class Main {
    public static void main(String[] args) {

        Pengunjung b = new Pengunjung("Ida", "13", 10, "mie", 2,14 );
        System.out.println("Pengunjung "+b.getNama()+" nomor komputer : "+b.getNomorkomputer());
        System.out.println("Waktu masuk : "+b.getTimein());
        System.out.println("Waktu keluar : "+b.getTimeout());
        System.out.println("Total yang harus dibayarkan adalah Rp. "+b.totalharga);
    }
}
