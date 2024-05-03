package com.entity.vo;

import com.entity.XiaoshoutongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 销售统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-06 18:06:12
 */
public class XiaoshoutongjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 销售姓名
	 */
	
	private String xiaoshouxingming;
		
	/**
	 * 统计月份
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tongjiyuefen;
		
	/**
	 * 统计类型
	 */
	
	private String tongjileixing;
		
	/**
	 * 销售金额
	 */
	
	private Integer xiaoshoujine;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：销售姓名
	 */
	 
	public void setXiaoshouxingming(String xiaoshouxingming) {
		this.xiaoshouxingming = xiaoshouxingming;
	}
	
	/**
	 * 获取：销售姓名
	 */
	public String getXiaoshouxingming() {
		return xiaoshouxingming;
	}
				
	
	/**
	 * 设置：统计月份
	 */
	 
	public void setTongjiyuefen(Date tongjiyuefen) {
		this.tongjiyuefen = tongjiyuefen;
	}
	
	/**
	 * 获取：统计月份
	 */
	public Date getTongjiyuefen() {
		return tongjiyuefen;
	}
				
	
	/**
	 * 设置：统计类型
	 */
	 
	public void setTongjileixing(String tongjileixing) {
		this.tongjileixing = tongjileixing;
	}
	
	/**
	 * 获取：统计类型
	 */
	public String getTongjileixing() {
		return tongjileixing;
	}
				
	
	/**
	 * 设置：销售金额
	 */
	 
	public void setXiaoshoujine(Integer xiaoshoujine) {
		this.xiaoshoujine = xiaoshoujine;
	}
	
	/**
	 * 获取：销售金额
	 */
	public Integer getXiaoshoujine() {
		return xiaoshoujine;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
