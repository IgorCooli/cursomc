package com.iobeica.cursomc.domain;

import java.util.Date;

import com.iobeica.cursomc.domain.enums.EstadoPagamento;

public class PagamentoComBoleto extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	private Date dataVenciomento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
		super();
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVenciomento = dataVencimento;
	}

	public Date getDataVenciomento() {
		return dataVenciomento;
	}

	public void setDataVenciomento(Date dataVenciomento) {
		this.dataVenciomento = dataVenciomento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	

}
