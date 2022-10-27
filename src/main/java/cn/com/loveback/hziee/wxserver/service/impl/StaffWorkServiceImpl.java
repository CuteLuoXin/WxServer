package cn.com.loveback.hziee.wxserver.service.impl;


import cn.com.loveback.hziee.wxserver.dao.StaffWorkDao;
import cn.com.loveback.hziee.wxserver.entity.StaffWork;
import cn.com.loveback.hziee.wxserver.service.StaffWorkService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (StaffWork)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service("staffWorkService")
public class StaffWorkServiceImpl implements StaffWorkService {
    @Resource
    private StaffWorkDao staffWorkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param staffId 主键
     * @return 实例对象
     */
    @Override
    public StaffWork queryById(Integer staffId) {
        return this.staffWorkDao.queryById(staffId);
    }

    /**
     * 分页查询
     *
     * @param staffWork 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<StaffWork> queryByPage(StaffWork staffWork, PageRequest pageRequest) {
        long total = this.staffWorkDao.count(staffWork);
        return new PageImpl<>(this.staffWorkDao.queryAllByLimit(staffWork, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param staffWork 实例对象
     * @return 实例对象
     */
    @Override
    public StaffWork insert(StaffWork staffWork) {
        this.staffWorkDao.insert(staffWork);
        return staffWork;
    }

    /**
     * 修改数据
     *
     * @param staffWork 实例对象
     * @return 实例对象
     */
    @Override
    public StaffWork update(StaffWork staffWork) {
        this.staffWorkDao.update(staffWork);
        return this.queryById(staffWork.getStaffId());
    }

    /**
     * 通过主键删除数据
     *
     * @param staffId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer staffId) {
        return this.staffWorkDao.deleteById(staffId) > 0;
    }
}
