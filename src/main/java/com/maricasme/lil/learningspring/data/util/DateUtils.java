package com.maricasme.lil.learningspring.data.util;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.DateFormat;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class DateUtils {
	public Date createDateFromDateString(String dateString){
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        if(StringUtils.hasText(dateString)){
           try{
               date = format.parse(dateString);
           } catch (ParseException e) {
               date = new Date();
           }
        }else{
            date = new Date();
        }
        return date;
    }

}
