import java.io.*;

public class Main {
    public static void main(String[] args) {
        int toplam = 0;
        File file = new File("dosya.txt");// dosya oluşturuldu
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter(file));// dosya içerisine veri yazdırmak için yol oluşturuldu
            w.write("5");// verileri yazdırma
            w.newLine();
            w.write("10");
            w.newLine();
            w.write("20");
            w.newLine();
            w.write("12");
            w.newLine();
            w.write("33");
            w.close();
            BufferedReader reader = new BufferedReader(new FileReader(file));//yazılan verileri okumak için
            String rdr;
            while ((rdr = reader.readLine()) != null) {
                toplam += Integer.parseInt(rdr.trim());// sırası ile okunan değerleri topluyoruz
                System.out.println("deger: " + rdr.trim());
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Toplam : " + toplam);

    }
}
