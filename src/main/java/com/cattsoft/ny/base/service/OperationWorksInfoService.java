/*
 * Powered By Generator Util
 */
package com.cattsoft.ny.base.service;

import java.util.List;

import com.cattsoft.baseplatform.core.entity.PagingQueryBean;
import com.cattsoft.baseplatform.core.entity.PagingResultBean;
import com.cattsoft.ny.base.entity.News;
import com.cattsoft.ny.base.entity.OperationWorksInfo;
import com.cattsoft.ny.base.entity.querybean.OperationWorksInfoQB;
/**
 * 
 * Description: <br>
 * Date: <br>
 * Copyright (c) 2012 CATTSoft <br>
 * 
 * @author CHASE
 */
public interface OperationWorksInfoService {
	/**
	 * 增加produce_works_info信息
	 * 
	 * @param operationWorksInfo produce_works_info信息
	 *
	 * @return produce_works_info标识
	 */
	Long createOperationWorksInfo(OperationWorksInfo operationWorksInfo);

	/**
	 * 修改produce_works_info信息
	 * 
	 * @param operationWorksInfo produce_works_info信息
	 */
	void updateOperationWorksInfo(OperationWorksInfo operationWorksInfo);

	/**
	 * 删除produce_works_info信息
	 * 
	 * @param id produce_works_info标识
	 */
	void removeOperationWorksInfo(Long id);

	/**
	 * 获取produce_works_info信息
	 * 
	 * @param id produce_works_info标识
	 * @return produce_works_info信息
	 */
	OperationWorksInfo getOperationWorksInfo(Long id);

	/**
	 * 获取所有produce_works_info
	 * 
	 * @return 所有produce_works_info信息的列表
	 */
	List<OperationWorksInfo> getAllOperationWorksInfos();
	
	/**
	 * 根据查询对象查询produce_works_info结果列表
	 * @param queryBean  查询对象
	 *
	 * @return  produce_works_info记录列表
	 */
	List<OperationWorksInfo> getOperationWorksInfos(OperationWorksInfoQB queryBean);

	/**
	 * 分页获取produce_works_info列表
	 * 
	 * @param pagingQueryBean  分页查询对象
	 *
	 * @return 分页produce_works_info列表
	 */
	PagingResultBean<List<OperationWorksInfo>> getAllOperationWorksInfosPaging(PagingQueryBean<OperationWorksInfoQB> pagingQueryBean);

	List<News> getNews();
}
