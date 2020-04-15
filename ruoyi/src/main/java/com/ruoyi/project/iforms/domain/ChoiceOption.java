package com.ruoyi.project.iforms.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author peng
 */
@Getter
@Setter
public class ChoiceOption implements Serializable {
    private String key;
    private String value;
    private byte checked;
}
