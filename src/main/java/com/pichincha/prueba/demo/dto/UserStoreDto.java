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
public class UserStoreDto {

	private Long id;
	private String userName;
	private Date createdDate;

	private List<ProductOrderDto> requestOrders;

}