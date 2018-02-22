package ca.diiza.f;

import ca.diiza.f.class_209;
import ca.diiza.f.class_238;

// $FF: renamed from: ca.diiza.f.x
public class class_232 {

   // $FF: renamed from: a java.lang.String
   public String field_1251;
   // $FF: renamed from: b boolean
   public boolean field_1252;
   // $FF: renamed from: c java.lang.String
   public String field_1253;
   // $FF: renamed from: d ca.diiza.f.c
   public class_238 field_1254;
   // $FF: renamed from: e int
   public int field_1255;
   // $FF: renamed from: f int
   public int field_1256;
   // $FF: renamed from: g int
   public int field_1257;
   // $FF: renamed from: h int
   public int field_1258;
   // $FF: renamed from: i int
   public int field_1259;
   // $FF: renamed from: j int
   public int field_1260;
   // $FF: renamed from: k int
   public int field_1261;
   // $FF: renamed from: l int
   public int field_1262;
   // $FF: renamed from: m float
   public float field_1263;
   // $FF: renamed from: n float
   public float field_1264;
   // $FF: renamed from: o add
   public add field_1265;
   // $FF: renamed from: p java.lang.String
   private static final String field_1266 = "default";


   // $FF: renamed from: <init> () void
   public void method_1263() {
      super();
      this.field_1251 = "";
      this.field_1252 = true;
      this.field_1253 = "default";
      this.field_1254 = class_238.DEFAULT;
      this.field_1255 = 90;
      this.field_1256 = 0;
      this.field_1257 = 0;
      this.field_1258 = -999;
      this.field_1259 = 0;
      this.field_1260 = -999;
      this.field_1261 = 0;
      this.field_1262 = 0;
      this.field_1263 = 1.0F;
      this.field_1264 = 0.0F;
      this.field_1265 = null;
   }

   // $FF: renamed from: a (boolean) void
   public void method_1264(boolean var1) {
      this.field_1252 = var1;
   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_1265(String var1) {
      var1 = var1.replace('&', '\u00a7');
      this.field_1251 = var1;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_1266(String var1) {
      this.field_1253 = var1;
   }

   // $FF: renamed from: a (int) void
   public void method_1267(int var1) {
      this.field_1255 = var1;
   }

   // $FF: renamed from: a (ca.diiza.f.c) void
   public void method_1268(class_238 var1) {
      this.field_1254 = var1;
   }

   // $FF: renamed from: b (int) void
   public void method_1269(int var1) {
      this.field_1259 = var1;
   }

   // $FF: renamed from: c (int) void
   public void method_1270(int var1) {
      this.field_1258 = var1;
   }

   // $FF: renamed from: d (int) void
   public void method_1271(int var1) {
      this.field_1260 = var1;
   }

   // $FF: renamed from: e (int) void
   public void method_1272(int var1) {
      this.field_1257 = var1;
   }

   // $FF: renamed from: f (int) void
   public void method_1273(int var1) {
      this.field_1261 = var1;
   }

   // $FF: renamed from: a (float) void
   public void method_1274(float var1) {
      this.field_1263 = var1;
   }

   // $FF: renamed from: b (float) void
   public void method_1275(float var1) {
      this.field_1264 = var1;
   }

   // $FF: renamed from: g (int) void
   public void method_1276(int var1) {
      add var10001;
      aji var4;
      label18: {
         adb var3 = adb.method_2919(var1);
         int var2 = class_209.method_1160();
         var4 = aji.method_2416(var1);
         if(var2 == 0) {
            if(var3 == null) {
               break label18;
            }

            var10001 = new add;
            var10001.method_3724(var3);
            this.field_1265 = var10001;
         }

         if(var2 == 0) {
            return;
         }
      }

      if(var4 != null) {
         var10001 = new add;
         var10001.method_3721(var4);
         this.field_1265 = var10001;
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_1277() {
      boolean var10000 = true;
      char[] var10003 = "§ìlî»®å".toCharArray();
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
            field_1266 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 65;
            break;
         case 1:
            var10009 = 11;
            break;
         case 2:
            var10009 = 136;
            break;
         case 3:
            var10009 = 13;
            break;
         case 4:
            var10009 = 76;
            break;
         case 5:
            var10009 = 64;
            break;
         default:
            var10009 = 19;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
