package com.ruoyi.project.iforms.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 表单反馈对象 f_response
 *
 * @author peng
 * @date 2020-04-15
 */
public class FormResponse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 表单id */
    @Excel(name = "表单id")
    private Long formId;

    /** 反馈 */
    @Excel(name = "反馈")
    private byte[] content;

    /** 反馈者 */
    @Excel(name = "反馈者")
    private String createdBy;

    /** 反馈时间 */
    @Excel(name = "反馈时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdDate;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setFormId(Long formId)
    {
        this.formId = formId;
    }

    public Long getFormId()
    {
        return formId;
    }
    public void setContent(byte[] content)
    {
        this.content = content;
    }

    public byte[] getContent()
    {
        return content;
    }
    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    public String getCreatedBy()
    {
        return createdBy;
    }
    public void setCreatedDate(Date createdDate)
    {
        this.createdDate = createdDate;
    }

    public Date getCreatedDate()
    {
        return createdDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("formId", getFormId())
            .append("content", getContent())
            .append("createdBy", getCreatedBy())
            .append("createdDate", getCreatedDate())
            .toString();
    }
}
