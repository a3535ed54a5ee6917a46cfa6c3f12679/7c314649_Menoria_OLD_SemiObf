
// $FF: renamed from: G
public enum class_94 {

   // $FF: renamed from: a G
   field_44,
   // $FF: renamed from: b G
   field_45,
   // $FF: renamed from: c G
   field_46,
   // $FF: renamed from: d G
   field_47;
   // $FF: renamed from: f int
   int field_48;
   // $FF: renamed from: g java.lang.String
   String field_49;
   // $FF: renamed from: h G[]
   private static final class_94[] field_50;
   // $FF: renamed from: i java.lang.String
   private static final String field_51;
   // $FF: renamed from: j G[]
   private static final class_94[] field_52;


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, int, java.lang.String) void
   private void method_442(String var1, int var2, String var3, int var4, int var5, String var6) {
      super(var1, var2);
      this.field_48 = var5;
      this.field_49 = var6;
   }

   // $FF: renamed from: b () int
   public int method_443() {
      return this.field_48;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_444() {
      return this.field_49;
   }

   // $FF: renamed from: b (Ae) void
   public void method_445(class_665 var1) {
      String[] var2;
      label23: {
         var2 = class_752.method_4253();
         if(var2 != null) {
            if(this == field_46) {
               var1.field_2838 = true;
               var1.field_2839 = true;
               var1.field_2836 = true;
               if(var2 != null) {
                  break label23;
               }
            }

            var1.field_2838 = false;
            var1.field_2839 = false;
            var1.field_2836 = false;
         }

         var1.field_2837 = false;
      }

      boolean var10001 = this.method_446();
      if(var2 != null) {
         var10001 = !var10001;
      }

      var1.field_2840 = var10001;
   }

   // $FF: renamed from: d () boolean
   public boolean method_446() {
      return this == field_47;
   }

   // $FF: renamed from: e () boolean
   public boolean method_447() {
      return this == field_46;
   }

   // $FF: renamed from: f () boolean
   public boolean method_448() {
      boolean var2;
      label17: {
         String[] var1 = class_752.method_4253();
         class_94 var10000 = this;
         class_94 var10001 = field_45;
         if(var1 != null) {
            if(this == field_45) {
               break label17;
            }

            var10000 = this;
            var10001 = field_47;
         }

         if(var10000 != var10001) {
            var2 = false;
            return var2;
         }
      }

      var2 = true;
      return var2;
   }

   // $FF: renamed from: b (int) G
   public static class_94 method_449(int var0) {
      class_94[] var2 = values();
      String[] var10000 = class_752.method_4253();
      int var3 = var2.length;
      String[] var1 = var10000;
      int var4 = 0;

      class_94 var6;
      while(true) {
         if(var4 < var3) {
            class_94 var5 = var2[var4];
            if(var1 != null) {
               var6 = var5;
               if(var1 == null) {
                  break;
               }

               if(var5.field_48 == var0) {
                  return var5;
               }

               ++var4;
            }

            if(var1 != null) {
               continue;
            }
         }

         var6 = field_45;
         break;
      }

      return var6;
   }

   // $FF: renamed from: b (java.lang.String) G
   public static class_94 method_450(String var0) {
      String[] var10000 = class_752.method_4253();
      class_94[] var2 = values();
      int var3 = var2.length;
      String[] var1 = var10000;
      int var4 = 0;

      class_94 var6;
      while(true) {
         if(var4 < var3) {
            class_94 var5 = var2[var4];
            if(var1 != null) {
               var6 = var5;
               if(var1 == null) {
                  break;
               }

               if(var5.field_49.equals(var0)) {
                  return var5;
               }

               ++var4;
            }

            if(var1 != null) {
               continue;
            }
         }

         var6 = field_45;
         break;
      }

      return var6;
   }

   // $FF: renamed from: <clinit> () void
   static void method_451() {
      // $FF: Couldn't be decompiled
   }
}
