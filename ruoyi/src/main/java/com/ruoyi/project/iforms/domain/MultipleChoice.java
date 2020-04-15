package com.ruoyi.project.iforms.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author peng
 */
@Getter
@Setter
public class MultipleChoice implements Serializable {
    private String title;
    private String placeholder;
    private List<ChoiceOption> options;
    private byte mandatory;
    private byte processCondition;
}
