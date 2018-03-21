package com.clashsoft.fxcommons.converter;

import javafx.util.StringConverter;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthStringConverter extends StringConverter<Month>
{
	private final TextStyle style;
	private final Locale    locale;

	public MonthStringConverter(TextStyle style, Locale locale)
	{
		this.style = style;
		this.locale = locale;
	}

	@Override
	public String toString(Month object)
	{
		return object.getDisplayName(this.style, this.locale);
	}

	@Override
	public Month fromString(String string)
	{
		return null;
	}
}
