package top.xkk.netty.demo.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import top.xkk.netty.demo.util.MsgUtil;

public class NettyClient {

    public static void main(String[] args) {
        new NettyClient().connect("127.0.0.1", 7397);
    }

    private void connect(String host, int port) {
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(workerGroup);
            b.channel(NioSocketChannel.class);
            b.option(ChannelOption.AUTO_READ, true);
            b.handler(new MyChannelInitializer());
            ChannelFuture f = b.connect(host, port).sync();
            System.out.println("Netty客户端启动！");

            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "使用protobuf通信格式的服务端，开到荼蘼InfinityX7"));
            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "使用protobuf通信格式的服务端，开到荼蘼InfinityX7"));
            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "使用protobuf通信格式的服务端，开到荼蘼InfinityX7"));
            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "使用protobuf通信格式的服务端，开到荼蘼InfinityX7"));
            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "使用protobuf通信格式的服务端，开到荼蘼InfinityX7"));
            f.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            workerGroup.shutdownGracefully();
        }
    }

}
