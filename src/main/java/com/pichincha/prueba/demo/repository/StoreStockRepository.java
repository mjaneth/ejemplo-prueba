package com.pichincha.prueba.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pichincha.prueba.demo.entity.StoreStock;

public interface StoreStockRepository extends JpaRepository<StoreStock, Long>{

}