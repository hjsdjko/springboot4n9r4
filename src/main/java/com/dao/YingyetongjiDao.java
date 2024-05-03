package com.dao;

import com.entity.YingyetongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingyetongjiVO;
import com.entity.view.YingyetongjiView;


/**
 * 营业统计
 * 
 * @author 
 * @email 
 * @date 2022-05-06 18:06:12
 */
public interface YingyetongjiDao extends BaseMapper<YingyetongjiEntity> {
	
	List<YingyetongjiVO> selectListVO(@Param("ew") Wrapper<YingyetongjiEntity> wrapper);
	
	YingyetongjiVO selectVO(@Param("ew") Wrapper<YingyetongjiEntity> wrapper);
	
	List<YingyetongjiView> selectListView(@Param("ew") Wrapper<YingyetongjiEntity> wrapper);

	List<YingyetongjiView> selectListView(Pagination page,@Param("ew") Wrapper<YingyetongjiEntity> wrapper);
	
	YingyetongjiView selectView(@Param("ew") Wrapper<YingyetongjiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YingyetongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YingyetongjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YingyetongjiEntity> wrapper);
}
