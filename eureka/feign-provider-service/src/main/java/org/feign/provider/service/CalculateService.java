package main.java.org.feign.provider.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    public String hello(String name){
        return  "hello " + name;
    }
    
    public int Add(int a, int b){   
        return  a+b;
    }

    public int Minus(int a, int b){   
        return  a-b;
    }

    public int Times(int a, int b){   
        return  a*b;
    }

    public int Divide(int a, int b){   
          return a/b;
    }

}