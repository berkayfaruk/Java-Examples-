
import java.util.Scanner;


public class Hesap {
    
    private String kullanici_adi;
    private String paralo;
    private int bakiye;

    public Hesap(String kullanici_adi, String parola, int bakiye) {
      
        this.kullanici_adi = kullanici_adi;
        this.paralo = parola;
        this.bakiye = bakiye;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return paralo;
    }

    public void setParola(String parola) {
        this.paralo = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    public void paraYatir(int tutar){
        bakiye=bakiye+tutar;
        System.out.println("Yeni Bakiyeniz: "+bakiye);
    }
    
    public void paraCek(int tutar){
        if(bakiye-tutar<0){
            System.out.println("Hesabınızda yeterli bakiye yoktur.");
        }
        else{
            bakiye=bakiye-tutar;
            System.out.println("Kalan Bakiyeniz: "+bakiye);
        }
        
    }
    
    
}
