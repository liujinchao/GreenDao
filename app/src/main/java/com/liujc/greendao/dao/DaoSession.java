package com.liujc.greendao.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.liujc.greendao.Bean.Profession;
import com.liujc.greendao.Bean.User;
import com.liujc.greendao.Bean.LTest;

import com.liujc.greendao.dao.ProfessionDao;
import com.liujc.greendao.dao.UserDao;
import com.liujc.greendao.dao.LTestDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig professionDaoConfig;
    private final DaoConfig userDaoConfig;
    private final DaoConfig lTestDaoConfig;

    private final ProfessionDao professionDao;
    private final UserDao userDao;
    private final LTestDao lTestDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        professionDaoConfig = daoConfigMap.get(ProfessionDao.class).clone();
        professionDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        lTestDaoConfig = daoConfigMap.get(LTestDao.class).clone();
        lTestDaoConfig.initIdentityScope(type);

        professionDao = new ProfessionDao(professionDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);
        lTestDao = new LTestDao(lTestDaoConfig, this);

        registerDao(Profession.class, professionDao);
        registerDao(User.class, userDao);
        registerDao(LTest.class, lTestDao);
    }
    
    public void clear() {
        professionDaoConfig.clearIdentityScope();
        userDaoConfig.clearIdentityScope();
        lTestDaoConfig.clearIdentityScope();
    }

    public ProfessionDao getProfessionDao() {
        return professionDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public LTestDao getLTestDao() {
        return lTestDao;
    }

}