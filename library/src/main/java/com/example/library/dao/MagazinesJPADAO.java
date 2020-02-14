package com.example.library.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.library.entities.Magazines;

public interface MagazinesJPADAO extends CrudRepository<Magazines, Integer>  {

}