package com.tensquare.article.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.tensquare.article.pojo.Article;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface ArticleDao extends JpaRepository<Article,String>,JpaSpecificationExecutor<Article>{
@Query("update Article a set a.state='1' where a.id=?1")
@Modifying
public   void examine(String articleId);



@Query("update Article a set a.thumbup=a.thumbup+1 where a.id=?1")
@Modifying
 public  void  thumbup(String  articleId);


 /**
  * 点赞
  * @param id
  */
 @Query("update Article  a set thumbup=thumbup+1 where id=?1")
 public  void updateThumbup(String id);
}
