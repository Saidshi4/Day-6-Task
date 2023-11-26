package javareact.day_6_task.business.concretes;

import javareact.day_6_task.dataAccess.abstracts.EmployerRepository;
import javareact.day_6_task.mapper.EmployerMapper;
import javareact.day_6_task.model.dto.EmployerDto;
import javareact.day_6_task.model.dto.EmployerLiteDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployerManager {
    private final EmployerRepository employerRepository;
    private final EmployerMapper employerMapper;
    public void saveEmployer(EmployerDto employerDto){
        employerRepository.save(employerMapper.mapDtoToEntity(employerDto));
    }
    public List<EmployerLiteDto> getAllEmployer(){
        return employerMapper.mapEntityToLiteDto2(employerRepository.findAll());
    }


}
