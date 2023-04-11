/**
 *
 * @author ASUS
 */
public class manis extends Martabak implements IsiMartabakManis{
    private String toping;
    private String rasa;

    public void setToping(String toping) {
        this.toping = toping;
    }

    public void setRasa(String Rasa) {
        this.rasa = Rasa;
    }

    public String getToping() {
        return toping;
    }

    public String getRasa() {
        return rasa;
    }

    public manis(String toping, String jenis, String rasa, int harga) {
        super(jenis, harga);
        this.toping = toping;
        this.rasa = rasa;
    }

    @Override
    void display(){
        System.out.println("Rasa : " + this.rasa);
        System.out.println("Toping : " + this.toping);
        System.out.println("Harga : " + this.harga);
    }
    
    void display(String martabak){
        if (martabak.equals("semua")){
            display();
            super.display(true);
        }
    }
    
    public void toping(){
        System.out.println("1. Meses ceres");
        System.out.println("2. Wijen");
    }
    
    public void rasa(){
        System.out.println("1. Keju");
        System.out.println("2. Coklat");
    }
}