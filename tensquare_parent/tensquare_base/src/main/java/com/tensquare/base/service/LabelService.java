package com.tensquare.base.service;

import com.tensquare.base.dao.LabelDao;
import com.tensquare.base.pojo.Label;
import com.itcast.utils.IdWorker;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@EnableTransactionManagement
public class LabelService {

    @Autowired
    private LabelDao labelDao;

    @Autowired
    private IdWorker  idWorker;

    public List<Label> findAll(){
        return  labelDao.findAll();
    }

    public Label  findById(String  id){
        return   labelDao.findById(id).get();

    }

    /**
     * 保存操作
     * @param label
     */
    public  void   save(Label  label){
        label.setId(idWorker.nextId()+"");
        //设置其他默认值
      labelDao.save(label);
    }

    /**
     * 修改操作
     */
    public  void   update(Label label){
        labelDao.save(label);
    }

    public void deleteById(String id) {
        labelDao.deleteById(id);
    }

    /**
     * 条件分页查询

     * @param map
     * @return
     */
    public Page<Label> search(Pageable pageable, Map map) {
        return   labelDao.findAll(getSpecification(map),pageable);
    }

    public List<Label> search(Map map) {
      return  labelDao.findAll(getSpecification(map));

    }


    /**
     * 用于创建查询条件
     * @param map
     * @return
     */
    private Specification<Label> getSpecification(Map map) {
     return new Specification<Label>() {
         List<Predicate>  list=new ArrayList<>();
         //return Predicate一个或者多个条件
         @Override
         public Predicate toPredicate(Root<Label> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
             String labelname = (String) map.get("labelname");
           if(StringUtils.isNotBlank(labelname)){
               Predicate p1 = criteriaBuilder.like(root.get("labelname").as(String.class), "%" + labelname + "%");
               list.add(p1);
           }

             String state = (String) map.get("state");
           if(StringUtils.isNotBlank(state)){
               Predicate p2 = criteriaBuilder.like(root.get("state").as(String.class), state);
               list.add(p2);
               }

               //多个条件使用or ? and ？连接
             Predicate[]  predicates=new Predicate[list.size()];

           //将数组转换为
             predicates = list.toArray(predicates);
             return criteriaBuilder.and(predicates);
         }
     };
    }
}
