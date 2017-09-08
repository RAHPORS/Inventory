package com.rahpors.Inventory.controller;

import com.rahpors.Inventory.constant.ViewConstant;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ramon on 8/09/17.
 */

@Controller
@RequestMapping("/item")
public class ItemController {

    private final static Log LOG = LogFactory.getLog(ItemController.class);


    @GetMapping("/showitems")
    private ModelAndView showItems(){
        ModelAndView modelAndView = new ModelAndView(ViewConstant.ITEMS_VIEW);
        return modelAndView;
    }

}
