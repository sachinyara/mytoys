package com.app.mytoys.service.impl;

import com.app.mytoys.entity.Toy;
import com.app.mytoys.repository.ToyRepository;
import com.app.mytoys.service.ToyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToyServiceImpl implements ToyService {

    @Autowired
    private ToyRepository toyRepository;

    public void save(Toy toy) {
        toyRepository.save(toy);
    }

    @Override
    public List<Toy> findByWorking(Boolean working) {
        return toyRepository.findByWorking(working);
    }
}
