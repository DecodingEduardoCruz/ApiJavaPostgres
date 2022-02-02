package com.responsedata.modelo;

import lombok.Data;
import javax.persistence.Id;
import java.io.Serializable;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("serial")
public class Usuario implements Serializable{

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long codigo;

	@Column(unique= true, nullable = false)
	private String usuario;
	
	@Column(nullable = false)
	private String password;

}
