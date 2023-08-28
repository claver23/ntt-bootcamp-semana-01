package com.bootcamp.projectosemana01.delegateImpl;


import com.example.demo.api.HelloApiDelegate;
import com.example.demo.model.HelloResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HelloDelegateImpl implements HelloApiDelegate {


    @Override
    public ResponseEntity<HelloResponse> hello() {
        HelloResponse hellow = new HelloResponse();
        System.out.println("aaaaaaaaaa");
        hellow.setText("aaaaaaaaaaax2");
        return ResponseEntity.ok(hellow);
    }
}
