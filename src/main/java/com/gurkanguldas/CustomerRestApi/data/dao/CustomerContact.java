package com.gurkanguldas.CustomerRestApi.data.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "customer_contact")
public class CustomerContact implements Serializable, IEntity {
	private static final long serialVersionUID = 4552253110061390939L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_contact_id")
	private Long id;

	@Column(name = "country", nullable = false)
	private String country;

	@Column(name = "city", nullable = false)
	private String city;

	@Column(name = "disrict", nullable = false)
	private String disrict;

	@Column(name = "adress", nullable = false)
	private String adress;

	@Column(name = "phone_number", nullable = false)
	private Long phoneNumber;
}
