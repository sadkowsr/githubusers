package org.sadkowski.github.service;

import org.sadkowski.github.model.User;
import org.sadkowski.github.repository.UserRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserDatabaseService {

    private final UserRepository userRepository;

    public void updateCounterByLogin(String login) {
        if (userRepository.existsById(login)) {
            userRepository.incrementCounterByLogin(login);
        } else {
            userRepository.save(User.builder()
                                        .login(login)
                                        .requestCount(1)
                                        .build());
        }
    }
}
