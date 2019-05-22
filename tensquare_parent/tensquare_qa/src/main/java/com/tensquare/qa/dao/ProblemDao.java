package com.tensquare.qa.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.tensquare.qa.pojo.Problem;
import org.springframework.data.jpa.repository.Query;

/**
 * 数据访问接口
 *
 * @author Administrator
 */
public interface ProblemDao extends JpaRepository<Problem, String>, JpaSpecificationExecutor<Problem> {

    /**
     * 根据标签查询最新问题列表
     *
     * @param labelid
     * @param pageable
     * @return
     */

    @Query("select p from Problem p where p.id in (select problemid from  Pl where labelid=?1 ) order by reply desc")
    public Page<Problem> newList(String labelid, Pageable pageable);

    /**
     * 根据标签查询最热门问题列表
     * @param labelId
     * @param pageable
     * @return
     */
    @Query("select p from Problem  p where id in (select problemid from Pl where labelid=?1) order by reply desc")
    public Page<Problem> findHotListByLabelId(String labelId, Pageable pageable);

    /**
     * 根据标签id查询出等待问题列表
     * @param labelid
     * @param pageable
     * @return
     */
    @Query("select p from Problem  p where id in (select problemid from Pl where labelid=?1) and relay=0 order by createTime desc ")
    public Page<Problem> findWaitListByLabelId(String labelid,Pageable pageable);
}
