package com.help.domain;

import java.time.LocalDate;
import java.util.Objects;

import com.help.domain.enums.Prioridade;
import com.help.domain.enums.Status;

public class Chamado {

	private Integer codigo;
	private LocalDate dataAbertura;
	private LocalDate dataFechamento;
	private Prioridade prioridade;
	private Status status;
	private String titulo;
	private String observacoes;
	private Tecnico tecnico;
	private Cliente cliente;
	
	public Chamado() {
		super();
	}
	
	public Chamado(Integer codigo, Prioridade prioridade, Status status, String titulo, String observacoes,
			Tecnico tecnico, Cliente cliente) {
		super();
		this.codigo = codigo;
		this.prioridade = prioridade;
		this.status = status;
		this.titulo = titulo;
		this.observacoes = observacoes;
		this.tecnico = tecnico;
		this.cliente = cliente;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public LocalDate getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(LocalDate dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chamado other = (Chamado) obj;
		return Objects.equals(codigo, other.codigo);
	}

}
