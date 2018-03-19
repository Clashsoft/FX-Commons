package com.clashsoft.fxcommons.data;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.time.LocalDate;
import java.util.UUID;

public class DataIO
{
	public static void writeUUID(DataOutput output, UUID uuid) throws IOException
	{
		output.writeLong(uuid.getMostSignificantBits());
		output.writeLong(uuid.getLeastSignificantBits());
	}

	public static UUID readUUID(DataInput input) throws IOException
	{
		long most = input.readLong();
		long least = input.readLong();
		return new UUID(most, least);
	}

	public static void writeLocalDate(DataOutput output, LocalDate date) throws IOException
	{
		if (date == null)
		{
			output.writeInt(-1);
			output.writeByte(-1);
			output.writeByte(-1);
		}
		else
		{
			output.writeInt(date.getYear());
			output.writeByte(date.getMonthValue());
			output.writeByte(date.getDayOfMonth());
		}
	}

	public static LocalDate readLocalDate(DataInput input) throws IOException
	{
		int year = input.readInt();
		byte month = input.readByte();
		byte day = input.readByte();

		if (month < 0 || day < 0)
		{
			return null;
		}
		return LocalDate.of(year, month, day);
	}
}
