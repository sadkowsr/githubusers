package org.sadkowski.github.service;

import java.util.Collections;

import org.sadkowski.github.configuration.RestGithubConfiguration;
import org.sadkowski.github.dto.UserGitHubDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RestClientService {

    private final RestGithubConfiguration restGithubConfiguration;

    public UserGitHubDTO getUser(final String login) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<HttpHeaders> request = new HttpEntity<>(httpHeaders);

        ResponseEntity<UserGitHubDTO> response = restTemplate.exchange(
                String.format("%s%s", restGithubConfiguration.getUrl(), login),
                HttpMethod.GET,
                request,
                UserGitHubDTO.class
        );
        return response.getBody();
    }
}
