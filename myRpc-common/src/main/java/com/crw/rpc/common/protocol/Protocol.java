package com.crw.rpc.common.protocol;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 协议分为 header 和 body 两部分
 * 协议头：
 * - 固定部分：
 * - 魔数: 0~15 bit
 * - 数据长度: 16~47 bit
 * - 头长度：48~63 bit
 * - 协议版本：64~71 bit
 * - 消息类型：72~79 bit
 * - 序列化方法：80~87 bit
 * - 消息id：88~151 bit
 * - 不固定部分：协议头扩展字段
 * 协议体：payload
 */
@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Protocol {

    /**
     * 魔数: 0~15 bit
     */
    private Short magicNumber;

    /**
     * 数据长度: 16~47 bit
     */
    private Long dataLength;

    /**
     * 头长度：48~63 bit
     */
    private Integer headerLength;

    /**
     * 协议版本：64~71 bit
     */
    private Byte version;

    /**
     * 消息类型：72~79 bit
     */
    private Byte msgType;

    /**
     * 序列化方法：80~87 bit
     */
    private Byte serializeMethod;

    /**
     * 请求id：88~151 bit
     */
    private AtomicLong reqId;


    /**
     * 协议头扩展字段
     */
    private Map<String, String> extra;

    /**
     * 消息体
     */
    private byte[] payload;


    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }
}
