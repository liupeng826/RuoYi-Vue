package com.ruoyi.project.iforms.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author peng
 */
@Getter
@Setter
public class DateControl implements Serializable {
    private String title;
    private String format;
    private byte mandatory;
}
