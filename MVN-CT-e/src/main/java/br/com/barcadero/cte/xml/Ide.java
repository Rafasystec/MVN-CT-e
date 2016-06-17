package br.com.barcadero.cte.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

import br.com.barcadero.cte.xml.enums.EnumForPag;
import br.com.barcadero.cte.xml.enums.EnumModDoc;
import br.com.barcadero.cte.xml.enums.EnumProcEmitente;
import br.com.barcadero.cte.xml.enums.EnumTpAmbiente;
import br.com.barcadero.cte.xml.enums.EnumTpCTe;
import br.com.barcadero.cte.xml.enums.EnumTpEmissao;
import br.com.barcadero.cte.xml.enums.EnumTpImp;
import br.com.barcadero.cte.xml.enums.EnumTpServico;

@XmlAccessorType(XmlAccessType.FIELD)
public class Ide {
	
	@XmlElement(name="cUF",required=true)
	private String cUF;
	@XmlElement(name="cCT",required=true)
	private String cCT;
	@XmlElement(name="CFOP",required=true)
	private String cFOP;
	@XmlElement(name="natOp",required=true)
	private String natOp;
	@XmlElement(name="forPag",required=true)
	private EnumForPag forPag;
	@XmlElement(name="mod",required=true)
	private EnumModDoc mod;
	@XmlElement(name="serie",required=true)
	private String serie;
	@XmlElement(name="nCT",required=true)
	private String nCT;
	@XmlElement(name="dhEmi",required=true)
	private String dhEmi;
	@XmlElement(name="tpImp",required=true)
	private EnumTpImp tpImp;
	@XmlElement(name="tpEmis",required=true)
	private EnumTpEmissao tpEmis;
	@XmlElement(name="cDV",required=true)
	private String cDV;
	@XmlElement(name="tpAmb",required=true)
	private EnumTpAmbiente tpAmb;
	@XmlElement(name="tpCTe",required=true)
	private EnumTpCTe tpCTe;
	@XmlElement(name="procEmi",required=true)
	private EnumProcEmitente procEmi;
	@XmlElement(name="verProc",required=true)
	private String verProc;
	@XmlElement(name="refCTe",required=false)
	private String refCTe;
	@XmlElement(name="cMunEnv",required=true)
	private String cMunEnv;
	@XmlElement(name="xMunEnv",required=true)
	private String xMunEnv;
	@XmlElement(name="UFEnv",required=true)
	private String UFEnv;
	@XmlElement(name="modal",required=true)
	private String modal;
	@XmlElement(name="tpServ",required=true)
	private EnumTpServico tpServ;
	@XmlElement(name="cMunIni",required=true)
	private String cMunIni;
	@XmlElement(name="xMunIni",required=true)
	private String xMunIni;
	@XmlElement(name="UFIni",required=true)
	private String UFIni;
	@XmlElement(name="cMunFim",required=true)
	private String cMunFim;
	@XmlElement(name="xMunFim",required=true)
	private String xMunFim;
	@XmlElement(name="UFFim",required=true)
	private String UFFim;
	@XmlElement(name="retira",required=true)
	private String retira;
	@XmlElement(name="xDetRetira",required=false)
	private String xDetRetira;
	@XmlElements({
		@XmlElement(name="toma03",type=Tomador03.class),
		@XmlElement(name="toma4",type=Tomador04.class)
	})
	private SuperTomador tomador;
	public String getcUF() {
		return cUF;
	}
	public void setcUF(String cUF) {
		this.cUF = cUF;
	}
	public String getcCT() {
		return cCT;
	}
	public void setcCT(String cCT) {
		this.cCT = cCT;
	}
	public String getcFOP() {
		return cFOP;
	}
	public void setcFOP(String cFOP) {
		this.cFOP = cFOP;
	}
	public String getNatOp() {
		return natOp;
	}
	public void setNatOp(String natOp) {
		this.natOp = natOp;
	}
	public EnumForPag getForPag() {
		return forPag;
	}
	public void setForPag(EnumForPag forPag) {
		this.forPag = forPag;
	}
	public EnumModDoc getMod() {
		return mod;
	}
	public void setMod(EnumModDoc mod) {
		this.mod = mod;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getnCT() {
		return nCT;
	}
	public void setnCT(String nCT) {
		this.nCT = nCT;
	}
	public String getDhEmi() {
		return dhEmi;
	}
	public void setDhEmi(String dhEmi) {
		this.dhEmi = dhEmi;
	}
	public EnumTpImp getTpImp() {
		return tpImp;
	}
	public void setTpImp(EnumTpImp tpImp) {
		this.tpImp = tpImp;
	}
	public EnumTpEmissao getTpEmis() {
		return tpEmis;
	}
	public void setTpEmis(EnumTpEmissao tpEmis) {
		this.tpEmis = tpEmis;
	}
	public String getcDV() {
		return cDV;
	}
	public void setcDV(String cDV) {
		this.cDV = cDV;
	}
	public EnumTpAmbiente getTpAmb() {
		return tpAmb;
	}
	public void setTpAmb(EnumTpAmbiente tpAmb) {
		this.tpAmb = tpAmb;
	}
	public EnumTpCTe getTpCTe() {
		return tpCTe;
	}
	public void setTpCTe(EnumTpCTe tpCTe) {
		this.tpCTe = tpCTe;
	}
	public EnumProcEmitente getProcEmi() {
		return procEmi;
	}
	public void setProcEmi(EnumProcEmitente procEmi) {
		this.procEmi = procEmi;
	}
	public String getVerProc() {
		return verProc;
	}
	public void setVerProc(String verProc) {
		this.verProc = verProc;
	}
	public String getRefCTe() {
		return refCTe;
	}
	public void setRefCTe(String refCTe) {
		this.refCTe = refCTe;
	}
	public String getcMunEnv() {
		return cMunEnv;
	}
	public void setcMunEnv(String cMunEnv) {
		this.cMunEnv = cMunEnv;
	}
	public String getxMunEnv() {
		return xMunEnv;
	}
	public void setxMunEnv(String xMunEnv) {
		this.xMunEnv = xMunEnv;
	}
	public String getUFEnv() {
		return UFEnv;
	}
	public void setUFEnv(String uFEnv) {
		UFEnv = uFEnv;
	}
	public String getModal() {
		return modal;
	}
	public void setModal(String modal) {
		this.modal = modal;
	}
	public EnumTpServico getTpServ() {
		return tpServ;
	}
	public void setTpServ(EnumTpServico tpServ) {
		this.tpServ = tpServ;
	}
	public String getcMunIni() {
		return cMunIni;
	}
	public void setcMunIni(String cMunIni) {
		this.cMunIni = cMunIni;
	}
	public String getxMunIni() {
		return xMunIni;
	}
	public void setxMunIni(String xMunIni) {
		this.xMunIni = xMunIni;
	}
	public String getUFIni() {
		return UFIni;
	}
	public void setUFIni(String uFIni) {
		UFIni = uFIni;
	}
	public String getcMunFim() {
		return cMunFim;
	}
	public void setcMunFim(String cMunFim) {
		this.cMunFim = cMunFim;
	}
	public String getxMunFim() {
		return xMunFim;
	}
	public void setxMunFim(String xMunFim) {
		this.xMunFim = xMunFim;
	}
	public String getUFFim() {
		return UFFim;
	}
	public void setUFFim(String uFFim) {
		UFFim = uFFim;
	}
	public String getRetira() {
		return retira;
	}
	public void setRetira(String retira) {
		this.retira = retira;
	}
	public String getxDetRetira() {
		return xDetRetira;
	}
	public void setxDetRetira(String xDetRetira) {
		this.xDetRetira = xDetRetira;
	}
	public SuperTomador getTomador() {
		return tomador;
	}
	public void setTomador(SuperTomador tomador) {
		this.tomador = tomador;
	}
	
	

}
