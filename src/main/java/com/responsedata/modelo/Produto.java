package com.responsedata.modelo;

import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("serial")
public class Produto implements Serializable{

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long codigo;

	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = true)
	private Byte estoque;
	
	@Column(nullable = true)
	private BigDecimal preco;
	
	@Column(nullable = false)
	LocalDate registredAt = LocalDate.now();
}
