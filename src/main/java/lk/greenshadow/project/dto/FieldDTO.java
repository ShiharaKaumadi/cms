package lk.greenshadow.project.dto;

import lombok.*;

import java.awt.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class FieldDTO {
    private String f_code;
    private String f_name;
    private Point f_location;
    private double extent_size;
    private Long image1;
    private Long image2;
}
