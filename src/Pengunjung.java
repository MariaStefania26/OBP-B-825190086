public class Pengunjung {
    private String nama;
    private String nomorkomputer;
    private int timein;
    private String pesanan;
    private int banyak;
    private int timeout;
    public int totalharga;
    public int ttlpesanan;

    public Pengunjung(String nama, String nomorkomputer, int timein, String pesanan, int banyak, int timeout) {
        this.nama = nama;
        this.nomorkomputer = nomorkomputer;
        this.timein = timein;
        this.pesanan = pesanan;
        this.banyak = banyak;
        this.timeout = timeout;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorkomputer() {
        return nomorkomputer;
    }

    public void setNomorkomputer(String nomorkomputer) {
        this.nomorkomputer = nomorkomputer;
    }

    public int getTimein() {
        return timein;
    }

    public void setTimein(int timein) {
        this.timein = timein;
    }

    public void Pesanan() {
        if (pesanan=="mie"){
            ttlpesanan = 10000*getBanyak();
        }
        if (pesanan=="snak"){
            ttlpesanan = 5000*getBanyak();
        }
        if (pesanan=="tidak memesan"){
            ttlpesanan = 0;
        }
        else {
            System.out.println("PESANAN TIDAK TERSEDIA");
        }
    }

    public int getBanyak() {
        return banyak;
    }

    public void setBanyak(int banyak) {
        this.banyak = banyak;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int Totalharga() {
        totalharga = 5000 *(getTimeout()-getTimein()) + ttlpesanan;

        return totalharga;
    }

}
