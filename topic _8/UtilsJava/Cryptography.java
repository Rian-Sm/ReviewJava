package UtilsJava;

public class Cryptography {

    public static void main (String[] args) {
        EASExample eas = new EASExample();
        RSAExample rsa = new RSAExample();
        HashingExample hash = new HashingExample();

        eas.Execute();    
        
        rsa.Execute();

        hash.Execute();
    }
}
