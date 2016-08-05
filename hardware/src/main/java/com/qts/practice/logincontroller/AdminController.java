package com.qts.practice.logincontroller;

import org.springframework.core.Ordered;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class AdminController
{
	public class WebMvcConfiguration extends WebMvcConfigurerAdapter
	{
	    @Override
	    public void addViewControllers(ViewControllerRegistry registry) 
	    {
	        registry.addViewController("/login").setViewName("login");
	        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
	    }
	    
	    /*@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	    public String redirect()
	    {
	    return "redirect:finalPage";
	    }
	    
	    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
	    public String finalPage()
	    {
	     return "final";
	   }*/
	    
	    @RequestMapping(value = "/login", method = RequestMethod.POST, params = "login")
	    public String login(@RequestParam(value = "username") String username, 
	            @RequestParam(value = "password") String password)
	    {
	        // do authentication
	        return "Redirect:home";
	    }
	    
	   /* @RequestMapping(value="/edit",method=RequestMethod.GET) 
        public ModelAndView getEditPage( 
                        @RequestParam(value="id")Long userId, 
                        Model model) throws IOException, SAXException 
        { 
                UserInfo userInfo = practiceService.getUserInfo(userId); 
                EditCommand editCommand = mapper.map(userInfo, EditCommand.class); 
                model.addAttribute(editCommand); 
        return new ModelAndView("edit","userModel",model); 
        } */
	}

}
