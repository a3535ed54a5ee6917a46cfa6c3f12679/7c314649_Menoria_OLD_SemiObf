import java.util.Collection;
import java.util.Iterator;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: lN
public abstract class class_226 extends class_215 {

   // $FF: renamed from: S boolean
   private boolean field_1192;
   // $FF: renamed from: T java.lang.String
   private static final String field_1193;
   // $FF: renamed from: U java.lang.String[]
   private static final String[] field_1194;


   // $FF: renamed from: <init> (Al) void
   public void method_1192(class_671 var1) {
      super.method_1192(var1);
   }

   // $FF: renamed from: b () void
   public void initGui() {
      String[] var10000 = class_752.method_4253();
      super.initGui();
      String[] var1 = var10000;
      class_226 var2 = this;
      if(var1 != null) {
         if(this.field_557.cursorCounter8.method_4175().isEmpty()) {
            return;
         }

         this.field_1108 = 160 + (this.width - this.field_1105 - 200) / 2;
         var2 = this;
      }

      var2.field_1192 = true;
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      String[] var10000 = class_752.method_4253();
      super.drawScreen(var1, var2, var3);
      String[] var4 = var10000;
      class_226 var5 = this;
      if(var4 != null) {
         if(!this.field_1192) {
            return;
         }

         var5 = this;
      }

      var5.method_1224();
   }

   // $FF: renamed from: g () void
   private void method_1224() {
      int var2 = this.field_1108 - 124;
      int var3 = this.field_1109;
      String[] var1 = class_752.method_4253();
      boolean var4 = true;
      Collection var5 = this.field_557.cursorCounter8.method_4175();
      byte var10000 = var5.isEmpty();
      if(var1 != null) {
         if(var10000 != 0) {
            return;
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(2896);
         var10000 = 33;
      }

      int var6 = var10000;
      Collection var14 = var5;
      if(var1 != null) {
         if(var5.size() > 5) {
            var6 = 132 / (var5.size() - 1);
         }

         var14 = this.field_557.cursorCounter8.method_4175();
      }

      Iterator var7 = var14.iterator();

      while(var7.hasNext()) {
         class_1645 var8 = (class_1645)var7.next();
         class_1635 var9 = class_1635.field_8489[var8.method_9016()];
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.field_557.method_5288().bindTexture(field_1104);
         this.method_658(var2, var3, 0, 166, 140, 32);
         class_1635 var15 = var9;
         if(var1 != null) {
            if(var9.method_8973()) {
               int var10 = var9.method_8974();
               this.method_658(var2 + 6, var3 + 7, 0 + var10 % 8 * 18, 198 + var10 / 8 * 18, 18, 18);
            }

            var15 = var9;
         }

         label58: {
            String var13;
            label71: {
               var13 = class_1450.method_7896(var15.method_8972(), new Object[0]);
               int var17 = var8.method_9018();
               byte var10001 = 1;
               String[] var12;
               StringBuilder var18;
               if(var1 != null) {
                  if(var17 == 1) {
                     var18 = (new StringBuilder()).append(var13).append(" ");
                     var12 = field_1194;
                     var13 = var18.append(class_1450.method_7896("enchantment.level.2", new Object[0])).toString();
                     if(var1 != null) {
                        break label71;
                     }
                  }

                  var17 = var8.method_9018();
                  var10001 = 2;
               }

               if(var1 != null) {
                  if(var17 == var10001) {
                     var18 = (new StringBuilder()).append(var13).append(" ");
                     var12 = field_1194;
                     var13 = var18.append(class_1450.method_7896("enchantment.level.3", new Object[0])).toString();
                     if(var1 != null) {
                        break label71;
                     }
                  }

                  var17 = var8.method_9018();
                  if(var1 == null) {
                     break label58;
                  }

                  var10001 = 3;
               }

               if(var17 == var10001) {
                  var18 = (new StringBuilder()).append(var13).append(" ");
                  String[] var16 = field_1194;
                  var13 = var18.append(class_1450.method_7896("enchantment.level.4", new Object[0])).toString();
               }
            }

            this.fontRendererObj.drawStringWithShadow(var13, var2 + 10 + 18, var3 + 6, 16777215);
         }

         String var11 = class_1635.method_8976(var8);
         this.fontRendererObj.drawStringWithShadow(var11, var2 + 10 + 18, var3 + 6 + 10, 8355711);
         var3 += var6;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_1203() {
      // $FF: Couldn't be decompiled
   }
}
