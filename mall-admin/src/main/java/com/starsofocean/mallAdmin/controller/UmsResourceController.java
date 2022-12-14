package com.starsofocean.mallAdmin.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.starsofocean.mallAdmin.domain.UmsResource;
import com.starsofocean.mallAdmin.service.UmsResourceService;
import com.starsofocean.mallCommon.api.CommonResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author starsofocean
 * date 2022/10/12 16:43
 */
@RestController
@RequestMapping("/resource")
public class UmsResourceController {
    @Resource
    private UmsResourceService resourceService;

    /**
     * 添加后台资源
     * @param resource
     * @return
     */
    @PostMapping("/create")
    public CommonResult create (@RequestBody UmsResource resource) {
        boolean save = resourceService.save(resource);
        if(save) {
            return CommonResult.success(save);
        }
        return CommonResult.failed();
    }

    /**
     *修改后台资源
     * @param id
     * @param resource
     * @return
     */
    @PostMapping("/update/{id}")
    public CommonResult update(@PathVariable Long id,@RequestBody UmsResource resource) {
        resource.setId(id);
        boolean update = resourceService.updateById(resource);
        if(update) {
            return CommonResult.success(update);
        }
        return CommonResult.failed();
    }

    /**
     * 根据id获得资源详情
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public CommonResult<UmsResource> getById (@PathVariable Long id) {
        UmsResource resource = resourceService.getById(id);
        return CommonResult.success(resource);
    }

    /**
     *根据id删除后台资源
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public CommonResult delete(@PathVariable Long id) {
        boolean delete = resourceService.removeById(id);
        if(delete) {
            return CommonResult.success(delete);
        }
        return CommonResult.failed();
    }

    /**
     *分页模糊查询后台资源
     * @param categoryId
     * @param nameKeyword
     * @param urlKeyword
     * @param pageSize
     * @param pageNum
     * @return
     */
    @GetMapping("/list")
    public CommonResult<Page<UmsResource>> list(@RequestParam(required = false) Long categoryId,
                                                @RequestParam(required = false) String nameKeyword,
                                                @RequestParam(required = false) String urlKeyword,
                                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        Page<UmsResource> pageInfo = resourceService.getPageInfo(categoryId, nameKeyword, urlKeyword, pageNum, pageSize);
        return CommonResult.success(pageInfo);
    }

    /**
     *查询后台所有资源
     * @return
     */
    @GetMapping("/listAll")
    public CommonResult<List<UmsResource>> listAll() {
        List<UmsResource> resourceList = resourceService.list();
        return CommonResult.success(resourceList);
    }

    /**
     *初始化资源角色关联数据
     * @return
     */
    @GetMapping("/initResourceRoleMap")
    public CommonResult initResourceRoleMap() {
        Map<String, List<String>> resourceRoleMap = resourceService.initResourceRoleMap();
        return CommonResult.success(resourceRoleMap);
    }
}
