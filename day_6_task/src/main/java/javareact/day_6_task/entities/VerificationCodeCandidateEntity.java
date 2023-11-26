package javareact.day_6_task.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "verification_code_candidates")
public class VerificationCodeCandidateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "candidate_id", referencedColumnName = "id")
    private CandidateEntity candidate;

    @OneToOne
    @JoinColumn(name = "verification_code_id", referencedColumnName = "id")
    private VerificationCodeEntity verificationCode;

}
