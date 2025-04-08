package UtilsJava;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.util.Base64;

import javax.crypto.Cipher;

public class RSAExample {
    
    public void Execute(){
        String text = "Try to encrypt this text";
        
        // Gerar par de chaves RSA
        KeyPairGenerator keyGen;
        try {
            keyGen = KeyPairGenerator.getInstance("RSA");
            
            keyGen.initialize(2048); // Tamanho da chave
            KeyPair parDeChaves = keyGen.generateKeyPair();

            // Criptografar com a chave pública
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, parDeChaves.getPublic());
            byte[] textoCriptografado = cipher.doFinal(text.getBytes());
            String textoCriptografadoBase64 = Base64.getEncoder().encodeToString(textoCriptografado);
            System.out.println("Texto Criptografado: " + textoCriptografadoBase64);

            // Descriptografar com a chave privada
            cipher.init(Cipher.DECRYPT_MODE, parDeChaves.getPrivate());
            byte[] textoDescriptografado = cipher.doFinal(Base64.getDecoder().decode(textoCriptografadoBase64));
            System.out.println("Texto Descriptografado: " + new String(textoDescriptografado));
    
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
