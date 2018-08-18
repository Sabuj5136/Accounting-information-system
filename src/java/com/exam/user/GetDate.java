/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.user;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Rezaul sabuj
 */
public class GetDate {
    String dt;
    public String getStringDate() {
       
        try {
            String d;
            String m;
            String y;
            Calendar cal = new GregorianCalendar();
            int yea = cal.get(Calendar.YEAR);
            int mon = cal.get(Calendar.MONTH);
            int dat = cal.get(Calendar.DATE);
            // System.out.println(mon);

            String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            m = month[mon];
            System.out.println(m);
            d = String.valueOf(dat);
            y = String.valueOf(yea);
            Date dd = new Date(new java.util.Date("" + d + "-" + m + "-" + y + "").getTime());
            System.out.println(dd);
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
             dt = df.format(dd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dt;
    }
}
