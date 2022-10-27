package cn.com.loveback.hziee.wxserver.service;


import cn.com.loveback.hziee.wxserver.entity.StaffAccount;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * (StaffAccount)表服务接口
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service
public interface StaffAccountService {

    /**
     * 通过ID查询单条数据
     *
     * @param staffId 主键
     * @return 实例对象
     */
    StaffAccount queryById(String staffId);

    /**
     * 分页查询
     *
     * @param staffAccount 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<StaffAccount> queryByPage(StaffAccount staffAccount, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param staffAccount 实例对象
     * @return 实例对象
     */
    StaffAccount insert(StaffAccount staffAccount);

    /**
     * 修改数据
     *
     * @param staffAccount 实例对象
     * @return 实例对象
     */
    StaffAccount update(StaffAccount staffAccount);

    /**
     * 通过主键删除数据
     *
     * @param staffId 主键
     * @return 是否成功
     */
    boolean deleteById(String staffId);

}
