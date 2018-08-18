/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.invoice;

import com.exam.connectionDatabase.ConnectionDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Rezaul sabuj
 */
public class Test {
    public static void main(String[] args) {
       ReportDAO rd=new ReportDAO();
       rd.pdf();
        
    }
}
