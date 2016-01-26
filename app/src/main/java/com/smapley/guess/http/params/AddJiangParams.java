package com.smapley.guess.http.params;

import com.smapley.guess.utils.MyData;

import org.xutils.http.RequestParams;

/**
 * Created by smapley on 16/1/25.
 */
public class AddJiangParams extends RequestParams {

    public AddJiangParams(String user1, String mi,String onlyid,String shuzu) {
        super(MyData.URL_addjiang);
        addBodyParameter("user1", user1);
        addBodyParameter("mi", mi);
        addBodyParameter("onlyid", onlyid);
        addBodyParameter("shuzu", shuzu);
    }
}
