package com.ruoyi.project.iforms.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author peng
 */
@Getter
@Setter
public class DateRange implements Serializable {
    private String titleStart;
    private String titleEnd;
    private String format;
    private String placeholder;
    private byte mandatory;
    private byte autoCalculate;
    private String calculateResult;
}
