package org.sadkowski.github.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO {

    Long id;
    String login;
    String name;
    String type;
    String avatarUrl;
    LocalDateTime createdAt;
    Double calculations;

}
