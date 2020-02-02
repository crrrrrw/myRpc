package com.crw.rpc.registry;

public class DefaultServiceDiscovery implements ServiceDiscovery {
    @Override
    public String discover(String serviceName) {
        return "localhost:9000";
    }
}
