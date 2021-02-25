package fr.sparna.rdf.shacl.diagram;

import java.util.ArrayList;
import java.util.List;

import org.apache.jena.rdf.model.Resource;;

public class PlantUmlBox {
	
	private Resource nodeShape;
	protected String nameshape;
	
	protected String nametargetclass; 
	protected String packageName;	
	
	protected List<PlantUmlProperty> properties = new ArrayList<>();
	protected List<PlantUmlBox> superClasses = new ArrayList<>();

	public PlantUmlBox(Resource nodeShape) {  
	    this.nodeShape = nodeShape;		
	}
	
	public String getNameshape() {
		return nameshape;
	}

	public void setNameshape(String nameshape) {		
		this.nameshape = nameshape;
	}	
	
	public List<PlantUmlProperty> getProperties() {	
		return properties;
	}
	
	public void setProperties(List<PlantUmlProperty> properties) {
		this.properties = properties;
	}	
		
	public String getNametargetclass() {
		return nametargetclass;
	}
	
	public String getQualifiedName() {		
		return packageName+"."+this.nameshape;
	}

	public Resource getNodeShape() {
		return nodeShape;
	}
	
	public String getPackageName() {
		return packageName;
	}

	public void setNametargetclass(String nametargetclass) {
		this.nametargetclass = nametargetclass;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public List<PlantUmlBox> getSuperClasses() {
		return superClasses;
	}

	public void setSuperClasses(List<PlantUmlBox> superClasses) {
		this.superClasses = superClasses;
	}

	public String toPlantUml() {
		String declaration = "Class"+" "+"\""+this.getNameshape()+"\""+((this.getNametargetclass() != null)?" "+"<"+this.getNametargetclass()+">":"")+"\n";
		if(this.superClasses != null) {
			for (PlantUmlBox aSuperClass : this.superClasses) {
				declaration += "\""+this.getNameshape()+"\"" + "--|>" + "\""+aSuperClass.getNameshape()+"\"" + "\n";
			}
		}
		return declaration;
	}
}