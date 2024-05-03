package com.dao;

import com.entity.CheliangweixiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheliangweixiuVO;
import com.entity.view.CheliangweixiuView;


/**
 * 车辆维修
 * 
 * @author 
 * @email 
 * @date 2022-05-06 18:06:12
 */
public interface CheliangweixiuDao extends BaseMapper<CheliangweixiuEntity> {
	
	List<CheliangweixiuVO> selectListVO(@Param("ew") Wrapper<CheliangweixiuEntity> wrapper);
	
	CheliangweixiuVO selectVO(@Param("ew") Wrapper<CheliangweixiuEntity> wrapper);
	
	List<CheliangweixiuView> selectListView(@Param("ew") Wrapper<CheliangweixiuEntity> wrapper);

	List<CheliangweixiuView> selectListView(Pagination page,@Param("ew") Wrapper<CheliangweixiuEntity> wrapper);
	
	CheliangweixiuView selectView(@Param("ew") Wrapper<CheliangweixiuEntity> wrapper);
	

}
