package com.clashsoft.fxcommons.scene.control;

import javafx.scene.control.Spinner;

public class EditableSpinner<T> extends Spinner<T>
{
	public EditableSpinner()
	{
		this.setEditable(true);
		this.focusedProperty().addListener((observable, oldValue, newValue) -> {
			if (!newValue) // focus lost
			{
				this.increment(0); // commit editor
			}
		});
	}
}
