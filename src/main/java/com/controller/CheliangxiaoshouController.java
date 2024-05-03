package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.CheliangxiaoshouEntity;
import com.entity.view.CheliangxiaoshouView;

import com.service.CheliangxiaoshouService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 车辆销售
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-06 18:06:12
 */
@RestController
@RequestMapping("/cheliangxiaoshou")
public class CheliangxiaoshouController {
    @Autowired
    private CheliangxiaoshouService cheliangxiaoshouService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CheliangxiaoshouEntity cheliangxiaoshou,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date xiaoshouriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date xiaoshouriqiend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xiaoshouyuan")) {
			cheliangxiaoshou.setXiaoshouzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<CheliangxiaoshouEntity> ew = new EntityWrapper<CheliangxiaoshouEntity>();
                if(xiaoshouriqistart!=null) ew.ge("xiaoshouriqi", xiaoshouriqistart);
                if(xiaoshouriqiend!=null) ew.le("xiaoshouriqi", xiaoshouriqiend);
		PageUtils page = cheliangxiaoshouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, cheliangxiaoshou), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CheliangxiaoshouEntity cheliangxiaoshou, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date xiaoshouriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date xiaoshouriqiend,
		HttpServletRequest request){
        EntityWrapper<CheliangxiaoshouEntity> ew = new EntityWrapper<CheliangxiaoshouEntity>();
                if(xiaoshouriqistart!=null) ew.ge("xiaoshouriqi", xiaoshouriqistart);
                if(xiaoshouriqiend!=null) ew.le("xiaoshouriqi", xiaoshouriqiend);
		PageUtils page = cheliangxiaoshouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, cheliangxiaoshou), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CheliangxiaoshouEntity cheliangxiaoshou){
       	EntityWrapper<CheliangxiaoshouEntity> ew = new EntityWrapper<CheliangxiaoshouEntity>();
      	ew.allEq(MPUtil.allEQMapPre( cheliangxiaoshou, "cheliangxiaoshou")); 
        return R.ok().put("data", cheliangxiaoshouService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CheliangxiaoshouEntity cheliangxiaoshou){
        EntityWrapper< CheliangxiaoshouEntity> ew = new EntityWrapper< CheliangxiaoshouEntity>();
 		ew.allEq(MPUtil.allEQMapPre( cheliangxiaoshou, "cheliangxiaoshou")); 
		CheliangxiaoshouView cheliangxiaoshouView =  cheliangxiaoshouService.selectView(ew);
		return R.ok("查询车辆销售成功").put("data", cheliangxiaoshouView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        CheliangxiaoshouEntity cheliangxiaoshou = cheliangxiaoshouService.selectById(id);
        return R.ok().put("data", cheliangxiaoshou);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        CheliangxiaoshouEntity cheliangxiaoshou = cheliangxiaoshouService.selectById(id);
        return R.ok().put("data", cheliangxiaoshou);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CheliangxiaoshouEntity cheliangxiaoshou, HttpServletRequest request){
    	cheliangxiaoshou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(cheliangxiaoshou);
        cheliangxiaoshouService.insert(cheliangxiaoshou);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CheliangxiaoshouEntity cheliangxiaoshou, HttpServletRequest request){
    	cheliangxiaoshou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(cheliangxiaoshou);
        cheliangxiaoshouService.insert(cheliangxiaoshou);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody CheliangxiaoshouEntity cheliangxiaoshou, HttpServletRequest request){
        //ValidatorUtils.validateEntity(cheliangxiaoshou);
        cheliangxiaoshouService.updateById(cheliangxiaoshou);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        cheliangxiaoshouService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<CheliangxiaoshouEntity> wrapper = new EntityWrapper<CheliangxiaoshouEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xiaoshouyuan")) {
			wrapper.eq("xiaoshouzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = cheliangxiaoshouService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
