package org.sadkowski.github.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserGitHubDTO {
    Long id;
    String login;
    String name;
    String type;
    String avatar_url;
    LocalDateTime created_at;
    Long followers;
    Long public_repos;
}
