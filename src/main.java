import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author ASUS
 */

public class main {
    public static void main(String[] args) throws IOException {
        // Array list isinya bisa campuran int string
        ArrayList <asin> Asin = new ArrayList<>();
        ArrayList <manis> manis = new ArrayList<>();


        String jenisT = "", jenisD="";
        int harga;
        
        asin MA = new asin("telur", "daging", "Asin", 0);
        manis MM = new manis("toping", "Manis", "rasa", 0);

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Login login = new Login();
        login.Login();
        while (true) {
            menu();
            int menu, pilih;
            menu = Integer.parseInt(br.readLine());
            if (menu == 1) {
                // CREATE
                System.out.println("====PILIH JENIS MARTABAK====");
                System.out.println("1. Asin");
                System.out.println("2. Manis");
                System.out.println("Masukkan Pilihan...");
                pilih = Integer.parseInt(br.readLine());
                if(pilih==1){
                    System.out.print("| Masukkan harga: ");
                    harga = Integer.parseInt(br.readLine());
                    System.out.println("| Masukkan jenis daging: ");
                    MA.daging();
                    System.out.println("Masukkan Pilihan...");
                    int select;
                    select = Integer.parseInt(br.readLine());
                    
                    if (select==1){
                        jenisD = "Ayam";
                    }else if (select==2){
                        jenisD = "Sapi";
                    }
                    System.out.println("| Masukkan jenis telur: ");
                    MA.telur();
                    System.out.println("Masukkan Pilihan...");
                    select = Integer.parseInt(br.readLine());
                    
                    if (select==1){
                        jenisT = "Ayam";
                    }else if (select==2){
                        jenisT = "Bebek";
                    }
                    asin newData = new asin(jenisT, jenisD, "Asin", harga);  
                    Asin.add(newData);
                }else if(pilih==2){
                    System.out.print("| Masukkan harga: ");
                    harga = Integer.parseInt(br.readLine());
                    System.out.println("| Masukkan rasa: ");
                    MM.rasa();
                    System.out.println("Masukkan Pilihan...");
                    menu = Integer.parseInt(br.readLine());
                    
                    if (menu==1){
                        jenisD = "Keju";
                    }else if (menu==2){
                        jenisD = "Coklat";
                    }
                    System.out.println("| Masukkan topping: ");
                    MM.toping();
                    System.out.println("Masukkan Pilihan...");
                    menu = Integer.parseInt(br.readLine());
                    
                    if (menu==1){
                        jenisT = "Meses Ceres";
                    }else if (menu==2){
                        jenisT = "Wijen";
                    }
                    manis newData = new manis(jenisT, "Manis", jenisD, harga); 
                    manis.add(newData);
                }
  
                
                System.out.println("");

            } else if (menu == 2) {
                // READ
                
                System.out.println("====PILIH JENIS MARTABAK====");
                System.out.println("1. Asin");
                System.out.println("2. Manis");
                System.out.println("Masukkan Pilihan...");
                pilih = Integer.parseInt(br.readLine());
                if (pilih == 1){
                    for (int i = 0; i < Asin.size(); i++) {
                        System.out.println("====MARTABAK ASIN====");
                        System.out.println("No. " + (i+1));
                        Asin.get(i).display();
                        System.out.println("==========================");
                    }
                } else if (pilih == 2){
                    for (int i = 0; i < manis.size(); i++) {
                        System.out.println("====MARTABAK MANIS====");
                        System.out.println("No. " + (i+1));
                        manis.get(i).display();
                        System.out.println("==========================");
                    }
                } 
            } else if (menu == 3) {
                System.out.println("1. asin");
                System.out.println("2. manis");
                System.out.println("masukkan pilihan: "); int pilihan = Integer.parseInt(br.readLine());
                if (pilihan == 1) {
                    System.out.println("Masukkan daging martabak yang ingin diedit: "); 
                    String Ubah = br.readLine();
                    for (asin Martabak : Asin){
                        if(Martabak.getJenisdaging().equals(Ubah)){
                            System.out.println("| Masukkan jenis martabak : "); 
                            Martabak.setJenis(br.readLine());
                            System.out.println("| Masukkan harga martabak : "); 
                            Martabak.setHarga (Integer.parseInt(br.readLine()));
                            System.out.println("masukkan jenis daging");
                            Martabak.setJenisdaging(br.readLine());
                            System.out.println("masukkan jenis telur");
                            Martabak.setJenistelur(br.readLine());
                            break;
                        }
                    }
                } else if (pilihan == 2) {
                    System.out.println("Masukkan rasa martabak yang ingin diedit: "); 
                    String Ubah = br.readLine();
                    for (manis terangbulan : manis){
                        if(terangbulan.getRasa().equals(Ubah)){
                            System.out.println("| Masukkan jenis martabak : "); 
                            terangbulan.setJenis(br.readLine());
                            System.out.println("| Masukkan harga martabak : "); 
                            terangbulan.setHarga (Integer.parseInt(br.readLine()));
                            System.out.println("masukkan topping : ");
                           terangbulan.setToping(br.readLine());
                            System.out.println("masukkan rasa : ");
                           terangbulan.setRasa(br.readLine());
                           break;
                        }
                    }
                }
            
            } else if (menu == 4) {
                System.out.println("1. asin");
                System.out.println("2. manis");
                System.out.println("masukkan pilihan: "); int pilihan = Integer.parseInt(br.readLine());
                
                if (pilihan == 1){
                     System.out.print("Masukkan daging martabak yang ingin dihapus: "); 
                     String Ubah = br.readLine();
                     for (int i = 0; i<Asin.size();i++){
                         if (Asin.get(i).getJenisdaging().equals(Ubah)){
                             Asin.remove(i);
                             System.out.println("data telah terhapus");
                         }
                     }
                }else if (pilihan == 2){
                    System.out.println("Masukkan rasa martabak yang ingin dihapus: "); 
                     String Ubah = br.readLine();
                     for (int i = 0; i<manis.size();i++){
                         if (manis.get(i).getRasa().equals(Ubah)){
                             manis.remove(i);
                             System.out.println("data telah terhapus");
                                     
                    }
                }
            }
            } else if(menu == 5){
                System.out.print("TERIMAKASIH TELAH BERKUNJUNG KE kedai KAMI");
                System.out.println("SAMPAI BERTEMU");
                break;
            }else {
                System.out.println("Masukkin yang bener!");
            }
        }
    }
    public static void menu(){
        System.out.println("[1] tambah jenis martabak");
        System.out.println("[2] lihat menu martabak");
        System.out.println("[3] Ubah martabak");
        System.out.println("[4] hapus martabak");
        System.out.println("[5] Exit\n");

        System.out.print("Masukkan Pilihan: ");
    }
}