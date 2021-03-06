package com.tensquare.qa.pojo;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 问题标签中间表
 */
@Entity
@Table(name="tb_pl")
@IdClass(Pl.class)//关联表id之间的关联
public class Pl implements Serializable{

    @Id
    private  String problemid;// 问题ID

    @Id
    private String labelid;//标签ID

    public String getProblemid() {
        return problemid;
    }

    public void setProblemid(String problemid) {
        this.problemid = problemid;
    }

    public String getLabelid() {
        return labelid;
    }

    public void setLabelid(String labelid) {
        this.labelid = labelid;
    }
}
