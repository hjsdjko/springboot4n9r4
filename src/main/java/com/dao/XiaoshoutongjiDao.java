package com.dao;

import com.entity.XiaoshoutongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoshoutongjiVO;
import com.entity.view.XiaoshoutongjiView;


/**
 * 销售统计
 * 
 * @author 
 * @email 
 * @date 2022-05-06 18:06:12
 */
public interface XiaoshoutongjiDao extends BaseMapper<XiaoshoutongjiEntity> {
	
	List<XiaoshoutongjiVO> selectListVO(@Param("ew") Wrapper<XiaoshoutongjiEntity> wrapper);
	
	XiaoshoutongjiVO selectVO(@Param("ew") Wrapper<XiaoshoutongjiEntity> wrapper);
	
	List<XiaoshoutongjiView> selectListView(@Param("ew") Wrapper<XiaoshoutongjiEntity> wrapper);

	List<XiaoshoutongjiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoshoutongjiEntity> wrapper);
	
	XiaoshoutongjiView selectView(@Param("ew") Wrapper<XiaoshoutongjiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XiaoshoutongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XiaoshoutongjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XiaoshoutongjiEntity> wrapper);
}
