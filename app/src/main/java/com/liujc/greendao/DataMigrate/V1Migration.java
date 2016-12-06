package com.liujc.greendao.DataMigrate;

import android.database.sqlite.SQLiteDatabase;

/**
 * 类名称：V1Migration
 * 创建者：Create by liujc
 * 创建时间：Create on 2016/12/5 16:28
 * 描述：针对V1版本数据库升级逻辑
 * 最近修改时间：2016/12/5 16:28
 * 修改人：Modify by liujc
 */
public class V1Migration implements Migration{
    @Override
    public void migrate(SQLiteDatabase db) {
        db.execSQL("ALTER TABLE USER ADD COLUMN remark");
    }
}
