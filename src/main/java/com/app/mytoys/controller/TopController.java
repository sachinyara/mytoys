package com.app.mytoys.controller;

import com.app.mytoys.entity.Toy;
import com.app.mytoys.service.ToyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("toy")
public class TopController {
    @Autowired
    private ToyService toyService;

    @PostMapping("save")
    public String save(@RequestBody Toy toy) {
        toyService.save(toy);
        return "Saved successfully";
    }

    @GetMapping("find/{working}")
    public List<Toy> findByIsWorking(@PathVariable Boolean working) {
        return toyService.findByWorking(working);
    }
}
