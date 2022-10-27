package cn.com.loveback.hziee.wxserver.service.impl;


import cn.com.loveback.hziee.wxserver.dao.BusinessRecordsDao;
import cn.com.loveback.hziee.wxserver.entity.BusinessRecords;
import cn.com.loveback.hziee.wxserver.service.BusinessRecordsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (BusinessRecords)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 01:24:58
 */
@Service("businessRecordsService")
public class BusinessRecordsServiceImpl implements BusinessRecordsService {
    @Resource
    private BusinessRecordsDao businessRecordsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param recordId 主键
     * @return 实例对象
     */
    @Override
    public BusinessRecords queryById(Integer recordId) {
        return this.businessRecordsDao.queryById(recordId);
    }

    /**
     * 分页查询
     *
     * @param businessRecords 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<BusinessRecords> queryByPage(BusinessRecords businessRecords, PageRequest pageRequest) {
        long total = this.businessRecordsDao.count(businessRecords);
        return new PageImpl<>(this.businessRecordsDao.queryAllByLimit(businessRecords, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param businessRecords 实例对象
     * @return 实例对象
     */
    @Override
    public BusinessRecords insert(BusinessRecords businessRecords) {
        this.businessRecordsDao.insert(businessRecords);
        return businessRecords;
    }

    /**
     * 修改数据
     *
     * @param businessRecords 实例对象
     * @return 实例对象
     */
    @Override
    public BusinessRecords update(BusinessRecords businessRecords) {
        this.businessRecordsDao.update(businessRecords);
        return this.queryById(businessRecords.getRecordId());
    }

    /**
     * 通过主键删除数据
     *
     * @param recordId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer recordId) {
        return this.businessRecordsDao.deleteById(recordId) > 0;
    }
}
