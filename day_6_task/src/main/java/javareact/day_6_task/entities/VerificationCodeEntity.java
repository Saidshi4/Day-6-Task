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
@Table(name = "verification_codes")
public class VerificationCodeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "code")
    private String code;

    @Column(name = "is _verified")
    private boolean isVerified;

    @Column(name = "verified_date")
    private LocalDate verifiedDate ;

    @OneToOne(mappedBy = "verificationCode")
    private VerificationCodeCandidateEntity verificationCodeCandidate;

    @OneToOne(mappedBy = "verificationCode")
    private VerificationCodeEmployerEntity verificationCodeEmployer;
}
