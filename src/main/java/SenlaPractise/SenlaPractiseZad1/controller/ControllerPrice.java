package SenlaPractise.SenlaPractiseZad1.controller;

import SenlaPractise.SenlaPractiseZad1.entity.History;
import SenlaPractise.SenlaPractiseZad1.entity.UserRole;
import SenlaPractise.SenlaPractiseZad1.sevice.impl.SystemPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Locale;

@Controller
public class ControllerPrice {
    SystemPrice service;

    @Autowired
    public ControllerPrice(SystemPrice service) {
        this.service = service;
    }

    @GetMapping("/sale/{sale}/{role}")
    public String sale(@PathVariable("sale") String sale, @PathVariable("role") String role, Model model) throws Exception {
        if(sale.contains("-")){
            throw new Exception("dobby никому ничего не должен");
        }
        double price=Double.parseDouble(sale);
        Integer discount= UserRole.getDiscountForRole(role);
        model.addAttribute("price","Price:"+price);
        model.addAttribute("role_disc","Role:"+role+" Discount:"+discount+"%");
        BigDecimal newPrice=BigDecimal.valueOf(price-price*discount/100).setScale(2, RoundingMode.HALF_UP);
        model.addAttribute("priceBef","Price with dicount:"+newPrice);
        service.addHistory(new History(new Date(),price,newPrice,UserRole.getDiscountForRole(role),UserRole.valueOf(role.toUpperCase())));
        model.addAttribute("journal",service.showAll());
        return "sale";
    }
}
