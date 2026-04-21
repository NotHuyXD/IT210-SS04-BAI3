package com.restaurant.bai3.controller;

import com.restaurant.bai3.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("controllerBai3")
public class RestaurantController {

    private final OrderService orderService;

    @Autowired
    public RestaurantController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/bai3/orders")
    @ResponseBody
    public String getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/bai3/orders/{id}")
    @ResponseBody
    public String getOrderById(@PathVariable Long id) {
        return "Chi tiết đơn hàng số " + id;
    }

    @PostMapping("/bai3/orders")
    @ResponseBody
    public String createOrder() {
        return "Them don hang moi thanh cong";
    }

    @GetMapping("/bai3/menu")
    @ResponseBody
    public String getMenu(@RequestParam(value = "category", required = false, defaultValue = "chay") String category) {
        return "Danh sach thuc don cho loai: " + category;
    }
}