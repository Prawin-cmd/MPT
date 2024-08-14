package com.ModelProjectTask.Controller;

import javax.naming.NameNotFoundException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ModelProjectTask.Entity.MPT;
import com.ModelProjectTask.Service.MPTService;

@RestController
@RequestMapping("/MPT")
public class MPTController {
    
   @Autowired
   MPTService ms;
   static Logger log= Logger.getLogger(MPTController.class);
   @PostMapping(value="/postall")
   public String postAll(@RequestBody MPT m) {
	   PropertyConfigurator.configure("MPT.properties");
	   log.info(ms.postAll(m));
	   return ms.postAll(m);
   }
   
   
   @GetMapping(value="/getname/{id}")
   public String getName(@PathVariable int id) throws NameNotFoundException {
	  
	   return ms.getName(id);
   }
}
