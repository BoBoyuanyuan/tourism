package com.tourism.conteoller;

import com.tourism.service.IAdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author
 * @date
 */
@Controller
@RequestMapping("/admin")
@Slf4j
public class AdminController {

    @Resource
    private IAdminService iAdminService;

    /**
     * 登陆
     * @param
     * @param
     * @return
     *
     * @ResponseBody：
     * 自动将该函数的返回的数据封装成json模式，然后传给前端内容
     *
     * DefaultHandlerExceptionResolver 默认处理程序异常解析器
     *
     * HttpMessageNotReadableException：JSON解析错误
     *
     * 412 未满足前提条件
     * 前提条件失败
     * 在服务器上测试前提条件时，部分请求标题字段中所给定的前提条件估计为FALSE。
     * 客户机将前提条件放置在当前资源 metainformation（标题字段数据）中，
     * 以防止所请求的方法被误用到其他资源。
     *
     * @RequestBody
     * @RequestParam
     * 使用过
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE )
    @ResponseBody
    public String login( String username,String password){
        log.info(username,password);
        int byUP = 1;//iAdminService.findByUP(username,password);
        if (byUP > 0){
            return "1";
        }else {
            return "0";
        }

    }
}
