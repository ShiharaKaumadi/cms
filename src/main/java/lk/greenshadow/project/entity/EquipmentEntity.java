package lk.greenshadow.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "equipment")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EquipmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String equipment_id;
    private String name;
    private String type;
    private String status;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="field_id")
    private FieldEntity field;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "staff")
    private StaffEntity staff;
}
