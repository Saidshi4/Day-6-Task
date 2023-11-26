package javareact.day_6_task.api;

import javareact.day_6_task.business.concretes.EmployerManager;
import javareact.day_6_task.model.dto.EmployerDto;
import javareact.day_6_task.model.dto.EmployerLiteDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/employer")
@RequiredArgsConstructor
public class EmployerController {
    private final EmployerManager employerManager;
    @PostMapping
    public void saveEmployer(@RequestBody EmployerDto employerDto){
        employerManager.saveEmployer(employerDto);
    }
    @GetMapping
    public List<EmployerLiteDto> getAllEmployer(){
        return employerManager.getAllEmployer();
    }
}
