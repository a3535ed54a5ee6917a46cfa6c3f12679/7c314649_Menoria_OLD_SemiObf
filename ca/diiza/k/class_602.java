package ca.diiza.k;

import ca.diiza.k.class_601;

// $FF: renamed from: ca.diiza.k.b
public enum class_602 {

   END,
   WARZONE;
   // $FF: renamed from: a ca.diiza.k.b
   private static class_602 field_2602;
   // $FF: renamed from: b ca.diiza.k.a
   private class_601 field_2603;
   // $FF: renamed from: c java.lang.String
   private String field_2604;
   // $FF: renamed from: d int
   private int field_2605;
   // $FF: renamed from: e int
   private int field_2606;
   // $FF: renamed from: f int
   private int field_2607;
   // $FF: renamed from: g int
   private int field_2608;
   // $FF: renamed from: h int
   private int field_2609;
   // $FF: renamed from: i java.lang.String
   private String field_2610;
   // $FF: renamed from: j int
   private int field_2611;
   // $FF: renamed from: k int
   private int field_2612;
   // $FF: renamed from: l long
   private long field_2613;
   // $FF: renamed from: m ca.diiza.k.b[]
   // $FF: synthetic field
   private static final class_602[] field_2614;
   // $FF: renamed from: n java.lang.String
   private static String field_2615;


   // $FF: renamed from: <init> (java.lang.String, int) void
   private void method_3249(String var1, int var2) {
      super(var1, var2);
      this.field_2613 = 0L;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_3250() {
      return this.field_2604;
   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_3251(String var1) {
      this.field_2604 = var1;
   }

   // $FF: renamed from: b () ca.diiza.k.b
   public static class_602 method_3252() {
      return field_2602;
   }

   // $FF: renamed from: a (ca.diiza.k.b) void
   public static void method_3253(class_602 var0) {
      field_2602 = var0;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_3254() {
      return this.field_2610;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_3255(String var1) {
      this.field_2610 = var1;
   }

   // $FF: renamed from: d () int
   public int method_3256() {
      return this.field_2611;
   }

   // $FF: renamed from: a (int) void
   public void method_3257(int var1) {
      this.field_2611 = var1;
   }

   // $FF: renamed from: e () int
   public int method_3258() {
      return this.field_2612;
   }

   // $FF: renamed from: b (int) void
   public void method_3259(int var1) {
      this.field_2612 = var1;
   }

   // $FF: renamed from: f () int
   public int method_3260() {
      return this.field_2609;
   }

   // $FF: renamed from: c (int) void
   public void method_3261(int var1) {
      this.field_2609 = var1;
   }

   // $FF: renamed from: g () int
   public int method_3262() {
      return this.field_2605;
   }

   // $FF: renamed from: d (int) void
   public void method_3263(int var1) {
      this.field_2605 = var1;
   }

   // $FF: renamed from: h () int
   public int method_3264() {
      return this.field_2606;
   }

   // $FF: renamed from: e (int) void
   public void method_3265(int var1) {
      this.field_2606 = var1;
   }

   // $FF: renamed from: i () ca.diiza.k.a
   public class_601 method_3266() {
      return this.field_2603;
   }

   // $FF: renamed from: a (ca.diiza.k.a) void
   public void method_3267(class_601 var1) {
      this.field_2603 = var1;
   }

   // $FF: renamed from: j () int
   public int method_3268() {
      return this.field_2607;
   }

   // $FF: renamed from: f (int) void
   public void method_3269(int var1) {
      this.field_2607 = var1;
   }

   // $FF: renamed from: k () int
   public int method_3270() {
      return this.field_2608;
   }

   // $FF: renamed from: g (int) void
   public void method_3271(int var1) {
      this.field_2608 = var1;
   }

   // $FF: renamed from: l () long
   public long method_3272() {
      return this.field_2613;
   }

   // $FF: renamed from: a (long) void
   public void method_3273(long var1) {
      this.field_2613 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3274() {
      String[] var6 = new String[2];
      int var4 = 0;
      method_3275((String)null);
      String var3 = " Øø2×îow";
      int var5 = " Øø2×îow".length();
      char var2 = 3;
      int var1 = -1;

      while(true) {
         ++var1;
         String var10002 = var3.substring(var1, var1 + var2);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var11 = true;
         char[] var10 = var10003;
         char[] var10001 = (char[])var10004;
         int var7 = 0;

         while(true) {
            var10003 = var10;
            var10 = var10001;
            var10001 = var10003;
            char[] var12 = var10;
            var10 = var10003;
            if(var10003 <= var7) {
               var6[var4++] = (new String((char[])var11)).intern();
               if((var1 += var2) >= var5) {
                  class_602 var9 = new class_602;
                  var9.method_3249("END", 0);
                  END = var9;
                  var9 = new class_602;
                  var9.method_3249("WARZONE", 1);
                  WARZONE = var9;
                  field_2614 = new class_602[]{END, WARZONE};
                  field_2602 = null;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 158;
               break;
            case 1:
               var10009 = 109;
               break;
            case 2:
               var10009 = 71;
               break;
            case 3:
               var10009 = 206;
               break;
            case 4:
               var10009 = 195;
               break;
            case 5:
               var10009 = 51;
               break;
            default:
               var10009 = 35;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }

   // $FF: renamed from: c (java.lang.String) void
   public static void method_3275(String var0) {
      field_2615 = var0;
   }

   // $FF: renamed from: m () java.lang.String
   public static String method_3276() {
      return field_2615;
   }
}
