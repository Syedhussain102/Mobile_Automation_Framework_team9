package methods;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Encryption {
    private static final int[] chain = {1000, 234, 35463, 2342, 2334};

    public static String encrypt(String key) {
        String result = "";
        int l = key.length();
        char ch;
        int ck = 0;
        for (int i = 0; i < l; i++) {
            if (ck >= chain.length - 1) ck = 0;
            ch = key.charAt(i);
            ch += chain[ck];
            result += ch;
            ck++;
        }
        return result;
    }

    public static String decrypt(String key) {
        String result = "";
        int l = key.length();
        char ch;
        int ck = 0;
        for (int i = 0; i < l; i++) {
            if (ck >= chain.length - 1) ck = 0;
            ch = key.charAt(i);
            ch -= chain[ck];
            result += ch;
            ck++;
        }
        return result;
    }

    public static void write(String text) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("output.txt")));
        writer.write(text);
        writer.flush();
        writer.close();
    }


    public static void main(String[] args) throws IOException {
        String pass = Encryption.encrypt("password enccrypter");
        System.out.println(pass);
        write(pass);

    }
}
