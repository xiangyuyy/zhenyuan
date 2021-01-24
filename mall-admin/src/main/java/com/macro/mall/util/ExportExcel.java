package com.macro.mall.util;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExportExcel<T> {
    private SimpleDateFormat sdf =  new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
    public void exportExcel(String[] headers,Collection<T> dataset,String sheetName, String fileName,HttpServletResponse response) {
        // 声明一个工作薄
        XSSFWorkbook workbook = new XSSFWorkbook();
        // 生成一个表格
        XSSFSheet sheet = workbook.createSheet(sheetName);
        XSSFCellStyle style = workbook.createCellStyle();
        // 基础样式
        // 设置自动换行
        style.setWrapText(true);
        // 水平对齐方式
        style.setAlignment(HorizontalAlignment.RIGHT);
        // 垂直对齐方式
        style.setVerticalAlignment(VerticalAlignment.CENTER);

        // 设置字体
        Font baseFont = workbook.createFont();
        // 字体类型
        baseFont.setFontName("宋体");
        // 字体大小
        baseFont.setFontHeightInPoints((short) 10);
        style.setFont(baseFont);
        // 设置表格默认列宽度为15个字节
        sheet.setDefaultColumnWidth((short) 20);

        //第一行

        //创建一个字体
        Font font=workbook.createFont();
        font.setFontHeightInPoints((short) 24);
        font.setFontName("宋体");
/*        font.setItalic(true);
        font.setStrikeout(true);*/
        CellStyle style1=workbook.createCellStyle();
        style1.setFont(font);

        XSSFRow rowHead = sheet.createRow(0);
        XSSFCell cellHead  = rowHead.createCell(0);
        XSSFRichTextString textHead = new XSSFRichTextString(sheetName);
        cellHead.setCellValue(textHead);
        cellHead.setCellStyle(style1);

        // 产生表格标题行
        XSSFRow row = sheet.createRow(1);
        for (short i = 0; i < headers.length; i++) {
            XSSFCell cell = row.createCell(i);
            XSSFRichTextString text = new XSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }
        try {
            // 遍历集合数据，产生数据行
            Iterator<T> it = dataset.iterator();
            int index = 1;
            while (it.hasNext()) {
                index++;
                row = sheet.createRow(index);
                T t = (T) it.next();
                // 利用反射，根据javabean属性的先后顺序，动态调用getXxx()方法得到属性值
                Field[] fields = t.getClass().getDeclaredFields();
                for (short i = 0; i < headers.length; i++) {
                    XSSFCell cell = row.createCell(i);
                    Field field = fields[i];
                    String fieldName = field.getName();
                    String getMethodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
                    Class<? extends Object> tCls = t.getClass();
                    Method getMethod = tCls.getMethod(getMethodName, new Class[] {});
                    Object value = getMethod.invoke(t, new Object[] {});
                    // 判断值的类型后进行强制类型转换
                    String textValue = null;
                    // 其它数据类型都当作字符串简单处理
                    if(value != null && value != ""){
                        String name = value.getClass().getName();
                        if(name.equals("java.util.Date")) {
                            textValue =	sdf.format(value);

                        }else {
                            textValue = value.toString();
                        }
                    }
                    if (textValue != null) {
                        XSSFRichTextString richString = new XSSFRichTextString(textValue);
                        cell.setCellValue(richString);
                    }
                }
            }
            getExportedFile(workbook, fileName,response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * 方法说明: 指定路径下生成EXCEL文件
     * @return
     */
    public void getExportedFile(XSSFWorkbook workbook, String name,HttpServletResponse response) throws Exception {
        ServletOutputStream fos = null;
        try {
            String fileName = name + ".xlsx";
            fileName = URLEncoder.encode(fileName, "UTF-8");
            response.setContentType("application/vnd.ms-excel;charset=UTF-8");
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
            fos = response.getOutputStream();
            workbook.write(fos);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                fos.close();
            }
        }
    }

}

