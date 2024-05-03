package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaoxiangongsiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaoxiangongsiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaoxiangongsiView;


/**
 * 保险公司
 *
 * @author 
 * @email 
 * @date 2022-05-06 18:06:12
 */
public interface BaoxiangongsiService extends IService<BaoxiangongsiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoxiangongsiVO> selectListVO(Wrapper<BaoxiangongsiEntity> wrapper);
   	
   	BaoxiangongsiVO selectVO(@Param("ew") Wrapper<BaoxiangongsiEntity> wrapper);
   	
   	List<BaoxiangongsiView> selectListView(Wrapper<BaoxiangongsiEntity> wrapper);
   	
   	BaoxiangongsiView selectView(@Param("ew") Wrapper<BaoxiangongsiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoxiangongsiEntity> wrapper);
   	

}

