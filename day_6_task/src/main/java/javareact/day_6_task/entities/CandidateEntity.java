package javareact.day_6_task.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidates")
public class CandidateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "identity_number")
    private String identityNumber;

    @Column(name = "birth_year")
    private int birthYear;

    @OneToOne
    @JoinColumn(name = "user_id",referencedColumnName ="id")
    private UserEntity user;

    @OneToOne(mappedBy = "candidate")
    private VerificationCodeCandidateEntity verificationCodeCandidate;
}
