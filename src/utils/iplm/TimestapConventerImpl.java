package utils.iplm;

import java.sql.Date;

import utils.TimestapConverter;

public class TimestapConventerImpl implements TimestapConverter{

	@Override
	public Date timestampStringToDate(String unixString) {
		if(unixString!=null) {
		long timestamp = Long.parseLong(unixString.substring(6, unixString.length()-7));
		return new Date(timestamp);
		}
		return null;
	}

}
