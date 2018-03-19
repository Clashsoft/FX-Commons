package com.clashsoft.fxcommons.table;

import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyCode;

import java.util.function.Consumer;

public class DataTable
{
	public static <T> void initOpen(TableView<T> table, Consumer<T> open)
	{
		table.setRowFactory(param -> {
			final TableRow<T> row = new TableRow<>();
			row.setOnMouseClicked(event -> {
				final T item = row.getItem();
				if (item != null && event.getClickCount() >= 1)
				{
					open.accept(item);
				}
			});
			return row;
		});
	}

	public static <T> void initKeys(TableView<T> table, Runnable edit, Runnable add, Runnable remove)
	{
		table.setOnKeyPressed(event -> {
			if ("+".equals(event.getText()))
			{
				add.run();
			}
			else if ("-".equals(event.getText()) || event.getCode() == KeyCode.DELETE)
			{
				remove.run();
			}
			else if ("e".equals(event.getText()) || event.getCode() == KeyCode.ENTER)
			{
				edit.run();
			}
		});
	}
}
