package fr.sparna.rdf.shacl.doc.model;

public class ExpectedValue {

	// either linkNodeShape is populated and this is a link to a NodeShape indicated by linkNodeShapeUri...
	private String linkNodeShape;
	private String linkNodeShapeUri;
	// ... or expectedValueLabel is populated and this is rendered as a code
	private String expectedValueLabel;
	// ... or the or is populated
	private String or;
	
	public String getOr() {
		return or;
	}

	public void setOr(String shOr) {
		this.or = shOr;
	}
	
	public String getExpectedValueLabel() {
		return expectedValueLabel;
	}
	
	public void setExpectedValueLabel(String expectedValueLabel) {
		this.expectedValueLabel = expectedValueLabel;
	}
	
	public String getLinkNodeShape() {
		return linkNodeShape;
	}

	public void setLinkNodeShape(String linkNodeShape) {
		this.linkNodeShape = linkNodeShape;
	}

	public String getLinkNodeShapeUri() {
		return linkNodeShapeUri;
	}

	public void setLinkNodeShapeUri(String linkNodeShapeUri) {
		this.linkNodeShapeUri = linkNodeShapeUri;
	}
	
}