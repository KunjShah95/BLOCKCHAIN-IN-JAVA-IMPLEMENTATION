package blockchain;

public class WalletTest {
    public static void main(String[] args) {
        // Create a new wallet
        Wallet wallet = new Wallet();
        
        // Print wallet details
        System.out.println("New wallet created!");
        System.out.println("Private Key: " + wallet.privateKey.getAlgorithm() + ", Format: " + wallet.privateKey.getFormat());
        System.out.println("Public Key: " + wallet.publicKey.getAlgorithm() + ", Format: " + wallet.publicKey.getFormat());
        
        // Simple test of key data
        byte[] pubKeyEncoded = wallet.publicKey.getEncoded();
        System.out.println("Public Key length: " + pubKeyEncoded.length + " bytes");
        
        System.out.println("Wallet functioning correctly!");
    }
} 