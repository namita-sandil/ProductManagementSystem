package com.example.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.Entities.Product;

import com.example.service.ProductService;

@Controller
public class myController {
	
	@Autowired
	ProductService productservice;
	
@RequestMapping(value="/form")
public String getForm(Model model)
{
	Product product = new Product();
	model.addAttribute("product", product);
	
	
	
			
	return "form";
}



@RequestMapping(value="/submit")
public String submitForm(@ModelAttribute Product product, Model m)
{
	System.out.println(product);
	
	productservice.save(product);
	
	
	return "registersuccess";
}



@GetMapping("/products")
public ModelAndView getallproducts() {
 
	List<Product> products=  (List<Product>) productservice.findAll();
    
     return new ModelAndView("productDetails", "list", products );
}

@GetMapping("/delete/{id}")
@ResponseBody
public String deleteProduct(@PathVariable("id") int id, Model model) {
	productservice.delete(id);
    
    return "Data removed successfully" ;
}

@GetMapping("/update")
public String updateProduct(@ModelAttribute  Product product) {
   
        
    productservice.save(product);
    return "redirect:/form";
}


}
