package blockchain;

import java.util.ArrayList;
import java.util.HashMap;

public class NoobChain {
	// Define UTXOs and minimumTransaction that are referenced in Transaction class
	public static HashMap<String, TransactionOutput> UTXOs = new HashMap<>();
	public static float minimumTransaction = 0.1f;
	public static ArrayList<Block> blockchain = new ArrayList<>();
	public static int difficulty = 5;
	public static Wallet walletA;
	public static Wallet walletB;
	public static Transaction genesisTransaction;
	
	public static void main(String[] args) {
		// Create wallets
		walletA = new Wallet();
		walletB = new Wallet();
		
		// Display wallet keys
		System.out.println("Private and public keys:");
		System.out.println("Wallet A: " + StringUtil.getStringFromKey(walletA.privateKey));
		System.out.println("Wallet B: " + StringUtil.getStringFromKey(walletB.publicKey));
		
		// Create a test transaction from WalletA to walletB
		System.out.println("\nCreating and Mining Genesis block... ");
		Block genesis = new Block("Genesis block", "0");
		genesis.mineBlock(difficulty);
		blockchain.add(genesis);
		
		// Add a few more blocks
		System.out.println("\nCreating and Mining Block 1... ");
		Block block1 = new Block("Block 1 Data", blockchain.get(blockchain.size()-1).hash);
		block1.mineBlock(difficulty);
		blockchain.add(block1);
		
		System.out.println("\nCreating and Mining Block 2... ");
		Block block2 = new Block("Block 2 Data", blockchain.get(blockchain.size()-1).hash);
		block2.mineBlock(difficulty);
		blockchain.add(block2);
		
		System.out.println("\nBlockchain is Valid: " + isChainValid());
		
		// Print out blockchain
		System.out.println("\nThe blockchain:");
		for (Block block : blockchain) {
			System.out.println(block.toString());
		}
	}
	
	public static Boolean isChainValid() {
		Block currentBlock; 
		Block previousBlock;
		String hashTarget = StringUtil.getDifficultyString(difficulty);
		
		// Loop through blockchain to check hashes:
		for(int i=1; i < blockchain.size(); i++) {
			currentBlock = blockchain.get(i);
			previousBlock = blockchain.get(i-1);
			
			// Compare registered hash and calculated hash:
			if(!currentBlock.hash.equals(currentBlock.calculateHash())) {
				System.out.println("Current Hashes not equal");            
				return false;
			}
			
			// Compare previous hash and registered previous hash
			if(!previousBlock.hash.equals(currentBlock.previousHash)) {
				System.out.println("Previous Hashes not equal");
				return false;
			}
			
			// Check if hash is solved
			if(!currentBlock.hash.substring(0, difficulty).equals(hashTarget)) {
				System.out.println("This block hasn't been mined");
				return false;
			}
		}
		return true;
	}
}