package com.sdis.gdproject.model.negocio;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("DocumentoBO")
public class DocumentoBO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "documento")
	private org.jbpm.document.Document documento;

	public DocumentoBO() {
	}

	public org.jbpm.document.Document getDocumento() {
		return this.documento;
	}

	public void setDocumento(org.jbpm.document.Document documento) {
		this.documento = documento;
	}

	public DocumentoBO(org.jbpm.document.Document documento) {
		this.documento = documento;
	}

}