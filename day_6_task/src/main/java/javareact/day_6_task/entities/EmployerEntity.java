package javareact.day_6_task.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employers")
public class EmployerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_address")
    private String webAddress;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(referencedColumnName = "id",name = "user_id")
    private UserEntity user;

    @OneToOne(mappedBy = "employer")
    private EmployeeConfirmEmployerEntity employeeConfirmEmployer;

    @OneToOne(mappedBy = "employer")
    private VerificationCodeEmployerEntity verificationCodeEmployer;
}
