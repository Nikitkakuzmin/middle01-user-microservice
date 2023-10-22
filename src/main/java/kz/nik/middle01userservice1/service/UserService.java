package kz.nik.middle01userservice1.service;

import kz.nik.middle01userservice1.dto.UserDTO;
import kz.nik.middle01userservice1.mapper.UserMapper;
import kz.nik.middle01userservice1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public List<UserDTO> getUsers(){
        return userMapper.toDtoList(userRepository.findAll());
    }

    public UserDTO getUser(Long id){
        return userMapper.toDto(userRepository.findById(id).orElse(null));
    }

    public UserDTO addUser(UserDTO userDTO){
        return userMapper.toDto(userRepository.save(userMapper.toEntity(userDTO)));
    }

    public UserDTO updateUser(UserDTO userDTO){
        return userMapper.toDto(userRepository.save(userMapper.toEntity(userDTO)));
    }

    public void deleteUser(Long id){
        userRepository.findById(id).ifPresent(userRepository::delete);
    }
}