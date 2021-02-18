package fr.sparna.rdf.shacl.doc;

import java.util.ArrayList;
import java.util.List;

import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFList;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.topbraid.shacl.vocabulary.SH;

public class ShaclPrefixReader {
	
	public List<String> readPrefixes(Resource resource) {
		List<String> prefixes = new ArrayList<>();
		
		appendPrefix(prefixes, resource, SH.path);
		appendPrefix(prefixes, resource, SH.targetClass);
		appendPrefix(prefixes, resource, SH.class_);
		appendPrefix(prefixes, resource, SH.datatype);
		appendPrefix(prefixes, resource, SH.in);
		appendPrefix(prefixes, resource, SH.hasValue);	
		
		return prefixes;
	}
	
	public static void appendPrefix(List<String> prefixes, Resource resource, Property property) {
		if(resource.hasProperty(property)) {
			if(resource.getProperty(property).getObject().isURIResource()) {
				String qname = resource.getModel().qnameFor(resource.getProperty(property).getObject().asNode().getURI());
				prefixes.add(qname.split(":")[0]);
			} else if(resource.getProperty(property).getObject().canAs(RDFList.class)) {
				List<RDFNode> nodes = resource.getProperty(property).getObject().as(RDFList.class).asJavaList();
				for (RDFNode aNode : nodes) {
					if(aNode.isURIResource()) {
						String qname = resource.getModel().qnameFor(aNode.asResource().getURI());
						prefixes.add(qname.split(":")[0]);
					}
				}
			}
		}
	}

}
