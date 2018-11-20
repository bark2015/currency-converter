package com.cloud.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cloud.model.Convertion;
import com.cloud.service.IConverter;

@RefreshScope
@Controller
public class ConverterController {

	@Autowired
	private IConverter converter;
	
	@Value("${current.value.dollar}")
    private String valueDollar;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showForm(ModelMap model) {
    	model.put("dollar", valueDollar);
    	//model.put("euro", "22");
		return new ModelAndView("welcome", "convertion", new Convertion(0.0));
    }
 
    @RequestMapping(value = "/convert", method = RequestMethod.POST)
    public String convert(@Valid @ModelAttribute("convertion")Convertion convertion, BindingResult result, ModelMap model) {

    	double value = converter.convert(convertion.getFrom(), convertion.getTo(), convertion.getQuantity());
    	convertion.setResult(value);
    	System.out.println("values"+value);
    	model.put("dollar", valueDollar);
    	model.put("euro", "22");
        return "welcome";
    }
}