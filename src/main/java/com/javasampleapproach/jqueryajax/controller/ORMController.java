package com.javasampleapproach.jqueryajax.controller;

//import org.osgi.service.useradmin.User;


import com.javasampleapproach.jqueryajax.model.ContactEntity;
import com.javasampleapproach.jqueryajax.repository.ContactRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created for JavaStudy.ru on 28.02.2016.
 */

@Controller

public class ORMController {


    final ContactRepository contactRepository;

    public ORMController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ModelAndView queryFindAllUsersJPA() {
        List<ContactEntity> contact = contactRepository.findAll();
        return new ModelAndView("/person1", "resultObject", contact);

    }

    @RequestMapping(value ="/result", method = RequestMethod.POST)
    public ModelAndView result(@ModelAttribute("lastName")String lastName){
        List<ContactEntity> contact= contactRepository.findByLastName(lastName);
        return new ModelAndView("/orm/person", "resultObject", contact);
    }

    @RequestMapping(value = "/newContact", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model) {
        ContactEntity contactEntity = new ContactEntity();
        model.addObject("contactEntity", contactEntity);
        model.setViewName("/orm/new-employee");
        return model;
    }

    @RequestMapping(value = "/saveContact", method = RequestMethod.POST)
    public ModelAndView saveEmployee(@ModelAttribute ContactEntity contactEntity) {
        contactRepository.save(contactEntity);
     return queryFindAllUsersJPA();
    }
//    @RequestMapping(value = "/deleteContact", method = RequestMethod.POST)
//    public ModelAndView deleteContact(HttpServletRequest request) {
//        int contactId = Integer.parseInt(request.getParameter("id"));
//        contactService.delete(contactId);
//        return queryFindAllUsersJPA();
//    }
//
//   @RequestMapping(value = "/edit", method = RequestMethod.POST)
//   public ModelAndView editArticle(HttpServletRequest request) {
//       int contactId = Integer.parseInt(request.getParameter("id"));
//       ModelAndView model = new ModelAndView();
//       ContactEntity contactEntity = contactService.findById(contactId);
//       model.addObject("contactEntity", contactEntity);
//       model.setViewName("/orm/new-employee");
//       return model;
//   }


}