package com.clashsoft.fxcommons.data;

import java.io.DataOutput;
import java.io.IOException;

public interface DataOutputWriter
{
	void write(DataOutput output) throws IOException;
}
