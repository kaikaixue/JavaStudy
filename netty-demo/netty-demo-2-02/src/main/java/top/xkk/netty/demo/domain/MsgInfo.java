// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Msg.proto

package top.xkk.netty.demo.domain;

public final class MsgInfo {
  private MsgInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_top_xkk_netty_domain_MsgBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_top_xkk_netty_domain_MsgBody_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\tMsg.proto\022\024top.xkk.netty.domain\"-\n\007Msg" +
      "Body\022\021\n\tchannelId\030\001 \001(\t\022\017\n\007msgInfo\030\002 \001(\t" +
      "B&\n\031top.xkk.netty.demo.domainB\007MsgInfoP\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_top_xkk_netty_domain_MsgBody_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_top_xkk_netty_domain_MsgBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_top_xkk_netty_domain_MsgBody_descriptor,
        new String[] { "ChannelId", "MsgInfo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
