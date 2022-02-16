package com.tddata.core.service.impl;

import com.tddata.core.entity.Test;
import com.tddata.core.dao.TestDao;
import com.tddata.core.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * test表(Test)表服务实现类
 *
 * @author makejava
 * @since 2022-02-14 17:53:47
 */
@Service("testService")
public class TestServiceImpl implements TestService {
    @Resource
    private TestDao testDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Test queryById(String id) {
        return this.testDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param test 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Test> queryByPage(Test test, PageRequest pageRequest) {
        long total = this.testDao.count(test);
        return new PageImpl<>(this.testDao.queryAllByLimit(test, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param test 实例对象
     * @return 实例对象
     */
    @Override
    public Test insert(Test test) {
        this.testDao.insert(test);
        return test;
    }

    /**
     * 修改数据
     *
     * @param test 实例对象
     * @return 实例对象
     */
    @Override
    public Test update(Test test) {
        this.testDao.update(test);
        return this.queryById(test.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.testDao.deleteById(id) > 0;
    }
}
