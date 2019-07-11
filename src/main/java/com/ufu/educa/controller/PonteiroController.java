package com.ufu.educa.controller;

import com.ufu.educa.repository.PonteiroRepository;

import java.util.List;

import javax.validation.ValidationException;

import com.ufu.educa.entity.Ponteiro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
@RequestMapping("/")
public class PonteiroController extends DefaultController{
    
    @Autowired
    private PonteiroRepository ponteiroRepository;

    @GetMapping("ponteiros")
    public String getPonteiro(@RequestParam(value="tipo", required=false) String tipo){
        return "abracadabra";
    }
}