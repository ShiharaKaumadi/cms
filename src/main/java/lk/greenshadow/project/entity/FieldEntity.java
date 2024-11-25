package lk.greenshadow.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;
import java.util.List;
@Entity
@Table(name="field")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FieldEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String f_code;
    @Column(name="field_name")
    private String f_name;
    @Column(name = "location")
    private Point f_location;
    @Column(name = "size")
    private double extent_size;

    @OneToMany(mappedBy = "field", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CropEntity> cropList;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="staff_fields_detail",
    joinColumns = @JoinColumn(name = "field_id"),
    inverseJoinColumns = @JoinColumn(name="staff_id"))
    private List<StaffEntity> staffList;
    @ManyToMany(mappedBy = "field_logs", cascade = CascadeType.ALL)
    private List<LogEntity> logs;
    @Column(name = "image1")
    private Long image1;
    @Column(name="image2")
    private Long image2;
}
