package UtilsJava;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class EASExample {


    public void Execute()  {
        String text = "Tomato is a fruit";
        
        KeyGenerator keyGen;
        try {
            System.out.println("Texto : " + text);

            keyGen = KeyGenerator.getInstance("AES");
            
            keyGen.init(128);  // Tamanho da chave: 128, 192 ou 256 bits
            SecretKey secretKey = keyGen.generateKey();

            // Criptografar o texto
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] textoCriptografado = cipher.doFinal(text.getBytes());
            String textoCriptografadoBase64 = Base64.getEncoder().encodeToString(textoCriptografado);
            System.out.println("Texto Criptografado: " + textoCriptografadoBase64);

            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] textoDescriptografado = cipher.doFinal(Base64.getDecoder().decode(textoCriptografadoBase64));
            System.out.println("Texto Descriptografado: " + new String(textoDescriptografado));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
