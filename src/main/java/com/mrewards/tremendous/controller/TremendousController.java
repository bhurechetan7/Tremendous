package com.mrewards.tremendous.controller;

import com.mrewards.tremendous.entity.Tremendous;
import com.mrewards.tremendous.service.ServiceImpl;
import com.sun.net.httpserver.Headers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Consumer;

@RestController
@RequestMapping("/tremendous")
public class TremendousController {

     @Autowired
     ServiceImpl service ;

     @GetMapping("/")
     public ResponseEntity<List<Tremendous>> getAllTremendousData(){
           return ResponseEntity.status(HttpStatus.OK).body(service.getTremendousData());

     }

}
