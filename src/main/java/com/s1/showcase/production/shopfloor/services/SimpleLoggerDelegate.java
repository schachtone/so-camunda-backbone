package com.s1.showcase.production.shopfloor.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SimpleLoggerDelegate implements JavaDelegate {

    private static Logger logger = LoggerFactory.getLogger(SimpleLoggerDelegate.class);

    public void execute(DelegateExecution delegateExecution) throws Exception {
        logger.info("***** executing activity");
        logger.info(delegateExecution.getCurrentActivityName());
    }
}
