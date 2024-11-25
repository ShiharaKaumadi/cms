package lk.greenshadow.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="staff")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StaffEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="id")
    private String id;
    @Column(name="name")
    private String name;
    @Column(name="email",unique = true)
    private String email;
    @Column(name="contact")
    private String contact;
    @Column(name="designation")
    private String designation;
    @Column(name="address")
    private String address;
    @Column(name = "dob")
    private LocalDate dob;
    @Enumerated(EnumType.STRING)
    private Role role;
    @Column(name="gender")
    private String gender;
    @ManyToMany(mappedBy = "staff_members", cascade = CascadeType.ALL)
    private List<FieldEntity> filed;
    @ManyToMany(mappedBy = "staff_logs", cascade = CascadeType.ALL)
    private List<LogEntity> logs;
    @OneToMany(mappedBy = "staff",cascade = CascadeType.ALL)
    private List<VehicleEntity> vehicle;
    @OneToMany(mappedBy = "staff",cascade =CascadeType.ALL)
    private List<EquipmentEntity> equipment;
    @OneToOne(mappedBy = "staff",cascade = CascadeType.ALL)
    private UserEntity user;
}
