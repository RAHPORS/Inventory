package com.rahpors.Inventory.service.impl;

import com.rahpors.Inventory.entity.LogApp;
import com.rahpors.Inventory.repository.LogAppRepository;
import com.rahpors.Inventory.service.LogAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by ramon on 8/09/17.
 */

@Service("logAppServiceImpl")
public class LogAppServiceImpl implements LogAppService {

    @Autowired
    @Qualifier("logAppRepository")
    private LogAppRepository logRepository;

    @Override
    public void addLogApp(LogApp log) {
        logRepository.save(log);
    }
}
