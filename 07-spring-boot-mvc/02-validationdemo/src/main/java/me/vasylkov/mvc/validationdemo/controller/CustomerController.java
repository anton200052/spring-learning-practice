package me.vasylkov.mvc.validationdemo.controller;

import jakarta.validation.Valid;
import me.vasylkov.mvc.validationdemo.entity.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController
{

    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping("/")
    public String showForm(Model model)
    {
        model.addAttribute("customer", new Customer());

        return "customer-form";
    }

    @PostMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult)
    {
        System.out.println("LastName: |" + customer.getLastName() + "|");
        System.out.println("Binding results: |" + bindingResult.toString() + "|");
        System.out.println("\n\n\n\n");
        if (bindingResult.hasErrors())
        {
            return "customer-form";
        }
        else
        {
            return "customer-confirmation";
        }
    }
}
