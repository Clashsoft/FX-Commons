package com.clashsoft.fxcommons.data;

import java.io.DataInput;
import java.io.IOException;

public interface DataInputFunction<T>
{
	T read(DataInput input) throws IOException;
}
