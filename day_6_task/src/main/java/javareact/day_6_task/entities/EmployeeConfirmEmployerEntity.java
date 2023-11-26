package javareact.day_6_task.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_confirm_employers")
public class EmployeeConfirmEmployerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(referencedColumnName = "id",name = "employer_id")
    private EmployerEntity employer;

    @OneToOne
    @JoinColumn(referencedColumnName = "id",name = "employee_confirm_id")
    private EmployeeConfirmEntity employeeConfirm;
}
