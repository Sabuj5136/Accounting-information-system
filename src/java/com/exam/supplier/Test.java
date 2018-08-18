/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.supplier;

import com.exam.connectionDatabase.IncrementDAO;

/**
 *
 * @author Rezaul sabuj
 */
public class Test {
    public static void main(String[] args) {
         IncrementDAO id=new IncrementDAO();
        String supplierId=id.doIncrement2("7000","supplierId", "supplier");
        System.out.println(supplierId);
    }
}
