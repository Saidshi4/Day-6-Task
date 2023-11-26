package javareact.day_6_task.business.concretes;

import javareact.day_6_task.dataAccess.abstracts.UserRepository;
import javareact.day_6_task.mapper.UserMapper;
import javareact.day_6_task.model.dto.UserDto;
import javareact.day_6_task.model.dto.UserGetDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    public void save(UserDto userDto){
        userRepository.save(userMapper.mapDtoToEntity(userDto));
    }
    public UserGetDto getByEmail(String email){
       return userMapper.mapEntityToDto(userRepository.findByEmail(email));
    }
}
