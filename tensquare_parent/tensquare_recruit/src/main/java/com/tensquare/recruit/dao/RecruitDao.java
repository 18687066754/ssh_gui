package com.tensquare.recruit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.tensquare.recruit.pojo.Recruit;

import java.util.List;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface RecruitDao extends JpaRepository<Recruit,String>,JpaSpecificationExecutor<Recruit>{
	//按照SpringData官方提供约定，方法命名实现查询
    public List<Recruit> findTop4ByStateOrderByCreatetimeDesc(String state);

    public List<Recruit> findTop4ByStateNotOrderByCreatetimeDesc(String state);
}
