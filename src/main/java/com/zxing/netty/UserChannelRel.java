package com.zxing.netty;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import io.netty.channel.Channel;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description: 用户id和channel的关联关系处理
 */
@Slf4j
public class UserChannelRel {

    private static Map<String, Channel> manager = new ConcurrentHashMap<>();

    public static void put(String senderId, Channel channel) {
        manager.put(senderId, channel);
    }

    public static Channel get(String senderId) {
        return manager.get(senderId);
    }

    public static void output() {
        for (Map.Entry<String, Channel> entry : manager.entrySet()) {
            log.info("UserId: {}, ChannelId: {}", entry.getKey(), entry.getValue().id().asLongText());
        }
    }
}
