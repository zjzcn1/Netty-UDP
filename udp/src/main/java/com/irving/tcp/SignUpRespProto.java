// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sign_up_resp_proto.proto

package com.irving.tcp;

public final class SignUpRespProto {
  private SignUpRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SignUpRespOrBuilder extends
      // @@protoc_insertion_point(interface_extends:tcp.SignUpResp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 请求Id
     * </pre>
     *
     * <code>int32 reqId = 1;</code>
     */
    int getReqId();

    /**
     * <pre>
     *状态码
     * </pre>
     *
     * <code>int32 statusCode = 2;</code>
     */
    int getStatusCode();

    /**
     * <pre>
     *结果信息
     * </pre>
     *
     * <code>string resultMsg = 3;</code>
     */
    java.lang.String getResultMsg();
    /**
     * <pre>
     *结果信息
     * </pre>
     *
     * <code>string resultMsg = 3;</code>
     */
    com.google.protobuf.ByteString
        getResultMsgBytes();
  }
  /**
   * Protobuf type {@code tcp.SignUpResp}
   */
  public  static final class SignUpResp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:tcp.SignUpResp)
      SignUpRespOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SignUpResp.newBuilder() to construct.
    private SignUpResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SignUpResp() {
      reqId_ = 0;
      statusCode_ = 0;
      resultMsg_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SignUpResp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              reqId_ = input.readInt32();
              break;
            }
            case 16: {

              statusCode_ = input.readInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              resultMsg_ = s;
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.irving.tcp.SignUpRespProto.internal_static_tcp_SignUpResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.irving.tcp.SignUpRespProto.internal_static_tcp_SignUpResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.irving.tcp.SignUpRespProto.SignUpResp.class, com.irving.tcp.SignUpRespProto.SignUpResp.Builder.class);
    }

    public static final int REQID_FIELD_NUMBER = 1;
    private int reqId_;
    /**
     * <pre>
     * 请求Id
     * </pre>
     *
     * <code>int32 reqId = 1;</code>
     */
    public int getReqId() {
      return reqId_;
    }

    public static final int STATUSCODE_FIELD_NUMBER = 2;
    private int statusCode_;
    /**
     * <pre>
     *状态码
     * </pre>
     *
     * <code>int32 statusCode = 2;</code>
     */
    public int getStatusCode() {
      return statusCode_;
    }

    public static final int RESULTMSG_FIELD_NUMBER = 3;
    private volatile java.lang.Object resultMsg_;
    /**
     * <pre>
     *结果信息
     * </pre>
     *
     * <code>string resultMsg = 3;</code>
     */
    public java.lang.String getResultMsg() {
      java.lang.Object ref = resultMsg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resultMsg_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *结果信息
     * </pre>
     *
     * <code>string resultMsg = 3;</code>
     */
    public com.google.protobuf.ByteString
        getResultMsgBytes() {
      java.lang.Object ref = resultMsg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resultMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (reqId_ != 0) {
        output.writeInt32(1, reqId_);
      }
      if (statusCode_ != 0) {
        output.writeInt32(2, statusCode_);
      }
      if (!getResultMsgBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, resultMsg_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reqId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, reqId_);
      }
      if (statusCode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, statusCode_);
      }
      if (!getResultMsgBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, resultMsg_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.irving.tcp.SignUpRespProto.SignUpResp)) {
        return super.equals(obj);
      }
      com.irving.tcp.SignUpRespProto.SignUpResp other = (com.irving.tcp.SignUpRespProto.SignUpResp) obj;

      boolean result = true;
      result = result && (getReqId()
          == other.getReqId());
      result = result && (getStatusCode()
          == other.getStatusCode());
      result = result && getResultMsg()
          .equals(other.getResultMsg());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + REQID_FIELD_NUMBER;
      hash = (53 * hash) + getReqId();
      hash = (37 * hash) + STATUSCODE_FIELD_NUMBER;
      hash = (53 * hash) + getStatusCode();
      hash = (37 * hash) + RESULTMSG_FIELD_NUMBER;
      hash = (53 * hash) + getResultMsg().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.irving.tcp.SignUpRespProto.SignUpResp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.irving.tcp.SignUpRespProto.SignUpResp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.irving.tcp.SignUpRespProto.SignUpResp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.irving.tcp.SignUpRespProto.SignUpResp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.irving.tcp.SignUpRespProto.SignUpResp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.irving.tcp.SignUpRespProto.SignUpResp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.irving.tcp.SignUpRespProto.SignUpResp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.irving.tcp.SignUpRespProto.SignUpResp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.irving.tcp.SignUpRespProto.SignUpResp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.irving.tcp.SignUpRespProto.SignUpResp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.irving.tcp.SignUpRespProto.SignUpResp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.irving.tcp.SignUpRespProto.SignUpResp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.irving.tcp.SignUpRespProto.SignUpResp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code tcp.SignUpResp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tcp.SignUpResp)
        com.irving.tcp.SignUpRespProto.SignUpRespOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.irving.tcp.SignUpRespProto.internal_static_tcp_SignUpResp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.irving.tcp.SignUpRespProto.internal_static_tcp_SignUpResp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.irving.tcp.SignUpRespProto.SignUpResp.class, com.irving.tcp.SignUpRespProto.SignUpResp.Builder.class);
      }

      // Construct using com.irving.tcp.SignUpRespProto.SignUpResp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        reqId_ = 0;

        statusCode_ = 0;

        resultMsg_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.irving.tcp.SignUpRespProto.internal_static_tcp_SignUpResp_descriptor;
      }

      @java.lang.Override
      public com.irving.tcp.SignUpRespProto.SignUpResp getDefaultInstanceForType() {
        return com.irving.tcp.SignUpRespProto.SignUpResp.getDefaultInstance();
      }

      @java.lang.Override
      public com.irving.tcp.SignUpRespProto.SignUpResp build() {
        com.irving.tcp.SignUpRespProto.SignUpResp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.irving.tcp.SignUpRespProto.SignUpResp buildPartial() {
        com.irving.tcp.SignUpRespProto.SignUpResp result = new com.irving.tcp.SignUpRespProto.SignUpResp(this);
        result.reqId_ = reqId_;
        result.statusCode_ = statusCode_;
        result.resultMsg_ = resultMsg_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.irving.tcp.SignUpRespProto.SignUpResp) {
          return mergeFrom((com.irving.tcp.SignUpRespProto.SignUpResp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.irving.tcp.SignUpRespProto.SignUpResp other) {
        if (other == com.irving.tcp.SignUpRespProto.SignUpResp.getDefaultInstance()) return this;
        if (other.getReqId() != 0) {
          setReqId(other.getReqId());
        }
        if (other.getStatusCode() != 0) {
          setStatusCode(other.getStatusCode());
        }
        if (!other.getResultMsg().isEmpty()) {
          resultMsg_ = other.resultMsg_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.irving.tcp.SignUpRespProto.SignUpResp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.irving.tcp.SignUpRespProto.SignUpResp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int reqId_ ;
      /**
       * <pre>
       * 请求Id
       * </pre>
       *
       * <code>int32 reqId = 1;</code>
       */
      public int getReqId() {
        return reqId_;
      }
      /**
       * <pre>
       * 请求Id
       * </pre>
       *
       * <code>int32 reqId = 1;</code>
       */
      public Builder setReqId(int value) {
        
        reqId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 请求Id
       * </pre>
       *
       * <code>int32 reqId = 1;</code>
       */
      public Builder clearReqId() {
        
        reqId_ = 0;
        onChanged();
        return this;
      }

      private int statusCode_ ;
      /**
       * <pre>
       *状态码
       * </pre>
       *
       * <code>int32 statusCode = 2;</code>
       */
      public int getStatusCode() {
        return statusCode_;
      }
      /**
       * <pre>
       *状态码
       * </pre>
       *
       * <code>int32 statusCode = 2;</code>
       */
      public Builder setStatusCode(int value) {
        
        statusCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *状态码
       * </pre>
       *
       * <code>int32 statusCode = 2;</code>
       */
      public Builder clearStatusCode() {
        
        statusCode_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object resultMsg_ = "";
      /**
       * <pre>
       *结果信息
       * </pre>
       *
       * <code>string resultMsg = 3;</code>
       */
      public java.lang.String getResultMsg() {
        java.lang.Object ref = resultMsg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          resultMsg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *结果信息
       * </pre>
       *
       * <code>string resultMsg = 3;</code>
       */
      public com.google.protobuf.ByteString
          getResultMsgBytes() {
        java.lang.Object ref = resultMsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          resultMsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *结果信息
       * </pre>
       *
       * <code>string resultMsg = 3;</code>
       */
      public Builder setResultMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        resultMsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *结果信息
       * </pre>
       *
       * <code>string resultMsg = 3;</code>
       */
      public Builder clearResultMsg() {
        
        resultMsg_ = getDefaultInstance().getResultMsg();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *结果信息
       * </pre>
       *
       * <code>string resultMsg = 3;</code>
       */
      public Builder setResultMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        resultMsg_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:tcp.SignUpResp)
    }

    // @@protoc_insertion_point(class_scope:tcp.SignUpResp)
    private static final com.irving.tcp.SignUpRespProto.SignUpResp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.irving.tcp.SignUpRespProto.SignUpResp();
    }

    public static com.irving.tcp.SignUpRespProto.SignUpResp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SignUpResp>
        PARSER = new com.google.protobuf.AbstractParser<SignUpResp>() {
      @java.lang.Override
      public SignUpResp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SignUpResp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SignUpResp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SignUpResp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.irving.tcp.SignUpRespProto.SignUpResp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tcp_SignUpResp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tcp_SignUpResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030sign_up_resp_proto.proto\022\003tcp\"B\n\nSignU" +
      "pResp\022\r\n\005reqId\030\001 \001(\005\022\022\n\nstatusCode\030\002 \001(\005" +
      "\022\021\n\tresultMsg\030\003 \001(\tB!\n\016com.irving.tcpB\017S" +
      "ignUpRespProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_tcp_SignUpResp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tcp_SignUpResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tcp_SignUpResp_descriptor,
        new java.lang.String[] { "ReqId", "StatusCode", "ResultMsg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
