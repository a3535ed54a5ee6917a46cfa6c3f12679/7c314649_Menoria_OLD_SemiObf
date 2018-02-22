import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class bpv {

   // $FF: renamed from: a int
   private final int field_7809;
   // $FF: renamed from: b java.util.Set
   private final Set field_7810;
   // $FF: renamed from: c java.util.List
   private final List field_7811;
   // $FF: renamed from: d int
   private int field_7812;
   // $FF: renamed from: e int
   private int field_7813;
   // $FF: renamed from: f int
   private final int field_7814;
   // $FF: renamed from: g int
   private final int field_7815;
   // $FF: renamed from: h boolean
   private final boolean field_7816;
   // $FF: renamed from: i int
   private final int field_7817;
   // $FF: renamed from: j java.lang.String
   private static final String field_7818 = "Unable to fit: %s - size: %dx%d - Maybe try a lowerresolution resourcepack?";


   // $FF: renamed from: <init> (int, int, boolean, int, int) void
   public void method_8016(int var1, int var2, boolean var3, int var4, int var5) {
      super();
      this.field_7810 = new HashSet(256);
      this.field_7811 = new ArrayList(256);
      this.field_7809 = var5;
      this.field_7814 = var1;
      this.field_7815 = var2;
      this.field_7816 = var3;
      this.field_7817 = var4;
   }

   // $FF: renamed from: a () int
   public int method_8017() {
      return this.field_7812;
   }

   // $FF: renamed from: b () int
   public int method_8018() {
      return this.field_7813;
   }

   // $FF: renamed from: a (bqd) void
   public void method_8019(bqd param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () void
   public void method_8020() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () java.util.List
   public List method_8021() {
      String[] var10000 = class_752.method_4253();
      ArrayList var2 = Lists.newArrayList();
      Iterator var3 = this.field_7811.iterator();
      String[] var1 = var10000;

      while(var3.hasNext()) {
         class_1491 var4 = (class_1491)var3.next();
         var4.method_8049(var2);
         if(var1 == null) {
            break;
         }
      }

      ArrayList var9 = Lists.newArrayList();
      Iterator var10 = var2.iterator();

      ArrayList var11;
      while(true) {
         if(var10.hasNext()) {
            class_1491 var5 = (class_1491)var10.next();
            class_1490 var6 = var5.method_8045();
            bqd var7 = var6.method_8036();

            try {
               var7.method_8077(this.field_7812, this.field_7813, var5.method_8046(), var5.method_8047(), var6.method_8040());
               var11 = var9;
               if(var1 == null) {
                  break;
               }

               var9.add(var7);
               if(var1 != null) {
                  continue;
               }
            } catch (class_686 var8) {
               throw method_8026(var8);
            }
         }

         var11 = var9;
         break;
      }

      return var11;
   }

   // $FF: renamed from: b (int, int) int
   private static int method_8022(int var0, int var1) {
      String[] var2 = class_752.method_4253();

      int var10000;
      int var10001;
      label32: {
         try {
            var10000 = var0 >> var1;
            var10001 = var0 & (1 << var1) - 1;
            if(var2 == null) {
               return var10000 + var10001 << var1;
            }

            if(var10001 == 0) {
               break label32;
            }
         } catch (class_686 var3) {
            throw method_8026(var3);
         }

         var10001 = 1;
         return var10000 + var10001 << var1;
      }

      var10001 = 0;
      return var10000 + var10001 << var1;
   }

   // $FF: renamed from: a (pa) boolean
   private boolean method_8023(class_1490 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (pa) boolean
   private boolean method_8024(class_1490 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int) int
   // $FF: synthetic method
   static int method_8025(int var0, int var1) {
      return method_8022(var0, var1);
   }

   // $FF: renamed from: b (Az) Az
   private static class_686 method_8026(class_686 var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8027() {
      boolean var10000 = true;
      char[] var10003 = "ÿX¯EóÞYÇ«@âí¶ÅÃL÷\t³ÒÒí¶ûËO¨\tâÄÓíEùÁÏD¨ZùÚßB¢G¶ÄÏE¸[õÓÚW¦".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_7818 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 252;
            break;
         case 1:
            var10009 = 96;
            break;
         case 2:
            var10009 = 177;
            break;
         case 3:
            var10009 = 155;
            break;
         case 4:
            var10009 = 127;
            break;
         case 5:
            var10009 = 192;
            break;
         default:
            var10009 = 224;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
