package com.clashsoft.fxcommons.data;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipIO
{
	public static void readData(ZipFile zipFile, String file, DataInputReader consumer) throws IOException
	{
		try (DataInputStream dataInput = new DataInputStream(zipFile.getInputStream(zipFile.getEntry(file))))
		{
			consumer.read(dataInput);
		}
	}

	public static void readData(ZipFile zipFile, ZipEntry entry, DataInputReader consumer) throws IOException
	{
		try (DataInputStream dataInput = new DataInputStream(zipFile.getInputStream(entry)))
		{
			consumer.read(dataInput);
		}
	}
}
