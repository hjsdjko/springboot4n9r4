package com.dao;

import com.entity.CheliangxiaoshouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheliangxiaoshouVO;
import com.entity.view.CheliangxiaoshouView;


/**
 * 车辆销售
 * 
 * @author 
 * @email 
 * @date 2022-05-06 18:06:12
 */
public interface CheliangxiaoshouDao extends BaseMapper<CheliangxiaoshouEntity> {
	
	List<CheliangxiaoshouVO> selectListVO(@Param("ew") Wrapper<CheliangxiaoshouEntity> wrapper);
	
	CheliangxiaoshouVO selectVO(@Param("ew") Wrapper<CheliangxiaoshouEntity> wrapper);
	
	List<CheliangxiaoshouView> selectListView(@Param("ew") Wrapper<CheliangxiaoshouEntity> wrapper);

	List<CheliangxiaoshouView> selectListView(Pagination page,@Param("ew") Wrapper<CheliangxiaoshouEntity> wrapper);
	
	CheliangxiaoshouView selectView(@Param("ew") Wrapper<CheliangxiaoshouEntity> wrapper);
	

}
