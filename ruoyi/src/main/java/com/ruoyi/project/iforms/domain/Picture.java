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
public class Picture implements Serializable {
    private String title;
    private List<PictureInformation> pictureList;
    private byte mandatory;
}
