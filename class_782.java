import java.util.List;
import java.util.UUID;

// $FF: renamed from: w_
public class class_782 extends class_781 {

   // $FF: renamed from: bK java.util.UUID
   private static final UUID field_3576;
   // $FF: renamed from: bL x5
   private static final class_1716 field_3577;
   // $FF: renamed from: bM int
   private int field_3578;
   // $FF: renamed from: bN int
   private int field_3579;
   // $FF: renamed from: bO sa
   private class_689 field_3580;
   // $FF: renamed from: ib java.lang.String[]
   private static final String[] field_3581;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3035 = true;
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(field_3566).method_390(0.0D);
      this.method_4211(class_1840.field_9393).method_390(0.5D);
      this.method_4211(class_1840.field_9394).method_390(5.0D);
   }

   // $FF: renamed from: bk () boolean
   protected boolean method_4225() {
      return false;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      class_782 var10000;
      label43: {
         String[] var1;
         int var3;
         label44: {
            var1 = class_752.method_4253();
            var10000 = this;
            if(var1 != null) {
               label38: {
                  if(this.field_3580 != this.field_3433) {
                     var3 = this.field_2990.field_1832;
                     if(var1 == null) {
                        break label44;
                     }

                     if(!this.field_2990.field_1832) {
                        class_80 var2 = this.method_4211(class_1840.field_9393);
                        var2.method_394(field_3577);
                        var10000 = this;
                        if(var1 == null) {
                           break label38;
                        }

                        if(this.field_3433 != null) {
                           var2.method_393(field_3577);
                        }
                     }
                  }

                  this.field_3580 = this.field_3433;
                  var10000 = this;
               }
            }

            if(var1 == null) {
               break label43;
            }

            var3 = var10000.field_3579;
         }

         if(var3 > 0) {
            var10000 = this;
            if(var1 == null) {
               break label43;
            }

            if(--this.field_3579 == 0) {
               String[] var10001 = field_3581;
               this.method_3868("mob.zombiepig.zpigangry", this.method_4216() * 2.0F, ((this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.2F + 1.0F) * 1.8F);
            }
         }

         var10000 = this;
      }

      var10000.method_3856();
   }

   // $FF: renamed from: by () boolean
   public boolean method_4274() {
      boolean var2;
      label40: {
         String[] var1 = class_752.method_4253();
         ahb var10000 = this.field_2990;
         if(var1 != null) {
            if(this.field_2990.field_1818 == class_918.field_4627) {
               break label40;
            }

            var10000 = this.field_2990;
         }

         var2 = var10000.method_2117(this.field_3004);
         if(var1 != null) {
            if(!var2) {
               break label40;
            }

            var2 = this.field_2990.method_2096(this, this.field_3004).isEmpty();
         }

         if(var1 != null) {
            if(!var2) {
               break label40;
            }

            var2 = this.field_2990.method_2120(this.field_3004);
         }

         if(var1 == null) {
            return var2;
         }

         if(!var2) {
            var2 = true;
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      super.method_3909(var1);
      String[] var10001 = field_3581;
      var1.method_8666("Anger", (short)this.field_3578);
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      super.method_3908(var1);
      String[] var10002 = field_3581;
      this.field_3578 = var1.method_8680("Anger");
   }

   // $FF: renamed from: bR () sa
   protected class_689 method_4332() {
      String[] var1 = class_752.method_4253();
      Object var10000 = this;
      if(var1 != null) {
         if(this.field_3578 == 0) {
            return null;
         }

         var10000 = super.method_4332();
      }

      return (class_689)var10000;
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      Object var10000 = this;
      if(var3 != null) {
         if(this.method_3961()) {
            return false;
         }

         var10000 = var1.method_9345();
      }

      Object var4 = var10000;
      boolean var9 = var4 instanceof class_792;
      if(var3 != null) {
         if(var9) {
            List var5 = this.field_2990.method_2155(this, this.field_3004.method_7097(32.0D, 32.0D, 32.0D));
            int var6 = 0;

            while(var6 < var5.size()) {
               class_689 var7 = (class_689)var5.get(var6);
               if(var3 != null) {
                  var9 = var7 instanceof class_782;
                  if(var3 == null) {
                     return var9;
                  }

                  if(var9) {
                     class_782 var8 = (class_782)var7;
                     var8.method_4523((class_689)var4);
                  }

                  ++var6;
               }

               if(var3 == null) {
                  break;
               }
            }

            this.method_4523((class_689)var4);
         }

         var9 = super.method_3896(var1, var2);
      }

      return var9;
   }

   // $FF: renamed from: b (sa) void
   private void method_4523(class_689 var1) {
      this.field_3433 = var1;
      this.field_3578 = 400 + this.field_3028.nextInt(400);
      this.field_3579 = this.field_3028.nextInt(40);
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String[] var10000 = field_3581;
      return "mob.zombiepig.zpig";
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3581;
      return "mob.zombiepig.zpighurt";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3581;
      return "mob.zombiepig.zpigdeath";
   }

   // $FF: renamed from: b (boolean, int) void
   protected void method_4196(boolean var1, int var2) {
      int var4 = this.field_3028.nextInt(2 + var2);
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var3 = var10000;

      while(true) {
         if(var5 < var4) {
            this.method_3914(class_1010.field_5224, 1);
            ++var5;
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         var4 = this.field_3028.nextInt(2 + var2);
         break;
      }

      var5 = 0;

      while(var5 < var4) {
         this.method_3914(class_1010.field_5228, 1);
         ++var5;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (yz) boolean
   public boolean method_4295(class_792 var1) {
      return false;
   }

   // $FF: renamed from: n (int) void
   protected void method_4195(int var1) {
      this.method_3914(class_1010.field_5124, 1);
   }

   // $FF: renamed from: bC () void
   protected void method_4278() {
      add var10002 = new add;
      var10002.method_3724(class_1010.field_5141);
      this.method_3935(0, var10002);
   }

   // $FF: renamed from: a (xY) xY
   public class_83 method_4282(class_83 var1) {
      super.method_4282(var1);
      this.method_4516(false);
      return var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      // $FF: Couldn't be decompiled
   }
}
