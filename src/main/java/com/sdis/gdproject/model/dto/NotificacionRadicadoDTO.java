package com.sdis.gdproject.model.dto;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("NotificacionRadicadoDTO")
public class NotificacionRadicadoDTO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("numeroDocIdent")
	private java.lang.String numeroDocIdent;
	@org.kie.api.definition.type.Label("tipoDocIdent")
	private java.lang.String tipoDocIdent;
	@org.kie.api.definition.type.Label("canal")
	private java.lang.String canal;
	@org.kie.api.definition.type.Label("mensajeLargo")
	private java.lang.String mensajeLargo;
	@org.kie.api.definition.type.Label("asunto")
	private java.lang.String asunto;

	@org.kie.api.definition.type.Label("adjunto")
	private com.sdis.gdproject.model.dto.ArchivoAdjuntoDTO adjunto;

	public NotificacionRadicadoDTO() {
	}

	public java.lang.String getNumeroDocIdent() {
		return this.numeroDocIdent;
	}

	public void setNumeroDocIdent(java.lang.String numeroDocIdent) {
		this.numeroDocIdent = numeroDocIdent;
	}

	public java.lang.String getTipoDocIdent() {
		return this.tipoDocIdent;
	}

	public void setTipoDocIdent(java.lang.String tipoDocIdent) {
		this.tipoDocIdent = tipoDocIdent;
	}

	public java.lang.String getCanal() {
		return this.canal;
	}

	public void setCanal(java.lang.String canal) {
		this.canal = canal;
	}

	public java.lang.String getMensajeLargo() {
		return this.mensajeLargo;
	}

	public void setMensajeLargo(java.lang.String mensajeLargo) {
		this.mensajeLargo = mensajeLargo;
	}

	public java.lang.String getAsunto() {
		return this.asunto;
	}

	public void setAsunto(java.lang.String asunto) {
		this.asunto = asunto;
	}

	public com.sdis.gdproject.model.dto.ArchivoAdjuntoDTO getAdjunto() {
		return this.adjunto;
	}

	public void setAdjunto(com.sdis.gdproject.model.dto.ArchivoAdjuntoDTO adjunto) {
		this.adjunto = adjunto;
	}

	public NotificacionRadicadoDTO(java.lang.String numeroDocIdent,
			java.lang.String tipoDocIdent, java.lang.String canal,
			java.lang.String mensajeLargo, java.lang.String asunto,
			com.sdis.gdproject.model.dto.ArchivoAdjuntoDTO adjunto) {
		this.numeroDocIdent = numeroDocIdent;
		this.tipoDocIdent = tipoDocIdent;
		this.canal = canal;
		this.mensajeLargo = mensajeLargo;
		this.asunto = asunto;
		this.adjunto = adjunto;
	}

}