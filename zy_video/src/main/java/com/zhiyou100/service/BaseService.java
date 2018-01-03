package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.dto.BaseDTO;
import com.zhiyou100.vo.QueryVO;

public interface BaseService<T> {
	
	/** 
	 * @Title: listObject 
	 * @Description: 展示信息
	 * @return
	 * @return: List<T>
	 */
	List<T> listObject();
	
	/**
	 * @Title: listObject
	 * @Description: 展示搜索结果,分页...信息
	 * @param vo
	 * @return
	 * @return: T
	 */
	BaseDTO<T> listObjectByQuery(QueryVO vo);

	/**
	 * @Title: addObject
	 * @Description: 添加信息
	 * @param t
	 * @return: void
	 */
	void addObject(T t);

	/**
	 * @Title: getObject
	 * @Description: 根据id获取信息
	 * @param id
	 * @return: void
	 */
	T getObject(Integer id);

	/**
	 * @Title: updateObject
	 * @Description: 更新信息
	 * @param t
	 * @return: void
	 */
	void updateObject(T t);
	
	/** 
	 * @Title: removeObject 
	 * @Description: 逻辑删除信息
	 * @param ids
	 * @return: void
	 */
	void removeObject(String[] ids);
}
