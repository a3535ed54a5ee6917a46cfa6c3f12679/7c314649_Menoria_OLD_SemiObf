import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.vecmath.Matrix4f;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: o6
public class class_1409 {

   // $FF: renamed from: a o4
   private final class_1404 field_7505;
   // $FF: renamed from: b bmg
   public final bmg field_7506;
   // $FF: renamed from: c bmg
   public final bmg field_7507;
   // $FF: renamed from: e java.util.List
   private final List field_7508;
   // $FF: renamed from: f java.util.List
   private final List field_7509;
   // $FF: renamed from: g java.util.List
   private final List field_7510;
   // $FF: renamed from: h java.util.List
   private final List field_7511;
   // $FF: renamed from: i javax.vecmath.Matrix4f
   private Matrix4f field_7512;
   // $FF: renamed from: j java.lang.String
   private static final String field_7513;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_7514;


   // $FF: renamed from: <init> (bqy, java.lang.String, bmg, bmg) void
   public void method_7692(bqy var1, String var2, bmg var3, bmg var4) {
      super();
      this.field_7508 = Lists.newArrayList();
      this.field_7509 = Lists.newArrayList();
      this.field_7510 = Lists.newArrayList();
      this.field_7511 = Lists.newArrayList();
      class_1404 var10001 = new class_1404;
      var10001.method_7649(var1, var2);
      this.field_7505 = var10001;
      this.field_7506 = var3;
      this.field_7507 = var4;
   }

   // $FF: renamed from: a () void
   public void method_7693() {
      this.field_7505.method_7650();
   }

   // $FF: renamed from: b (java.lang.String, java.lang.Object, int, int) void
   public void method_7694(String var1, Object var2, int var3, int var4) {
      this.field_7509.add(this.field_7509.size(), var1);
      this.field_7508.add(this.field_7508.size(), var2);
      this.field_7510.add(this.field_7510.size(), Integer.valueOf(var3));
      this.field_7511.add(this.field_7511.size(), Integer.valueOf(var4));
   }

   // $FF: renamed from: b () void
   private void method_7695() {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glDisable(2929);
      GL11.glDisable(3008);
      GL11.glDisable(2912);
      GL11.glDisable(2896);
      GL11.glDisable(2903);
      GL11.glEnable(3553);
      GL11.glBindTexture(3553, 0);
   }

   // $FF: renamed from: b (javax.vecmath.Matrix4f) void
   public void method_7696(Matrix4f var1) {
      this.field_7512 = var1;
   }

   // $FF: renamed from: b (float) void
   public void method_7697(float var1) {
      this.method_7695();
      String[] var10000 = class_752.method_4253();
      this.field_7506.method_7493();
      String[] var2 = var10000;
      float var3 = (float)this.field_7507.field_7285;
      float var4 = (float)this.field_7507.field_7286;
      GL11.glViewport(0, 0, (int)var3, (int)var4);
      String[] var9 = field_7514;
      this.field_7505.method_7658("DiffuseSampler", this.field_7506);
      int var5 = 0;

      while(true) {
         if(var5 < this.field_7508.size()) {
            this.field_7505.method_7658((String)this.field_7509.get(var5), this.field_7508.get(var5));
            class_1404 var11 = this.field_7505;
            StringBuilder var10001 = new StringBuilder();
            var9 = field_7514;
            var11.method_7655(var10001.append("AuxSize").append(var5).toString()).method_7738((float)((Integer)this.field_7510.get(var5)).intValue(), (float)((Integer)this.field_7511.get(var5)).intValue());
            ++var5;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         var9 = field_7514;
         this.field_7505.method_7655("ProjMat").method_7745(this.field_7512);
         this.field_7505.method_7655("InSize").method_7738((float)this.field_7506.field_7285, (float)this.field_7506.field_7286);
         this.field_7505.method_7655("OutSize").method_7738(var3, var4);
         this.field_7505.method_7655("Time").method_7737(var1);
         break;
      }

      bao var10 = bao.method_5273();
      String[] var13 = field_7514;
      this.field_7505.method_7655("ScreenSize").method_7738((float)var10.cursorCounter2, (float)var10.cursorCounter3);
      this.field_7505.method_7652();
      this.field_7507.method_7496();
      this.field_7507.method_7492(false);
      GL11.glDepthMask(false);
      GL11.glColorMask(true, true, true, false);
      bmh var6 = bmh.instance;
      var6.setVisible2();
      var6.method_7463(-1);
      var6.method_7462(0.0D, (double)var4, 500.0D);
      var6.method_7462((double)var3, (double)var4, 500.0D);
      var6.method_7462((double)var3, 0.0D, 500.0D);
      var6.method_7462(0.0D, 0.0D, 500.0D);
      var6.getVisible8();
      GL11.glDepthMask(true);
      GL11.glColorMask(true, true, true, true);
      this.field_7505.method_7651();
      this.field_7507.method_7493();
      this.field_7506.method_7491();
      Iterator var7 = this.field_7508.iterator();

      while(var7.hasNext()) {
         label24: {
            Object var8 = var7.next();
            Object var12 = var8;
            if(var2 != null) {
               if(!(var8 instanceof bmg)) {
                  break label24;
               }

               var12 = var8;
            }

            ((bmg)var12).method_7491();
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d () o4
   public class_1404 method_7698() {
      return this.field_7505;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7699() {
      // $FF: Couldn't be decompiled
   }
}
