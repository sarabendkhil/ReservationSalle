package com.mosa.gestion.controllers;

import java.text.ParseException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mosa.gestion.entities.SalleTP;
import com.mosa.gestion.service.SalleTPService;

@Controller
public class SalleTPController {
	@Autowired
	SalleTPService salleTPService;
	@RequestMapping("/showCreate")
	public String showCreate(ModelMap modelMap)
	{
	modelMap.addAttribute("salleTP", new SalleTP());
	modelMap.addAttribute("mode", "new");
	return "formSalleTP";
	}
	@RequestMapping("/saveSalleTP")
	public String saveSalleTP(@Valid SalleTP salleTP,

	BindingResult bindingResult)

	{
	if (bindingResult.hasErrors()) return "createSalleTP";
	salleTPService.saveSalleTP(salleTP);
	return "formSalleTP";
	}
	@RequestMapping("/ListeSalleTPs")
	public String listeProduits(ModelMap modelMap,

	@RequestParam (name="page",defaultValue = "0") int page,
	@RequestParam (name="size", defaultValue = "2") int size)

	{
	Page<SalleTP> satps = salleTPService.getAllSalleTPsParPage(page, size);
	modelMap.addAttribute("salleTPs", satps);

	modelMap.addAttribute("pages", new int[satps.getTotalPages()]);

	modelMap.addAttribute("currentPage", page);
	return "listeSalleTPs";
	}
	
	@RequestMapping("/supprimerSalleTP")
	public String supprimerSalleTP(@RequestParam("id") Long id,

	ModelMap modelMap,
	@RequestParam (name="page",defaultValue = "0") int page,
	@RequestParam (name="size", defaultValue = "2") int size)

	{
	salleTPService.deleteSalleTPById(id);
	Page<SalleTP> satps = salleTPService.getAllSalleTPsParPage(page,

	size);

	modelMap.addAttribute("salleTPs", satps);
	modelMap.addAttribute("pages", new int[satps.getTotalPages()]);
	modelMap.addAttribute("currentPage", page);
	modelMap.addAttribute("size", size);
	return "listeSalleTPs";
	}
	@RequestMapping("/modifierSalleTP")
	public String editerSalleTP(@RequestParam("id") Long id,ModelMap modelMap)
	{
		SalleTP p= salleTPService.getSalleTP(id);
	modelMap.addAttribute("salleTP", p);
	modelMap.addAttribute("mode", "edit");
	return "editerSalleTP";
	}
	@RequestMapping("/updateSalleTP")
	public String updateSalleTP(@ModelAttribute("salleTP") SalleTP salleTP,
			ModelMap modelMap) throws ParseException

			{
			
			salleTPService.updateSalleTP(salleTP);
			List<SalleTP> satps = salleTPService.getAllSalleTPs();
			modelMap.addAttribute("salleTPs", satps);
			return "ListeSalleTPs";

			}

}
