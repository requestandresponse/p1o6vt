/**
 *
 */
package com.imooc.security.core;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.imooc.security.core.properties.SecurityProperties;

import java.util.Scanner;

/**
 * @author zhailiang
 */
@Configuration
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityCoreConfig {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String next = sc.next();
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = next.toCharArray();
        boolean flag = false;
        for (int i = 0; i < chars.length; i++) {
            try {
                char aChar = chars[i];
                sb.append(aChar);
                while (chars[i + 1] >= '0' && chars[i + 1] <= '9') {
                    stringBuilder.append(chars[i + 1]);
                    i++;
                    flag = true;
                    if (i == chars.length - 1) {
                        int count = Integer.parseInt(stringBuilder.toString());
                        for (int j = 1; j < count; j++) {
                            sb.append(aChar);
                        }
                        stringBuilder = new StringBuilder();
                        flag = false;
                    }
                }
                if (flag) {
                    int count = Integer.parseInt(stringBuilder.toString());
                    for (int j = 1; j < count; j++) {
                        sb.append(aChar);
                    }
                    stringBuilder = new StringBuilder();
                    flag = false;
                }
            } catch (Exception e) {

            }
        }
        System.out.println(sb.toString());
    }
}
