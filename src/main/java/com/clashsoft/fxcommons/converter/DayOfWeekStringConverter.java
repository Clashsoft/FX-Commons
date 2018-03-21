package com.clashsoft.fxcommons.converter;

import javafx.util.StringConverter;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayOfWeekStringConverter extends StringConverter<DayOfWeek>
{
	private final TextStyle style;
	private final Locale    locale;

	public DayOfWeekStringConverter(TextStyle style, Locale locale)
	{
		this.style = style;
		this.locale = locale;
	}

	@Override
	public String toString(DayOfWeek object)
	{
		return object.getDisplayName(this.style, this.locale);
	}

	@Override
	public DayOfWeek fromString(String string)
	{
		return null;
	}
}
