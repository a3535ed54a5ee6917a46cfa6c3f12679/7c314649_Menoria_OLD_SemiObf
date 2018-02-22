package ca.diiza.f;

import ca.diiza.f.A;
import ca.diiza.f.class_0;
import ca.diiza.f.class_209;
import ca.diiza.f.class_212;
import java.util.ArrayList;

// $FF: renamed from: ca.diiza.f.w
public class class_231 {

   // $FF: renamed from: b ca.diiza.f.o
   private class_212 field_1241;
   // $FF: renamed from: c int
   private int field_1242;
   // $FF: renamed from: d int
   private int field_1243;
   // $FF: renamed from: e int
   private int field_1244;
   // $FF: renamed from: f int
   private int field_1245;
   // $FF: renamed from: g boolean
   private boolean field_1246;
   // $FF: renamed from: h boolean
   private boolean field_1247;
   // $FF: renamed from: i ca.diiza.f.A[]
   private class_0[] field_1248;
   // $FF: renamed from: j java.util.ArrayList
   private ArrayList<A> field_1249;
   // $FF: renamed from: k ca.diiza.f.A
   private class_0 field_1250;


   // $FF: renamed from: <init> (ca.diiza.f.o, int, int, int, int, java.lang.Class) void
   public void method_1252(class_212 var1, int var2, int var3, int var4, int var5, Class var6) {
      super();
      this.field_1241 = var1;
      this.field_1242 = var2;
      this.field_1243 = var3;
      this.field_1244 = var4;
      this.field_1245 = var5;
      this.field_1247 = false;
      this.field_1246 = false;
      this.field_1248 = (class_0[])((class_0[])((class_0[])((class_0[])var6.getEnumConstants())));
      this.field_1249 = new ArrayList();
      this.field_1250 = this.field_1248[0];
   }

   // $FF: renamed from: b (int, int) void
   public void method_1253(int var1, int var2) {
      this.field_1249.clear();
      int var10000 = class_209.method_1160();
      this.field_1241.method_1168(bmh.instance, (double)this.field_1242, (double)(this.field_1242 + this.field_1244), (double)this.field_1243, (double)(this.field_1243 + this.field_1245), 1.0F, 1.0F, 1.0F, 0.5F);
      this.field_1241.method_1175(this.field_1250.method_0(), this.field_1242 + this.field_1244 / 2, this.field_1243 + this.field_1245 / 2 - this.field_1241.field_1013 / 2, 16777215);
      int var4 = 0;
      int var3 = var10000;
      byte var6 = this.field_1247;
      if(var3 == 0) {
         if(!this.field_1247) {
            return;
         }

         var6 = 0;
      }

      int var5 = var6;

      while(var5 < this.field_1248.length) {
         label22: {
            boolean var7 = this.field_1248[var5].equals(this.field_1250);
            if(var3 == 0) {
               if(var7) {
                  break label22;
               }

               this.field_1249.add(this.field_1248[var5]);
            }

            this.field_1241.method_1169(bmh.instance, (double)this.field_1242, (double)(this.field_1242 + this.field_1244), (double)(this.field_1243 + (var4 + 1) * this.field_1245), (double)((float)(this.field_1243 + (var4 + 2) * this.field_1245) + 1.0F), 1.0F, 1.0F, 1.0F, 0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F);
            this.field_1241.method_1175(this.field_1248[var5].method_0(), this.field_1242 + this.field_1244 / 2, (this.field_1243 + (var4 + 1) * this.field_1245 + this.field_1243 + (var4 + 2) * this.field_1245) / 2 - this.field_1241.field_1013 / 2, 16777215);
            ++var4;
         }

         ++var5;
         if(var3 != 0) {
            break;
         }
      }

   }

   // $FF: renamed from: c (int, int) void
   public void method_1254(int var1, int var2) {
      int var3 = class_209.method_1160();
      int var10000 = var1;
      int var10001 = this.field_1242;
      if(var3 == 0) {
         if(var1 < this.field_1242) {
            return;
         }

         var10000 = var1;
         var10001 = this.field_1242 + this.field_1244;
      }

      label73: {
         if(var3 == 0) {
            if(var10000 > var10001) {
               return;
            }

            var10000 = var2;
            if(var3 != 0) {
               break label73;
            }

            var10001 = this.field_1243;
         }

         if(var10000 >= var10001) {
            var10000 = var2;
            if(var3 != 0) {
               break label73;
            }

            if(var2 <= this.field_1243 + this.field_1245) {
               boolean var5 = this.field_1247;
               if(var3 == 0) {
                  var5 = !this.field_1247;
               }

               this.field_1247 = var5;
               this.field_1246 = true;
               if(var3 == 0) {
                  return;
               }
            }
         }

         var10000 = this.field_1247;
      }

      if(var3 == 0) {
         if(var10000 == 0) {
            return;
         }

         var10000 = var2;
      }

      var10001 = this.field_1243;
      if(var3 == 0) {
         if(var10000 < this.field_1243) {
            return;
         }

         var10000 = var2;
         var10001 = this.field_1243 + this.field_1245 * this.field_1248.length;
      }

      if(var3 == 0) {
         if(var10000 > var10001) {
            return;
         }

         var10000 = var2 - this.field_1243;
         var10001 = this.field_1245;
      }

      int var4 = var10000 / var10001;
      this.field_1250 = (class_0)this.field_1249.get(var4 - 1);
      this.field_1247 = false;
      this.field_1246 = true;
   }

   // $FF: renamed from: b () ca.diiza.f.A
   public class_0 method_1255() {
      return this.field_1250;
   }

   // $FF: renamed from: c () boolean
   public boolean method_1256() {
      return this.field_1247;
   }

   // $FF: renamed from: d () boolean
   public boolean method_1257() {
      return this.field_1246;
   }

   // $FF: renamed from: b (boolean) void
   public void method_1258(boolean var1) {
      this.field_1246 = var1;
   }

   // $FF: renamed from: e () int
   public int method_1259() {
      return this.field_1244;
   }

   // $FF: renamed from: f () int
   public int method_1260() {
      return this.field_1245;
   }

   // $FF: renamed from: g () int
   public int method_1261() {
      return this.field_1242;
   }

   // $FF: renamed from: h () int
   public int method_1262() {
      return this.field_1243;
   }
}
