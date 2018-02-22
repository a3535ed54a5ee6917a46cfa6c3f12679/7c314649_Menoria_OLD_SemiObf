import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: uk
public class class_1671 {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_8708;
   // $FF: renamed from: b sa
   public class_689 field_8709;
   // $FF: renamed from: c int
   public int field_8710;
   // $FF: renamed from: d int
   public int field_8711;
   // $FF: renamed from: e int
   public int field_8712;
   // $FF: renamed from: f int
   public int field_8713;
   // $FF: renamed from: g int
   public int field_8714;
   // $FF: renamed from: h int
   public int field_8715;
   // $FF: renamed from: i int
   public int field_8716;
   // $FF: renamed from: j int
   public int field_8717;
   // $FF: renamed from: k double
   public double field_8718;
   // $FF: renamed from: l double
   public double field_8719;
   // $FF: renamed from: m double
   public double field_8720;
   // $FF: renamed from: n int
   public int field_8721;
   // $FF: renamed from: o double
   private double field_8722;
   // $FF: renamed from: p double
   private double field_8723;
   // $FF: renamed from: q double
   private double field_8724;
   // $FF: renamed from: r boolean
   private boolean field_8725;
   // $FF: renamed from: s boolean
   private boolean field_8726;
   // $FF: renamed from: t int
   private int field_8727;
   // $FF: renamed from: u sa
   private class_689 field_8728;
   // $FF: renamed from: v boolean
   private boolean field_8729;
   // $FF: renamed from: w boolean
   public boolean field_8730;
   // $FF: renamed from: x java.util.Set
   public Set field_8731;
   // $FF: renamed from: y java.lang.String
   private static final String field_8732;
   // $FF: renamed from: z java.lang.String[]
   private static final String[] field_8733;


   // $FF: renamed from: <init> (sa, int, int, boolean) void
   public void method_9215(class_689 var1, int var2, int var3, boolean var4) {
      super();
      this.field_8731 = new HashSet();
      this.field_8709 = var1;
      this.field_8710 = var2;
      this.field_8711 = var3;
      this.field_8726 = var4;
      this.field_8712 = class_1715.method_9561(var1.field_2994 * 32.0D);
      this.field_8713 = class_1715.method_9561(var1.field_2995 * 32.0D);
      this.field_8714 = class_1715.method_9561(var1.field_2996 * 32.0D);
      this.field_8715 = class_1715.method_9559(var1.field_3000 * 256.0F / 360.0F);
      this.field_8716 = class_1715.method_9559(var1.field_3001 * 256.0F / 360.0F);
      this.field_8717 = class_1715.method_9559(var1.method_3957() * 256.0F / 360.0F);
   }

   public boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public int hashCode() {
      return this.field_8709.method_3845();
   }

   // $FF: renamed from: b (java.util.List) void
   public void method_9216(List param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () void
   private void method_9217() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (r1) void
   public void method_9218(class_250 var1) {
      String[] var10000 = class_752.method_4253();
      Iterator var3 = this.field_8731.iterator();
      String[] var2 = var10000;

      while(var3.hasNext()) {
         class_793 var4 = (class_793)var3.next();
         var4.field_3654.method_9291(var1);
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (r1) void
   public void method_9219(class_250 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () void
   public void method_9220() {
      String[] var10000 = class_752.method_4253();
      Iterator var2 = this.field_8731.iterator();
      String[] var1 = var10000;

      while(var2.hasNext()) {
         class_793 var3 = (class_793)var2.next();
         var3.method_4657(this.field_8709);
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (xi) void
   public void method_9221(class_793 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (xi) void
   public void method_9222(class_793 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e (xi) boolean
   private boolean method_9223(class_793 var1) {
      return var1.method_4650().method_2257().method_9141(var1, this.field_8709.field_3040, this.field_8709.field_3042);
   }

   // $FF: renamed from: c (java.util.List) void
   public void method_9224(List var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < var1.size()) {
         this.method_9222((class_793)var1.get(var3));
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d () r1
   private class_250 method_9225() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f (xi) void
   public void method_9226(class_793 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_9227() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "WD¹úavÊQ¾öX\rrU®²ncÊB¿ÿgt¿ü|eR¦oê¢8\\ ÞéU^ýæ(Gúúg1_úól\b1";
      int var4 = "WD¹úavÊQ¾öX\rrU®²ncÊB¿ÿgt¿ü|eR¦oê¢8\\ ÞéU^ýæ(Gúúg1_úól\b1".length();
      char var1 = 37;
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
                  field_8733 = var5;
                  String[] var10 = field_8733;
                  field_8732 = "CL_00001443";
                  field_8708 = LogManager.getLogger();
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 19;
               break;
            case 1:
               var10009 = 232;
               break;
            case 2:
               var10009 = 50;
               break;
            case 3:
               var10009 = 216;
               break;
            case 4:
               var10009 = 144;
               break;
            case 5:
               var10009 = 10;
               break;
            default:
               var10009 = 110;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_9228(IllegalArgumentException var0) {
      return var0;
   }
}
