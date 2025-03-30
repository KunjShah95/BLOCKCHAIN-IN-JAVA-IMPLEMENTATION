package blockchain;

import java.util.Date;

public class Block {

    public String hash;
    public String previousHash;
    public String data; // our data will be a simple message.
    private final long timeStamp; // current time in milliseconds
    private int nonce;

    // Constructor for Block
    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.nonce = 0;
        this.hash = calculateHash(); // Making sure we do this after we set the other values
    }

    // Calculate new hash based on blocks contents
    public final String calculateHash() {
        String calculatedhash = StringUtil.applySha256(
                previousHash +
                Long.toString(timeStamp) +
                Integer.toString(nonce) +
                data
        );
        return calculatedhash;
    }

    public void mineBlock(int difficulty) {
        String target = new String(new char[difficulty]).replace('\0', '0'); // Create a string with difficulty * "0" 
        while(!hash.substring(0, difficulty).equals(target)) {
            nonce++;
            hash = calculateHash();
        }
        System.out.println("Block Mined!!! : " + hash);
    }
    
    // Getter methods for private fields
    public long getTimeStamp() {
        return timeStamp;
    }
    
    public int getNonce() {
        return nonce;
    }
    
    // Enhanced toString method to display detailed block information
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Block:\n");
        builder.append(" Hash: ").append(hash).append("\n");
        builder.append(" Previous Hash: ").append(previousHash).append("\n");
        builder.append(" Data: ").append(data).append("\n");
        builder.append(" Timestamp: ").append(new Date(timeStamp)).append("\n");
        builder.append(" Nonce: ").append(nonce).append("\n");
        return builder.toString();
    }
}