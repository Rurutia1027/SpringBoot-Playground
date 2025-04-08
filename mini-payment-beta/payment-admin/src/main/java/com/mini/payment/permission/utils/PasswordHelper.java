package com.mini.payment.permission.utils;

import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

public class PasswordHelper {
    private static final String secret = "";
    private static final int iterations = 2;
    private static final int hashWidth = 256;
    private static final String algorithm = "PBKDF2WithHmacSHA256";
    private static final Pbkdf2PasswordEncoder encoder =
            new Pbkdf2PasswordEncoder(secret, iterations, hashWidth, Pbkdf2PasswordEncoder.SecretKeyFactoryAlgorithm.valueOf(algorithm));


    // Generate salt (Spring Security does it internally, but we simulate it like Shiro)
    public static String generateSalt() {
        byte[] saltBytes = new byte[16];
        new java.security.SecureRandom().nextBytes(saltBytes);
        return org.apache.commons.codec.binary.Hex.encodeHexString(saltBytes);
    }

    // Encode password with given salt
    public static String encodePassword(String rawPassword, String salt) {
        // Combine password and salt
        String combined = rawPassword + salt;
        return encoder.encode(combined);
    }

    // Validate password
    public static boolean matches(String rawPassword, String salt, String encodedPassword) {
        return encoder.matches(rawPassword + salt, encodedPassword);
    }
}
