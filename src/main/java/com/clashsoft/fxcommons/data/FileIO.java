package com.clashsoft.fxcommons.data;

import java.io.*;

public class FileIO
{
	public static <T> T loadData(File file, DataInputFunction<T> function) throws IOException
	{
		try (DataInputStream dataInput = new DataInputStream(new BufferedInputStream(new FileInputStream(file))))
		{
			return function.read(dataInput);
		}
	}

	public static void readData(File file, DataInputReader consumer) throws IOException
	{
		try (DataInputStream dataInput = new DataInputStream(new BufferedInputStream(new FileInputStream(file))))
		{
			consumer.read(dataInput);
		}
	}

	public static void writeData(File file, DataOutputWriter consumer) throws IOException
	{
		try (DataOutputStream dataInput = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file))))
		{
			consumer.write(dataInput);
		}
	}
}
