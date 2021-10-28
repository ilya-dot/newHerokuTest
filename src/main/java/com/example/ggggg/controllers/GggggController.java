package com.example.ggggg.controllers;

import com.example.ggggg.models.entities.Hz;
import com.example.ggggg.models.tables.HzTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/hz", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class GggggController {

    @Autowired
    private HzTable hzTable;

    public GggggController(HzTable hzTable) {
        this.hzTable = hzTable;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAllException(Exception exception) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("ERROR: " + exception.getMessage());
    }


    @GetMapping(value = "/getAll")
    public List<Hz> getAll() throws Exception {

        return hzTable.findAll();
    }

    @GetMapping(value = "/getById/{id}")
    public Hz getById(@PathVariable int id) throws Exception {


        return hzTable.findById(id).get();
    }
}
