package com.pichincha.prueba.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pichincha.prueba.demo.dto.ResponseDto;
import com.pichincha.prueba.demo.dto.StoreDto;
import com.pichincha.prueba.demo.exception.StoreException;
import com.pichincha.prueba.demo.service.StoreService;

@RestController
@RequestMapping("/store")
public class StoreController {


	@Autowired
	private StoreService storeService;

	@PostMapping("")
	public ResponseEntity<ResponseDto> createStore(@RequestBody StoreDto store) {

		try {
			return new ResponseEntity<>(storeService.saveStore(store), HttpStatus.OK);
		} catch (StoreException e) {
			return new ResponseEntity<>( HttpStatus.BAD_REQUEST);
		}
	}
}