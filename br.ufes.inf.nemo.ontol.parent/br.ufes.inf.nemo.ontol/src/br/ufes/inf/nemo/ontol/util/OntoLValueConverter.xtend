package br.ufes.inf.nemo.ontol.util

import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.util.Strings

class OntoLValueConverter extends DefaultTerminalConverters {
	
	@ValueConverter(rule = "ELEMENTBOUND")
	def IValueConverter<Integer> ElementBound(){
		return new IValueConverter<Integer>(){
			
			override String toString(Integer value){
				if(value == -1)	return "*"
				else			return Integer.toString(value)
			}
			
			override toValue(String string, INode node) throws ValueConverterException {
				if(Strings.isEmpty(string)) {
					throw new ValueConverterException("Couldn't convert empty string to int", node, null)
				}
				else if("*".equals(string.trim)){
					return -1;
				}
				else {
					try( return Integer.parseInt(string))
					catch (NumberFormatException e){
						throw new ValueConverterException(
							"Couldn't convert '"+string+"' to int.",node,e
						)
					}
				}
			}
		}
	}
	
	@ValueConverter(rule="BOOLEAN")
	def IValueConverter<Boolean> Boolean(){
		return new IValueConverter<Boolean>() {
			
			override toString(Boolean value) {
				if(value)	return "true"
				else		return "false"
			}
			
			override toValue(String string, INode node) throws ValueConverterException {
				if(Strings.isEmpty(string)) {
					throw new ValueConverterException("Couldn't convert empty string to a boolean.", node, null)
				}
				else if("true".equals(string.trim)){
					return true
				}
				else if("false".equals(string.trim)){
					return false
				}
				else {
					throw new ValueConverterException("Couldn't convert '"+string+"' to boolean.",node, new Exception)
				}
			}
			
		}
	}
	
	@ValueConverter(rule="NUMBER")
	def IValueConverter<Double> Number(){
		return new IValueConverter<Double>() {
			
			override toString(Double value) throws ValueConverterException {
				double.toString
			}
			
			override toValue(String string, INode node) throws ValueConverterException {
				if(Strings.isEmpty(string)){
					throw new ValueConverterException("Couldn't convert empty string to a number.", node, null)
				}
				else {
					return Double.parseDouble(string.trim)
				}
			}
			
		}
	}
	
}