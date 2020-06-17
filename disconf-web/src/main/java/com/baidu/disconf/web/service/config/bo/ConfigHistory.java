package com.baidu.disconf.web.service.config.bo;

import com.baidu.dsp.common.dao.Columns;
import com.baidu.dsp.common.dao.DB;
import com.baidu.unbiz.common.genericdao.annotation.Column;
import com.baidu.unbiz.common.genericdao.annotation.Table;
import com.github.knightliao.apollo.db.bo.BaseObject;

import lombok.Data;

//edit by hetw25334 修改表名信息 原先为config_history 现在为disconf_config_history
@Data
@Table(db = DB.DB_NAME, name = "disconf_config_history", keyColumn = "id")
public class ConfigHistory extends BaseObject<Long> {

    /**
     *
     */
    @Column(value = Columns.CONFIG_ID)
    private Long configId;

    /**
     *
     */
    @Column(value = "old_value")
    private String oldValue;

    /**
     *
     */
    @Column(value = "new_value")
    private String newValue;

    /**
     * 创建时间
     */
    @Column(value = Columns.CREATE_TIME)
    private String createTime;

    /**
     *
     */
    @Column(value = Columns.UPDATE_BY)
    private Long updateBy;

}
