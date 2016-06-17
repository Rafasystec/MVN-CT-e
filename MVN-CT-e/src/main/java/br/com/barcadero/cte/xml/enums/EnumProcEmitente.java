package br.com.barcadero.cte.xml.enums;
/**
 * Preencher com:
0 - emissão de CT-e com aplicativo do
contribuinte;
1 - emissão de CT-e avulsa pelo Fisco;
2 - emissão de CT-e avulsa, pelo
contribuinte com seu certificado digital,
através do site do Fisco;
3- emissão CT-e pelo contribuinte com
aplicativo fornecido pelo Fisco.

 * @author Rafael Rocha
 *
 */
public enum EnumProcEmitente {

	CTE_APLICATIVO_CLI,
	CTE_AVULSA_FISCO,
	CTE_AVULSA_FISCO_CLI,
	CTE_PELO_CLI_APP_FISCO
}
