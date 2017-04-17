package io.githup.rpc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.geping.rec.model.Knowledge;
import com.geping.rec.model.query.KnowledgeQuery;
import com.geping.rec.model.res.ResultList;
import com.geping.rec.service.RecService;

import io.githup.rpc.model.App;
import io.githup.rpc.model.wrappers.responses.ResultObject;
import io.githup.rpc.service.service.RpcService;

@RestController
@RequestMapping(value = "/rpc")
public class Controller {
    
	@Autowired
	private RpcService rpcService;
	
	@Autowired
	private RecService recService;
	
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResultObject<App> getSpecifiedDayBloodSugarData() {
    	App app =rpcService.generagePayment();
        return new ResultObject(app);
    }
    
    @RequestMapping(value = "/knowledge", method = RequestMethod.GET)
    public ResultList<Knowledge> getSpecifiedDayBloodSugarData(KnowledgeQuery query) {
    	System.out.println(query.getUserId());
    	return recService.getKnowledge(query);
    }
}