package com.liujc.greendao;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.liujc.greendao.dao.DaoMaster;
import com.liujc.greendao.dao.DaoSession;

/**
 * 类名称：MyApplication
 * 创建者：Create by liujc
 * 创建时间：Create on 2016/12/1 14:57
 * 描述：TODO
 * 最近修改时间：2016/12/1 14:57
 * 修改人：Modify by liujc
 */
public class MyApplication extends Application{
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        //greenDao全局配置,只希望有一个数据库操作对象
        GreenDaoManager.getInstance();
    }

    public static Context getContext(){
        return context;
    }

}
