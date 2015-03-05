package com.codgen.virtualcatalog.api.util;



import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Named;
import java.security.Key;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

/**
 * Created by vicente on 7/3/14.
 */
@Named
public class CryptoUtils {

//    @Inject
//    private StoreUserFinderBean storeUserFinderBean;

    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//
//    @Inject
//    private UserSessionFinderService userSessionFinderService;

    private static final String ALGORITHM = "AES";
    private static final byte[] keyValue ="G@Pc0R3int3rnal@".getBytes();

    public String encrypt(String valueToEnc) {
        try {
            Key key = generateKey();
            Cipher c = Cipher.getInstance(ALGORITHM);
            c.init(Cipher.ENCRYPT_MODE, key);
            byte[] encValue = c.doFinal(valueToEnc.getBytes());
            String encryptedValue = new BASE64Encoder().encode(encValue);
            return encryptedValue;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public  String decrypt(String encryptedValue) {
        try {
            Key key = generateKey();
            Cipher c = Cipher.getInstance(ALGORITHM);
            c.init(Cipher.DECRYPT_MODE, key);
            byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedValue);
            byte[] decValue = c.doFinal(decordedValue);
            String decryptedValue = new String(decValue);
            return decryptedValue;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private static Key generateKey() throws Exception {
        Key key = new SecretKeySpec(keyValue, ALGORITHM);
        return key;
    }

    public  String generateToken(long id) {
        StringBuilder token = new StringBuilder();
        Date date = new Date();
        token.append(id);
        token.append(":");
        Date timestamp = new Date();
        token.append(sdf.format(timestamp));
        // Encrypt
        return encrypt(token.toString());
    }

//    public  StoreUser getUserFromToken(String encryptedToken) {
//        String descrypted= decrypt(encryptedToken);
//        StringTokenizer tokenizer=new StringTokenizer(descrypted, ":");
//        Long id = null;
//        String datetime = null;
//        while (tokenizer.hasMoreElements()) {
//            id = Long.parseLong(tokenizer.nextElement().toString());
//            datetime = tokenizer.nextElement().toString();
//        }
//
//        if(id==null || datetime==null){
//            throw new ValidationException("[Invalid token]: token is invalid");
//        }else {
//            try {
//                if(!validateTokenDate(sdf.parse(datetime))){
//                    throw new ValidationException("[Invalid token]: token is invalid");
//                }
//            } catch (ParseException e) {
//                throw new ValidationException("[Invalid token]: token is invalid");
//            }
//        }
//        return storeUserFinderBean.getById(id);
//    }

    public boolean validateTokenDate(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.HOUR_OF_DAY, 1); // adds one hour
        return date.before(cal.getTime());
    }
}

