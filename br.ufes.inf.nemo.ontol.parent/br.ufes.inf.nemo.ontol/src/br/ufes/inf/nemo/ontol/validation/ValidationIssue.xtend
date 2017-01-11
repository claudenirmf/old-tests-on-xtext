package br.ufes.inf.nemo.ontol.validation

import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EObject

abstract class ValidationIssue {
	
	private String message;
	private EStructuralFeature feature;
	private int index;
	private String code;
	private String[] issueData;
	private EObject source;
	
	new() {
		this.message = null
		this.feature = null
		this.index = -1
		this.code = null
		this.issueData = null
		this.source = null
	}
	
	def String getMessage() { this.message }
	
	def void setMessage(String message) { this.message = message }
	
	def EStructuralFeature getFeature() { this.feature }
	
	def void setFeature(EStructuralFeature feature) { this.feature = feature }
	
	def int getIndex() { this.index }
	
	def void setIndex(int index) { this.index = index }
	
	def String getCode() { this.code }
	
	def void setCode(String code) { this.code = code }
	
	def String[] getIssueData() { this.issueData }
	
	def void setIssueData(String[] issueData) { this.issueData = issueData	}
	
	def EObject getSource() { this.source }
	
	def void setSource(EObject source) { this.source = source }
	
}