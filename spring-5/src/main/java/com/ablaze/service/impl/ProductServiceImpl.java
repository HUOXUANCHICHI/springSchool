package com.ablaze.service.impl;

import com.ablaze.service.ProductService;

import java.security.MessageDigest;

/**
 * @author ablaze
 * @Date: 2023/10/11/13:46
 */
public class ProductServiceImpl implements ProductService {
    //模拟的
    @Override
    public void browse() {
        System.out.println("browse...");
    }

    @Override
    public String encryption(String plainText) {
        String re_md5 = new String();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();

            int i;

            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }

            re_md5 = buf.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return re_md5;
    }
}
