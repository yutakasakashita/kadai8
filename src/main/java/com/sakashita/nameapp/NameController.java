package com.sakashita.nameapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {

    private NameMapper nameMapper;

    public NameController(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    @GetMapping("/names")
    public List<Name> getNames(@RequestParam String startsWith) {
        List<Name> names = nameMapper.findByNameStartsWith(startsWith);
        return names;
    }
}
