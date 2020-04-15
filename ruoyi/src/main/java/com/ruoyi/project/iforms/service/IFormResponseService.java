package com.ruoyi.project.iforms.service;

import java.util.List;
import com.ruoyi.project.iforms.domain.FormResponse;

/**
 * 表单反馈Service接口
 * 
 * @author peng
 * @date 2020-04-15
 */
public interface IFormResponseService 
{
    /**
     * 查询表单反馈
     * 
     * @param id 表单反馈ID
     * @return 表单反馈
     */
    public FormResponse selectFormResponseById(Long id);

    /**
     * 查询表单反馈列表
     * 
     * @param formResponse 表单反馈
     * @return 表单反馈集合
     */
    public List<FormResponse> selectFormResponseList(FormResponse formResponse);

    /**
     * 新增表单反馈
     * 
     * @param formResponse 表单反馈
     * @return 结果
     */
    public int insertFormResponse(FormResponse formResponse);

    /**
     * 修改表单反馈
     * 
     * @param formResponse 表单反馈
     * @return 结果
     */
    public int updateFormResponse(FormResponse formResponse);

    /**
     * 批量删除表单反馈
     * 
     * @param ids 需要删除的表单反馈ID
     * @return 结果
     */
    public int deleteFormResponseByIds(Long[] ids);

    /**
     * 删除表单反馈信息
     * 
     * @param id 表单反馈ID
     * @return 结果
     */
    public int deleteFormResponseById(Long id);
}
