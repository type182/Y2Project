package com.Mai.Util.Phon;
import java.security.MessageDigest;

/**
 * 验证码生成工具类
 * @author Administrator
 *
 */
public class Chenkpage {

    //计算并获取checkSum
    public static String getCheckSum(String appSecret,String nonce,String curTime){
        return encode("SHA",appSecret+nonce+curTime);
    }

    private static String encode(String algorithm,String value){
        if(value==null){
            return null;
        }

        try {
            MessageDigest messageDigest=MessageDigest.getInstance(algorithm);
            messageDigest.update(value.getBytes());
            return "";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}