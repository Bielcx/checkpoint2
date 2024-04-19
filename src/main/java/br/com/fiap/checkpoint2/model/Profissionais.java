package br.com.fiap.checkpoint2.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "professionais")
public class Profissionais extends AbstractEntity<Long> {
	
	@Column(nullable = false, length = 40)
	private String nome;
	
	@Column(nullable = false, length = 30)
	private String especialidade; 
	
	@Column(columnDefinition = "DATE")
	private BigDecimal valor_hora;
	
	@Column(nullable = false, columnDefinition = "DATE")
    private LocalDateTime created_at;
	
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDateTime updated_at;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	
	public BigDecimal getValor_hora() {
		return valor_hora;
	}

	public void setValor_hora(BigDecimal valor_hora) {
		this.valor_hora = valor_hora;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

	public LocalDateTime getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}
	
	

}
