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
import com.ruoyi.project.iforms.domain.Form;
import com.ruoyi.project.iforms.service.IFormService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 表单Controller
 * 
 * @author peng
 * @date 2020-04-15
 */
@RestController
@RequestMapping("/iforms/form")
public class FormController extends BaseController
{
    @Autowired
    private IFormService formService;

    /**
     * 查询表单列表
     */
    @PreAuthorize("@ss.hasPermi('iforms:form:list')")
    @GetMapping("/list")
    public TableDataInfo list(Form form)
    {
        startPage();
        List<Form> list = formService.selectFormList(form);
        return getDataTable(list);
    }

    /**
     * 导出表单列表
     */
    @PreAuthorize("@ss.hasPermi('iforms:form:export')")
    @Log(title = "表单", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Form form)
    {
        List<Form> list = formService.selectFormList(form);
        ExcelUtil<Form> util = new ExcelUtil<Form>(Form.class);
        return util.exportExcel(list, "form");
    }

    /**
     * 获取表单详细信息
     */
    @PreAuthorize("@ss.hasPermi('iforms:form:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(formService.selectFormById(id));
    }

    /**
     * 新增表单
     */
    @PreAuthorize("@ss.hasPermi('iforms:form:add')")
    @Log(title = "表单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Form form)
    {
        return toAjax(formService.insertForm(form));
    }

    /**
     * 修改表单
     */
    @PreAuthorize("@ss.hasPermi('iforms:form:edit')")
    @Log(title = "表单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Form form)
    {
        return toAjax(formService.updateForm(form));
    }

    /**
     * 删除表单
     */
    @PreAuthorize("@ss.hasPermi('iforms:form:remove')")
    @Log(title = "表单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(formService.deleteFormByIds(ids));
    }
}
