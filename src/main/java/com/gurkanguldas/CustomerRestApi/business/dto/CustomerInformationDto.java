package com.gurkanguldas.CustomerRestApi.business.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.gurkanguldas.CustomerRestApi.message.CustomerValidationMessage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class CustomerInformationDto implements Serializable 
{
	private static final long serialVersionUID = 587108000926014711L;

	private Long id;

	@NotEmpty(message = CustomerValidationMessage.NAME_NOTEMPTY)
	private String name;

	@NotEmpty(message = CustomerValidationMessage.SURNAME_NOTEMPTY)
	private String surname;

	@NotEmpty(message = CustomerValidationMessage.GENDER_NOTEMPTY)
	private String gender;

	@NotNull(message = CustomerValidationMessage.DATE_NOTNULL)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDate dateOfBirth;

	@NotNull(message = CustomerValidationMessage.IDENTITY_NO_NOTNULL)
	private Long identificationNumber;

}
