package org.example.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GenericReference<T> {
	private T reference;
	
	public GenericReference() {
		super();
	}

	public GenericReference(T reference) {
		super();
		this.reference = reference;
	}

	public T getReference() {
		return reference;
	}

	public void setReference(T reference) {
		this.reference = reference;
	}

}
