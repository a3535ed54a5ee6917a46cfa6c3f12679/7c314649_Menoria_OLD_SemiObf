import java.util.UUID;

// $FF: renamed from: wL
public abstract class class_776 extends class_769 implements class_78 {

   // $FF: renamed from: bG yR
   protected class_1748 field_3543;
   // $FF: renamed from: ib java.lang.String[]
   private static final String[] field_3544;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      class_1748 var10001 = new class_1748;
      var10001.method_9696(this);
      this.field_3543 = var10001;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(16, Byte.valueOf((byte)0));
      this.field_3036.method_9497(17, "");
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (boolean) void
   protected void method_4475(boolean var1) {
      String[] var10000 = class_752.method_4253();
      String[] var11 = field_3544;
      String var3 = "heart";
      String[] var2 = var10000;

      byte var13;
      label31: {
         label30: {
            try {
               var13 = var1;
               if(var2 == null) {
                  break label31;
               }

               if(var1 != 0) {
                  break label30;
               }
            } catch (IllegalArgumentException var12) {
               throw method_4485(var12);
            }

            var10000 = field_3544;
            var3 = "smoke";
         }

         var13 = 0;
      }

      int var4 = var13;

      while(var4 < 7) {
         double var5 = this.field_3028.nextGaussian() * 0.02D;
         double var7 = this.field_3028.nextGaussian() * 0.02D;
         double var9 = this.field_3028.nextGaussian() * 0.02D;
         this.field_2990.method_2087(var3, this.field_2994 + (double)(this.field_3028.nextFloat() * this.field_3014 * 2.0F) - (double)this.field_3014, this.field_2995 + 0.5D + (double)(this.field_3028.nextFloat() * this.field_3015), this.field_2996 + (double)(this.field_3028.nextFloat() * this.field_3014 * 2.0F) - (double)this.field_3014, var5, var7, var9);
         ++var4;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (byte) void
   public void method_3932(byte param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: bx () boolean
   public boolean method_4476() {
      String[] var1 = class_752.method_4253();

      int var10000;
      label32: {
         try {
            var10000 = this.field_3036.method_9499(16) & 4;
            if(var1 == null) {
               return (boolean)var10000;
            }

            if(var10000 != 0) {
               break label32;
            }
         } catch (IllegalArgumentException var2) {
            throw method_4485(var2);
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   // $FF: renamed from: k (boolean) void
   public void method_4477(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: bA () boolean
   public boolean method_4478() {
      String[] var1 = class_752.method_4253();

      int var10000;
      label32: {
         try {
            var10000 = this.field_3036.method_9499(16) & 1;
            if(var1 == null) {
               return (boolean)var10000;
            }

            if(var10000 != 0) {
               break label32;
            }
         } catch (IllegalArgumentException var2) {
            throw method_4485(var2);
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   // $FF: renamed from: l (boolean) void
   public void method_4479(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () java.lang.String
   public String method_382() {
      return this.field_3036.method_9503(17);
   }

   // $FF: renamed from: c (java.lang.String) void
   public void method_4480(String var1) {
      this.field_3036.method_9506(17, var1);
   }

   // $FF: renamed from: bQ () sv
   public class_752 method_4481() {
      try {
         UUID var1 = UUID.fromString(this.method_382());
         return var1 == null?null:this.field_2990.method_2179(var1);
      } catch (IllegalArgumentException var2) {
         return null;
      }
   }

   // $FF: renamed from: f (sv) boolean
   public boolean method_4482(class_752 var1) {
      boolean var10000;
      try {
         if(var1 == this.method_4481()) {
            var10000 = true;
            return var10000;
         }
      } catch (IllegalArgumentException var2) {
         throw method_4485(var2);
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: bS () yR
   public class_1748 method_4483() {
      return this.field_3543;
   }

   // $FF: renamed from: b (sv, sv) boolean
   public boolean method_4484(class_752 var1, class_752 var2) {
      return true;
   }

   // $FF: renamed from: bt () kn
   public class_1350 method_4247() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (sv) boolean
   public boolean method_4248(class_752 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () sa
   // $FF: synthetic method
   public class_689 method_383() {
      return this.method_4481();
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_4485(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4384() {
      // $FF: Couldn't be decompiled
   }
}
