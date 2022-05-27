package com.muguang;

import com.muguang.annotation.RpcReference;
import org.springframework.stereotype.Component;

/**
 * @author smile2coder
 */
@Component
public class HelloController {

    @RpcReference(version = "version1", group = "test1")
    private HelloService helloService;

    public void test() throws InterruptedException {
//        String hello = this.helloService.hello(new Hello("111", "222"));
//        如需使用 assert 断言，需要在 VM options 添加参数：-ea
//        assert "Hello description is 222".equals(hello);

        // 失败可能是因为 zookeeper 的服务无效，需要重新注册一下
        for (int i = 0; i < 10; i++) {
            System.out.println(helloService.hello(new Hello("111", "222")));
        }
    }
}
