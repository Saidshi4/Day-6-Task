package javareact.day_6_task.mapper;

import javareact.day_6_task.entities.EmployerEntity;
import javareact.day_6_task.model.dto.EmployerDto;
import javareact.day_6_task.model.dto.EmployerLiteDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface EmployerMapper {
    @Mapping(target="user.id",source = "userId")
    EmployerEntity mapDtoToEntity(EmployerDto employerDto);
    EmployerDto mapEntityToDto(EmployerEntity employerEntity);
    @Mapping(target="user",source="user")
    EmployerLiteDto mapEntityToLiteDto(EmployerEntity employerEntity);

    List<EmployerLiteDto> mapEntityToLiteDto2(List<EmployerEntity> employerEntity);
}
