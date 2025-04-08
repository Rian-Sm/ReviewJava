package UtilsJava;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class HashingExample {

    public void Execute(){

        String texto = "Prophet";
        // Gerar hash com SHA-256
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("SHA-256");
            
            byte[] hash = digest.digest(texto.getBytes());
            String hashBase64 = Base64.getEncoder().encodeToString(hash);

            System.out.println("Hash (SHA-256): " + hashBase64);

        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
