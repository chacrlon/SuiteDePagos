package com.suitepagos.backend.utils;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateTimeSuite {

    /*********** BEGIN control of TIME ***********/
    static SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    static long miliseconds = System.currentTimeMillis();
    static Date date = new Date(miliseconds);
    public static String dateFormateada = formato.format(date);
    /*********** END control of TIME ***********/
    
    }