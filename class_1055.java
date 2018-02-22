import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

// $FF: renamed from: g7
public class class_1055 extends class_1052 {

   // $FF: renamed from: g java.util.List
   private static List width3;
   // $FF: renamed from: h java.util.List
   private List width4;
   // $FF: renamed from: i int
   private int width5;
   // $FF: renamed from: j int
   private int width6;
   // $FF: renamed from: k java.lang.String
   private static final String width7;
   // $FF: renamed from: l java.lang.String[]
   private static final String[] width8;


   // $FF: renamed from: <init> () void
   public void method_5960() {
      super.method_5960();
      this.width4 = new ArrayList();
      this.width5 = 32;
      this.width6 = 8;
      List var10000 = this.width4;
      class_1653 var10001 = new class_1653;
      var10001.method_9099(class_783.class, 1, 1, 1);
      var10000.add(var10001);
   }

   // $FF: renamed from: <init> (java.util.Map) void
   public void method_5978(Map var1) {
      this.method_5960();
      String[] var2 = class_752.method_4253();
      Iterator var3 = var1.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         String var10000 = (String)var4.getKey();
         String[] var10001 = width8;
         if(var10000.equals("distance")) {
            this.width5 = class_1715.method_9582((String)var4.getValue(), this.width5, this.width6 + 1);
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b () java.lang.String
   public String method_5963() {
      String[] var10000 = width8;
      return "Temple";
   }

   // $FF: renamed from: b (int, int) boolean
   protected boolean method_5972(int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int var5 = var2;
      String[] var3 = var10000;
      int var12 = var1;
      if(var3 != null) {
         if(var1 < 0) {
            var1 -= this.width5 - 1;
         }

         var12 = var2;
      }

      if(var3 != null) {
         if(var12 < 0) {
            var2 -= this.width5 - 1;
         }

         var12 = var1 / this.width5;
      }

      int var6 = var12;
      int var7 = var2 / this.width5;
      Random var8 = this.field_5566.method_2213(var6, var7, 14357617);
      var6 *= this.width5;
      var7 *= this.width5;
      var6 += var8.nextInt(this.width5 - this.width6);
      var7 += var8.nextInt(this.width5 - this.width6);
      var12 = var1;
      if(var3 != null) {
         if(var1 == var6) {
            var12 = var5;
            if(var3 == null) {
               return (boolean)var12;
            }

            if(var5 == var7) {
               class_985 var9 = this.field_5566.method_2041().method_5537(var1 * 16 + 8, var5 * 16 + 8);
               Iterator var10 = width3.iterator();

               while(var10.hasNext()) {
                  class_985 var11 = (class_985)var10.next();
                  if(var9 == var11) {
                     return true;
                  }

                  if(var3 == null) {
                     break;
                  }
               }
            }
         }

         var12 = 0;
      }

      return (boolean)var12;
   }

   // $FF: renamed from: c (int, int) i2
   protected class_1199 method_5973(int var1, int var2) {
      class_1202 var10000 = new class_1202;
      var10000.method_6466(this.field_5566, this.field_5565, var1, var2);
      return var10000;
   }

   // $FF: renamed from: d (int, int, int) boolean
   public boolean method_5979(int var1, int var2, int var3) {
      boolean var8;
      label28: {
         String[] var10000 = class_752.method_4253();
         class_1199 var5 = this.method_5966(var1, var2, var3);
         String[] var4 = var10000;
         class_1199 var7 = var5;
         if(var4 != null) {
            if(var5 == null) {
               break label28;
            }

            var7 = var5;
         }

         var8 = var7 instanceof class_1202;
         if(var4 == null) {
            return var8;
         }

         if(var8) {
            var8 = var5.field_6230.isEmpty();
            if(var4 == null) {
               return var8;
            }

            if(!var8) {
               class_1094 var6 = (class_1094)var5.field_6230.getFirst();
               return var6 instanceof class_1096;
            }
         }
      }

      var8 = false;
      return var8;
   }

   // $FF: renamed from: a () java.util.List
   public List method_5980() {
      return this.width4;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5975() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "mØ{\\å°\bJ¸ôF*KKz´êB\'\t";
      int var4 = "mØ{\\å°\bJ¸ôF*KKz´êB\'\t".length();
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
                  width8 = var5;
                  String[] var10 = width8;
                  width7 = "CL_00000471";
                  width3 = Arrays.asList(new class_985[]{class_985.field_4990, class_985.field_5005, class_985.field_5009, class_985.field_5010, class_985.field_4994});
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 147;
               break;
            case 1:
               var10009 = 108;
               break;
            case 2:
               var10009 = 58;
               break;
            case 3:
               var10009 = 143;
               break;
            case 4:
               var10009 = 246;
               break;
            case 5:
               var10009 = 209;
               break;
            default:
               var10009 = 149;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
