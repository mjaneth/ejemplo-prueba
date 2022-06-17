package com.pichincha.prueba.demo.service;

import com.pichincha.prueba.demo.dto.ResponseDto;
import com.pichincha.prueba.demo.dto.StoreDto;
import com.pichincha.prueba.demo.exception.StoreException;

public interface StoreService {

	ResponseDto saveStore(StoreDto storeDto)  throws StoreException;
}