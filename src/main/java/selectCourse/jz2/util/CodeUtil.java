package selectCourse.jz2.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CodeUtil {
    public static String getMD5Encoding(String password) {
        //创建一个基于MD5的加密计算器
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        md5.update(password.getBytes());
        return new BigInteger(1, md5.digest()).toString(16);
    }
    
}

