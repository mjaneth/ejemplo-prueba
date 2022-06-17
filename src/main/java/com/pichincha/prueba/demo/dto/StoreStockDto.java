package com.pichincha.prueba.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StoreStockDto {

	private Long id;

	private Double soldPrice;

	private ProductDto productOwner;	

	private Integer stock;
}