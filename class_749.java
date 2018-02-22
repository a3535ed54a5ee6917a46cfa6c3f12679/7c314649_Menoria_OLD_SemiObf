import java.util.ArrayList;

// $FF: renamed from: wF
public class class_749 extends class_748 {

   // $FF: renamed from: ay au
   public class_925 field_3299;
   // $FF: renamed from: az java.lang.String
   private static final String field_3300;
   // $FF: renamed from: eb java.lang.String[]
   private static final String[] field_3301;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
   }

   // $FF: renamed from: <init> (ahb, int, int, int, int) void
   public void method_4139(ahb var1, int var2, int var3, int var4, int var5) {
      super.method_4139(var1, var2, var3, var4, var5);
      ArrayList var7 = new ArrayList();
      String[] var10000 = class_752.method_4253();
      class_925[] var8 = class_925.values();
      int var9 = var8.length;
      String[] var6 = var10000;
      int var10 = 0;

      boolean var12;
      while(true) {
         if(var10 < var9) {
            class_925 var11 = var8[var10];
            this.field_3299 = var11;
            this.method_4140(var5);
            if(var6 != null) {
               var12 = this.method_4142();
               if(var6 == null) {
                  break;
               }

               if(var12) {
                  var7.add(var11);
               }

               ++var10;
            }

            if(var6 != null) {
               continue;
            }
         }

         var12 = var7.isEmpty();
         break;
      }

      if(!var12) {
         this.field_3299 = (class_925)var7.get(this.field_3028.nextInt(var7.size()));
      }

      this.method_4140(var5);
   }

   // $FF: renamed from: <init> (ahb, int, int, int, int, java.lang.String) void
   public void method_4147(ahb var1, int var2, int var3, int var4, int var5, String var6) {
      this.method_4139(var1, var2, var3, var4, var5);
      String[] var10000 = class_752.method_4253();
      class_925[] var8 = class_925.values();
      int var9 = var8.length;
      String[] var7 = var10000;
      int var10 = 0;

      while(true) {
         if(var10 < var9) {
            label30: {
               class_925 var11 = var8[var10];
               if(var7 == null) {
                  break;
               }

               if(var7 != null) {
                  if(var11.field_4701.equals(var6)) {
                     this.field_3299 = var11;
                     if(var7 != null) {
                        break label30;
                     }
                  }

                  ++var10;
               }

               if(var7 != null) {
                  continue;
               }
            }
         }

         this.method_4140(var5);
         break;
      }

   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      String[] var10001 = field_3301;
      var1.initGui1("Motive", this.field_3299.field_4701);
      super.method_3909(var1);
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      String[] var10001 = field_3301;
      String var3 = var1.method_8685("Motive");
      class_925[] var4 = class_925.values();
      String[] var2 = class_752.method_4253();
      int var5 = var4.length;
      int var6 = 0;

      class_749 var8;
      label38: {
         class_925 var10000;
         while(true) {
            if(var6 < var5) {
               class_925 var7 = var4[var6];
               if(var2 != null) {
                  var10000 = var7;
                  if(var2 == null) {
                     break;
                  }

                  if(var7.field_4701.equals(var3)) {
                     this.field_3299 = var7;
                  }

                  ++var6;
               }

               if(var2 != null) {
                  continue;
               }
            }

            var8 = this;
            if(var2 == null) {
               break label38;
            }

            var10000 = this.field_3299;
            break;
         }

         if(var10000 == null) {
            this.field_3299 = class_925.field_4674;
         }

         var8 = this;
      }

      var8.method_3908(var1);
   }

   // $FF: renamed from: f () int
   public int method_4143() {
      return this.field_3299.field_4702;
   }

   // $FF: renamed from: i () int
   public int method_4144() {
      return this.field_3299.field_4703;
   }

   // $FF: renamed from: b (sa) void
   public void method_4145(class_689 var1) {
      String[] var2 = class_752.method_4253();
      if(var2 != null) {
         if(var1 instanceof class_792) {
            class_792 var3 = (class_792)var1;
            if(var2 == null) {
               return;
            }

            if(var3.field_3640.field_2839) {
               return;
            }
         }

         add var10001 = new add;
         var10001.method_3724(class_1010.field_5179);
         this.method_3916(var10001, 0.0F);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_4146() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = ":\"U-F4~tËfFxr";
      int var4 = ":\"U-F4~tËfFxr".length();
      char var1 = 6;
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
                  field_3301 = var5;
                  String[] var10 = field_3301;
                  field_3300 = "CL_00001556";
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
               var10009 = 69;
               break;
            case 2:
               var10009 = 41;
               break;
            case 3:
               var10009 = 76;
               break;
            case 4:
               var10009 = 243;
               break;
            case 5:
               var10009 = 43;
               break;
            default:
               var10009 = 94;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
