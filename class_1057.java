import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

// $FF: renamed from: g5
public class class_1057 extends class_1052 {

   // $FF: renamed from: g double
   private double height2;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] height3;


   // $FF: renamed from: <init> () void
   public void method_5960() {
      super.method_5960();
      this.height2 = 0.004D;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_5963() {
      String[] var10000 = height3;
      return "Mineshaft";
   }

   // $FF: renamed from: <init> (java.util.Map) void
   public void method_5982(Map var1) {
      super.method_5960();
      this.height2 = 0.004D;
      String[] var10000 = class_752.method_4253();
      Iterator var3 = var1.entrySet().iterator();
      String[] var2 = var10000;

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         String var5 = (String)var4.getKey();
         String[] var10001 = height3;
         if(var5.equals("chance")) {
            this.height2 = class_1715.method_9583((String)var4.getValue(), this.height2);
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (int, int) boolean
   protected boolean method_5972(int var1, int var2) {
      int var10000;
      label24: {
         String[] var3 = class_752.method_4253();
         double var4;
         var10000 = (var4 = this.field_5565.nextDouble() - this.height2) == 0.0D?0:(var4 < 0.0D?-1:1);
         if(var3 != null) {
            if(var10000 >= 0) {
               break label24;
            }

            var10000 = this.field_5565.nextInt(80);
         }

         if(var3 == null) {
            return (boolean)var10000;
         }

         if(var10000 < Math.max(Math.abs(var1), Math.abs(var2))) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: c (int, int) i2
   protected class_1199 method_5973(int var1, int var2) {
      class_1204 var10000 = new class_1204;
      var10000.method_6468(this.field_5566, this.field_5565, var1, var2);
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5975() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Bä;%ÆÞ%_ Cë05Ë";
      int var4 = "Bä;%ÆÞ%_ Cë05Ë".length();
      char var1 = 9;
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
                  height3 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 127;
               break;
            case 1:
               var10009 = 23;
               break;
            case 2:
               var10009 = 182;
               break;
            case 3:
               var10009 = 98;
               break;
            case 4:
               var10009 = 106;
               break;
            case 5:
               var10009 = 146;
               break;
            default:
               var10009 = 131;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
