import net.minecraft.item.ItemSuperBow;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: oP
public class class_838 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3882;
   // $FF: renamed from: k nk
   private final class_1214 field_3883;
   // $FF: renamed from: l java.lang.String
   private static final String field_3884;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      class_1214 var10001 = new class_1214;
      var10001.method_6525(0.0F);
      super.method_4798(var10001, 0.5F);
      this.field_3883 = (class_1214)this.field_3844;
   }

   // $FF: renamed from: b (w8, double, double, double, float, float) void
   public void method_4867(class_783 var1, double var2, double var4, double var6, float var8, float var9) {
      add var10 = var1.method_4214();
      this.field_3883.field_6304 = var10 != null;
      super.method_4830(var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: b (w8) bqx
   protected bqx method_4868(class_783 var1) {
      return field_3882;
   }

   // $FF: renamed from: b (w8, float) void
   protected void method_4869(class_783 var1, float var2) {
      GL11.glColor3f(1.0F, 1.0F, 1.0F);
      String[] var3 = class_752.method_4253();
      super.method_4807(var1, var2);
      add var4 = var1.method_4214();
      if(var3 != null) {
         if(var4 == null) {
            return;
         }

         GL11.glPushMatrix();
      }

      boolean var10000 = this.field_3844.field_6262;
      float var5;
      if(var3 != null) {
         if(this.field_3844.field_6262) {
            var5 = 0.5F;
            GL11.glTranslatef(0.0F, 0.625F, 0.0F);
            GL11.glRotatef(-20.0F, -1.0F, 0.0F, 0.0F);
            GL11.glScalef(var5, var5, var5);
         }

         this.field_3883.field_6302.method_6648(0.0625F);
         GL11.glTranslatef(-0.0625F, 0.53125F, 0.21875F);
         var10000 = var4.method_3730() instanceof abh;
      }

      label88: {
         if(var3 != null) {
            label76: {
               if(var10000) {
                  var10000 = blm.drawTextBox7(aji.method_2417(var4.method_3730()).method_2436());
                  if(var3 == null) {
                     break label76;
                  }

                  if(var10000) {
                     var5 = 0.5F;
                     GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
                     var5 *= 0.75F;
                     GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
                     GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
                     GL11.glScalef(var5, -var5, var5);
                     if(var3 != null) {
                        break label88;
                     }
                  }
               }

               var10000 = var4.method_3730() instanceof class_573;
            }
         }

         label67: {
            label66: {
               label89: {
                  if(var3 != null) {
                     if(var10000) {
                        break label89;
                     }

                     var10000 = var4.method_3730() instanceof ItemSuperBow;
                  }

                  if(var3 == null) {
                     break label67;
                  }

                  if(!var10000) {
                     break label66;
                  }
               }

               var5 = 0.625F;
               GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
               GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
               GL11.glScalef(var5, -var5, var5);
               GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
               if(var3 != null) {
                  break label88;
               }
            }

            var10000 = var4.method_3730().method_2942();
         }

         if(var10000) {
            var5 = 0.625F;
            if(var3 != null) {
               if(var4.method_3730().method_2943()) {
                  GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
                  GL11.glTranslatef(0.0F, -0.125F, 0.0F);
               }

               this.method_4870();
               GL11.glScalef(var5, -var5, var5);
               GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            }

            if(var3 != null) {
               break label88;
            }
         }

         var5 = 0.375F;
         GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
         GL11.glScalef(var5, var5, var5);
         GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
      }

      label47: {
         GL11.glRotatef(-15.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(40.0F, 0.0F, 0.0F, 1.0F);
         bly var6 = this.field_3788.field_7424;
         class_783 var10001 = var1;
         add var10002 = var4;
         byte var10003 = 0;
         if(var3 != null) {
            this.field_3788.field_7424.method_3231(var1, var4, 0);
            if(!var4.method_3730().method_2970()) {
               break label47;
            }

            var6 = this.field_3788.field_7424;
            var10001 = var1;
            var10002 = var4;
            var10003 = 1;
         }

         var6.method_3231(var10001, var10002, var10003);
      }

      GL11.glPopMatrix();
   }

   // $FF: renamed from: b () void
   protected void method_4870() {
      GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
   }

   // $FF: renamed from: c (w8, float) void
   protected void method_4871(class_783 var1, float var2) {
      float var3 = 0.9375F;
      GL11.glScalef(var3, var3, var3);
   }

   // $FF: renamed from: a (sw, double, double, double, float, float) void
   public void method_4830(class_753 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4867((class_783)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: a (sv, float) void
   protected void method_4814(class_752 var1, float var2) {
      this.method_4871((class_783)var1, var2);
   }

   // $FF: renamed from: c (sv, float) void
   protected void method_4807(class_752 var1, float var2) {
      this.method_4869((class_783)var1, var2);
   }

   // $FF: renamed from: a (sv, double, double, double, float, float) void
   public void method_4801(class_752 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4867((class_783)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4868((class_783)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4867((class_783)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "ÈYÁPR[ºo5Âÿ:~øpcòpq¥/h";
      int var5 = "ÈYÁPR[ºo5Âÿ:~øpcòpq¥/h".length();
      char var2 = 11;
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
                  field_3884 = "CL_00001033";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/witch.png");
                  field_3882 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 246;
               break;
            case 1:
               var10009 = 34;
               break;
            case 2:
               var10009 = 123;
               break;
            case 3:
               var10009 = 140;
               break;
            case 4:
               var10009 = 29;
               break;
            case 5:
               var10009 = 31;
               break;
            default:
               var10009 = 22;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
