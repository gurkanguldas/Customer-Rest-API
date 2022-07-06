package com.gurkanguldas.CustomerRestApi.business.dto;

import java.io.Serializable;

import javax.validation.Valid;
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

public class CustomerDto implements Serializable 
{
	private static final long serialVersionUID = 659325978270741194L;

	private Long id;

	@NotEmpty(message = CustomerValidationMessage.NICKNAME_NOTEMPTY)
	private String nickname;

	@NotEmpty(message = CustomerValidationMessage.PASSWORD_NOTEMPTY)
	private String password;

	@Valid
	@NotNull(message = CustomerValidationMessage.CUSTOMERINFO_NOTEMPTY)
	private CustomerInformationDto customerInfo;

	@Valid
	@NotNull(message = CustomerValidationMessage.CUSTOMERCONTACT_NOTEMPTY)
	private CustomerContactDto customerContact;
}
