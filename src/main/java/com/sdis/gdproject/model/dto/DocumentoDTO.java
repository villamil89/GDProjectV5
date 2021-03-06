package com.sdis.gdproject.model.dto;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("DocumentoDTO")
public class DocumentoDTO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "nombreDocumento")
	private java.lang.String nombreDocumento;
	@org.kie.api.definition.type.Label(value = "tipoDocumental")
	private java.lang.String tipoDocumental;
	@org.kie.api.definition.type.Label(value = "documento")
	private java.lang.String documento;
	@org.kie.api.definition.type.Label(value = "tipoArchivo")
	private java.lang.String tipoArchivo;

	public DocumentoDTO() {
	}

	public java.lang.String getNombreDocumento() {
		return this.nombreDocumento;
	}

	public void setNombreDocumento(java.lang.String nombreDocumento) {
		this.nombreDocumento = nombreDocumento;
	}

	public java.lang.String getTipoDocumental() {
		return this.tipoDocumental;
	}

	public void setTipoDocumental(java.lang.String tipoDocumental) {
		this.tipoDocumental = tipoDocumental;
	}

	public java.lang.String getDocumento() {
		return this.documento;
	}

	public void setDocumento(java.lang.String documento) {
		this.documento = documento;
	}

	public java.lang.String getTipoArchivo() {
		return this.tipoArchivo;
	}

	public void setTipoArchivo(java.lang.String tipoArchivo) {
		this.tipoArchivo = tipoArchivo;
	}

	public DocumentoDTO(java.lang.String nombreDocumento,
			java.lang.String tipoDocumental, java.lang.String documento,
			java.lang.String tipoArchivo) {
		this.nombreDocumento = nombreDocumento;
		this.tipoDocumental = tipoDocumental;
		this.documento = documento;
		this.tipoArchivo = tipoArchivo;
	}

}