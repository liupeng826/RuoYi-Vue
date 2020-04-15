package com.ruoyi.project.iforms.service;

import java.util.List;
import com.ruoyi.project.iforms.domain.Form;

/**
 * 表单Service接口
 * 
 * @author peng
 * @date 2020-04-15
 */
public interface IFormService 
{
    /**
     * 查询表单
     * 
     * @param id 表单ID
     * @return 表单
     */
    public Form selectFormById(Long id);

    /**
     * 查询表单列表
     * 
     * @param form 表单
     * @return 表单集合
     */
    public List<Form> selectFormList(Form form);

    /**
     * 新增表单
     * 
     * @param form 表单
     * @return 结果
     */
    public int insertForm(Form form);

    /**
     * 修改表单
     * 
     * @param form 表单
     * @return 结果
     */
    public int updateForm(Form form);

    /**
     * 批量删除表单
     * 
     * @param ids 需要删除的表单ID
     * @return 结果
     */
    public int deleteFormByIds(Long[] ids);

    /**
     * 删除表单信息
     * 
     * @param id 表单ID
     * @return 结果
     */
    public int deleteFormById(Long id);
}
