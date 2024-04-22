package com.app.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Topping;

public interface IToppingDao extends JpaRepository<Topping, Integer>{

}
