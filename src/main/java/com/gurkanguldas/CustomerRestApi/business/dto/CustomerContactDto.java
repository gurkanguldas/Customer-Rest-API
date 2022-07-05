package com.gurkanguldas.CustomerRestApi.business.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.gurkanguldas.CustomerRestApi.message.CustomerValidationMessage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class CustomerContactDto implements Serializable
{
	private static final long serialVersionUID = -6868631636490130951L;

	private Long id;
	
	@NotEmpty(message = CustomerValidationMessage.COUNTRY_NOTEMPTY)
	private String country;
	
	@NotEmpty(message = CustomerValidationMessage.CITY_NOTEMPTY)
	private String city;
	
	@NotEmpty(message = CustomerValidationMessage.DISRICT_NOTEMPTY)
	private String disrict;
	
	@NotEmpty(message = CustomerValidationMessage.ADRESS_NOTEMPTY)
	private String adress;
	
	@NotNull(message = CustomerValidationMessage.PHONENUMBER_NOTEMPTY)
	private Long phoneNumber;
}
