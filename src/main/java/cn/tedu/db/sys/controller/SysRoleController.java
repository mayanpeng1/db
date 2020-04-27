package cn.tedu.db.sys.controller;

import cn.tedu.db.commom.pojo.JsonResult;
import cn.tedu.db.commom.pojo.PageObjectVO;
import cn.tedu.db.sys.pojo.SysRoleDO;
import cn.tedu.db.sys.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/role")
@RestController
public class SysRoleController {
    @Autowired
    private SysRoleService service;
    
    @RequestMapping("/findSysRole")
    public JsonResult<PageObjectVO<SysRoleDO>> findSysRole(String name,Integer pageCurrent){
        PageObjectVO<SysRoleDO> data = service.findSysRole(name,pageCurrent);
        return JsonResult.getSuccessJR(data);
    }
}
