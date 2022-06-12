package com.revature.HelloSpringBoot.services;


import com.revature.HelloSpringBoot.models.Candy;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CandyService {

    //basic crud business logic
    public Candy createCandy(Candy c);

    public List<Candy> getAll();

    public Candy editCandy(Candy c);

    public void deleteCandyById(int id);
}
