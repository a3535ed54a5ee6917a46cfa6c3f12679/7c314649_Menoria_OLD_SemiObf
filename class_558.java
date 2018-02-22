import java.util.List;

// $FF: renamed from: bZ
public class class_558 extends class_557 {

   // $FF: renamed from: w boolean
   private final boolean field_2432;
   // $FF: renamed from: x java.lang.String
   private static final String field_2433;
   // $FF: renamed from: y java.lang.String[]
   private static final String[] field_2434;


   // $FF: renamed from: <init> (boolean) void
   public void getBlock48(boolean var1) {
      super.getBlock40(0, 0.0F, false);
      this.field_2432 = var1;
   }

   // $FF: renamed from: b (add) int
   public int getBlock43(add var1) {
      class_132 var4;
      int var5;
      label23: {
         class_132 var3;
         label22: {
            var3 = class_132.method_625(var1);
            String[] var2 = class_752.method_4253();
            boolean var10000 = this.field_2432;
            if(var2 != null) {
               if(!this.field_2432) {
                  break label22;
               }

               var4 = var3;
               if(var2 == null) {
                  break label23;
               }

               var10000 = var3.method_623();
            }

            if(var10000) {
               var5 = var3.method_618();
               return var5;
            }
         }

         var4 = var3;
      }

      var5 = var4.method_616();
      return var5;
   }

   // $FF: renamed from: c (add) float
   public float getBlock44(add var1) {
      class_132 var5;
      float var6;
      label23: {
         class_132 var3;
         label22: {
            String[] var10000 = class_752.method_4253();
            var3 = class_132.method_625(var1);
            String[] var2 = var10000;
            boolean var4 = this.field_2432;
            if(var2 != null) {
               if(!this.field_2432) {
                  break label22;
               }

               var5 = var3;
               if(var2 == null) {
                  break label23;
               }

               var4 = var3.method_623();
            }

            if(var4) {
               var6 = var3.method_619();
               return var6;
            }
         }

         var5 = var3;
      }

      var6 = var5.method_617();
      return var6;
   }

   // $FF: renamed from: i (add) java.lang.String
   public String method_2961(add var1) {
      return class_132.method_625(var1) == class_132.field_321?class_1011.field_5370:null;
   }

   // $FF: renamed from: a (vM) void
   public void registerIcons(class_74 var1) {
      String[] var10000 = class_752.method_4253();
      class_132[] var3 = class_132.values();
      String[] var2 = var10000;
      int var4 = var3.length;
      int var5 = 0;

      while(var5 < var4) {
         class_132 var6 = var3[var5];
         var6.method_620(var1);
         ++var5;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: e (add, ahb, yz) void
   protected void getBlock42(add var1, ahb var2, class_792 var3) {
      String[] var10000 = class_752.method_4253();
      class_132 var5 = class_132.method_625(var1);
      String[] var4 = var10000;
      if(var4 != null) {
         if(var5 == class_132.field_321) {
            class_1645 var10001 = new class_1645;
            var10001.method_9012(class_1635.field_8509.field_8526, 1200, 3);
            var3.method_4179(var10001);
            var10001 = new class_1645;
            var10001.method_9012(class_1635.field_8507.field_8526, 300, 2);
            var3.method_4179(var10001);
            var10001 = new class_1645;
            var10001.method_9012(class_1635.field_8499.field_8526, 300, 1);
            var3.method_4179(var10001);
         }

         super.getBlock42(var1, var2, var3);
      }

   }

   // $FF: renamed from: b_ (int) vL
   public class_73 getIconFromDamage(int var1) {
      class_132 var4;
      class_73 var5;
      label23: {
         class_132 var3;
         label22: {
            var3 = class_132.method_624(var1);
            String[] var2 = class_752.method_4253();
            boolean var10000 = this.field_2432;
            if(var2 != null) {
               if(!this.field_2432) {
                  break label22;
               }

               var4 = var3;
               if(var2 == null) {
                  break label23;
               }

               var10000 = var3.method_623();
            }

            if(var10000) {
               var5 = var3.method_622();
               return var5;
            }
         }

         var4 = var3;
      }

      var5 = var4.method_621();
      return var5;
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void getSubItems(adb var1, class_872 var2, List var3) {
      class_132[] var5 = class_132.values();
      int var6 = var5.length;
      String[] var10000 = class_752.method_4253();
      int var7 = 0;
      String[] var4 = var10000;

      while(var7 < var6) {
         class_132 var8 = var5[var7];
         if(var4 != null && (!this.field_2432 || var4 != null && var8.method_623())) {
            add var10001 = new add;
            var10001.method_3726(this, 1, var8.method_614());
            var3.add(var10001);
         }

         ++var7;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (add) java.lang.String
   public String getUnlocalizedName(add var1) {
      StringBuilder var5;
      String var6;
      label17: {
         String[] var10000 = class_752.method_4253();
         class_132 var3 = class_132.method_625(var1);
         String[] var2 = var10000;
         var5 = (new StringBuilder()).append(this.getUnlocalizedName()).append(".").append(var3.method_615()).append(".");
         boolean var10001 = this.field_2432;
         if(var2 != null) {
            if(!this.field_2432) {
               break label17;
            }

            var10001 = var3.method_623();
         }

         if(var10001) {
            String[] var4 = field_2434;
            var6 = "cooked";
            return var5.append(var6).toString();
         }
      }

      String[] var7 = field_2434;
      var6 = "raw";
      return var5.append(var6).toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "u) d\'¸fâXD=·\f¬7xä?";
      int var4 = "u) d\'¸fâXD=·\f¬7xä?".length();
      char var1 = 3;
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
                  field_2434 = var5;
                  String[] var10 = field_2434;
                  field_2433 = "CL_00000032";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 166;
               break;
            case 1:
               var10009 = 233;
               break;
            case 2:
               var10009 = 118;
               break;
            case 3:
               var10009 = 172;
               break;
            case 4:
               var10009 = 38;
               break;
            case 5:
               var10009 = 157;
               break;
            default:
               var10009 = 61;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
