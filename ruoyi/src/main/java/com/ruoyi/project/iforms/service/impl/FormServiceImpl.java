package com.ruoyi.project.iforms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.iforms.mapper.FormMapper;
import com.ruoyi.project.iforms.domain.Form;
import com.ruoyi.project.iforms.service.IFormService;

/**
 * 表单Service业务层处理
 * 
 * @author peng
 * @date 2020-04-15
 */
@Service
public class FormServiceImpl implements IFormService 
{
    @Autowired
    private FormMapper formMapper;

    /**
     * 查询表单
     * 
     * @param id 表单ID
     * @return 表单
     */
    @Override
    public Form selectFormById(Long id)
    {
        return formMapper.selectFormById(id);
    }

    /**
     * 查询表单列表
     * 
     * @param form 表单
     * @return 表单
     */
    @Override
    public List<Form> selectFormList(Form form)
    {
        return formMapper.selectFormList(form);
    }

    /**
     * 新增表单
     * 
     * @param form 表单
     * @return 结果
     */
    @Override
    public int insertForm(Form form)
    {
        return formMapper.insertForm(form);
    }

    /**
     * 修改表单
     * 
     * @param form 表单
     * @return 结果
     */
    @Override
    public int updateForm(Form form)
    {
        return formMapper.updateForm(form);
    }

    /**
     * 批量删除表单
     * 
     * @param ids 需要删除的表单ID
     * @return 结果
     */
    @Override
    public int deleteFormByIds(Long[] ids)
    {
        return formMapper.deleteFormByIds(ids);
    }

    /**
     * 删除表单信息
     * 
     * @param id 表单ID
     * @return 结果
     */
    @Override
    public int deleteFormById(Long id)
    {
        return formMapper.deleteFormById(id);
    }
}
