package fr.sparna.rdf.shacl.shaclplay.generate;

import fr.sparna.rdf.shacl.shaclplay.catalog.rules.RulesCatalog;

public class GenerateFormData {

	public static final String KEY = GenerateFormData.class.getSimpleName();
	
	protected String errorMessage;
	
	protected RulesCatalog catalog;
	
	protected String selectedShapesKey;

	/**
	 * Creates a new ConvertFormData instance suitable for displaying the given error message.
	 * @param message
	 * @return
	 */
	public static GenerateFormData error(String message) {
		GenerateFormData data = new GenerateFormData();
		data.setErrorMessage(message);
		return data;
	}	
	
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public RulesCatalog getCatalog() {
		return catalog;
	}

	public void setCatalog(RulesCatalog catalog) {
		this.catalog = catalog;
	}

	public String getSelectedShapesKey() {
		return selectedShapesKey;
	}

	public void setSelectedShapesKey(String selectedShapesKey) {
		this.selectedShapesKey = selectedShapesKey;
	}

}
