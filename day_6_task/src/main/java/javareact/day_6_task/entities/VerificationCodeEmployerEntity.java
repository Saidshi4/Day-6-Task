package javareact.day_6_task.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "verification_code_employers")
public class VerificationCodeEmployerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "employer_id", referencedColumnName = "id")
    private EmployerEntity employer;

    @OneToOne
    @JoinColumn(name = "verification_code_id",referencedColumnName = "id")
    private VerificationCodeEntity verificationCode;
}
