package javareact.day_6_task.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_confirms")
public class EmployeeConfirmEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(referencedColumnName = "id", name = "employee_id")
    private EmployeeEntity employee;

    @Column(name = "is_confirmed")
    private boolean isConfirmed;

    @Column(name = "confirm_date")
    private LocalDate confirm_date;

    @OneToOne(mappedBy = "employeeConfirm")
    private EmployeeConfirmEmployerEntity employeeConfirmEmployer;
}
