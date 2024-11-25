package lk.greenshadow.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "logs")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String log_code;
    private LocalDate log_date;
    private String log_details;
    private Long observed_img;
    private List<StaffEntity> staff;
    private List<CropEntity> crops;
    private List<FieldEntity> fields;

}
