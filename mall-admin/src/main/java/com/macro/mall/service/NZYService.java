package com.macro.mall.service;

import com.macro.mall.model.*;

import java.util.List;

/**
 * NZY Service
 * Created by macro on 2018/4/26.
 */
public interface NZYService {

    List<Codeitem> getAllCodeItem();

    List<Organization> getAllOrganization();

    List<Usra01> getAllUsra01();

    List<Usra04> getAllUsra04();

    List<Usra22> getAllUsra22();

    List<Usra64> getAllUsra64();

    List<Usra65> getAllUsra65();

    List<Usra66> getAllUsra66();

    List<Usra71> getAllUsra71();

    List<VZhicheng> getAllVZhicheng();

    Boolean insertAllCodeItem(List<Codeitem> list);

    Boolean insertAllOrganization(List<Organization> list);

    Boolean insertAllUsra01(List<Usra01> list);

    Boolean insertAllUsra04(List<Usra04> list);

    Boolean insertAllUsra22(List<Usra22> list);

    Boolean insertAllUsra64(List<Usra64> list);

    Boolean insertAllUsra65(List<Usra65> list);

    Boolean insertAllUsra66(List<Usra66> list);

    Boolean insertAllUsra71(List<Usra71> list);

    Boolean insertAllVZhicheng(List<VZhicheng> list);

}
