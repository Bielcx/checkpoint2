package br.com.fiap.checkpoint2.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "consultas")
public class Consultas extends AbstractEntity<Long>{

	@ManyToOne
    @JoinColumn(name = "professionais_id_fk", nullable = false)
	private Profissionais professionais;
	
	@ManyToOne
    @JoinColumn(name = "pacientes_id_fk", nullable = false)
	private Pacientes pacientes;
	
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDateTime data_consulta;
	
	@Column(nullable = false, length = 2)
    @Enumerated(EnumType.STRING)
    @JdbcTypeCode(SqlTypes.CHAR)
	private Status status;
	
	@Column(length = 24)
	private int quantidade_horas;
	
	@Column(columnDefinition = "NUMERIC(15,2)")
	private BigDecimal valor_consulta;
	
	public Profissionais getProfessionais() {
		return professionais;
	}

	public void setProfessionais(Profissionais professionais) {
		this.professionais = professionais;
	}

	public Pacientes getPacientes() {
		return pacientes;
	}

	public void setPacientes(Pacientes pacientes) {
		this.pacientes = pacientes;
	}

	public LocalDateTime getData_consulta() {
		return data_consulta;
	}

	public void setData_consulta(LocalDateTime data_consulta) {
		this.data_consulta = data_consulta;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getQuantidade_horas() {
		return quantidade_horas;
	}

	public void setQuantidade_horas(int quantidade_horas) {
		this.quantidade_horas = quantidade_horas;
	}

	public BigDecimal getValor_consulta() {
		return valor_consulta;
	}

	public void setValor_consulta(BigDecimal valor_consulta) {
		this.valor_consulta = valor_consulta;
	}
	
	

}


	
	
	
	
	

	
	
	
	
	

