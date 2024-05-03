package com.dao;

import com.entity.BaoxiangongsiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoxiangongsiVO;
import com.entity.view.BaoxiangongsiView;


/**
 * 保险公司
 * 
 * @author 
 * @email 
 * @date 2022-05-06 18:06:12
 */
public interface BaoxiangongsiDao extends BaseMapper<BaoxiangongsiEntity> {
	
	List<BaoxiangongsiVO> selectListVO(@Param("ew") Wrapper<BaoxiangongsiEntity> wrapper);
	
	BaoxiangongsiVO selectVO(@Param("ew") Wrapper<BaoxiangongsiEntity> wrapper);
	
	List<BaoxiangongsiView> selectListView(@Param("ew") Wrapper<BaoxiangongsiEntity> wrapper);

	List<BaoxiangongsiView> selectListView(Pagination page,@Param("ew") Wrapper<BaoxiangongsiEntity> wrapper);
	
	BaoxiangongsiView selectView(@Param("ew") Wrapper<BaoxiangongsiEntity> wrapper);
	

}
