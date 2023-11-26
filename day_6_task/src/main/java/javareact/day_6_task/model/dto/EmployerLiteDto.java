package javareact.day_6_task.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerLiteDto {
    private String companyName;
    private String webAddress;
    private String phoneNumber;
    private UserDto user;
}
