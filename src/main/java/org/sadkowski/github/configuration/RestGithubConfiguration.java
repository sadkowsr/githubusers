package org.sadkowski.github.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix = "rest")
@Data
public class RestGithubConfiguration {

    private String url;
}

