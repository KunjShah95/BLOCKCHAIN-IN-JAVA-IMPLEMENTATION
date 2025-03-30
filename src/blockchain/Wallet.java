package blockchain;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Wallet {
    public PrivateKey privateKey;
    public PublicKey publicKey;
    
    public Wallet() {
        generateKeyPair();    
    }

    private void generateKeyPair() {
        try {
            // Try to use built-in providers
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(2048); // 2048 bits provides good security
            
            KeyPair keyPair = keyGen.generateKeyPair();
            // Set the public and private keys from the keyPair
            privateKey = keyPair.getPrivate();
            publicKey = keyPair.getPublic();
        } catch(NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}