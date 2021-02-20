package com.mys.my.zhanglao.wx.miniapp;

import com.mys.my.zhanglao.wx.miniapp.WxMaDemoApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试基类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = WxMaDemoApplication.class)
public abstract class BaseSpringBootTest {

    private long time;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Before
    public void setUp() throws Exception {
        this.setTime(System.currentTimeMillis());
        System.out.println("==> 测试开始执行 <==");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("==> 测试执行完成，耗时：{} <==" +
                (System.currentTimeMillis() - this.getTime()));
    }

}
