package com.example.learn_spring_boot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="currency-service")
@Component
public class CurrencyServiceConfiguration {
    public String url;
    public String username;
    public String key;

    // No-argument constructor is needed by Spring
    public CurrencyServiceConfiguration() {
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CurrencyServiceConfiguration(String url, String username, String key) {
        this.url = url;
        this.username = username;
        this.key = key;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getKey() {
        return key;
    }
    @Override
    public String toString() {
        return "CurrencyServiceConfiguration{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
