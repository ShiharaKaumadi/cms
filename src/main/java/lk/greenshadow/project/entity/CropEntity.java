package lk.greenshadow.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "crops")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CropEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String c_code;
    @Column(name = "common_name")
    private String common_name;
    @Column(name="sci_name")
    private String scientific_name;
    @Column(name = "crop_image")
    private Long crop_Image;
    @Column(name = "category")
    private String category;
    @Column(name = "crop_season")
    private String crop_season;
    @ManyToOne
    @JoinColumn(name="field_id")
    private FieldEntity field;
    @ManyToMany(mappedBy = "crop_logs", cascade = CascadeType.ALL)
    private List<LogEntity> logs;
}
