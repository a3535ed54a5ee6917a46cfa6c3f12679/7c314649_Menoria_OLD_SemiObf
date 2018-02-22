import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: sh
public class class_292 extends class_250 {

   // $FF: renamed from: c org.apache.logging.log4j.Logger
   private static final Logger field_1531;
   // $FF: renamed from: d de
   private class_1035 field_1532;
   // $FF: renamed from: e byte[]
   private byte[] field_1533;
   // $FF: renamed from: f int
   private int field_1534;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_1535;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, short[], gI) void
   public void method_1677(int var1, short[] var2, class_1069 var3) {
      String[] var10000 = class_752.method_4253();
      super.method_1449();
      String[] var4 = var10000;
      class_1035 var10001 = new class_1035;
      var10001.method_5856(var3.fontRendererObj1, var3.fontRendererObj2);
      this.field_1532 = var10001;
      this.field_1534 = var1;
      int var5 = 4 * var1;

      try {
         ByteArrayOutputStream var6 = new ByteArrayOutputStream(var5);
         DataOutputStream var7 = new DataOutputStream(var6);
         int var8 = 0;

         while(true) {
            if(var8 < var1) {
               int var9 = var2[var8] >> 12 & 15;
               int var10 = var2[var8] >> 8 & 15;
               int var11 = var2[var8] & 255;

               try {
                  var7.writeShort(var2[var8]);
                  var7.writeShort((short)((aji.method_2415(var3.method_6028(var9, var11, var10)) & 4095) << 4 | var3.method_6029(var9, var11, var10) & 15));
                  ++var8;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               } catch (IOException var14) {
                  throw method_1682(var14);
               }
            }

            this.field_1533 = var6.toByteArray();
            break;
         }

         try {
            if(this.field_1533.length != var5) {
               RuntimeException var16 = new RuntimeException;
               StringBuilder var10002 = new StringBuilder();
               String[] var12 = field_1535;
               var16.<init>(var10002.append("Expected length ").append(var5).append(" doesn\'t match received length ").append(this.field_1533.length).toString());
               throw var16;
            }
         } catch (IOException var13) {
            throw method_1682(var13);
         }
      } catch (IOException var15) {
         String[] var17 = field_1535;
         field_1531.error("Couldn\'t create bulk block update packet", var15);
         this.field_1533 = null;
      }

   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (tF) void
   public void method_1678(class_64 var1) {
      var1.method_287(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      String[] var10000 = field_1535;
      return String.format("xc=%d, zc=%d, count=%d", new Object[]{Integer.valueOf(this.field_1532.field_5475), Integer.valueOf(this.field_1532.field_5476), Integer.valueOf(this.field_1534)});
   }

   // $FF: renamed from: a () de
   public class_1035 method_1679() {
      return this.field_1532;
   }

   // $FF: renamed from: e () byte[]
   public byte[] method_1680() {
      return this.field_1533;
   }

   // $FF: renamed from: f () int
   public int method_1681() {
      return this.field_1534;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (java.lang.Exception) java.lang.Exception
   private static Exception method_1682(Exception var0) {
      return var0;
   }
}
