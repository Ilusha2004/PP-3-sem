package com.regex;

 public class DateRegex {

    DateRegex(){
        DATE_DD_MM_YYYY_SLASH_REG = 
            "(" +
                "(" +
                    "(" +
                        COMMON_31_DAY +	
                        SLASH +
                        COMMON_31_MONTH +
                    ")" + 				
                OR +
                    "(" +
                        COMMON_30_DAY +	
                        SLASH +
                        COMMON_30_MONTH +	
                    ")" +
                OR +
                    "(" +
                        COMMON_FEBRUARY_MONTH +
                        SLASH +
                        FEBRUARY +
                    ")" +
                ")" +
                SLASH +
                COMMON_YEAR +
            ")" +
        OR +
            "(" +
                LEAP_FEBRUARY_DAYS +
                SLASH +
                FEBRUARY +
                SLASH +
                LEAP_YEAR +
        ")";
    }

	private static final String COMMON_YEAR = "([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})";
	private static final String LEAP_YEAR = "(([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))";
	private static final String COMMON_31_MONTH = "(0[13578]|1[02]|jan|mar|may|jul|aug|oct|dec)";
	private static final String COMMON_31_DAY = "(0[1-9]|[12][0-9]|3[01])";
	private static final String COMMON_30_MONTH = "(0[469]|11|apr|jun|sep|nov)";
	private static final String COMMON_30_DAY = "(0[1-9]|[12][0-9]|30)";
	private static final String FEBRUARY = "(02|feb)";
	private static final String LEAP_FEBRUARY_DAYS = "29";
	private static final String COMMON_FEBRUARY_MONTH = "(0[1-9]|[1][0-9]|2[0-8])";
	private static final String SLASH = "/";
    private static final String OR = "|";
    
	public String DATE_DD_MM_YYYY_SLASH_REG;

	public final boolean isDate(String content){
		if(content.matches(DATE_DD_MM_YYYY_SLASH_REG)){
			return true;
		}
		return false;
	}

    public String getDATE_DD_MM_YYYY_SLASH_REG() {
        return DATE_DD_MM_YYYY_SLASH_REG;
    }

}