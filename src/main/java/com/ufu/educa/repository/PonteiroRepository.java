package com.ufu.educa.repository;

import java.util.List;

import com.ufu.educa.entity.Ponteiro;

import org.springframework.data.repository.CrudRepository;

public interface PonteiroRepository extends CrudRepository<Ponteiro, Long>  {

    List<Ponteiro> findByTipo(String tipo);
}