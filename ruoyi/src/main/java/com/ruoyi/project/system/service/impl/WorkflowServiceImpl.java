package com.ruoyi.project.system.service.impl;

import com.ruoyi.project.system.service.WorkflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkflowServiceImpl implements WorkflowService {
    @Autowired
    private SnakerEngineFacadeImpl snakerEngineFacade;

    @Override
    public Integer deployWf() {

        return null;
    }
}
