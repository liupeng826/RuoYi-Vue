package com.ruoyi.project.iforms.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.iforms.domain.FormResponse;
import com.ruoyi.project.iforms.service.IFormResponseService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 表单反馈Controller
 * 
 * @author peng
 * @date 2020-04-15
 */
@RestController
@RequestMapping("/iforms/formResponse")
public class FormResponseController extends BaseController
{
    @Autowired
    private IFormResponseService formResponseService;

    /**
     * 查询表单反馈列表
     */
    @PreAuthorize("@ss.hasPermi('iforms:formResponse:list')")
    @GetMapping("/list")
    public TableDataInfo list(FormResponse formResponse)
    {
        startPage();
        List<FormResponse> list = formResponseService.selectFormResponseList(formResponse);
        return getDataTable(list);
    }

    /**
     * 导出表单反馈列表
     */
    @PreAuthorize("@ss.hasPermi('iforms:formResponse:export')")
    @Log(title = "表单反馈", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(FormResponse formResponse)
    {
        List<FormResponse> list = formResponseService.selectFormResponseList(formResponse);
        ExcelUtil<FormResponse> util = new ExcelUtil<FormResponse>(FormResponse.class);
        return util.exportExcel(list, "formResponse");
    }

    /**
     * 获取表单反馈详细信息
     */
    @PreAuthorize("@ss.hasPermi('iforms:formResponse:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(formResponseService.selectFormResponseById(id));
    }

    /**
     * 新增表单反馈
     */
    @PreAuthorize("@ss.hasPermi('iforms:formResponse:add')")
    @Log(title = "表单反馈", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FormResponse formResponse)
    {
        return toAjax(formResponseService.insertFormResponse(formResponse));
    }

    /**
     * 修改表单反馈
     */
    @PreAuthorize("@ss.hasPermi('iforms:formResponse:edit')")
    @Log(title = "表单反馈", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FormResponse formResponse)
    {
        return toAjax(formResponseService.updateFormResponse(formResponse));
    }

    /**
     * 删除表单反馈
     */
    @PreAuthorize("@ss.hasPermi('iforms:formResponse:remove')")
    @Log(title = "表单反馈", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(formResponseService.deleteFormResponseByIds(ids));
    }
}
