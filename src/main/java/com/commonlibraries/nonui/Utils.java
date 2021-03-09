package com.commonlibraries.nonui;

import net.bytebuddy.dynamic.scaffold.MethodGraph;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Utils {

    public Utils()
    {

    }
    public static LinkedHashMap<String, String> getNewUserDetails(String excelName, String sheetName)
    {
        LinkedHashMap<String, String> userDetails = new LinkedHashMap<>();
        FileInputStream fis = null;
        DataFormatter df= new DataFormatter();
        Cell c1, c2;
        String tempKey = "", tempValue = "";
        try {
            fis = new FileInputStream(new File(excelName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        XSSFWorkbook excel = null;
        try {
            excel = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        XSSFSheet sheet =  excel.getSheet(sheetName);
        Row r1 = sheet.getRow(0);
        Row r2 = sheet.getRow(1);
        int length = r1.getLastCellNum();
        for(int i = 0; i < length; i++ )
        {   //Need to handle integer to string conversion
            c1 = r1.getCell(i);
            c2 = r2.getCell(i);
            tempKey = df.formatCellValue(c1);
            tempValue = df.formatCellValue(c2);
            userDetails.put(tempKey, tempValue);
        }
        try {
            excel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userDetails;
    }
}
