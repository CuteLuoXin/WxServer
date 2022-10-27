package cn.com.loveback.hziee.wxserver.service.impl;

import cn.com.loveback.hziee.wxserver.entity.WxUser;
import cn.com.loveback.hziee.wxserver.dao.WxUserDao;
import cn.com.loveback.hziee.wxserver.service.WxUserService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (WxUser)表服务实现类
 *
 * @author makejava
 * @since 2022-10-22 21:39:33
 */
@Service("wxUserService")
public class WxUserServiceImpl implements WxUserService {
    @Resource
    private WxUserDao wxUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param telnum 主键
     * @return 实例对象
     */
    @Override
    public WxUser queryById(String telnum) {
        return this.wxUserDao.queryById(telnum);
    }

    /**
     * 分页查询
     *
     * @param wxUser      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<WxUser> queryByPage(WxUser wxUser, PageRequest pageRequest) {
        long total = this.wxUserDao.count(wxUser);
        return new PageImpl<>(this.wxUserDao.queryAllByLimit(wxUser, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param wxUser 实例对象
     * @return 实例对象
     */
    @Override
    public WxUser insert(WxUser wxUser) {
        this.wxUserDao.insert(wxUser);
        return wxUser;
    }

    /**
     * 修改数据
     *
     * @param wxUser 实例对象
     * @return 实例对象
     */
    @Override
    public WxUser update(WxUser wxUser) {
        this.wxUserDao.update(wxUser);
        return this.queryById(wxUser.getTelnum());
    }

    /**
     * 通过主键删除数据
     *
     * @param telnum 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String telnum) {
        return this.wxUserDao.deleteById(telnum) > 0;
    }
}
