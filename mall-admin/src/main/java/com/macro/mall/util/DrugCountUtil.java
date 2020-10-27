package com.macro.mall.util;

import com.macro.mall.model.DrugCount;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class DrugCountUtil {
    public static DrugCount getResult(int subjection, int chineseMedicine, int longRange, BigDecimal area) {
        DrugCount drugCount = new DrugCount();
        int praPharmacist = 0;//执业药师
        int praChinesePharmacist = 0;//执业中药师
        int pharmacist = 0;//药师
        int mechanic = 0;//技工
        if (subjection == 1) { // 市区
            if (chineseMedicine == 1) { //有中药
                if (longRange == 1) { //有远程
                    BigDecimal s = new BigDecimal(100);//起始值
                    int i = area.subtract(s).divide(new BigDecimal(50)).intValue();
                    pharmacist = i + 2 - praPharmacist - praChinesePharmacist;
                    if (5 > pharmacist + praPharmacist + praChinesePharmacist) {
                        mechanic = 5 - pharmacist - praChinesePharmacist;
                    } else {
                        mechanic = 0;
                    }
                } else { //无远程
                    praPharmacist = 1;
                    praChinesePharmacist = 1;
                    BigDecimal s = new BigDecimal(100);//起始值
                    int i = area.subtract(s).divide(new BigDecimal(50)).intValue();
                    pharmacist = i + 2 - praPharmacist - praChinesePharmacist;
                    if (5 > pharmacist + praPharmacist + praChinesePharmacist) {
                        mechanic = 5 - pharmacist - praChinesePharmacist;
                    } else {
                        mechanic = 0;
                    }

                }
            } else { //无中药
                if (longRange == 1) { //有远程
                    BigDecimal s = new BigDecimal(80);//起始值
                    int i = area.subtract(s).divide(new BigDecimal(50)).intValue();
                    pharmacist = i + 2 - praPharmacist - praChinesePharmacist;
                    if (5 > pharmacist + praPharmacist + praChinesePharmacist) {
                        mechanic = 5 - pharmacist - praChinesePharmacist;
                    } else {
                        mechanic = 0;
                    }
                } else { //无远程
                    praPharmacist = 1;
                    praChinesePharmacist = 0;
                    BigDecimal s = new BigDecimal(80);//起始值
                    int i = area.subtract(s).divide(new BigDecimal(50)).intValue();
                    pharmacist = i + 2 - praPharmacist - praChinesePharmacist;
                    if (5 > pharmacist + praPharmacist + praChinesePharmacist) {
                        mechanic = 5 - pharmacist - praChinesePharmacist;
                    } else {
                        mechanic = 0;
                    }

                }
            }
        }

        if (subjection == 2) { // 乡镇
            if (chineseMedicine == 1) { //有中药
                if (longRange == 1) { //有远程
                    BigDecimal s = new BigDecimal(80);//起始值
                    int i = area.subtract(s).divide(new BigDecimal(50)).intValue();
                    pharmacist = i + 2 - praPharmacist - praChinesePharmacist;
                    if (4 > pharmacist + praPharmacist + praChinesePharmacist) {
                        mechanic = 4 - pharmacist - praChinesePharmacist;
                    } else {
                        mechanic = 0;
                    }
                } else { //无远程
                    praPharmacist = 1;
                    praChinesePharmacist = 1;
                    BigDecimal s = new BigDecimal(80);//起始值
                    int i = area.subtract(s).divide(new BigDecimal(50)).intValue();
                    pharmacist = i + 2 - praPharmacist - praChinesePharmacist;
                    if (4 > pharmacist + praPharmacist + praChinesePharmacist) {
                        mechanic = 4 - pharmacist - praChinesePharmacist;
                    } else {
                        mechanic = 0;
                    }

                }
            } else { //无中药
                if (longRange == 1) { //有远程
                    BigDecimal s = new BigDecimal(60);//起始值
                    int i = area.subtract(s).divide(new BigDecimal(50)).intValue();
                    pharmacist = i + 2 - praPharmacist - praChinesePharmacist;
                    if (4 > pharmacist + praPharmacist + praChinesePharmacist) {
                        mechanic = 4 - pharmacist - praChinesePharmacist;
                    } else {
                        mechanic = 0;
                    }
                } else { //无远程
                    praPharmacist = 1;
                    praChinesePharmacist = 0;
                    BigDecimal s = new BigDecimal(60);//起始值
                    int i = area.subtract(s).divide(new BigDecimal(50)).intValue();
                    pharmacist = i + 2 - praPharmacist - praChinesePharmacist;
                    if (4 > pharmacist + praPharmacist + praChinesePharmacist) {
                        mechanic = 4 - pharmacist - praChinesePharmacist;
                    } else {
                        mechanic = 0;
                    }

                }
            }
        }

        if (subjection == 3) { // 村
            if (chineseMedicine == 1) { //有中药
                if (longRange == 1) { //有远程
                    BigDecimal s = new BigDecimal(60);//起始值
                    int i = area.subtract(s).divide(new BigDecimal(50)).intValue();
                    pharmacist = i + 2 - praPharmacist - praChinesePharmacist;
                    if (4 > pharmacist + praPharmacist + praChinesePharmacist) {
                        mechanic = 4 - pharmacist - praChinesePharmacist;
                    } else {
                        mechanic = 0;
                    }
                } else { //无远程
                    praPharmacist = 1;
                    praChinesePharmacist = 1;
                    BigDecimal s = new BigDecimal(60);//起始值
                    int i = area.subtract(s).divide(new BigDecimal(50)).intValue();
                    pharmacist = i + 2 - praPharmacist - praChinesePharmacist;
                    if (4 > pharmacist + praPharmacist + praChinesePharmacist) {
                        mechanic = 4 - pharmacist - praChinesePharmacist;
                    } else {
                        mechanic = 0;
                    }

                }
            } else { //无中药
                if (longRange == 1) { //有远程
                    BigDecimal s = new BigDecimal(40);//起始值
                    int i = area.subtract(s).divide(new BigDecimal(50)).intValue();
                    pharmacist = i + 2 - praPharmacist - praChinesePharmacist;
                    if (4 > pharmacist + praPharmacist + praChinesePharmacist) {
                        mechanic = 4 - pharmacist - praChinesePharmacist;
                    } else {
                        mechanic = 0;
                    }
                } else { //无远程
                    praPharmacist = 1;
                    praChinesePharmacist = 0;
                    BigDecimal s = new BigDecimal(40);//起始值
                    int i = area.subtract(s).divide(new BigDecimal(50)).intValue();
                    pharmacist = i + 2 - praPharmacist - praChinesePharmacist;
                    if (4 > pharmacist + praPharmacist + praChinesePharmacist) {
                        mechanic = 4 - pharmacist - praChinesePharmacist;
                    } else {
                        mechanic = 0;
                    }

                }
            }
        }
        drugCount.setArea(area);
        drugCount.setChineseMedicine(chineseMedicine);
        drugCount.setLongRange(longRange);
        drugCount.setSubjection(subjection);

        drugCount.setPharmacist(pharmacist);
        drugCount.setPraPharmacist(praPharmacist);
        drugCount.setPraChinesePharmacist(praChinesePharmacist);
        drugCount.setMechanic(mechanic);

        return drugCount;
    }
}