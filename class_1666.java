
// $FF: renamed from: vH
public class class_1666 implements class_22 {

   // $FF: renamed from: b java.lang.String
   private String field_8682;
   // $FF: renamed from: c vI
   private class_22 field_8683;
   // $FF: renamed from: d vI
   private class_22 field_8684;


   // $FF: renamed from: <init> (java.lang.String, vI, vI) void
   public void method_9196(String var1, class_22 var2, class_22 var3) {
      String[] var10000 = class_752.method_4253();
      super();
      String[] var4 = var10000;
      this.field_8682 = var1;
      class_22 var5 = var2;
      if(var4 != null) {
         if(var2 == null) {
            var2 = var3;
         }

         var5 = var3;
      }

      label20: {
         if(var4 != null) {
            if(var5 != null) {
               break label20;
            }

            var5 = var2;
         }

         var3 = var5;
      }

      this.field_8683 = var2;
      this.field_8684 = var3;
   }

   // $FF: renamed from: f () int
   public int method_83() {
      return this.field_8683.method_83() + this.field_8684.method_83();
   }

   // $FF: renamed from: b (vI) boolean
   public boolean method_9197(class_22 var1) {
      boolean var3;
      label17: {
         String[] var2 = class_752.method_4253();
         class_22 var10000 = this.field_8683;
         class_22 var10001 = var1;
         if(var2 != null) {
            if(this.field_8683 == var1) {
               break label17;
            }

            var10000 = this.field_8684;
            var10001 = var1;
         }

         if(var10000 != var10001) {
            var3 = false;
            return var3;
         }
      }

      var3 = true;
      return var3;
   }

   // $FF: renamed from: i () java.lang.String
   public String method_88() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_8683.method_89();
      class_1666 var2;
      if(var1 != null) {
         if(var10000) {
            return this.field_8683.method_88();
         }

         var2 = this;
         if(var1 == null) {
            return var2.field_8682;
         }

         var10000 = this.field_8684.method_89();
      }

      if(var10000) {
         return this.field_8684.method_88();
      } else {
         var2 = this;
         return var2.field_8682;
      }
   }

   // $FF: renamed from: j () boolean
   public boolean method_89() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_8683.method_89();
      if(var1 != null) {
         if(!var10000) {
            var10000 = this.field_8684.method_89();
            if(var1 == null) {
               return var10000;
            }

            if(!var10000) {
               var10000 = false;
               return var10000;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: c (int) add
   public add method_84(int var1) {
      return var1 >= this.field_8683.method_83()?this.field_8684.method_84(var1 - this.field_8683.method_83()):this.field_8683.method_84(var1);
   }

   // $FF: renamed from: b (int, int) add
   public add method_85(int var1, int var2) {
      return var1 >= this.field_8683.method_83()?this.field_8684.method_85(var1 - this.field_8683.method_83(), var2):this.field_8683.method_85(var1, var2);
   }

   // $FF: renamed from: j (int) add
   public add method_86(int var1) {
      return var1 >= this.field_8683.method_83()?this.field_8684.method_86(var1 - this.field_8683.method_83()):this.field_8683.method_86(var1);
   }

   // $FF: renamed from: b (int, add) void
   public void method_87(int var1, add var2) {
      String[] var3 = class_752.method_4253();
      if(var1 >= this.field_8683.method_83()) {
         this.field_8684.method_87(var1 - this.field_8683.method_83(), var2);
         if(var3 != null) {
            return;
         }
      }

      this.field_8683.method_87(var1, var2);
   }

   // $FF: renamed from: k () int
   public int method_90() {
      return this.field_8683.method_90();
   }

   // $FF: renamed from: l () void
   public void method_91() {
      this.field_8683.method_91();
      this.field_8684.method_91();
   }

   // $FF: renamed from: b (yz) boolean
   public boolean method_92(class_792 var1) {
      boolean var10000;
      label24: {
         String[] var2 = class_752.method_4253();
         var10000 = this.field_8683.method_92(var1);
         if(var2 != null) {
            if(!var10000) {
               break label24;
            }

            var10000 = this.field_8684.method_92(var1);
         }

         if(var2 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: m () void
   public void method_93() {
      this.field_8683.method_93();
      this.field_8684.method_93();
   }

   // $FF: renamed from: n () void
   public void method_94() {
      this.field_8683.method_94();
      this.field_8684.method_94();
   }

   // $FF: renamed from: d (int, add) boolean
   public boolean method_95(int var1, add var2) {
      return true;
   }
}
