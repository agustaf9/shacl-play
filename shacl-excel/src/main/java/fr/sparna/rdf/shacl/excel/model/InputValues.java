package fr.sparna.rdf.shacl.excel.model;

/**
 * @deprecated DO NOT USE - use Jena Statement instead
 * @author thomas
 *
 */
public class InputValues {
	
	protected String subject;
	protected String predicate;
	protected String object;
	protected String datatype;
	
	
	public String getDatatype() {
		return datatype;
	}
	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPredicate() {
		return predicate;
	}
	public void setPredicate(String predicate) {
		this.predicate = predicate;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	
	
}
