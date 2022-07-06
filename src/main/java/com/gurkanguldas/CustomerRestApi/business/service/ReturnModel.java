package com.gurkanguldas.CustomerRestApi.business.service;

import java.io.Serializable;

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
public class ReturnModel<T> implements Serializable
{
	private static final long serialVersionUID = -1810203145593140304L;
	
	private Boolean succesful;
	private String code;
	private String message;
	private T result;
}
