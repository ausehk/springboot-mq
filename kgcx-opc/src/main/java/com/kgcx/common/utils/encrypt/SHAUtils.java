package com.kgcx.common.utils.encrypt;

import java.security.MessageDigest;

/**
 * hash加密工具类
 *
 * @author
 * @version 0.1
 * @time 2017/3/13 14:13
 * @since 0.1
 */
public class SHAUtils {

    private static final java.security.SecureRandom random = new java.security.SecureRandom();
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /**
     * 返回MD5加密后的结果
     *
     * @param
     * @return
     * @author
     * @time 2017/3/13 14:16
     * @version 0.1
     * @since 0.1
     */
    public static String md5(String srcStr) {
        return hash("MD5", srcStr);
    }

    /**
     * 返回SHA-1加密后的结果
     *
     * @param
     * @return
     * @author
     * @time 2017/3/13 14:16
     * @version 0.1
     * @since 0.1
     */
    public static String sha1(String srcStr) {
        return hash("SHA-1", srcStr);
    }

    /**
     * 返回SHA-256加密后的结果
     *
     * @param
     * @return
     * @author
     * @time 2017/3/13 14:16
     * @version 0.1
     * @since 0.1
     */
    public static String sha256(String srcStr) {
        return hash("SHA-256", srcStr);
    }

    /**
     * 返回SHA-384加密后的结果
     *
     * @param
     * @return
     * @author
     * @time 2017/3/13 14:16
     * @version 0.1
     * @since 0.1
     */
    public static String sha384(String srcStr) {
        return hash("SHA-384", srcStr);
    }

    /**
     * 返回SHA-512加密后的结果
     *
     * @param
     * @return
     * @author
     * @time 2017/3/13 14:16
     * @version 0.1
     * @since 0.1
     */
    public static String sha512(String srcStr) {
        return hash("SHA-512", srcStr);
    }

    /**
     * encrypt 128bit 16bytes
     * sha1 160bit 20bytes
     * sha256 256bit 32bytes
     * sha384 384bit 48bites
     * sha512 512bit 64bites
     */
    public static String hash(String algorithm, String srcStr) {
        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);
            byte[] bytes = md.digest(srcStr.getBytes("utf-8"));
            return toHex(bytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 把密文转换成十六进制的字符串形式
     *
     * @param
     * @return
     * @author
     * @time 2017/3/13 14:20
     * @version 0.1
     * @since 0.1
     */
    private static String toHex(byte[] bytes) {
        StringBuilder stringBuilder = new StringBuilder(bytes.length * 2);
        for (int i = 0; i < bytes.length; i++) {
            stringBuilder.append(HEX_DIGITS[(bytes[i] >> 4) & 0x0f]);
            stringBuilder.append(HEX_DIGITS[bytes[i] & 0x0f]);
        }
        return stringBuilder.toString();
    }

    /**
     * 生成混淆加密字符串
     *
     * @param
     * @return
     * @author
     * @time 2017/3/13 14:19
     * @version 0.1
     * @since 0.1
     */
    public static String generateSalt(int numberOfBytes) {
        byte[] salt = new byte[numberOfBytes];
        random.nextBytes(salt);
        return toHex(salt);
    }
}




