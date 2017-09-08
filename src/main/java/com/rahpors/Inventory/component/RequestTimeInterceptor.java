package com.rahpors.Inventory.component;

import com.rahpors.Inventory.entity.LogApp;
import com.rahpors.Inventory.service.LogAppService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by ramon on 30/08/17.
 */

@Component("requestTimeInterceptor")
public class RequestTimeInterceptor extends HandlerInterceptorAdapter{

    @Autowired
    @Qualifier("logAppServiceImpl")
    LogAppService logAppService;

    private static final Log LOG = LogFactory.getLog(RequestTimeInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("startTime",System.currentTimeMillis());
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        long startTime = (long)request.getAttribute("startTime");
        String url=request.getRequestURL().toString();
        LogApp logApp = new LogApp(new Date(),"Details hardcoded","USERNAME",url,"afterCompletion()");
        logAppService.addLogApp(logApp);

        LOG.info("URL TO: '"+url+"' IN: '"+ (System.currentTimeMillis()-startTime)+"' ms");
    }
}
