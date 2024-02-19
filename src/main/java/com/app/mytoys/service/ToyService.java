package com.app.mytoys.service;

import com.app.mytoys.entity.Toy;

import java.util.List;

public interface ToyService {
    void save(Toy toy);

    List<Toy> findByWorking(Boolean working);
}
