package lk.greenshadow.project.controller;

import lk.greenshadow.project.dto.FieldDTO;
import lk.greenshadow.project.util.ResponseUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin
public class FieldController {
public ResponseUtil getAllFields(){
    ArrayList<FieldDTO> allFields = new ArrayList();
    return new ResponseUtil("All","200","All Fields"+allFields);
}
}
