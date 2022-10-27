package cn.com.loveback.hziee.wxserver.service;

import cn.com.loveback.hziee.wxserver.entity.WxUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * (WxUser)表服务接口
 *
 * @author makejava
 * @since 2022-10-22 21:39:33
 */
@Service
public interface WxUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param telnum 主键
     * @return 实例对象
     */
    WxUser queryById(String telnum);

    /**
     * 分页查询
     *
     * @param wxUser      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<WxUser> queryByPage(WxUser wxUser, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param wxUser 实例对象
     * @return 实例对象
     */
    WxUser insert(WxUser wxUser);

    /**
     * 修改数据
     *
     * @param wxUser 实例对象
     * @return 实例对象
     */
    WxUser update(WxUser wxUser);

    /**
     * 通过主键删除数据
     *
     * @param telnum 主键
     * @return 是否成功
     */
    boolean deleteById(String telnum);

}
