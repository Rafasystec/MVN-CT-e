package br.com.barcadero.cte.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.barcadero.cte.xml.enums.EnumTpAmbiente;
import br.com.barcadero.cte.xml.enums.EnumXService;

@XmlRootElement(name="consSitCTe")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConsSitCTe {
	
	@XmlAttribute(name="versao")
	private String versao;
	@XmlElement(name="tpAmb",required=true)
	private EnumTpAmbiente tpAmbiente;
	@XmlElement(name="xServ",required=true)
	private EnumXService xServico;
	@XmlElement(name="chCTe",required=true)
	private String chCTe;
	
	public String getVersao() {
		return versao;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}
	public EnumTpAmbiente getTpAmbiente() {
		return tpAmbiente;
	}
	public void setTpAmbiente(EnumTpAmbiente tpAmbiente) {
		this.tpAmbiente = tpAmbiente;
	}
	public EnumXService getxServico() {
		return xServico;
	}
	public void setxServico(EnumXService xServico) {
		this.xServico = xServico;
	}
	public String getChCTe() {
		return chCTe;
	}
	public void setChCTe(String chCTe) {
		this.chCTe = chCTe;
	}

}
