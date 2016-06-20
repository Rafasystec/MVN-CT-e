package br.com.barcadero.cte.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

import br.com.barcadero.cte.xml.enums.EnumTomador04;

@XmlAccessorType(XmlAccessType.FIELD)
public class Tomador04 extends SuperTomador {
	
	@XmlElement(name="toma",required=true)
	EnumTomador04 toma;
	@XmlElements({
		@XmlElement(name="CNPJ",type=CNPJ.class),
		@XmlElement(name="CPF",type=CPF.class)
	})
	private SuperCpfCnpj cpfCnpj;
	@XmlElement(name="IE",required=false)
	private String iE;
	@XmlElement(name="xNome",required=true)
	private String xNome;
	@XmlElement(name="xFant",required=false)
	private String xFant;
	@XmlElement(name="fone",required=false)
	private String fone;
	@XmlElement(name="enderToma",required=true)
	private EnderToma enderTomador;
	public EnumTomador04 getToma() {
		return toma;
	}
	public void setToma(EnumTomador04 toma) {
		this.toma = toma;
	}
	public SuperCpfCnpj getCpfCnpj() {
		return cpfCnpj;
	}
	/**
	 * Informar os zeros não significativos.
	 * Em caso de empresa não estabelecida
	no Brasil, será informado o CNPJ com zeros.
	Informar os zeros não significativos.
	 * @param cpfCnpj
	 */
	public void setCpfCnpj(SuperCpfCnpj cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getiE() {
		return iE;
	}
	/**
	 * Informar a IE do tomador ou ISENTO se
		tomador é contribuinte do ICMS isento de
		inscrição no cadastro de contribuintes do
		ICMS. Caso o tomador não seja
		contribuinte do ICMS não informar o
		conteúdo.
	 * @param iE
	 */
	public void setiE(String iE) {
		this.iE = iE;
	}
	public String getxNome() {
		return xNome;
	}
	public void setxNome(String xNome) {
		this.xNome = xNome;
	}
	public String getxFant() {
		return xFant;
	}
	public void setxFant(String xFant) {
		this.xFant = xFant;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public EnderToma getEnderTomador() {
		return enderTomador;
	}
	public void setEnderTomador(EnderToma enderTomador) {
		this.enderTomador = enderTomador;
	}
	
	

}
