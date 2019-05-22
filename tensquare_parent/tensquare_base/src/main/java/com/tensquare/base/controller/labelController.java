package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import com.itcast.entity.PageResult;
import com.itcast.entity.Result;
import com.itcast.entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin  //解决跨域
@RequestMapping("/label")
public class labelController {

    @Autowired
    private LabelService labelService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Result findAll() {
        return new Result(true, StatusCode.OK, "查询成功", labelService.findAll());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result findById(@PathVariable String id) {
        return new Result(true, 2000, "查询成功", labelService.findById(id));
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result save(@RequestBody Label label) {
        labelService.save(label);
        return new Result(true, 2000, "添加成功");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result update(@RequestBody Label label, @PathVariable String id) {
        label.setId(id);
        labelService.update(label);
        return new Result(true, 2000, "更新成功");


    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable String id) {
        labelService.deleteById(id);
        return new Result(true, 2000, "删除成功");
    }


    /**
     * 添加+分页查询
     *
     * @param page
     * @param size
     * @param map
     * @return
     */
    @RequestMapping(value = "/search/{page}/{size}",method = RequestMethod.POST)
    public Result Search(@PathVariable int page, @PathVariable int size, @RequestBody Map map) {
        //Pageable封装大小，页大小
        Pageable pageable = PageRequest.of(page - 1, size);
        //Page对象封装总局路数，当前记录数
        Page<Label> pageData = labelService.search(pageable, map);
        PageResult<Label> pageResult = new PageResult<>(pageData.getTotalElements(), pageData.getContent());
        return new Result(true, StatusCode.OK, "查询成功", pageResult);


    }




    @RequestMapping("/search")
    public Result search(@RequestBody Map map) {
        List<Label> list = labelService.search(map);
        return new Result(true, StatusCode.OK, "查询成功", list);
    }

}
