package com.ruoyi.project.iforms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.iforms.mapper.FormResponseMapper;
import com.ruoyi.project.iforms.domain.FormResponse;
import com.ruoyi.project.iforms.service.IFormResponseService;

/**
 * 表单反馈Service业务层处理
 * 
 * @author peng
 * @date 2020-04-15
 */
@Service
public class FormResponseServiceImpl implements IFormResponseService 
{
    @Autowired
    private FormResponseMapper formResponseMapper;

    /**
     * 查询表单反馈
     * 
     * @param id 表单反馈ID
     * @return 表单反馈
     */
    @Override
    public FormResponse selectFormResponseById(Long id)
    {
        return formResponseMapper.selectFormResponseById(id);
    }

    /**
     * 查询表单反馈列表
     * 
     * @param formResponse 表单反馈
     * @return 表单反馈
     */
    @Override
    public List<FormResponse> selectFormResponseList(FormResponse formResponse)
    {
        return formResponseMapper.selectFormResponseList(formResponse);
    }

    /**
     * 新增表单反馈
     * 
     * @param formResponse 表单反馈
     * @return 结果
     */
    @Override
    public int insertFormResponse(FormResponse formResponse)
    {
        return formResponseMapper.insertFormResponse(formResponse);
    }

    /**
     * 修改表单反馈
     * 
     * @param formResponse 表单反馈
     * @return 结果
     */
    @Override
    public int updateFormResponse(FormResponse formResponse)
    {
        return formResponseMapper.updateFormResponse(formResponse);
    }

    /**
     * 批量删除表单反馈
     * 
     * @param ids 需要删除的表单反馈ID
     * @return 结果
     */
    @Override
    public int deleteFormResponseByIds(Long[] ids)
    {
        return formResponseMapper.deleteFormResponseByIds(ids);
    }

    /**
     * 删除表单反馈信息
     * 
     * @param id 表单反馈ID
     * @return 结果
     */
    @Override
    public int deleteFormResponseById(Long id)
    {
        return formResponseMapper.deleteFormResponseById(id);
    }
}
