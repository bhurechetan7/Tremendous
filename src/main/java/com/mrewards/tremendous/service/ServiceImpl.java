package com.mrewards.tremendous.service;

import com.mrewards.tremendous.entity.Tremendous;
import com.mrewards.tremendous.repository.Data;

import java.util.List;
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {


    @Override
    public List<Tremendous> getTremendousData() {

                 Data data = new Data();
                 List<Tremendous> d = data.tremendous();

                   return d;


    }
}
