package lk.greenshadow.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vehicle")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VehicleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  String vehicle_code;
    private String licence_plate_number;
    private String vehicle_category;
    private String fuel_type;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="staff_id")
    private StaffEntity staff;
    private String remarks;
}
