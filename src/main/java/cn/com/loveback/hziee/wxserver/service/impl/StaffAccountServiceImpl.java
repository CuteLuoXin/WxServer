package cn.com.loveback.hziee.wxserver.service.impl;


import cn.com.loveback.hziee.wxserver.dao.StaffAccountDao;
import cn.com.loveback.hziee.wxserver.entity.StaffAccount;
import cn.com.loveback.hziee.wxserver.service.StaffAccountService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (StaffAccount)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service("staffAccountService")
public class StaffAccountServiceImpl implements StaffAccountService {
    @Resource
    private StaffAccountDao staffAccountDao;

    /**
     * 通过ID查询单条数据
     *
     * @param staffId 主键
     * @return 实例对象
     */
    @Override
    public StaffAccount queryById(String staffId) {
        return this.staffAccountDao.queryById(staffId);
    }

    /**
     * 分页查询
     *
     * @param staffAccount 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<StaffAccount> queryByPage(StaffAccount staffAccount, PageRequest pageRequest) {
        long total = this.staffAccountDao.count(staffAccount);
        return new PageImpl<>(this.staffAccountDao.queryAllByLimit(staffAccount, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param staffAccount 实例对象
     * @return 实例对象
     */
    @Override
    public StaffAccount insert(StaffAccount staffAccount) {
        this.staffAccountDao.insert(staffAccount);
        return staffAccount;
    }

    /**
     * 修改数据
     *
     * @param staffAccount 实例对象
     * @return 实例对象
     */
    @Override
    public StaffAccount update(StaffAccount staffAccount) {
        this.staffAccountDao.update(staffAccount);
        return this.queryById(staffAccount.getStaffId());
    }

    /**
     * 通过主键删除数据
     *
     * @param staffId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String staffId) {
        return this.staffAccountDao.deleteById(staffId) > 0;
    }
}
