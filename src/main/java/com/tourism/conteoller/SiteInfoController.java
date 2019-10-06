package com.tourism.conteoller;

import com.tourism.entity.SiteInfo;
import com.tourism.service.ISiteInfoService;
import com.tourism.utils.JsonResult;
import com.tourism.utils.UploadFile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author
 * @date
 */
@Controller()
@RequestMapping("/siteInfo")
@Slf4j
public class SiteInfoController {

    @Resource
    private ISiteInfoService iSiteInfoService;

    @Resource
    private UploadFile uploadFile;

    @RequestMapping("/toInfo")
    public String toInfo(){
        return "siteInfo";
    }


    @RequestMapping("/quireInfo")
    @ResponseBody
    public JsonResult quireInfo(){
        SiteInfo siteInfo = iSiteInfoService.quireSiteInfo();
        return new JsonResult(siteInfo);
    }

    @RequestMapping("/submitInfo")
    public String submitInfo(@ModelAttribute("siteInfo") SiteInfo siteInfo,MultipartFile file,HttpServletRequest request) throws IOException {
        SiteInfo site = uploadFile.uploadFile(siteInfo, file, request);
        log.info("site::::"+site);
        iSiteInfoService.updateByPrimaryKey(site);
        return "siteInfo";
    }

    /**
     * 上传文章,将markdown解析成html
     */
    /*@RequestMapping(value = "/index", method = RequestMethod.POST)
    @ResponseBody
    public String uploadFile(@ModelAttribute("goods") Goods goods,MultipartFile file,HttpServletRequest request) throws IOException {
        //限制上传类型
        if ("image/png".equals(file.getContentType()) || "image/jpg".equals(file.getContentType())) {
            //判断用户是否上传文件
            System.out.println(file.isEmpty());
            System.out.println(file.getContentType());
            if (!file.isEmpty()) {
                //上传位置
                String path = request.getSession().getServletContext().getRealPath("/uploads");
                //判断路径是否存在
                File files = new File(path);
                if (!files.exists()) {
                    //创建文件夹
                    files.mkdirs();
                }
                //获取上传文件的名称
                String filename = file.getOriginalFilename();
                //把文件的名称设置唯一值
                String uuid = UUID.randomUUID().toString().replace("-", "");
                filename = uuid + "_" + filename;
                goods.setPic(filename);
                //完成
                file.transferTo(new File(path, filename));
                System.out.println(goods.toString());
                return "1";
            }
        }
            return "0";
    }*/
}
