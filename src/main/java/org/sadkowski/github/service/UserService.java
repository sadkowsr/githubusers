package org.sadkowski.github.service;

import org.sadkowski.github.dto.UserDTO;
import org.sadkowski.github.dto.UserGitHubDTO;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserCalculation userCalculation;
    private final RestClientService restClientService;
    private final UserDatabaseService userDatabaseService;

    @Transactional
    public UserDTO getUser(final String login) {
        final UserGitHubDTO resultUserGitHubDTO = restClientService.getUser(login);
        userDatabaseService.updateCounterByLogin(login);

        return UserDTO.builder()
                .calculations(userCalculation.doCalculate(resultUserGitHubDTO.getFollowers(), resultUserGitHubDTO.getPublic_repos()))
                .id(resultUserGitHubDTO.getId())
                .login(resultUserGitHubDTO.getLogin())
                .name(resultUserGitHubDTO.getName())
                .type(resultUserGitHubDTO.getType())
                .createdAt(null)
                .avatarUrl(resultUserGitHubDTO.getAvatar_url())
                .build();
    }
}
