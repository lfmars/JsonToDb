package utils;

import java.sql.Date;

public interface TimestapConverter {
	public Date timestampStringToDate(String unixString);
}
