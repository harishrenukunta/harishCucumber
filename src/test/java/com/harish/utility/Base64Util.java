package com.harish.utility;

import org.apache.commons.codec.binary.Base64;

public class Base64Util {

    /**
     * Encode the given byte array into regular Base64 encoded string
     *
     * @param bytes
     * @return
     */
    public static String encode(byte[] bytes){
        return Base64.encodeBase64String(bytes);
    }

    public static byte[] decode(String s){
        return Base64.decodeBase64(s);
    }

    /**
     * Decode a given Base64 encoded string into its original un-encoded form.
     */
    private Base64Util(){
        throw new IllegalStateException("Base64Util class");
    }


}
