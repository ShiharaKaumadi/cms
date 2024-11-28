package lk.greenshadow.project.util;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ResponseUtil {
    private String code;
    private String status;
    private String message;
}
