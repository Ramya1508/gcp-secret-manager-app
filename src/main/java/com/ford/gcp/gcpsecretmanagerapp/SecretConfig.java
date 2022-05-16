package com.ford.gcp.gcpsecretmanagerapp;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableConfigurationProperties
@Slf4j
public class SecretConfig {

    @Value ("${sm://NAME}")
    String secretName;

    @PostConstruct
    public void init () {
        log.info (" SecretConfig  >>>> secret value >> {} ", secretName);

        System.out.println (" SecretConfig  >>>> secret value >> {} " + secretName);
    }
}
