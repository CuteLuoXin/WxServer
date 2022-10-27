package cn.com.loveback.hziee.wxserver.service.impl;


import cn.com.loveback.hziee.wxserver.dao.RecordsDao;
import cn.com.loveback.hziee.wxserver.entity.Records;
import cn.com.loveback.hziee.wxserver.service.RecordsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Records)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service("recordsService")
public class RecordsServiceImpl implements RecordsService {
    @Resource
    private RecordsDao recordsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param recordsId 主键
     * @return 实例对象
     */
    @Override
    public Records queryById(Integer recordsId) {
        return this.recordsDao.queryById(recordsId);
    }

    /**
     * 分页查询
     *
     * @param records 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Records> queryByPage(Records records, PageRequest pageRequest) {
        long total = this.recordsDao.count(records);
        return new PageImpl<>(this.recordsDao.queryAllByLimit(records, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param records 实例对象
     * @return 实例对象
     */
    @Override
    public Records insert(Records records) {
        this.recordsDao.insert(records);
        return records;
    }

    /**
     * 修改数据
     *
     * @param records 实例对象
     * @return 实例对象
     */
    @Override
    public Records update(Records records) {
        this.recordsDao.update(records);
        return this.queryById(records.getRecordsId());
    }

    /**
     * 通过主键删除数据
     *
     * @param recordsId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer recordsId) {
        return this.recordsDao.deleteById(recordsId) > 0;
    }
}
