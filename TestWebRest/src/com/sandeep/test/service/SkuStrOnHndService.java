package com.sandeep.test.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sandeep.test.bl.SkuStrOnHndManager;
import com.sandeep.test.dto.FindSkuStrAttrDTO;
import com.sandeep.test.dto.SkuStrOnHndDTO;

import io.swagger.annotations.Api;

@Api(value = "/skuStr", tags = "skuStr")
@Path("/skuStr")
public class SkuStrOnHndService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/onHnd/{type}")
	public List<SkuStrOnHndDTO> findAllSkuStrOnHnd(@PathParam("type") String searchType) {

		System.out.println("==========" + searchType);
		return SkuStrOnHndManager.skuStrOnHnd(new FindSkuStrAttrDTO());
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/onHnd/{sku}/{str}")
	public List<SkuStrOnHndDTO> findEachSkuStrOnHnd(@PathParam("sku") int skuNbr,
			@PathParam("str") int strNbr){
		FindSkuStrAttrDTO findSkuStrDto = new FindSkuStrAttrDTO(strNbr,skuNbr);
		return SkuStrOnHndManager.skuStrOnHnd(findSkuStrDto);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/onHnd/{sku}/{str}")
	public boolean postEachSkuStrOnHnd(@PathParam("sku") int skuNbr,
			@PathParam("str") int strNbr, String skuStrOnHnd){
		System.out.println(skuStrOnHnd);
		Gson jsonParser = new Gson();
		SkuStrOnHndDTO skuStrOnHndDTO = jsonParser.fromJson(skuStrOnHnd, SkuStrOnHndDTO.class);
		return SkuStrOnHndManager.createSkuStrOnHnd(skuStrOnHndDTO);
	}
	
	
}
