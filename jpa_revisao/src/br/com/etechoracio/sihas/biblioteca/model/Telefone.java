package br.com.etechoracio.sihas.biblioteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.sihas.biblioteca.enums.SimNaoEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TBL_TELEFONE")
public class Telefone {
	
	@Id
	@GeneratedValue
	@Column(name="ID_TELEFONE")
	private Long id;
	
	@Column(name="TX_NUMERO")
	private String numero;
	
	@Enumerated(EnumType.STRING)
	@Column(name="FL_FIXO")
	private SimNaoEnum fixo;
}
