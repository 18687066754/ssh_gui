package com.tensquare.qa.controller;

import java.util.Map;

import com.itcast.entity.PageResult;
import com.itcast.entity.Result;
import com.itcast.entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import com.tensquare.qa.pojo.Problem;
import com.tensquare.qa.service.ProblemService;


/**
 * 控制器层
 *
 * @author Administrator
 */
@RestController
@CrossOrigin
@RequestMapping("/problem")
public class ProblemController {

    @Autowired
    private ProblemService problemService;


    /**
     * 查询全部数据
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll() {
        return new Result(true, StatusCode.OK, "查询成功", problemService.findAll());
    }

    /**
     * 根据ID查询
     *
     * @param id ID
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result findById(@PathVariable String id) {
        return new Result(true, StatusCode.OK, "查询成功", problemService.findById(id));
    }


    /**
     * 分页+多条件查询
     *
     * @param searchMap 查询条件封装
     * @param page      页码
     * @param size      页大小
     * @return 分页结果
     */
    @RequestMapping(value = "/search/{page}/{size}", method = RequestMethod.POST)
    public Result findSearch(@RequestBody Map searchMap, @PathVariable int page, @PathVariable int size) {
        Page<Problem> pageList = problemService.findSearch(searchMap, page, size);
        return new Result(true, StatusCode.OK, "查询成功", new PageResult<Problem>(pageList.getTotalElements(), pageList.getContent()));
    }

    /**
     * 根据条件查询
     *
     * @param searchMap
     * @return
     */
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public Result findSearch(@RequestBody Map searchMap) {
        return new Result(true, StatusCode.OK, "查询成功", problemService.findSearch(searchMap));
    }

    /**
     * 增加
     *
     * @param problem
     */
    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody Problem problem) {
        problemService.add(problem);
        return new Result(true, StatusCode.OK, "增加成功");
    }

    /**
     * 修改
     *
     * @param problem
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result update(@RequestBody Problem problem, @PathVariable String id) {
        problem.setId(id);
        problemService.update(problem);
        return new Result(true, StatusCode.OK, "修改成功");
    }

    /**
     * 删除
     *
     * @param id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result delete(@PathVariable String id) {
        problemService.deleteById(id);
        return new Result(true, StatusCode.OK, "删除成功");
    }

    /**
     * 根据标签id查询出id下最新问题列表
     *
     * @param labelId
     * @param page
     * @param size
     * @return
     */
    @RequestMapping("/newlist/{label}/{page}/{size}")
    public Result newList(@PathVariable("label") String labelId, @PathVariable int page, @PathVariable int size) {
        Pageable pageable = PageRequest.of(page - 1, size);
        Page<Problem> pageData = problemService.newList(labelId, pageable);
        return new Result(true, StatusCode.OK, "查询成功", new PageResult<Problem>(pageData.getTotalElements(), pageData.getContent()));
    }

    /**
     * 根据标签id查询出id下最热门问题列表
     *
     * @param labelId
     * @param page
     * @param size
     * @return
     */
    @RequestMapping("/hotlist/{label}/{page}/{size}")
    public Result findHotListByLabelId(@PathVariable("label") String labelId, @PathVariable int page, @PathVariable int size) {
        Pageable pageable = PageRequest.of(page - 1, size);
        Page<Problem> pageData = problemService.findHotListByLabelId(labelId, pageable);
        return new Result(true, StatusCode.OK, "查询成功",new PageResult<Problem>(pageData.getTotalElements(),pageData.getTotalPages()) );
    }


    /**
     * 根据标签id查询出等待服务列表
     *
     * @param labelId
     * @param page
     * @param size
     * @return
     */
    @RequestMapping("/waitlist/{label}/{page}/{size}")
    public Result findWaitListByLabelId(@PathVariable("label") String labelId, @PathVariable int page, @PathVariable int size) {
        Pageable pageable = PageRequest.of(page - 1, size);
        Page<Problem> pageData = problemService.findWaitListByLabelId(labelId, pageable);
        return new Result(true, StatusCode.OK, "查询成功",new PageResult<Problem>(pageData.getTotalElements(),pageData.getTotalPages()) );
    }


}
