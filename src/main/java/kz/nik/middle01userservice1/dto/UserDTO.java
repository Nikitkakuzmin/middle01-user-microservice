package kz.nik.middle01userservice1.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class UserDTO {

    private Long id;
    private String email;
    private String login;
    private String fullName;

}