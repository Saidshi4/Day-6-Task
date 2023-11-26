package javareact.day_6_task.mapper;

import javareact.day_6_task.entities.UserEntity;
import javareact.day_6_task.model.dto.UserDto;
import javareact.day_6_task.model.dto.UserGetDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEntity mapDtoToEntity(UserDto userDto);
    @Mapping(target="id",source = "id")
    UserGetDto mapEntityToDto(UserEntity userEntity);
}
