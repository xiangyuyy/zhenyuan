package com.macro.mall.msservice;

import com.macro.mall.model.*;
import com.macro.mall.msmodel.Test;

import java.util.List;

/**
 * ZY Service
 * Created by macro on 2018/4/26.
 */
public interface ZYService {

    List<Codeitem> getAllCodeItem();

    List<Organization> getInintOrganization();

    List<Organization> getAllOrganization();

    List<Usra01> getInintUsra01();

    List<Usra01> getAllUsra01();

    List<Usra04> getAllUsra04();

    List<Usra22> getAllUsra22();

    List<Usra64> getAllUsra64();

    List<Usra65> getAllUsra65();

    List<Usra66> getAllUsra66();

    List<Usra71> getAllUsra71();
}
