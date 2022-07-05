package com.gurkanguldas.CustomerRestApi.business.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class ReturnModel<T> {
	private Boolean succesful;
	private String code;
	private String message;
	private T result;
}
