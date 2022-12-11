package com.study.springboot20221peng.web.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.study.springboot20221peng.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductTestController {

    @GetMapping("/product/addtion")
    public String loadAddition() {
        return "product/product_add";

    }

  /*  @PostMapping("/api/product")
    public String registerProduct(HttpServletRequest request){
        System.out.println(request.getParameter("price")); // 무조건 String
    return "product/product_view" ;
    }
*/
//
//    @PostMapping("/api/product")//현재 오류남 - html 문제
//    public String registerProduct(@RequestParam String productCode,
//                                  @RequestParam String productName,
//                                  @RequestParam("price") int p) {
//
//        System.out.println(p);
//        return "product/product_view";
//    }

    @GetMapping("/product/addtion2")
    public String loadAddition2(){
        return "product/product_add2";
    }
    @ResponseBody
    @PostMapping("/api/product/2")//현재 오류남 - html 문제
    public String registerProduct(ProductDto productDto) {
        System.out.println(productDto);
        return "텍스트 데이터 응답";

    }
}