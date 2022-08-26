package phonebook.controller;

//          http://localhost:8080/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;
import phonebook.entity.Contact;

import java.util.ArrayList;
import java.util.List;

@Controller
public class contactController {

    private List<Contact> contacts;

    public contactController() {
        this.contacts = new ArrayList<>();
        this.contacts.add(new Contact("Donga", "0789456123"));
        this.contacts.add(new Contact("Kozhata", "0789123456"));
        this.contacts.add(new Contact("Buzema", "0789224466"));
    }
    @GetMapping("/")
    public ModelAndView index(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        modelAndView.addObject("contacts", this.contacts);

        return modelAndView;
    }
    @PostMapping("/")
    public String add(Contact contact){
        this.contacts.add(contact);

        return "redirect:/";
    }

    @PutMapping
    public String updateByName(Contact editedContact){
        Contact contactToEdit;

        for (Contact contact : contacts){

            if (contact.getName().equals(editedContact.getName())){
                this.contacts.remove(contact);
                this.contacts.add(editedContact);
                break;
            }
        }
        return "redirect:/";
    }
}

















