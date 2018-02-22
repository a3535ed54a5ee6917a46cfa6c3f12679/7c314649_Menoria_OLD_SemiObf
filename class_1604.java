
// $FF: renamed from: u3
public class class_1604 extends class_1601 {

   // $FF: renamed from: n int
   public final int field_8379;
   // $FF: renamed from: o int
   public final int field_8380;
   // $FF: renamed from: p u3
   public final class_1604 field_8381;
   // $FF: renamed from: q java.lang.String
   private final String field_8382;
   // $FF: renamed from: r u1
   private class_70 field_8383;
   // $FF: renamed from: s add
   public final add field_8384;
   // $FF: renamed from: t boolean
   private boolean field_8385;
   // $FF: renamed from: u java.lang.String
   private static final String field_8386;
   // $FF: renamed from: v java.lang.String[]
   private static final String[] field_8387;


   // $FF: renamed from: <init> (java.lang.String, java.lang.String, int, int, adb, u3) void
   public void method_8764(String var1, String var2, int var3, int var4, adb var5, class_1604 var6) {
      add var10005 = new add;
      var10005.method_3724(var5);
      this.method_8766(var1, var2, var3, var4, var10005, var6);
   }

   // $FF: renamed from: <init> (java.lang.String, java.lang.String, int, int, aji, u3) void
   public void method_8765(String var1, String var2, int var3, int var4, aji var5, class_1604 var6) {
      add var10005 = new add;
      var10005.method_3721(var5);
      this.method_8766(var1, var2, var3, var4, var10005, var6);
   }

   // $FF: renamed from: <init> (java.lang.String, java.lang.String, int, int, add, u3) void
   public void method_8766(String var1, String var2, int var3, int var4, add var5, class_1604 var6) {
      class_1081 var10002 = new class_1081;
      StringBuilder var10004 = new StringBuilder();
      String[] var7 = field_8387;
      var10002.method_6126(var10004.append("achievement.").append(var2).toString(), new Object[0]);
      super.method_8748(var1, var10002);
      this.field_8384 = var5;
      this.field_8382 = "achievement." + var2 + ".desc";
      this.field_8379 = var3;
      this.field_8380 = var4;
      if(var3 < class_1600.field_8325) {
         class_1600.field_8325 = var3;
      }

      if(var4 < class_1600.field_8326) {
         class_1600.field_8326 = var4;
      }

      if(var3 > class_1600.field_8327) {
         class_1600.field_8327 = var3;
      }

      if(var4 > class_1600.field_8328) {
         class_1600.field_8328 = var4;
      }

      this.field_8381 = var6;
   }

   // $FF: renamed from: j () u3
   public class_1604 method_8767() {
      this.field_8366 = true;
      return this;
   }

   // $FF: renamed from: k () u3
   public class_1604 method_8768() {
      this.field_8385 = true;
      return this;
   }

   // $FF: renamed from: l () u3
   public class_1604 method_8769() {
      super.method_8750();
      class_1600.field_8329.add(this);
      return this;
   }

   // $FF: renamed from: c () boolean
   public boolean method_8751() {
      return true;
   }

   // $FF: renamed from: d () rV
   public class_66 method_8753() {
      class_66 var1 = super.method_8753();
      var1.method_338().method_8524(this.method_8773()?class_130.field_281:class_130.field_286);
      return var1;
   }

   // $FF: renamed from: b (java.lang.Class) u3
   public class_1604 method_8770(Class var1) {
      return (class_1604)super.method_8757(var1);
   }

   // $FF: renamed from: m () java.lang.String
   public String method_8771() {
      String[] var1 = class_752.method_4253();
      class_1604 var10000 = this;
      String var2;
      if(var1 != null) {
         if(this.field_8383 != null) {
            var2 = this.field_8383.method_363(class_1563.method_8581(this.field_8382));
            return var2;
         }

         var10000 = this;
      }

      var2 = class_1563.method_8581(var10000.field_8382);
      return var2;
   }

   // $FF: renamed from: b (u1) u3
   public class_1604 method_8772(class_70 var1) {
      this.field_8383 = var1;
      return this;
   }

   // $FF: renamed from: n () boolean
   public boolean method_8773() {
      return this.field_8385;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8760() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "·Ãn»ÞÁøÙ®¼ßÕ;çÖÕ";
      int var4 = "·Ãn»ÞÁøÙ®¼ßÕ;çÖÕ".length();
      char var1 = 12;
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
                  field_8387 = var5;
                  String[] var10 = field_8387;
                  field_8386 = "CL_00001466";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 225;
               break;
            case 1:
               var10009 = 213;
               break;
            case 2:
               var10009 = 212;
               break;
            case 3:
               var10009 = 157;
               break;
            case 4:
               var10009 = 216;
               break;
            case 5:
               var10009 = 210;
               break;
            default:
               var10009 = 60;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
