package com.macro.mall.msservice;

import com.macro.mall.dto.UmsAdminParam;
import com.macro.mall.dto.UpdateAdminPasswordParam;
import com.macro.mall.model.UmsAdmin;
import com.macro.mall.model.UmsResource;
import com.macro.mall.model.UmsRole;
import com.macro.mall.msmodel.Test;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 后台管理员Service
 * Created by macro on 2018/4/26.
 */
public interface TestService {

    /**
     * 根据用户名或昵称分页查询用户
     */
    List<Test> list(String keyword, Integer pageSize, Integer pageNum);


}
