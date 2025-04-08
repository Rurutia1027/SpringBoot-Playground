package com.mini.payment.permission.utils;

import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MiniPayHttpClientUtils {
    public static String post(String url, String parameters) {
        if (url == null || url.trim().isEmpty() || parameters == null || parameters.trim().isEmpty()) {
            return null;
        }

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost post = new HttpPost(url);
            post.addHeader("Content-Type", "application/json; charset=UTF-8");
            post.setHeader("Accept", "application/json");
            post.setEntity(new StringEntity(parameters, StandardCharsets.UTF_8));

            try (CloseableHttpResponse response = httpClient.execute(post)) {
                int statusCode = response.getCode();
                if (statusCode != HttpStatus.SC_OK) {
                    return "1"; // request error
                }
                return EntityUtils.toString(response.getEntity());

            } catch (ParseException e) {
                return "2"; // parse error
            }

        } catch (IOException e) {
            return "3"; // network error
        }
    }
}
