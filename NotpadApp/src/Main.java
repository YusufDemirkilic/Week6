
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("Notpad.txt");// dosyamızı tanımladık
        Scanner scanner = new Scanner(System.in);

        try {

            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));//Notepad.txt okumak için metod çağırma
                String readText = bufferedReader.readLine();// dosyasyı okuyoruz
                bufferedReader.close();
                System.out.println("Önceki Not: " + readText);// önceki notu ekrana yazdırıyoruz
                System.out.println("Lütfen bir değer girin");
                String text = scanner.nextLine();
                FileWriter fileWriter = new FileWriter(file, true);// dosyaya veriyi yazma metod çağrılma
                fileWriter.write(text + "\n");// girilen metni dosyaya yazıyoruz
                fileWriter.close();
            } else {
                System.out.println("             Dosya bulunmyor... ");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}