package com.pichincha.prueba.demo.exception;

import lombok.Getter;

@Getter
public class StoreException extends Exception {
	private static final long serialVersionUID = -1393415637717906283L;

	private String message;

	public StoreException(String message, Throwable excption) {
		super(message, excption);
		this.message = message;
	}

}