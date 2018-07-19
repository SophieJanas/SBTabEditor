package de.sbtab.containers;

import org.sbml.jsbml.UnitDefinition;

import de.sbtab.controller.SBTabElement;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SBTabUnitDefinitionWrapper implements SBTabElement {
	private UnitDefinition unitDefinition;
	private StringProperty unitDefinitionName;
	private StringProperty unitDefinitionId;
	private StringProperty unitDefinitionSBOTerm;
	
	public SBTabUnitDefinitionWrapper(UnitDefinition unitDefinition) {
		if (unitDefinition != null) {
			setUnitDefinition(unitDefinition);
			initialize();
		}
	}

	public void initialize() {
		// TODO: figure out what fields do we need to work with
		unitDefinitionName = new SimpleStringProperty(unitDefinition.getName());		
		unitDefinitionId = new SimpleStringProperty(unitDefinition.getId());
		unitDefinitionSBOTerm = new SimpleStringProperty(unitDefinition.getSBOTermID());
	}
	

	public UnitDefinition getUnitDefinition() {
		return unitDefinition;
	}

	public void setUnitDefinition(UnitDefinition unitDefinition) {
		this.unitDefinition = unitDefinition;
	}

	public StringProperty getUnitDefinitionName() {
		return unitDefinitionName;
	}

	public void setUnitDefinitionName(StringProperty unitDefinitionName) {
		this.unitDefinitionName = unitDefinitionName;
	}

	public StringProperty getUnitDefinitionId() {
		return unitDefinitionId;
	}

	public void setUnitDefinitionId(StringProperty unitDefinitionId) {
		this.unitDefinitionId = unitDefinitionId;
	}

	public StringProperty getUnitDefinitionSBOTerm() {
		return unitDefinitionSBOTerm;
	}

	public void setUnitDefinitionSBOTerm(StringProperty unitDefinitionSBOTerm) {
		this.unitDefinitionSBOTerm = unitDefinitionSBOTerm;
	}
}