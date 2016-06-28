package com.sandeep.test.bl;

import java.util.List;

import com.sandeep.test.dao.RepoDAO;
import com.sandeep.test.dao.SkuStrOnHandDAOImpl;
import com.sandeep.test.dto.FindSkuStrAttrDTO;
import com.sandeep.test.dto.SkuStrOnHndDTO;

public class SkuStrOnHndManager {

	public static List<SkuStrOnHndDTO> skuStrOnHnd(FindSkuStrAttrDTO searchDto) {
		RepoDAO<FindSkuStrAttrDTO, SkuStrOnHndDTO> repoDto = new SkuStrOnHandDAOImpl();
		return repoDto.getSkuStrData(searchDto);

	}
	
	public static boolean createSkuStrOnHnd(SkuStrOnHndDTO skuStrOnHndDto) {
		RepoDAO<FindSkuStrAttrDTO, SkuStrOnHndDTO> repoDto = new SkuStrOnHandDAOImpl();
		return repoDto.createSkuStr(skuStrOnHndDto);

	}
}
