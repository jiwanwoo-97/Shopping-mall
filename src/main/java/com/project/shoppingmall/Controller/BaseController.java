package com.project.shoppingmall.Controller;


import com.project.shoppingmall.ResBody.memberResBody;
import com.project.shoppingmall.Service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @Autowired
    private BaseService baseService;

    @GetMapping("/test")
    public ResponseEntity<memberResBody> main () {

     return ResponseEntity.ok(baseService.createMain());
    }


}
