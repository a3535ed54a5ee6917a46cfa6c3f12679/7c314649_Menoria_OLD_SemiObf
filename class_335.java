import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// $FF: renamed from: s6
public class class_335 extends class_250 {

   // $FF: renamed from: c int
   private int field_1688;
   // $FF: renamed from: d java.util.List
   private final List field_1689;
   // $FF: renamed from: e java.lang.String
   private static final String field_1690;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_1691;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
      this.field_1689 = new ArrayList();
   }

   // $FF: renamed from: <init> (int, java.util.Collection) void
   public void method_1898(int var1, Collection var2) {
      super.method_1449();
      String[] var10000 = class_752.method_4253();
      this.field_1689 = new ArrayList();
      String[] var3 = var10000;
      this.field_1688 = var1;
      Iterator var4 = var2.iterator();

      while(var4.hasNext()) {
         class_80 var5 = (class_80)var4.next();
         List var6 = this.field_1689;
         class_1598 var10001 = new class_1598;
         var10001.method_8736(this, var5.method_388().method_384(), var5.method_389(), var5.method_391());
         var6.add(var10001);
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1688 = var1.readInt();
      String[] var10000 = class_752.method_4253();
      int var3 = var1.readInt();
      String[] var2 = var10000;
      int var4 = 0;

      while(var4 < var3) {
         String var5 = var1.method_524(64);
         double var6 = var1.readDouble();
         ArrayList var8 = new ArrayList();
         short var9 = var1.readShort();
         int var10 = 0;

         while(true) {
            if(var10 < var9) {
               UUID var11 = new UUID(var1.readLong(), var1.readLong());
               class_1716 var10001 = new class_1716;
               String[] var10004 = field_1691;
               var10001.method_9593(var11, "Unknown synced attribute modifier", var1.readDouble(), var1.readByte());
               var8.add(var10001);
               ++var10;
               if(var2 == null) {
                  break;
               }

               if(var2 != null) {
                  continue;
               }
            }

            List var12 = this.field_1689;
            class_1598 var13 = new class_1598;
            var13.method_8736(this, var5, var6, var8);
            var12.add(var13);
            ++var4;
            break;
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1688);
      String[] var10000 = class_752.method_4253();
      var1.writeInt(this.field_1689.size());
      String[] var2 = var10000;
      Iterator var3 = this.field_1689.iterator();

      label25:
      while(var3.hasNext()) {
         class_1598 var4 = (class_1598)var3.next();
         var1.method_525(var4.method_8737());
         var1.writeDouble(var4.method_8738());
         var1.writeShort(var4.method_8739().size());
         Iterator var5 = var4.method_8739().iterator();

         while(var5.hasNext()) {
            class_1716 var6 = (class_1716)var5.next();
            var1.writeLong(var6.method_9594().getMostSignificantBits());
            var1.writeLong(var6.method_9594().getLeastSignificantBits());
            var1.writeDouble(var6.method_9597());
            var1.writeByte(var6.method_9596());
            if(var2 == null) {
               continue label25;
            }

            if(var2 == null) {
               break;
            }
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (tF) void
   public void method_1899(class_64 var1) {
      var1.method_331(this);
   }

   // $FF: renamed from: a () int
   public int method_1900() {
      return this.field_1688;
   }

   // $FF: renamed from: e () java.util.List
   public List method_1901() {
      return this.field_1689;
   }

   // $FF: renamed from: b (rP) void
   public void method_1455(class_57 var1) {
      this.method_1899((class_64)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ØpY´~ªê !ÎRµ_ó »O§_\ná*»]ªEí,îH»ë*òZ·T";
      int var4 = "ØpY´~ªê !ÎRµ_ó »O§_\ná*»]ªEí,îH»ë*òZ·T".length();
      char var1 = 11;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_1691 = var5;
                  String[] var10 = field_1691;
                  field_1690 = "CL_00001341";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 186;
               break;
            case 1:
               var10009 = 29;
               break;
            case 2:
               var10009 = 255;
               break;
            case 3:
               var10009 = 16;
               break;
            case 4:
               var10009 = 72;
               break;
            case 5:
               var10009 = 165;
               break;
            default:
               var10009 = 111;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
