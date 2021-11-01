package top.xkk.netty.demo.client;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.handler.codec.string.StringDecoder;

import java.nio.charset.StandardCharsets;

public class MyChannelInitializer extends ChannelInitializer<NioDatagramChannel> {

    @Override
    protected void initChannel(NioDatagramChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        // 解码转String，注意调整自己的编码格式
        pipeline.addLast("stringDecoder", new StringDecoder(StandardCharsets.UTF_8));
        pipeline.addLast(new MyClientHandler());
    }

}
