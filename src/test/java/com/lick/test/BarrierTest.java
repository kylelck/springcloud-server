package com.lick.test;

import com.google.gson.Gson;
import com.lick.SpringcloudServerApplicationTests;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.Arrays;
import java.util.List;

/**
 * @description：
 * @author: lick
 * @date: 2017年12月07日 16:36
 * @copyright: 版权归lick所有
 */
public class BarrierTest extends SpringcloudServerApplicationTests {

    private ThreadPoolTaskExecutor executor1;
    @Test
    public void CellTest(){
        List<String> ids = Arrays.asList(new String[]{"36","43","35"});
        System.out.println(new Gson().toJson(ids));
    }

    public static String getIndexOf(String linkUrl,String type) {
        final String DEFAULT_EMPTY = "";
        try {
            if (StringUtils.isBlank(linkUrl)) {
                return DEFAULT_EMPTY;
            }
            if (StringUtils.isBlank(type)) {
                return linkUrl;
            }
            int pos = linkUrl.indexOf(type);
            if (pos < 0) {
                return DEFAULT_EMPTY;
            }
            int pos_char = linkUrl.indexOf("&", pos + type.length() + 1);
            if (pos_char >= 0) {
                return linkUrl.substring(pos + type.length() + 1, pos_char);
            }
            return linkUrl.substring(pos+type.length()+1);
        }catch (Exception e){
            return "";
        }
    }
}
