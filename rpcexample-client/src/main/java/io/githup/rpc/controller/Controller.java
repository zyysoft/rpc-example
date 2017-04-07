package io.githup.rpc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.githup.rpc.model.App;
import io.githup.rpc.model.wrappers.responses.ResultObject;
import io.githup.rpc.service.service.RpcService;

@RestController
@RequestMapping(value = "/rpc")
public class Controller {
    
	@Autowired
	private RpcService rpcService;
	
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResultObject<App> getSpecifiedDayBloodSugarData() {
    	App app =rpcService.generagePayment();
        return new ResultObject(app);
    }
}