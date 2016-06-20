package br.com.barcadero.cte.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/**
 * Dados do endereco do tomador
 * Nivel 3
 * @author antoniorafael
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class EnderToma {
	
	@XmlElement(name="xLgr")
	private String xLgr;
	@XmlElement(name="nro")
	private String nro;
	@XmlElement(name="xCpl")
	private String xCpl;
	@XmlElement(name="xBairro")
	private String xBairro;
	@XmlElement(name="cMun")
	private String cMun;
	@XmlElement(name="xMun")
	private String xMun;
	@XmlElement(name="CEP")
	private String cEP;
	@XmlElement(name="UF")
	private String uF;
	@XmlElement(name="cPais")
	private String cPais;
	@XmlElement(name="xPais")
	private String xPais;
	public String getxLgr() {
		return xLgr;
	}
	public void setxLgr(String xLgr) {
		this.xLgr = xLgr;
	}
	public String getNro() {
		return nro;
	}
	public void setNro(String nro) {
		this.nro = nro;
	}
	public String getxCpl() {
		return xCpl;
	}
	public void setxCpl(String xCpl) {
		this.xCpl = xCpl;
	}
	public String getxBairro() {
		return xBairro;
	}
	public void setxBairro(String xBairro) {
		this.xBairro = xBairro;
	}
	public String getcMun() {
		return cMun;
	}
	/**
	 * Informar 9999999 para operações com o exterior.
	 * @param cMun
	 */
	public void setcMun(String cMun) {
		this.cMun = cMun;
	}
	public String getxMun() {
		return xMun;
	}
	/**
	 * Informar EXTERIOR para operações com o exterior.
	 * @param xMun
	 */
	public void setxMun(String xMun) {
		this.xMun = xMun;
	}
	public String getcEP() {
		return cEP;
	}
	public void setcEP(String cEP) {
		this.cEP = cEP;
	}
	public String getuF() {
		return uF;
	}
	public void setuF(String uF) {
		this.uF = uF;
	}
	public String getcPais() {
		return cPais;
	}
	public void setcPais(String cPais) {
		this.cPais = cPais;
	}
	public String getxPais() {
		return xPais;
	}
	public void setxPais(String xPais) {
		this.xPais = xPais;
	}
	
	

}
