package com.gurkanguldas.CustomerRestApi.security.data;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CustomerLogin implements Serializable
{
	private static final long serialVersionUID = 8103005479925532851L;
	
	private String nickname;
	private String password;
	private String token;
}
