package fr.sparna.rdf.shacl.doc;

import java.io.IOException;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;

import fr.sparna.rdf.shacl.diagram.ShaclPlantUmlWriter;

public class PlantUmlSourceGenerator {

	public String generatePlantUmlDiagram(Model shapesModel, Model owlModel) throws IOException {

		// draw - without subclasses links
		// set first parameter to true to draw subclassOf links
		ShaclPlantUmlWriter writer = new ShaclPlantUmlWriter(false, true);
		Model finalModel = ModelFactory.createDefaultModel();
		finalModel.add(shapesModel);
		if(owlModel != null) {
			finalModel.add(owlModel);
		}
		String plantUmlString = writer.writeInPlantUml(finalModel);
		return plantUmlString;
	}

}