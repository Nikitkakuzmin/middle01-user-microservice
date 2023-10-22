package kz.nik.middle01userservice1.mapper;

import kz.nik.middle01userservice1.dto.UserDTO;
import kz.nik.middle01userservice1.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toDto(User user);
    User toEntity(UserDTO userDTO);
    List<UserDTO> toDtoList(List<User> users);
}
