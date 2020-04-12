package com.ruoyi.project.system.controller;

import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.system.service.WorkflowService;
import com.ruoyi.project.system.service.impl.SnakerEngineFacadeImpl;
import org.apache.commons.lang.StringUtils;
import org.snaker.engine.SnakerEngine;
import org.snaker.engine.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/system/wf")
public class WorkflowController {
    @Autowired
    private WorkflowService wfService;
    @Autowired
    private SnakerEngineFacadeImpl snakerEngineFacade;
    @Autowired
    private SnakerEngine engine;

    //流程模板路径(配置文件读取）
    @Value("${snaker.workflow.model.path}")
    private String MODEL_PATH;

    //流程模板路径(常量类引入）
    //public static final String MODEL_PATH = "snakerflow/examination.snaker";
    /*
     * 部署流程模板
     * */
    @RequestMapping(value = "/deploy", method = RequestMethod.POST)
    public AjaxResult deployWf() {
        String processId = snakerEngineFacade.deploy(MODEL_PATH);
        if (StringUtils.isNotBlank(processId)) {
            return AjaxResult.success("部署成功", processId);
        } else {
            return AjaxResult.error();
        }
    }

    @RequestMapping(value = "/getProcess", method = RequestMethod.GET)
    public AjaxResult getProcess() {
        String processId = "a6a45d2712a940c3a05c3bb83d0d21a4";
        String operator = "liuxzh_userId";
        Map<String, Object> args = new HashMap<String, Object>();
        args.put("quanju var", "全局变量");

        Order order = snakerEngineFacade.startInstanceById(processId, operator, args);
        if (StringUtils.isNotBlank(order.getId())) {
            System.out.println(order.getId());
            return AjaxResult.success("启动流程实例成功");
        } else {
            return AjaxResult.error();
        }
    }

    @RequestMapping(value = "/getAllProcessNames", method = RequestMethod.GET)
    public AjaxResult getAllProcessNames() {

        List<String> names = snakerEngineFacade.getAllProcessNames();

        if (StringUtils.isNotBlank(names.size() + "")) {
            for (String name : names) {
                System.out.println(name);
            }
            return AjaxResult.success("所有流程名称获取成功");
        } else {
            return AjaxResult.error();
        }
    }
}

