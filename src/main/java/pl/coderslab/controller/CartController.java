package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.model.Cart;
import pl.coderslab.model.CartItem;
import pl.coderslab.model.Product;

import java.util.Random;

@Controller
public class CartController {

    private ProduktDao produktDao;
    private Cart cart;

    @Autowired
    public CartController(Cart cart) {
        this.cart = cart;
    }

    @Autowired
    public CartController (ProduktDao produktDao){
        this.produktDao = produktDao;
    }

    @GetMapping("/addtocart")
    @ResponseBody

    public String addtocart() {
        Random rand = new Random();
        cart.addToCart(new CartItem(1, new Product("prod" + rand.nextInt(10), rand.nextDouble(),13L)));
        return "addtocart";
    }

    @GetMapping("cart")
    @ResponseBody
    public String cartList(){
        return cart.toString();
    }

}
