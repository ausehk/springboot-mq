package com.kgcx.opc.common.utils.encrypt;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

public class BASE64Utils {

    /**
     * BASE64解密
     *
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] decryptBASE64(String key) throws IOException {
        return (new BASE64Decoder()).decodeBuffer(key);
    }

    /**
     * BASE64加密
     *
     * @param key
     * @return
     */
    public static String encryptBASE64(byte[] key) {
        return (new BASE64Encoder()).encodeBuffer(key);
    }

}
