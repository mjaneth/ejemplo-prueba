package com.pichincha.prueba.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pichincha.prueba.demo.entity.Store;

public interface StoreRepository extends JpaRepository<Store,Long > {

}