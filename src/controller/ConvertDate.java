/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.AccountDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author
 */
//public class ConvertDate {
//
//    public static ConvertDate getInstance() {
//        return new ConvertDate();
//    }
//
//    public Date ChangeFrom(Date date) throws ParseException {
//        SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy 00:00:00");
//        String dateText = fm.format(date);
//        SimpleDateFormat par = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
//        Date result = par.parse(dateText);
//        return result;
//    }
//
//    public Date ChangeTo(Date date) throws ParseException {
//        SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy 23:59:59");
//        String dateText = fm.format(date);
//        SimpleDateFormat par = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
//        Date result = par.parse(dateText);
//        return result;
//    }
//}
public class ConvertDate {

    private static final SimpleDateFormat START_OF_DAY_FORMAT = new SimpleDateFormat("dd-MM-yyyy 00:00:00");
    private static final SimpleDateFormat END_OF_DAY_FORMAT = new SimpleDateFormat("dd-MM-yyyy 23:59:59");
    private static final SimpleDateFormat PARSE_FORMAT = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    private static ConvertDate instance;

    private ConvertDate() {
    }

    public static synchronized ConvertDate getInstance() {
        if (instance == null) {
            instance = new ConvertDate();
        }
        return instance;
    }

    public Date ChangeFrom(Date date) throws ParseException {
        String dateText = START_OF_DAY_FORMAT.format(date);
        return PARSE_FORMAT.parse(dateText);
    }

    public Date ChangeTo(Date date) throws ParseException {
        String dateText = END_OF_DAY_FORMAT.format(date);
        return PARSE_FORMAT.parse(dateText);
    }
}