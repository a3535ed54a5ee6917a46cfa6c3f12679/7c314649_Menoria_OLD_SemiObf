import com.google.common.collect.BiMap;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: r1
public abstract class class_250 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_1379;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_1380;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super();
   }

   // $FF: renamed from: b (com.google.common.collect.BiMap, int) r1
   public static class_250 method_1450(BiMap var0, int var1) {
      String[] var2 = class_752.method_4253();

      try {
         Class var3 = (Class)var0.get(Integer.valueOf(var1));

         Object var6;
         try {
            var6 = var3;
            if(var2 == null) {
               return (class_250)var6;
            }

            if(var3 == null) {
               return null;
            }
         } catch (Exception var4) {
            throw method_1459(var4);
         }

         var6 = var3.newInstance();
         return (class_250)var6;
      } catch (Exception var5) {
         Logger var10000 = field_1379;
         StringBuilder var10001 = new StringBuilder();
         String[] var10002 = field_1380;
         var10000.error(var10001.append("Couldn\'t create packet ").append(var1).toString(), var5);
         return null;
      }
   }

   // $FF: renamed from: b (io.netty.buffer.ByteBuf, byte[]) void
   public static void method_1451(ByteBuf var0, byte[] var1) {
      var0.writeShort(var1.length);
      var0.writeBytes(var1);
   }

   // $FF: renamed from: b (io.netty.buffer.ByteBuf) byte[]
   public static byte[] method_1452(ByteBuf var0) {
      String[] var10000 = class_752.method_4253();
      short var2 = var0.readShort();
      String[] var1 = var10000;
      short var4 = var2;
      if(var1 != null) {
         if(var2 < 0) {
            IOException var5 = new IOException("Key was smaller than nothing!  Weird key!");
            String[] var10002 = field_1380;
            throw var5;
         }

         var4 = var2;
      }

      byte[] var3 = new byte[var4];
      var0.readBytes(var3);
      return var3;
   }

   // $FF: renamed from: b (d) void
   public abstract void method_1453(class_112 var1);

   // $FF: renamed from: c (d) void
   public abstract void method_1454(class_112 var1);

   // $FF: renamed from: b (rP) void
   public abstract void method_1455(class_57 var1);

   // $FF: renamed from: b () boolean
   public boolean method_1456() {
      return false;
   }

   public String toString() {
      return this.getClass().getSimpleName();
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return "";
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "yf\fÎNN)ÐA\\_)\tÃKMN))ql A[zÃLMH)\rÊN\bTf\rÊNO)YõIZ^)Ç";
      int var4 = "yf\fÎNN)ÐA\\_)\tÃKMN))ql A[zÃLMH)\rÊN\bTf\rÊNO)YõIZ^)Ç".length();
      char var1 = 23;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_1380 = var5;
                  field_1379 = LogManager.getLogger();
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 25;
               break;
            case 1:
               var10009 = 42;
               break;
            case 2:
               var10009 = 90;
               break;
            case 3:
               var10009 = 129;
               break;
            case 4:
               var10009 = 219;
               break;
            case 5:
               var10009 = 3;
               break;
            default:
               var10009 = 11;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_1459(Exception var0) {
      return var0;
   }
}
