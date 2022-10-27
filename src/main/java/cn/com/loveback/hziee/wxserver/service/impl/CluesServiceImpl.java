package cn.com.loveback.hziee.wxserver.service.impl;


import cn.com.loveback.hziee.wxserver.dao.CluesDao;
import cn.com.loveback.hziee.wxserver.entity.Clues;
import cn.com.loveback.hziee.wxserver.service.CluesService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Clues)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service("cluesService")
public class CluesServiceImpl implements CluesService {
    @Resource
    private CluesDao cluesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cluesId 主键
     * @return 实例对象
     */
    @Override
    public Clues queryById(String cluesId) {
        return this.cluesDao.queryById(cluesId);
    }

    /**
     * 分页查询
     *
     * @param clues 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Clues> queryByPage(Clues clues, PageRequest pageRequest) {
        long total = this.cluesDao.count(clues);
        return new PageImpl<>(this.cluesDao.queryAllByLimit(clues, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param clues 实例对象
     * @return 实例对象
     */
    @Override
    public Clues insert(Clues clues) {
        this.cluesDao.insert(clues);
        return clues;
    }

    /**
     * 修改数据
     *
     * @param clues 实例对象
     * @return 实例对象
     */
    @Override
    public Clues update(Clues clues) {
        this.cluesDao.update(clues);
        return this.queryById(clues.getCluesId());
    }

    /**
     * 通过主键删除数据
     *
     * @param cluesId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String cluesId) {
        return this.cluesDao.deleteById(cluesId) > 0;
    }
}
