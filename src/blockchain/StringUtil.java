package blockchain;

import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Base64;

public class StringUtil {

    // Applies Sha256 to a string and returns the result.
    public static String applySha256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            
            // Applies sha256 to our input
            byte[] hash = digest.digest(input.getBytes("UTF-8"));
            
            StringBuilder hexString = new StringBuilder(); // This will contain hash as hexadecimal
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch(UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    // Applies digital signature and returns the result (as bytes)
    public static byte[] applyECDSASig(PrivateKey privateKey, String input) {
        Signature dsa;
        byte[] output = new byte[0];
        try {
            dsa = Signature.getInstance("RSA");
            dsa.initSign(privateKey);
            byte[] strByte = input.getBytes("UTF-8");
            dsa.update(strByte);
            output = dsa.sign();
        } catch (UnsupportedEncodingException | java.security.NoSuchAlgorithmException | 
                 java.security.InvalidKeyException | java.security.SignatureException e) {
            throw new RuntimeException(e);
        }
        return output;
    }
    // Verifies a String signature 
    public static boolean verifyECDSASig(PublicKey publicKey, String data, byte[] signature) {
        try {
            Signature verify = Signature.getInstance("RSA");
            verify.initVerify(publicKey);
            verify.update(data.getBytes("UTF-8"));
            return verify.verify(signature);
        } catch(UnsupportedEncodingException | java.security.NoSuchAlgorithmException | 
                java.security.InvalidKeyException | java.security.SignatureException e) {
            throw new RuntimeException(e);
        }
    }
    
    // Returns difficulty string target, to compare to hash. eg difficulty of 5 will return "00000"  
    public static String getDifficultyString(int difficulty) {
        return new String(new char[difficulty]).replace('\0', '0');
    }
    
    // Converts a Key to a string representation
    public static String getStringFromKey(Key key) {
        return Base64.getEncoder().encodeToString(key.getEncoded());
    }
}
