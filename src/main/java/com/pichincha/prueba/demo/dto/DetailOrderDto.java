package com.pichincha.prueba.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DetailOrderDto {


	private Long id;
	private ProductDto productDto;
	private ProductOrderDto orderOwner;
	private Integer totalOdered;
	private Double priceUnit;
	private Double priceTotal;

}