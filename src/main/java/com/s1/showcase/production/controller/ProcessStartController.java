package com.s1.showcase.production.controller;

import com.s1.showcase.production.controller.model.ProcessStartRequest;
import com.s1.showcase.production.controller.model.ProcessStartResponse;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("/demo/process")
public class ProcessStartController {

    private ProcessEngine processEngine;

    @Autowired
    public ProcessStartController(ProcessEngine processEngine){
        this.processEngine = processEngine;
    }

    @RequestMapping(value = "start" , method = RequestMethod.POST)
    public @ResponseBody
    ProcessStartResponse startProcess(@RequestBody ProcessStartRequest processInput) {
        ProcessStartResponse response = new ProcessStartResponse();

        ProcessInstance processInstance = processEngine.getRuntimeService().createProcessInstanceByKey(processInput.getProcessName()).setVariables(processInput.getProcessVariables()).execute();

        response.setMessage("process successfully started");
        response.setProcessId(processInstance.getProcessInstanceId());
        response.setStartTime(LocalDateTime.now().toString());

        return response;
    }

    @RequestMapping(value = "test" , method = RequestMethod.GET)
    public @ResponseBody
    String test() {
        return LocalDateTime.now().toString();
    }

    @RequestMapping(value = "test2" , method = RequestMethod.GET)
    public @ResponseBody
    ProcessStartRequest test2() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Bla","Blubb");


        return new ProcessStartRequest("ProcessName",map);
    }
}