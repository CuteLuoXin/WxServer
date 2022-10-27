package cn.com.loveback.hziee.wxserver.service;


import cn.com.loveback.hziee.wxserver.entity.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * (Client)表服务接口
 *
 * @author makejava
 * @since 2022-10-19 01:24:58
 */
@Service
public interface ClientService {

    /**
     * 通过ID查询单条数据
     *
     * @param clientId 主键
     * @return 实例对象
     */
    Client queryById(Integer clientId);

    /**
     * 分页查询
     *
     * @param client 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Client> queryByPage(Client client, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param client 实例对象
     * @return 实例对象
     */
    Client insert(Client client);

    /**
     * 修改数据
     *
     * @param client 实例对象
     * @return 实例对象
     */
    Client update(Client client);

    /**
     * 通过主键删除数据
     *
     * @param clientId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer clientId);

}
