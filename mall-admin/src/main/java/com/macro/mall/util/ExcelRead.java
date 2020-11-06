package com.macro.mall.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

public class ExcelRead {
    public static int totalRows; //sheet中总行数
    public static int totalCells; //每一行总单元格数

    /**
     * read the Excel .xlsx,.xls
     *
     * @param file jsp中的上传文件
     * @return
     * @throws IOException
     */
    public static List<ArrayList<String>> readExcel(MultipartFile file) throws IOException {
        if (file == null || ExcelUtil.EMPTY.equals(file.getOriginalFilename().trim())) {
            return null;
        } else {
            String postfix = ExcelUtil.getPostfix(file.getOriginalFilename());
            if (!ExcelUtil.EMPTY.equals(postfix)) {
                if (ExcelUtil.OFFICE_EXCEL_2003_POSTFIX.equals(postfix)) {
                    return readXls(file, null);
                } else if (ExcelUtil.OFFICE_EXCEL_2010_POSTFIX.equals(postfix)) {
                    return readXlsx(file, null);
                } else {
                    return null;
                }
            }
        }
        return null;
    }


    /**
     * read the Excel .xlsx,.xls
     *
     * @param file jsp中的上传文件
     * @return
     * @throws IOException
     */
    public static List<ArrayList<String>> readExcel(MultipartFile file, Integer pages) throws IOException {
        if (file == null || ExcelUtil.EMPTY.equals(file.getOriginalFilename().trim())) {
            return null;
        } else {
            String postfix = ExcelUtil.getPostfix(file.getOriginalFilename());
            if (!ExcelUtil.EMPTY.equals(postfix)) {
                if (ExcelUtil.OFFICE_EXCEL_2003_POSTFIX.equals(postfix)) {
                    return readXls(file, pages);
                } else if (ExcelUtil.OFFICE_EXCEL_2010_POSTFIX.equals(postfix)) {
                    return readXlsx(file, pages);
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    /**
     * read the Excel .xlsx,.xls
     *
     * @param file jsp中的上传文件
     * @return
     * @throws IOException
     */
    public static List<ArrayList<String>> readExcelBySheetId(MultipartFile file, Integer sheetId) throws IOException {
        if (file == null || ExcelUtil.EMPTY.equals(file.getOriginalFilename().trim())) {
            return null;
        } else {
            String postfix = ExcelUtil.getPostfix(file.getOriginalFilename());
            if (!ExcelUtil.EMPTY.equals(postfix)) {
                if (ExcelUtil.OFFICE_EXCEL_2003_POSTFIX.equals(postfix)) {
                    return readXlsBySheetId(file, sheetId);
                } else if (ExcelUtil.OFFICE_EXCEL_2010_POSTFIX.equals(postfix)) {
                    return readXlsxBySheetId(file, sheetId);
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    /**
     * read the Excel 2010 .xlsx
     *
     * @param file
     * @return
     * @throws IOException
     */
    @SuppressWarnings("deprecation")
    public static List<ArrayList<String>> readXlsx(MultipartFile file, Integer pages) {
        List<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        // IO流读取文件
        InputStream input = null;
        XSSFWorkbook wb = null;
        ArrayList<String> rowList = null;
        try {
            input = file.getInputStream();
            // 创建文档
            wb = new XSSFWorkbook(input);
            //读取sheet(页)
            int sheetLimt = null == pages ? wb.getNumberOfSheets() : pages;
            for (int numSheet = 0; numSheet < sheetLimt; numSheet++) {
                XSSFSheet xssfSheet = wb.getSheetAt(numSheet);
                if (xssfSheet == null) {
                    continue;
                }
                totalRows = xssfSheet.getLastRowNum();
                //读取Row,从第二行开始
                for (int rowNum = 1; rowNum <= totalRows; rowNum++) {
                    XSSFRow xssfRow = xssfSheet.getRow(rowNum);
                    if (xssfRow != null) {
                        rowList = new ArrayList<String>();
                        totalCells = xssfRow.getLastCellNum();
                        //读取列，从第一列开始
                        for (int c = 0; c <= totalCells + 1; c++) {
                            XSSFCell cell = xssfRow.getCell(c);
                            if (cell == null) {
                                rowList.add(ExcelUtil.EMPTY);
                                continue;
                            }
                            rowList.add(ExcelUtil.getXValue(cell).trim());
                        }
                        list.add(rowList);
                    }
                }
            }
            return list;
        } catch (IOException e) {
            return null;
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                return null;
            }
        }

    }

    /**
     * read the Excel 2003-2007 .xls
     *
     * @param file
     * @return
     * @throws IOException
     */
    public static List<ArrayList<String>> readXls(MultipartFile file, Integer pages) {
        List<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        // IO流读取文件
        InputStream input = null;
        HSSFWorkbook wb = null;
        ArrayList<String> rowList = null;
        try {
            input = file.getInputStream();
            // 创建文档
            wb = new HSSFWorkbook(input);
            //读取sheet(页)
            int sheetLimt = null == pages ? wb.getNumberOfSheets() : pages;
            for (int numSheet = 0; numSheet < sheetLimt; numSheet++) {
                HSSFSheet hssfSheet = wb.getSheetAt(numSheet);
                if (hssfSheet == null) {
                    continue;
                }
                totalRows = hssfSheet.getLastRowNum();
                //读取Row,从第二行开始
                for (int rowNum = 1; rowNum <= totalRows; rowNum++) {
                    HSSFRow hssfRow = hssfSheet.getRow(rowNum);
                    if (hssfRow != null) {
                        rowList = new ArrayList<String>();
                        totalCells = hssfRow.getLastCellNum();
                        //读取列，从第一列开始
                        for (short c = 0; c <= totalCells + 1; c++) {
                            HSSFCell cell = hssfRow.getCell(c);
                            if (cell == null) {
                                rowList.add(ExcelUtil.EMPTY);
                                continue;
                            }
                            rowList.add(ExcelUtil.getHValue(cell).trim());
                        }
                        list.add(rowList);
                    }
                }
            }
            return list;
        } catch (IOException e) {
            return null;
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                return null;
            }
        }
    }

    public static List<ArrayList<String>> readXlsxBySheetId(MultipartFile file, Integer sheetId) {
        List<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        // IO流读取文件
        InputStream input = null;
        XSSFWorkbook wb = null;
        ArrayList<String> rowList = null;
        try {
            input = file.getInputStream();
            // 创建文档
            wb = new XSSFWorkbook(input);
            //读取sheet(页)
            int sheetLimt = null == sheetId ? 1 : sheetId;
            for (int numSheet = (sheetLimt - 1); numSheet < sheetLimt; numSheet++) {
                XSSFSheet xssfSheet = wb.getSheetAt(numSheet);
                if (xssfSheet == null) {
                    continue;
                }
                totalRows = xssfSheet.getLastRowNum();
                //读取Row,从第二行开始
                for (int rowNum = 1; rowNum <= totalRows; rowNum++) {
                    XSSFRow xssfRow = xssfSheet.getRow(rowNum);
                    if (xssfRow != null) {
                        rowList = new ArrayList<String>();
                        totalCells = xssfRow.getLastCellNum();
                        //读取列，从第一列开始
                        for (int c = 0; c <= totalCells + 1; c++) {
                            XSSFCell cell = xssfRow.getCell(c);
                            if (cell == null) {
                                rowList.add(ExcelUtil.EMPTY);
                                continue;
                            }
                            rowList.add(ExcelUtil.getXValue(cell).trim());
                        }
                        list.add(rowList);
                    }
                }
            }
            return list;
        } catch (IOException e) {
            return null;
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                return null;
            }
        }

    }

    /**
     * read the Excel 2003-2007 .xls
     *
     * @param file
     * @return
     * @throws IOException
     */
    public static List<ArrayList<String>> readXlsBySheetId(MultipartFile file, Integer sheetId) {
        List<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        // IO流读取文件
        InputStream input = null;
        HSSFWorkbook wb = null;
        ArrayList<String> rowList = null;
        try {
            input = file.getInputStream();
            // 创建文档
            wb = new HSSFWorkbook(input);
            //读取sheet(页)
            int sheetLimt = null == sheetId ? 1 : sheetId;
            for (int numSheet = sheetLimt - 1; numSheet < sheetLimt; numSheet++) {
                HSSFSheet hssfSheet = wb.getSheetAt(numSheet);
                if (hssfSheet == null) {
                    continue;
                }
                totalRows = hssfSheet.getLastRowNum();
                //读取Row,从第二行开始
                for (int rowNum = 1; rowNum <= totalRows; rowNum++) {
                    HSSFRow hssfRow = hssfSheet.getRow(rowNum);
                    if (hssfRow != null) {
                        rowList = new ArrayList<String>();
                        totalCells = hssfRow.getLastCellNum();
                        //读取列，从第一列开始
                        for (short c = 0; c <= totalCells + 1; c++) {
                            HSSFCell cell = hssfRow.getCell(c);
                            if (cell == null) {
                                rowList.add(ExcelUtil.EMPTY);
                                continue;
                            }
                            rowList.add(ExcelUtil.getHValue(cell).trim());
                        }
                        list.add(rowList);
                    }
                }
            }
            return list;
        } catch (IOException e) {
            return null;
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                return null;
            }
        }
    }
}