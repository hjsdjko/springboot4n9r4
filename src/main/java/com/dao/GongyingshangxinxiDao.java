package com.dao;

import com.entity.GongyingshangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongyingshangxinxiVO;
import com.entity.view.GongyingshangxinxiView;


/**
 * 供应商信息
 * 
 * @author 
 * @email 
 * @date 2022-05-06 18:06:12
 */
public interface GongyingshangxinxiDao extends BaseMapper<GongyingshangxinxiEntity> {
	
	List<GongyingshangxinxiVO> selectListVO(@Param("ew") Wrapper<GongyingshangxinxiEntity> wrapper);
	
	GongyingshangxinxiVO selectVO(@Param("ew") Wrapper<GongyingshangxinxiEntity> wrapper);
	
	List<GongyingshangxinxiView> selectListView(@Param("ew") Wrapper<GongyingshangxinxiEntity> wrapper);

	List<GongyingshangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GongyingshangxinxiEntity> wrapper);
	
	GongyingshangxinxiView selectView(@Param("ew") Wrapper<GongyingshangxinxiEntity> wrapper);
	

}
