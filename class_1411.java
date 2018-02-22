import java.io.BufferedInputStream;
import java.nio.ByteBuffer;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.BufferUtils;

// $FF: renamed from: o7
public class class_1411 {

   // $FF: renamed from: b W
   private final class_106 field_7517;
   // $FF: renamed from: c java.lang.String
   private final String field_7518;
   // $FF: renamed from: d int
   private int field_7519;
   // $FF: renamed from: e int
   private int field_7520;
   // $FF: renamed from: f java.lang.String
   private static final String field_7521;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7522;


   // $FF: renamed from: <init> (W, int, java.lang.String) void
   private void method_7704(class_106 var1, int var2, String var3) {
      super();
      this.field_7520 = 0;
      this.field_7517 = var1;
      this.field_7519 = var2;
      this.field_7518 = var3;
   }

   // $FF: renamed from: b (o4) void
   public void method_7705(class_1404 var1) {
      ++this.field_7520;
      buu.method_9042(var1.method_7662(), this.field_7519);
   }

   // $FF: renamed from: c (o4) void
   public void method_7706(class_1404 var1) {
      String[] var10000 = class_752.method_4253();
      --this.field_7520;
      String[] var2 = var10000;
      int var3 = this.field_7520;
      if(var2 != null) {
         if(this.field_7520 > 0) {
            return;
         }

         var3 = this.field_7519;
      }

      buu.method_9043(var3);
      this.field_7517.method_502().remove(this.field_7518);
   }

   // $FF: renamed from: b () java.lang.String
   public String method_7707() {
      return this.field_7518;
   }

   // $FF: renamed from: b (bqy, W, java.lang.String) o7
   public static class_1411 method_7708(bqy var0, class_106 var1, String var2) {
      String[] var10000 = class_752.method_4253();
      class_1411 var4 = (class_1411)var1.method_502().get(var2);
      String[] var3 = var10000;
      class_1411 var13 = var4;
      if(var3 != null) {
         if(var4 == null) {
            bqx var14 = new bqx;
            StringBuilder var10002 = new StringBuilder();
            String[] var12 = field_7522;
            var14.method_8227(var10002.append("shaders/program/").append(var2).append(var1.method_500()).toString());
            bqx var5 = var14;
            BufferedInputStream var6 = new BufferedInputStream(var0.method_224(var5).method_234());
            byte[] var7 = IOUtils.toByteArray(var6);
            ByteBuffer var8 = BufferUtils.createByteBuffer(var7.length);
            var8.put(var7);
            var8.position(0);
            int var9 = buu.method_9044(var1.method_501());
            buu.method_9045(var9, var8);
            buu.method_9046(var9);
            if(var3 != null) {
               if(buu.method_9047(var9, buu.field_8573) == 0) {
                  String var10 = StringUtils.trim(buu.method_9048(var9, '\u8000'));
                  class_129 var15 = new class_129;
                  var15.method_590("Couldn\'t compile " + var1.method_499() + " program: " + var10);
                  class_129 var11 = var15;
                  var11.method_593(var5.method_8228());
                  throw var11;
               }

               var13 = new class_1411;
               var13.method_7704(var1, var9, var2);
               var4 = var13;
            }

            var1.method_502().put(var2, var4);
         }

         var13 = var4;
      }

      return var13;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7709() {
      // $FF: Couldn't be decompiled
   }
}
