import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;


public class desexample {
    public static void main(String[] args) throws Exception{
        KeyGenerator myGenerator=KeyGenerator.getInstance("DES");
        SecretKey key=myGenerator.generateKey();
        Cipher desCipher=Cipher.getInstance("DES");
        desCipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] bytes="This message is important".getBytes();
        byte[] myEncyptedBytes=desCipher.doFinal(bytes);
        System.out.println(myEncyptedBytes);
    }
}
