/**
 *
 * @author ASUS
 */
public class asin extends Martabak implements IsiMartabakAsin{
    private String jenistelur;
    private String jenisdaging;
    
    public asin(String jenistelur, String jenisdaging, String jenis, int harga) {
        super(jenis, harga);
        this.jenistelur = jenistelur;
        this.jenisdaging = jenisdaging;
    }

    public String getJenistelur() {
        return jenistelur;
    }

    public void setJenistelur(String jenistelur) {
        this.jenistelur = jenistelur;
    }

    public String getJenisdaging() {
        return jenisdaging;
    }

    public void setJenisdaging(String jenisdaging) {
        this.jenisdaging = jenisdaging;
    }   
    
    @Override
    void display(){
        System.out.println("Telur : " + this.jenistelur);
        System.out.println("Daging : " + this.jenisdaging);
        System.out.println("harga : " + this.harga);
    }
    
    public void daging(){
        System.out.println("1. Daging Ayam");
        System.out.println("2. Daging Sapi");
    }
    
    public void telur(){
        System.out.println("1. Telur Ayam");
        System.out.println("2. Telur Bebek");
    }
    
}
