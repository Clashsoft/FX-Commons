package com.clashsoft.fxcommons.scene.control;

import javafx.beans.property.ObjectProperty;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class IconButton extends Button
{
	private static final int SIZE = 27;

	public IconButton()
	{
		this("");
	}

	public IconButton(String text)
	{
		super(text);
		this.setPrefSize(SIZE, SIZE);
		this.setMaxSize(SIZE, SIZE);
		this.setMinSize(SIZE, SIZE);

		this.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);

		final ImageView imageView = new ImageView();
		imageView.setFitWidth(16);
		imageView.setFitHeight(16);
		this.setGraphic(imageView);
	}

	public ObjectProperty<Image> iconProperty()
	{
		return ((ImageView) this.getGraphic()).imageProperty();
	}

	public Image getIcon()
	{
		return this.iconProperty().get();
	}

	public void setIcon(Image icon)
	{
		this.iconProperty().set(icon);
	}
}
