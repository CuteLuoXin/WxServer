package cn.com.loveback.hziee.wxserver.service.impl;


import cn.com.loveback.hziee.wxserver.dao.StaffRecordsDao;
import cn.com.loveback.hziee.wxserver.entity.StaffRecords;
import cn.com.loveback.hziee.wxserver.service.StaffRecordsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (StaffRecords)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service("staffRecordsService")
public class StaffRecordsServiceImpl implements StaffRecordsService {
    @Resource
    private StaffRecordsDao staffRecordsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param staffId 主键
     * @return 实例对象
     */
    @Override
    public StaffRecords queryById(Integer staffId) {
        return this.staffRecordsDao.queryById(staffId);
    }

    /**
     * 分页查询
     *
     * @param staffRecords 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<StaffRecords> queryByPage(StaffRecords staffRecords, PageRequest pageRequest) {
        long total = this.staffRecordsDao.count(staffRecords);
        return new PageImpl<>(this.staffRecordsDao.queryAllByLimit(staffRecords, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param staffRecords 实例对象
     * @return 实例对象
     */
    @Override
    public StaffRecords insert(StaffRecords staffRecords) {
        this.staffRecordsDao.insert(staffRecords);
        return staffRecords;
    }

    /**
     * 修改数据
     *
     * @param staffRecords 实例对象
     * @return 实例对象
     */
    @Override
    public StaffRecords update(StaffRecords staffRecords) {
        this.staffRecordsDao.update(staffRecords);
        return this.queryById(staffRecords.getStaffId());
    }

    /**
     * 通过主键删除数据
     *
     * @param staffId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer staffId) {
        return this.staffRecordsDao.deleteById(staffId) > 0;
    }
}
