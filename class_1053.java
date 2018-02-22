import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

// $FF: renamed from: g9
public class class_1053 extends class_1052 {

   // $FF: renamed from: g java.util.List
   public static final List field_5571;
   // $FF: renamed from: h int
   private int field_5572;
   // $FF: renamed from: i int
   private int field_5573;
   // $FF: renamed from: j int
   private int field_5574;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_5575;


   // $FF: renamed from: <init> () void
   public void method_5960() {
      super.method_5960();
      this.field_5573 = 32;
      this.field_5574 = 8;
   }

   // $FF: renamed from: <init> (java.util.Map) void
   public void method_5976(Map var1) {
      String[] var10000 = class_752.method_4253();
      this.method_5960();
      String[] var2 = var10000;
      Iterator var3 = var1.entrySet().iterator();

      while(var3.hasNext()) {
         label23: {
            Entry var4 = (Entry)var3.next();
            String var6 = (String)var4.getKey();
            String[] var5 = field_5575;
            boolean var7 = var6.equals("size");
            if(var2 != null) {
               if(var7) {
                  this.field_5572 = class_1715.method_9582((String)var4.getValue(), this.field_5572, 0);
                  if(var2 != null) {
                     break label23;
                  }
               }

               var6 = (String)var4.getKey();
               String[] var10001 = field_5575;
               var7 = var6.equals("distance");
            }

            if(var7) {
               this.field_5573 = class_1715.method_9582((String)var4.getValue(), this.field_5573, this.field_5574 + 1);
            }
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b () java.lang.String
   public String method_5963() {
      String[] var10000 = field_5575;
      return "Village";
   }

   // $FF: renamed from: b (int, int) boolean
   protected boolean method_5972(int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int var5 = var2;
      String[] var3 = var10000;
      int var10 = var1;
      if(var3 != null) {
         if(var1 < 0) {
            var1 -= this.field_5573 - 1;
         }

         var10 = var2;
      }

      if(var3 != null) {
         if(var10 < 0) {
            var2 -= this.field_5573 - 1;
         }

         var10 = var1 / this.field_5573;
      }

      int var6 = var10;
      int var7 = var2 / this.field_5573;
      Random var8 = this.field_5566.method_2213(var6, var7, 10387312);
      var6 *= this.field_5573;
      var7 *= this.field_5573;
      var6 += var8.nextInt(this.field_5573 - this.field_5574);
      var7 += var8.nextInt(this.field_5573 - this.field_5574);
      var10 = var1;
      if(var3 != null) {
         if(var1 == var6) {
            var10 = var5;
            if(var3 == null) {
               return (boolean)var10;
            }

            if(var5 == var7) {
               byte var9 = this.field_5566.method_2041().method_5543(var1 * 16 + 8, var5 * 16 + 8, 0, field_5571);
               var10 = var9;
               if(var3 == null) {
                  return (boolean)var10;
               }

               if(var9 != 0) {
                  return true;
               }
            }
         }

         var10 = 0;
      }

      return (boolean)var10;
   }

   // $FF: renamed from: c (int, int) i2
   protected class_1199 method_5973(int var1, int var2) {
      class_1200 var10000 = new class_1200;
      var10000.method_6464(this.field_5566, this.field_5565, var1, var2, this.field_5572);
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5975() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "D¥8Ëü37a¥.Â\bv¥\'Óü:1w";
      int var4 = "D¥8Ëü37a¥.Â\bv¥\'Óü:1w".length();
      char var1 = 7;
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
                  field_5575 = var5;
                  field_5571 = Arrays.asList(new class_985[]{class_985.field_4989, class_985.field_4990, class_985.field_5023});
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 44;
               break;
            case 1:
               var10009 = 242;
               break;
            case 2:
               var10009 = 106;
               break;
            case 3:
               var10009 = 153;
               break;
            case 4:
               var10009 = 163;
               break;
            case 5:
               var10009 = 106;
               break;
            default:
               var10009 = 108;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
