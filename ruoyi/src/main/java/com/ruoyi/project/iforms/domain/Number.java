package com.ruoyi.project.iforms.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author peng
 */
@Getter
@Setter
public class Number implements Serializable {
    private String title;
    private String placeholder;
    private String unit;
    private byte mandatory;
    private byte processCondition;
}
