package cn.com.loveback.hziee.wxserver.service.impl;


import cn.com.loveback.hziee.wxserver.dao.StaffStateDao;
import cn.com.loveback.hziee.wxserver.entity.StaffState;
import cn.com.loveback.hziee.wxserver.service.StaffStateService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (StaffState)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service("staffStateService")
public class StaffStateServiceImpl implements StaffStateService {
    @Resource
    private StaffStateDao staffStateDao;

    /**
     * 通过ID查询单条数据
     *
     * @param stateId 主键
     * @return 实例对象
     */
    @Override
    public StaffState queryById(Integer stateId) {
        return this.staffStateDao.queryById(stateId);
    }

    /**
     * 分页查询
     *
     * @param staffState 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<StaffState> queryByPage(StaffState staffState, PageRequest pageRequest) {
        long total = this.staffStateDao.count(staffState);
        return new PageImpl<>(this.staffStateDao.queryAllByLimit(staffState, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param staffState 实例对象
     * @return 实例对象
     */
    @Override
    public StaffState insert(StaffState staffState) {
        this.staffStateDao.insert(staffState);
        return staffState;
    }

    /**
     * 修改数据
     *
     * @param staffState 实例对象
     * @return 实例对象
     */
    @Override
    public StaffState update(StaffState staffState) {
        this.staffStateDao.update(staffState);
        return this.queryById(staffState.getStateId());
    }

    /**
     * 通过主键删除数据
     *
     * @param stateId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer stateId) {
        return this.staffStateDao.deleteById(stateId) > 0;
    }
}
