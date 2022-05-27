package github.javaguide.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RpcConfigEnum {

    // rpc配置
    RPC_CONFIG_PATH("rpc.properties"),
    // zookeeper 地址
    ZK_ADDRESS("rpc.zookeeper.address");

    private final String propertyValue;

}
