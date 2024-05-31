package swp.internmanagement.internmanagement.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@Getter
@Setter
@Entity
@Table(name="request")
public class Request {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="request_id")
    private int requestId;

    @Column(name="manager_id")
    private int managerId;

    @Column(name="mentor_id")
    private int mentorId;

    @Column(name="coordinator_id")
    private int coordinatorId;

    @Column(name="intern_id")
    private int internId;


    @NotNull
    @NotEmpty
    @NotBlank
    @Column(name="request_type")
    private String requestType;

    @NotNull
    @NotEmpty
    @NotBlank
    @Column(name="request_description")
    private String requestDescription;

    @Column(name="request_status")
    private byte requestStatus;


}