package com.sandeep.test.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.sandeep.test.dto.FindSkuStrAttrDTO;
import com.sandeep.test.dto.SkuStrOnHndDTO;

public class SkuStrOnHandDAOImpl implements RepoDAO<FindSkuStrAttrDTO,SkuStrOnHndDTO>{

	static List<SkuStrOnHndDTO> skuStrOnHndDataList= new ArrayList<>();
	
	static{
		skuStrOnHndDataList.add(new SkuStrOnHndDTO(1000, 101, "Lumber", "ATL", 20));
		skuStrOnHndDataList.add(new SkuStrOnHndDTO(1001, 101, "Lumber New", "ATL", 25));
		skuStrOnHndDataList.add(new SkuStrOnHndDTO(1002, 101, "Table", "ATL", 10));
		skuStrOnHndDataList.add(new SkuStrOnHndDTO(1000, 102, "Lumber", "NYC", 20));
		skuStrOnHndDataList.add(new SkuStrOnHndDTO(1001, 102, "Lumber New", "NYC", 40));
		skuStrOnHndDataList.add(new SkuStrOnHndDTO(1002, 102, "Table", "NYC", 60));
		skuStrOnHndDataList.add(new SkuStrOnHndDTO(1000, 103, "Lumber", "OLD", 20));
		skuStrOnHndDataList.add(new SkuStrOnHndDTO(1001, 103, "Lumber New", "OLD", 25));
		skuStrOnHndDataList.add(new SkuStrOnHndDTO(1002, 103, "Table", "OLD", 25));
	}
	@Override
	public boolean updateSkuStr(FindSkuStrAttrDTO searchSkuStrDto) {
		Predicate<SkuStrOnHndDTO> pred = (p) -> {
			boolean returnFlag = (p.getSkuNbr() == searchSkuStrDto.getSkuNbr()
					&& p.getStrNbr() == searchSkuStrDto.getStrNbr());
			return returnFlag;
		};

		skuStrOnHndDataList.stream().filter(pred)
				.forEach(matchingDto -> matchingDto.setOnHand(searchSkuStrDto.getOnHnd()));

		return true;
	}

	@Override
	public boolean createSkuStr(SkuStrOnHndDTO skuStrOnHndDto) {
		skuStrOnHndDataList.add(skuStrOnHndDto);
		return true;
	}

	@Override
	public boolean deleteSkuStr(FindSkuStrAttrDTO searchSkuStrDto) {

		Predicate<SkuStrOnHndDTO> pred = (p) -> {
			boolean returnFlag = (p.getSkuNbr() == searchSkuStrDto.getSkuNbr()
					&& p.getStrNbr() == searchSkuStrDto.getStrNbr());
			return returnFlag;
		};

		skuStrOnHndDataList.stream().filter(pred)
				.forEach(matchingDto -> this.skuStrOnHndDataList.remove((matchingDto)));

		return true;
	}

	@Override
	public List<SkuStrOnHndDTO> getSkuStrData(FindSkuStrAttrDTO searchSkuStrDto) {

		if (searchSkuStrDto.getSkuNbr() != 0 && searchSkuStrDto.getStrNbr() != 0) {
			Predicate<SkuStrOnHndDTO> pred = (p) -> {
				boolean returnFlag = (p.getSkuNbr() == searchSkuStrDto.getSkuNbr() 
						&& p.getStrNbr() == searchSkuStrDto.getStrNbr());
				return returnFlag;
			};
			List<SkuStrOnHndDTO> matchingResultList = new ArrayList<>();
			skuStrOnHndDataList.stream().filter(pred).forEach(matchingDto -> matchingResultList.add(matchingDto));
			
			matchingResultList.stream().forEach(searchDTO -> {
				System.out.println(searchDTO.getSkuNbr() +" "+ searchDTO.getStrName());
			});
			return matchingResultList;
		} else {
			return skuStrOnHndDataList;
		}
	}

}
