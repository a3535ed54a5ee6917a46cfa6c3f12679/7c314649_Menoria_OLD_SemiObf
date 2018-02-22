import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufProcessor;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

// $FF: renamed from: d
public class class_112 extends ByteBuf {

   // $FF: renamed from: b io.netty.buffer.ByteBuf
   private final ByteBuf field_206;
   // $FF: renamed from: c java.lang.String
   private static final String field_207;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_208;


   // $FF: renamed from: <init> (io.netty.buffer.ByteBuf) void
   public void method_516(ByteBuf var1) {
      super();
      this.field_206 = var1;
   }

   // $FF: renamed from: b (int) int
   public static int method_517(int param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () int
   public int method_518() {
      int var1 = 0;
      int var2 = 0;

      byte var3;
      do {
         var3 = this.readByte();
         var1 |= (var3 & 127) << var2++ * 7;
         if(var2 > 5) {
            RuntimeException var10000 = new RuntimeException("VarInt too big");
            String[] var4 = field_208;
            throw var10000;
         }
      } while((var3 & 128) == 128);

      return var1;
   }

   // $FF: renamed from: c (int) void
   public void method_519(int var1) {
      String[] var2 = class_752.method_4253();

      while(true) {
         if((var1 & -128) != 0) {
            this.writeByte(var1 & 127 | 128);
            var1 >>>= 7;

            try {
               if(var2 == null) {
                  break;
               }

               if(var2 != null) {
                  continue;
               }
            } catch (RuntimeException var3) {
               throw method_526(var3);
            }
         }

         this.writeByte(var1);
         break;
      }

   }

   // $FF: renamed from: b (ro) void
   public void method_520(class_1583 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () ro
   public class_1583 method_521() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (add) void
   public void method_522(add param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () add
   public add method_523() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d (int) java.lang.String
   public String method_524(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_525(String param1) {
      // $FF: Couldn't be decompiled
   }

   public int capacity() {
      return this.field_206.capacity();
   }

   public ByteBuf capacity(int var1) {
      return this.field_206.capacity(var1);
   }

   public int maxCapacity() {
      return this.field_206.maxCapacity();
   }

   public ByteBufAllocator alloc() {
      return this.field_206.alloc();
   }

   public ByteOrder order() {
      return this.field_206.order();
   }

   public ByteBuf order(ByteOrder var1) {
      return this.field_206.order(var1);
   }

   public ByteBuf unwrap() {
      return this.field_206.unwrap();
   }

   public boolean isDirect() {
      return this.field_206.isDirect();
   }

   public int readerIndex() {
      return this.field_206.readerIndex();
   }

   public ByteBuf readerIndex(int var1) {
      return this.field_206.readerIndex(var1);
   }

   public int writerIndex() {
      return this.field_206.writerIndex();
   }

   public ByteBuf writerIndex(int var1) {
      return this.field_206.writerIndex(var1);
   }

   public ByteBuf setIndex(int var1, int var2) {
      return this.field_206.setIndex(var1, var2);
   }

   public int readableBytes() {
      return this.field_206.readableBytes();
   }

   public int writableBytes() {
      return this.field_206.writableBytes();
   }

   public int maxWritableBytes() {
      return this.field_206.maxWritableBytes();
   }

   public boolean isReadable() {
      return this.field_206.isReadable();
   }

   public boolean isReadable(int var1) {
      return this.field_206.isReadable(var1);
   }

   public boolean isWritable() {
      return this.field_206.isWritable();
   }

   public boolean isWritable(int var1) {
      return this.field_206.isWritable(var1);
   }

   public ByteBuf clear() {
      return this.field_206.clear();
   }

   public ByteBuf markReaderIndex() {
      return this.field_206.markReaderIndex();
   }

   public ByteBuf resetReaderIndex() {
      return this.field_206.resetReaderIndex();
   }

   public ByteBuf markWriterIndex() {
      return this.field_206.markWriterIndex();
   }

   public ByteBuf resetWriterIndex() {
      return this.field_206.resetWriterIndex();
   }

   public ByteBuf discardReadBytes() {
      return this.field_206.discardReadBytes();
   }

   public ByteBuf discardSomeReadBytes() {
      return this.field_206.discardSomeReadBytes();
   }

   public ByteBuf ensureWritable(int var1) {
      return this.field_206.ensureWritable(var1);
   }

   public int ensureWritable(int var1, boolean var2) {
      return this.field_206.ensureWritable(var1, var2);
   }

   public boolean getBoolean(int var1) {
      return this.field_206.getBoolean(var1);
   }

   public byte getByte(int var1) {
      return this.field_206.getByte(var1);
   }

   public short getUnsignedByte(int var1) {
      return this.field_206.getUnsignedByte(var1);
   }

   public short getShort(int var1) {
      return this.field_206.getShort(var1);
   }

   public int getUnsignedShort(int var1) {
      return this.field_206.getUnsignedShort(var1);
   }

   public int getMedium(int var1) {
      return this.field_206.getMedium(var1);
   }

   public int getUnsignedMedium(int var1) {
      return this.field_206.getUnsignedMedium(var1);
   }

   public int getInt(int var1) {
      return this.field_206.getInt(var1);
   }

   public long getUnsignedInt(int var1) {
      return this.field_206.getUnsignedInt(var1);
   }

   public long getLong(int var1) {
      return this.field_206.getLong(var1);
   }

   public char getChar(int var1) {
      return this.field_206.getChar(var1);
   }

   public float getFloat(int var1) {
      return this.field_206.getFloat(var1);
   }

   public double getDouble(int var1) {
      return this.field_206.getDouble(var1);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2) {
      return this.field_206.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3) {
      return this.field_206.getBytes(var1, var2, var3);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.field_206.getBytes(var1, var2, var3, var4);
   }

   public ByteBuf getBytes(int var1, byte[] var2) {
      return this.field_206.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, byte[] var2, int var3, int var4) {
      return this.field_206.getBytes(var1, var2, var3, var4);
   }

   public ByteBuf getBytes(int var1, ByteBuffer var2) {
      return this.field_206.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, OutputStream var2, int var3) {
      return this.field_206.getBytes(var1, var2, var3);
   }

   public int getBytes(int var1, GatheringByteChannel var2, int var3) {
      return this.field_206.getBytes(var1, var2, var3);
   }

   public ByteBuf setBoolean(int var1, boolean var2) {
      return this.field_206.setBoolean(var1, var2);
   }

   public ByteBuf setByte(int var1, int var2) {
      return this.field_206.setByte(var1, var2);
   }

   public ByteBuf setShort(int var1, int var2) {
      return this.field_206.setShort(var1, var2);
   }

   public ByteBuf setMedium(int var1, int var2) {
      return this.field_206.setMedium(var1, var2);
   }

   public ByteBuf setInt(int var1, int var2) {
      return this.field_206.setInt(var1, var2);
   }

   public ByteBuf setLong(int var1, long var2) {
      return this.field_206.setLong(var1, var2);
   }

   public ByteBuf setChar(int var1, int var2) {
      return this.field_206.setChar(var1, var2);
   }

   public ByteBuf setFloat(int var1, float var2) {
      return this.field_206.setFloat(var1, var2);
   }

   public ByteBuf setDouble(int var1, double var2) {
      return this.field_206.setDouble(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2) {
      return this.field_206.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3) {
      return this.field_206.setBytes(var1, var2, var3);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.field_206.setBytes(var1, var2, var3, var4);
   }

   public ByteBuf setBytes(int var1, byte[] var2) {
      return this.field_206.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, byte[] var2, int var3, int var4) {
      return this.field_206.setBytes(var1, var2, var3, var4);
   }

   public ByteBuf setBytes(int var1, ByteBuffer var2) {
      return this.field_206.setBytes(var1, var2);
   }

   public int setBytes(int var1, InputStream var2, int var3) {
      return this.field_206.setBytes(var1, var2, var3);
   }

   public int setBytes(int var1, ScatteringByteChannel var2, int var3) {
      return this.field_206.setBytes(var1, var2, var3);
   }

   public ByteBuf setZero(int var1, int var2) {
      return this.field_206.setZero(var1, var2);
   }

   public boolean readBoolean() {
      return this.field_206.readBoolean();
   }

   public byte readByte() {
      return this.field_206.readByte();
   }

   public short readUnsignedByte() {
      return this.field_206.readUnsignedByte();
   }

   public short readShort() {
      return this.field_206.readShort();
   }

   public int readUnsignedShort() {
      return this.field_206.readUnsignedShort();
   }

   public int readMedium() {
      return this.field_206.readMedium();
   }

   public int readUnsignedMedium() {
      return this.field_206.readUnsignedMedium();
   }

   public int readInt() {
      return this.field_206.readInt();
   }

   public long readUnsignedInt() {
      return this.field_206.readUnsignedInt();
   }

   public long readLong() {
      return this.field_206.readLong();
   }

   public char readChar() {
      return this.field_206.readChar();
   }

   public float readFloat() {
      return this.field_206.readFloat();
   }

   public double readDouble() {
      return this.field_206.readDouble();
   }

   public ByteBuf readBytes(int var1) {
      return this.field_206.readBytes(var1);
   }

   public ByteBuf readSlice(int var1) {
      return this.field_206.readSlice(var1);
   }

   public ByteBuf readBytes(ByteBuf var1) {
      return this.field_206.readBytes(var1);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2) {
      return this.field_206.readBytes(var1, var2);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2, int var3) {
      return this.field_206.readBytes(var1, var2, var3);
   }

   public ByteBuf readBytes(byte[] var1) {
      return this.field_206.readBytes(var1);
   }

   public ByteBuf readBytes(byte[] var1, int var2, int var3) {
      return this.field_206.readBytes(var1, var2, var3);
   }

   public ByteBuf readBytes(ByteBuffer var1) {
      return this.field_206.readBytes(var1);
   }

   public ByteBuf readBytes(OutputStream var1, int var2) {
      return this.field_206.readBytes(var1, var2);
   }

   public int readBytes(GatheringByteChannel var1, int var2) {
      return this.field_206.readBytes(var1, var2);
   }

   public ByteBuf skipBytes(int var1) {
      return this.field_206.skipBytes(var1);
   }

   public ByteBuf writeBoolean(boolean var1) {
      return this.field_206.writeBoolean(var1);
   }

   public ByteBuf writeByte(int var1) {
      return this.field_206.writeByte(var1);
   }

   public ByteBuf writeShort(int var1) {
      return this.field_206.writeShort(var1);
   }

   public ByteBuf writeMedium(int var1) {
      return this.field_206.writeMedium(var1);
   }

   public ByteBuf writeInt(int var1) {
      return this.field_206.writeInt(var1);
   }

   public ByteBuf writeLong(long var1) {
      return this.field_206.writeLong(var1);
   }

   public ByteBuf writeChar(int var1) {
      return this.field_206.writeChar(var1);
   }

   public ByteBuf writeFloat(float var1) {
      return this.field_206.writeFloat(var1);
   }

   public ByteBuf writeDouble(double var1) {
      return this.field_206.writeDouble(var1);
   }

   public ByteBuf writeBytes(ByteBuf var1) {
      return this.field_206.writeBytes(var1);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2) {
      return this.field_206.writeBytes(var1, var2);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2, int var3) {
      return this.field_206.writeBytes(var1, var2, var3);
   }

   public ByteBuf writeBytes(byte[] var1) {
      return this.field_206.writeBytes(var1);
   }

   public ByteBuf writeBytes(byte[] var1, int var2, int var3) {
      return this.field_206.writeBytes(var1, var2, var3);
   }

   public ByteBuf writeBytes(ByteBuffer var1) {
      return this.field_206.writeBytes(var1);
   }

   public int writeBytes(InputStream var1, int var2) {
      return this.field_206.writeBytes(var1, var2);
   }

   public int writeBytes(ScatteringByteChannel var1, int var2) {
      return this.field_206.writeBytes(var1, var2);
   }

   public ByteBuf writeZero(int var1) {
      return this.field_206.writeZero(var1);
   }

   public int indexOf(int var1, int var2, byte var3) {
      return this.field_206.indexOf(var1, var2, var3);
   }

   public int bytesBefore(byte var1) {
      return this.field_206.bytesBefore(var1);
   }

   public int bytesBefore(int var1, byte var2) {
      return this.field_206.bytesBefore(var1, var2);
   }

   public int bytesBefore(int var1, int var2, byte var3) {
      return this.field_206.bytesBefore(var1, var2, var3);
   }

   public int forEachByte(ByteBufProcessor var1) {
      return this.field_206.forEachByte(var1);
   }

   public int forEachByte(int var1, int var2, ByteBufProcessor var3) {
      return this.field_206.forEachByte(var1, var2, var3);
   }

   public int forEachByteDesc(ByteBufProcessor var1) {
      return this.field_206.forEachByteDesc(var1);
   }

   public int forEachByteDesc(int var1, int var2, ByteBufProcessor var3) {
      return this.field_206.forEachByteDesc(var1, var2, var3);
   }

   public ByteBuf copy() {
      return this.field_206.copy();
   }

   public ByteBuf copy(int var1, int var2) {
      return this.field_206.copy(var1, var2);
   }

   public ByteBuf slice() {
      return this.field_206.slice();
   }

   public ByteBuf slice(int var1, int var2) {
      return this.field_206.slice(var1, var2);
   }

   public ByteBuf duplicate() {
      return this.field_206.duplicate();
   }

   public int nioBufferCount() {
      return this.field_206.nioBufferCount();
   }

   public ByteBuffer nioBuffer() {
      return this.field_206.nioBuffer();
   }

   public ByteBuffer nioBuffer(int var1, int var2) {
      return this.field_206.nioBuffer(var1, var2);
   }

   public ByteBuffer internalNioBuffer(int var1, int var2) {
      return this.field_206.internalNioBuffer(var1, var2);
   }

   public ByteBuffer[] nioBuffers() {
      return this.field_206.nioBuffers();
   }

   public ByteBuffer[] nioBuffers(int var1, int var2) {
      return this.field_206.nioBuffers(var1, var2);
   }

   public boolean hasArray() {
      return this.field_206.hasArray();
   }

   public byte[] array() {
      return this.field_206.array();
   }

   public int arrayOffset() {
      return this.field_206.arrayOffset();
   }

   public boolean hasMemoryAddress() {
      return this.field_206.hasMemoryAddress();
   }

   public long memoryAddress() {
      return this.field_206.memoryAddress();
   }

   public String toString(Charset var1) {
      return this.field_206.toString(var1);
   }

   public String toString(int var1, int var2, Charset var3) {
      return this.field_206.toString(var1, var2, var3);
   }

   public int hashCode() {
      return this.field_206.hashCode();
   }

   public boolean equals(Object var1) {
      return this.field_206.equals(var1);
   }

   public int compareTo(ByteBuf var1) {
      return this.field_206.compareTo(var1);
   }

   public String toString() {
      return this.field_206.toString();
   }

   public ByteBuf retain(int var1) {
      return this.field_206.retain(var1);
   }

   public ByteBuf retain() {
      return this.field_206.retain();
   }

   public int refCnt() {
      return this.field_206.refCnt();
   }

   public boolean release() {
      return this.field_206.release();
   }

   public boolean release(int var1) {
      return this.field_206.release(var1);
   }

   // $FF: renamed from: b (java.lang.RuntimeException) java.lang.RuntimeException
   private static RuntimeException method_526(RuntimeException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_527() {
      // $FF: Couldn't be decompiled
   }
}
