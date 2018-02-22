import java.util.Iterator;
import java.util.List;

// $FF: renamed from: a5
public abstract class class_872 {

   // $FF: renamed from: b a5[]
   public static final class_872[] field_4243;
   // $FF: renamed from: c a5
   public static final class_872 field_4244;
   // $FF: renamed from: d a5
   public static final class_872 field_4245;
   // $FF: renamed from: e a5
   public static final class_872 field_4246;
   // $FF: renamed from: f a5
   public static final class_872 field_4247;
   // $FF: renamed from: g a5
   public static final class_872 field_4248;
   // $FF: renamed from: h a5
   public static final class_872 field_4249;
   // $FF: renamed from: i a5
   public static final class_872 fontRendererInstance0;
   // $FF: renamed from: j a5
   public static final class_872 fontRendererInstance1;
   // $FF: renamed from: k a5
   public static final class_872 fontRendererInstance2;
   // $FF: renamed from: l a5
   public static final class_872 fontRendererInstance3;
   // $FF: renamed from: m a5
   public static final class_872 fontRendererInstance4;
   // $FF: renamed from: n a5
   public static final class_872 fontRendererInstance5;
   // $FF: renamed from: o int
   private final int fontRendererInstance6;
   // $FF: renamed from: p java.lang.String
   private final String fontRendererInstance7;
   // $FF: renamed from: q java.lang.String
   private String fontRendererInstance8;
   // $FF: renamed from: r boolean
   private boolean fontRendererInstance9;
   // $FF: renamed from: s boolean
   private boolean xPosition0;
   // $FF: renamed from: t E[]
   private class_93[] xPosition1;
   // $FF: renamed from: u add
   private add xPosition2;
   // $FF: renamed from: v java.lang.String
   private static final String xPosition3;
   // $FF: renamed from: w java.lang.String[]
   private static final String[] xPosition4;


   // $FF: renamed from: <init> (int, java.lang.String) void
   public void method_5146(int var1, String var2) {
      super();
      String[] var10001 = xPosition4;
      this.fontRendererInstance8 = "items.png";
      this.fontRendererInstance9 = true;
      this.xPosition0 = true;
      this.fontRendererInstance6 = var1;
      this.fontRendererInstance7 = var2;
      field_4243[var1] = this;
   }

   // $FF: renamed from: b () int
   public int method_5147() {
      return this.fontRendererInstance6;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_5148() {
      return this.fontRendererInstance7;
   }

   // $FF: renamed from: d () java.lang.String
   public String method_5149() {
      StringBuilder var10000 = new StringBuilder();
      String[] var10001 = xPosition4;
      return var10000.append("itemGroup.").append(this.method_5148()).toString();
   }

   // $FF: renamed from: e () add
   public add method_5150() {
      String[] var1 = class_752.method_4253();
      add var10000 = this.xPosition2;
      if(var1 != null) {
         if(this.xPosition2 == null) {
            add var10001 = new add;
            var10001.method_3726(this.method_5151(), 1, this.method_5152());
            this.xPosition2 = var10001;
         }

         var10000 = this.xPosition2;
      }

      return var10000;
   }

   // $FF: renamed from: f () adb
   public abstract adb method_5151();

   // $FF: renamed from: g () int
   public int method_5152() {
      return 0;
   }

   // $FF: renamed from: h () java.lang.String
   public String method_5153() {
      return this.fontRendererInstance8;
   }

   // $FF: renamed from: b (java.lang.String) a5
   public class_872 method_5154(String var1) {
      this.fontRendererInstance8 = var1;
      return this;
   }

   // $FF: renamed from: i () boolean
   public boolean method_5155() {
      return this.xPosition0;
   }

   // $FF: renamed from: j () a5
   public class_872 method_5156() {
      this.xPosition0 = false;
      return this;
   }

   // $FF: renamed from: k () boolean
   public boolean method_5157() {
      return this.fontRendererInstance9;
   }

   // $FF: renamed from: l () a5
   public class_872 method_5158() {
      this.fontRendererInstance9 = false;
      return this;
   }

   // $FF: renamed from: m () int
   public int method_5159() {
      return this.fontRendererInstance6 % 6;
   }

   // $FF: renamed from: n () boolean
   public boolean method_5160() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.fontRendererInstance6;
      if(var1 != null) {
         var10000 = this.fontRendererInstance6 < 6?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: o () E[]
   public class_93[] method_5161() {
      return this.xPosition1;
   }

   // $FF: renamed from: b (E[]) a5
   public class_872 method_5162(class_93 ... var1) {
      this.xPosition1 = var1;
      return this;
   }

   // $FF: renamed from: b (E) boolean
   public boolean method_5163(class_93 var1) {
      String[] var2 = class_752.method_4253();
      class_93[] var10000 = this.xPosition1;
      if(var2 != null) {
         if(this.xPosition1 == null) {
            return false;
         }

         var10000 = this.xPosition1;
      }

      class_93[] var3 = var10000;
      int var4 = var3.length;
      int var5 = 0;

      while(var5 < var4) {
         class_93 var6 = var3[var5];
         if(var2 != null) {
            if(var6 == var1) {
               return true;
            }

            ++var5;
         }

         if(var2 == null) {
            break;
         }
      }

      return false;
   }

   // $FF: renamed from: b (java.util.List) void
   public void method_5164(List var1) {
      String[] var10000 = class_752.method_4253();
      Iterator var3 = adb.field_2329.iterator();
      String[] var2 = var10000;

      while(true) {
         if(var3.hasNext()) {
            adb var4 = (adb)var3.next();
            if(var2 == null) {
               break;
            }

            label48: {
               adb var5 = var4;
               if(var2 != null) {
                  if(var4 == null) {
                     break label48;
                  }

                  var5 = var4;
               }

               if(var2 != null) {
                  if(var5.getCreativeTab() != this) {
                     break label48;
                  }

                  var5 = var4;
               }

               var5.getSubItems(var4, this, var1);
            }

            if(var2 != null) {
               continue;
            }
         }

         class_872 var6 = this;
         if(var2 != null) {
            if(this.method_5161() == null) {
               break;
            }

            var6 = this;
         }

         var6.method_5165(var1, this.method_5161());
         break;
      }

   }

   // $FF: renamed from: b (java.util.List, E[]) void
   public void method_5165(List var1, class_93 ... var2) {
      String[] var10000 = class_752.method_4253();
      class_940[] var4 = class_940.field_4782;
      String[] var3 = var10000;
      int var5 = var4.length;
      int var6 = 0;

      while(var6 < var5) {
         class_940 var7 = var4[var6];
         if(var3 != null) {
            if(var7 != null && var7.field_4810 != null) {
               boolean var8 = false;
               int var9 = 0;

               boolean var10;
               while(true) {
                  if(var9 < var2.length) {
                     var10 = var8;
                     if(var3 == null || var3 == null) {
                        break;
                     }

                     if(!var8) {
                        if(var7.field_4810 == var2[var9]) {
                           var8 = true;
                        }

                        ++var9;
                        if(var3 != null) {
                           continue;
                        }
                     }
                  }

                  var10 = var8;
                  break;
               }

               if(var3 != null && var10) {
                  class_535 var10001 = class_1010.field_5259;
                  class_1655 var10002 = new class_1655;
                  var10002.method_9103(var7, var7.method_5482());
                  var1.add(var10001.getBlock04(var10002));
               }
            }

            ++var6;
         }

         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_5166() {
      // $FF: Couldn't be decompiled
   }
}
