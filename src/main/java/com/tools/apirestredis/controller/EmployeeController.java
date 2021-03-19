package com.tools.apirestredis.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tools.apirestredis.vo.EmployeeVO;
import com.tools.apirestredis.vo.MessageVO;

@RestController
public class EmployeeController
{
    @GetMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
    public String getHealthCheck()
    {
        return "{ \"isWorking\" : true }";
    }

    @GetMapping("/employeeslala")
    public String getEmployees()
    {
        return "{ \"employees\" : lala }";
    }

    @GetMapping("/employeesvo")
    public MessageVO<EmployeeVO> getEmployeesvo()
    {
        EmployeeVO employeeVO = new EmployeeVO(true);
        return new MessageVO<EmployeeVO>().success(employeeVO);
    }

}
