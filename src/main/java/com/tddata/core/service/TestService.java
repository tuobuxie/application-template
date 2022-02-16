package com.tddata.core.service;

import com.tddata.core.entity.Test;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * test表(Test)表服务接口
 *
 * @author makejava
 * @since 2022-02-14 17:53:46
 */
public interface TestService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Test queryById(String id);

    /**
     * 分页查询
     *
     * @param test 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Test> queryByPage(Test test, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param test 实例对象
     * @return 实例对象
     */
    Test insert(Test test);

    /**
     * 修改数据
     *
     * @param test 实例对象
     * @return 实例对象
     */
    Test update(Test test);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}
