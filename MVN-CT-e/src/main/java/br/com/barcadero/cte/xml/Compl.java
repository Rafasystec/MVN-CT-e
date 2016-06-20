package br.com.barcadero.cte.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/**
 * Dados complementares do CT-e para fins operacionais ou comerciais
 * @author antoniorafael
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Compl {

	@XmlElement(name="xCaracAd")
	private String xCaracAd;
	@XmlElement(name="xCaracSer")
	private String xCaracSer;
	@XmlElement(name="xEmi")
	private String xEmi;
	
	public String getxCaracAd() {
		return xCaracAd;
	}
	/**
	 * Texto livre:
	REENTREGA; DEVOLUÇÃO;
	REFATURAMENTO; etc
	 * @param xCaracAd
	 */
	public void setxCaracAd(String xCaracAd) {
		this.xCaracAd = xCaracAd;
	}
	public String getxCaracSer() {
		return xCaracSer;
	}
	/**
	 * Texto livre:
	ENTREGA EXPRESSA; LOGÍSTICA
	REVERSA; CONVENCIONAL;
	EMERGENCIAL; etc
	 * @param xCaracSer
	 */
	public void setxCaracSer(String xCaracSer) {
		this.xCaracSer = xCaracSer;
	}
	public String getxEmi() {
		return xEmi;
	}
	public void setxEmi(String xEmi) {
		this.xEmi = xEmi;
	}
	
	
	
}
