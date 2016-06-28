package com.sandeep.test.dao;

import java.util.List;

public interface RepoDAO <T1,T2>{

	boolean updateSkuStr(T1 t);
	boolean createSkuStr(T2 t);
	boolean deleteSkuStr(T1 t);
	List<T2> getSkuStrData(T1 t);
}
