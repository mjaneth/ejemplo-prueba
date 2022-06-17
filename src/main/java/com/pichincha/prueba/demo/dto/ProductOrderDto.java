package com.pichincha.prueba.demo.dto;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductOrderDto {
	private Long id;
	private Date dateOrdered;
	private List<DetailOrderDto> details;
	private UserStoreDto userOwner;
}