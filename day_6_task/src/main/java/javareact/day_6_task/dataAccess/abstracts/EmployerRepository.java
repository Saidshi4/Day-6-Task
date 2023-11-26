package javareact.day_6_task.dataAccess.abstracts;

import javareact.day_6_task.entities.EmployeeEntity;
import javareact.day_6_task.entities.EmployerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<EmployerEntity, Integer> {

}
