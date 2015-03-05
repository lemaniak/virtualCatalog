package com.codgen.virtualcatalog.api.util;



import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.util.Date;

/**
 * Created by vicente on 14/12/14.
 */

@Singleton
@Startup
public class StartupBean {

//    @Inject
//    private StoreCreateBean storeCreateBean;
//    @Inject
//    private StoreUserCreateBean storeUserCreateBean;
//    @Inject
//    private StoreUserFinderBean storeUserFinderBean;
//    @Inject
//    private StoreFinderBean storeFinderBean;
//    @Inject
//    private CryptoUtils cryptoUtils;

    @PostConstruct
    private void startup() {
//        String userEmail=Utils.getProperty("storeEmail");
//        if(storeFinderBean.getStoreCount()==0 && !storeUserFinderBean.existsEmail(userEmail)){//create store if not exists
//            Store store = new Store();
//            store.setName(Utils.getProperty("storeName"));
//            store.setEmail(userEmail);
//            store.setPhone(Utils.getProperty("storePhone"));
//            store.setFacebook(Utils.getProperty("store.facebook"));
//            store.setTwitter(Utils.getProperty("store.twitter"));
//            store.setPinterest(Utils.getProperty("store.pinterest"));
//            store.setYoutube(Utils.getProperty("store.youtube"));
//            storeCreateBean.create(store);
//            StoreUser storeUser = new StoreUser();
//            storeUser.setEmail(Utils.getProperty("user.email"));
//            storeUser.setName(Utils.getProperty("user.name"));
//            storeUser.setLastName(Utils.getProperty("user.lastname"));
//            storeUser.setPassword(cryptoUtils.encrypt(Utils.getProperty("user.password")));
//            storeUser.setActive(true);
//            if(Utils.getProperty("user.sex")== SexType.FEMALE.getValue()){
//                storeUser.setSexType(SexType.FEMALE);
//            }else {
//                storeUser.setSexType(SexType.MALE);
//            }
//            storeUser.setCreatedAt(new Date());
//            storeUser.setUserType(UserType.ADMIN);
//            storeUserCreateBean.create(storeUser);
        }
    }

