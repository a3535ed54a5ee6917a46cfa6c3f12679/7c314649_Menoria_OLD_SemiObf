import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;
import java.util.Map;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: ob
public class class_616 extends class_614 {

   // $FF: renamed from: a bqx
   private static final bqx field_2665;
   // $FF: renamed from: c bqx
   private static final bqx field_2666;
   // $FF: renamed from: d bqx
   private static final bqx field_2667;
   // $FF: renamed from: e bqx
   private static final bqx field_2668;
   // $FF: renamed from: f ob
   public static class_616 field_2669;
   // $FF: renamed from: h nd
   private class_1220 field_2670;
   // $FF: renamed from: i nd
   private class_1220 field_2671;
   // $FF: renamed from: j java.lang.String
   private static final String field_2672;


   // $FF: renamed from: <init> () void
   public void method_3391() {
      super.method_3391();
      class_1220 var10001 = new class_1220;
      var10001.method_6536(0, 0, 64, 32);
      this.field_2670 = var10001;
      var10001 = new class_1220;
      var10001.method_6536(0, 0, 64, 64);
      this.field_2671 = var10001;
   }

   // $FF: renamed from: b (gz, double, double, double, float) void
   public void method_3400(class_581 var1, double var2, double var4, double var6, float var8) {
      this.method_3401((float)var2, (float)var4, (float)var6, var1.getBlock96() & 7, (float)(var1.method_3115() * 360) / 16.0F, var1.method_3114(), var1.method_3110());
   }

   // $FF: renamed from: b (n3) void
   public void method_3394(class_1380 var1) {
      super.method_3394(var1);
      field_2669 = this;
   }

   // $FF: renamed from: b (float, float, float, int, float, int, com.mojang.authlib.GameProfile) void
   public void method_3401(float var1, float var2, float var3, int var4, float var5, int var6, GameProfile var7) {
      String[] var8;
      class_1220 var9;
      label72: {
         label75: {
            label70: {
               label69: {
                  label68: {
                     String[] var10000 = class_752.method_4253();
                     var9 = this.field_2670;
                     var8 = var10000;
                     if(var8 != null) {
                        switch(var6) {
                        case 0:
                        default:
                           this.method_3393(field_2665);
                           break;
                        case 1:
                           break label68;
                        case 2:
                           break label69;
                        case 3:
                           break label70;
                        case 4:
                           break label75;
                        }
                     }

                     if(var8 != null) {
                        break label72;
                     }
                  }

                  this.method_3393(field_2666);
                  if(var8 != null) {
                     break label72;
                  }
               }

               this.method_3393(field_2667);
               var9 = this.field_2671;
               if(var8 != null) {
                  break label72;
               }
            }

            bqx var10 = class_794.field_3677;
            if(var8 != null) {
               label46: {
                  if(var7 != null) {
                     bao var11 = bao.method_5273();
                     Map var12 = var11.method_5303().method_7878(var7);
                     if(var8 == null) {
                        break label46;
                     }

                     if(var12.containsKey(MinecraftProfileTexture$Type.SKIN)) {
                        var10 = var11.method_5303().method_7875((MinecraftProfileTexture)var12.get(MinecraftProfileTexture$Type.SKIN), MinecraftProfileTexture$Type.SKIN);
                     }
                  }

                  this.method_3393(var10);
               }
            }

            if(var8 != null) {
               break label72;
            }
         }

         this.method_3393(field_2668);
      }

      label40: {
         label39: {
            GL11.glPushMatrix();
            GL11.glDisable(2884);
            int var14 = var4;
            if(var8 != null) {
               if(var4 == 1) {
                  break label39;
               }

               var14 = var4;
            }

            switch(var14) {
            case 2:
               GL11.glTranslatef(var1 + 0.5F, var2 + 0.25F, var3 + 0.74F);
               if(var8 != null) {
                  break label40;
               }
            case 3:
               GL11.glTranslatef(var1 + 0.5F, var2 + 0.25F, var3 + 0.26F);
               var5 = 180.0F;
               if(var8 != null) {
                  break label40;
               }
            case 4:
               GL11.glTranslatef(var1 + 0.74F, var2 + 0.25F, var3 + 0.5F);
               var5 = 270.0F;
               if(var8 != null) {
                  break label40;
               }
            case 5:
            default:
               GL11.glTranslatef(var1 + 0.26F, var2 + 0.25F, var3 + 0.5F);
               var5 = 90.0F;
               if(var8 != null) {
                  break label40;
               }
            }
         }

         GL11.glTranslatef(var1 + 0.5F, var2, var3 + 0.5F);
      }

      float var13 = 0.0625F;
      GL11.glEnable('\u803a');
      GL11.glScalef(-1.0F, -1.0F, 1.0F);
      GL11.glEnable(3008);
      var9.method_6511((class_689)null, 0.0F, 0.0F, 0.0F, var5, 0.0F, var13);
      GL11.glPopMatrix();
   }

   // $FF: renamed from: b (gi, double, double, double, float) void
   public void method_3392(class_580 var1, double var2, double var4, double var6, float var8) {
      this.method_3400((class_581)var1, var2, var4, var6, var8);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3402() {
      // $FF: Couldn't be decompiled
   }
}
