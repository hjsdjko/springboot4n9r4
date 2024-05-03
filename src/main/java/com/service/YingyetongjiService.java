package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingyetongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingyetongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingyetongjiView;


/**
 * 营业统计
 *
 * @author 
 * @email 
 * @date 2022-05-06 18:06:12
 */
public interface YingyetongjiService extends IService<YingyetongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingyetongjiVO> selectListVO(Wrapper<YingyetongjiEntity> wrapper);
   	
   	YingyetongjiVO selectVO(@Param("ew") Wrapper<YingyetongjiEntity> wrapper);
   	
   	List<YingyetongjiView> selectListView(Wrapper<YingyetongjiEntity> wrapper);
   	
   	YingyetongjiView selectView(@Param("ew") Wrapper<YingyetongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingyetongjiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YingyetongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YingyetongjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YingyetongjiEntity> wrapper);
}

