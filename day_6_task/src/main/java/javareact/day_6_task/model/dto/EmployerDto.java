package javareact.day_6_task.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployerDto {
    private String companyName;
    private String webAddress;
    private String phoneNumber;
    private Integer userId;
}
