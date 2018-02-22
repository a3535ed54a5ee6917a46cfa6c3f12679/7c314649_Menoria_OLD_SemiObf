import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: km
public class class_1349 extends class_1348 {

   // $FF: renamed from: h net.minecraft.server.MinecraftServer
   private final MinecraftServer field_6949;
   // $FF: renamed from: i java.util.Set
   private final Set field_6950;
   // $FF: renamed from: j jR
   private class_1295 field_6951;


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer) void
   public void method_7194(MinecraftServer var1) {
      super.method_7159();
      this.field_6950 = new HashSet();
      this.field_6949 = var1;
   }

   // $FF: renamed from: b (ki) void
   public void method_7185(class_1345 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_7185(var1);
      String[] var2 = var10000;
      class_1349 var3 = this;
      if(var2 != null) {
         if(this.field_6950.contains(var1.writeText4())) {
            class_1627 var4 = this.field_6949.method_2383();
            class_341 var10001 = new class_341;
            var10001.method_1930(var1, 0);
            var4.method_8889(var10001);
         }

         var3 = this;
      }

      var3.method_7196();
   }

   // $FF: renamed from: h (java.lang.String) void
   public void method_7186(String var1) {
      super.method_7186(var1);
      class_1627 var10000 = this.field_6949.method_2383();
      class_341 var10001 = new class_341;
      var10001.method_1931(var1);
      var10000.method_8889(var10001);
      this.method_7196();
   }

   // $FF: renamed from: b (int, kh) void
   public void method_7171(int var1, class_1344 var2) {
      class_1344 var4 = this.method_7172(var1);
      String[] var10000 = class_752.method_4253();
      super.method_7171(var1, var2);
      String[] var3 = var10000;
      class_1344 var5 = var4;
      class_1349 var6;
      class_1627 var7;
      class_313 var8;
      if(var3 != null) {
         label40: {
            if(var4 != var2) {
               var5 = var4;
               if(var3 == null) {
                  break label40;
               }

               if(var4 != null) {
                  label34: {
                     var6 = this;
                     class_1344 var10001 = var4;
                     if(var3 != null) {
                        if(this.method_7201(var4) > 0) {
                           var7 = this.field_6949.method_2383();
                           var8 = new class_313;
                           var8.method_1784(var1, var2);
                           var7.method_8889(var8);
                           if(var3 != null) {
                              break label34;
                           }
                        }

                        var6 = this;
                        var10001 = var4;
                     }

                     var6.method_7200(var10001);
                  }
               }
            }

            var5 = var2;
         }
      }

      if(var5 != null) {
         label26: {
            var6 = this;
            if(var3 != null) {
               if(this.field_6950.contains(var2)) {
                  var7 = this.field_6949.method_2383();
                  var8 = new class_313;
                  var8.method_1784(var1, var2);
                  var7.method_8889(var8);
                  if(var3 != null) {
                     break label26;
                  }
               }

               var6 = this;
            }

            var6.method_7198(var2);
         }
      }

      this.method_7196();
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) boolean
   public boolean method_7176(String var1, String var2) {
      String[] var3 = class_752.method_4253();
      boolean var10000 = super.method_7176(var1, var2);
      if(var3 != null) {
         if(var10000) {
            class_1351 var4 = this.method_7173(var2);
            class_1627 var5 = this.field_6949.method_2383();
            class_305 var10001 = new class_305;
            var10001.method_1738(var4, Arrays.asList(new String[]{var1}), 3);
            var5.method_8889(var10001);
            this.method_7196();
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: b (java.lang.String, ko) void
   public void method_7178(String var1, class_1351 var2) {
      super.method_7178(var1, var2);
      class_1627 var10000 = this.field_6949.method_2383();
      class_305 var10001 = new class_305;
      var10001.method_1738(var2, Arrays.asList(new String[]{var1}), 4);
      var10000.method_8889(var10001);
      this.method_7196();
   }

   // $FF: renamed from: c (kh) void
   public void method_7182(class_1344 var1) {
      super.method_7182(var1);
      this.method_7196();
   }

   // $FF: renamed from: d (kh) void
   public void method_7183(class_1344 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_7183(var1);
      String[] var2 = var10000;
      class_1349 var3 = this;
      if(var2 != null) {
         if(this.field_6950.contains(var1)) {
            class_1627 var4 = this.field_6949.method_2383();
            class_306 var10001 = new class_306;
            var10001.method_1748(var1, 2);
            var4.method_8889(var10001);
         }

         var3 = this;
      }

      var3.method_7196();
   }

   // $FF: renamed from: e (kh) void
   public void method_7184(class_1344 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_7184(var1);
      String[] var2 = var10000;
      class_1349 var3 = this;
      if(var2 != null) {
         if(this.field_6950.contains(var1)) {
            this.method_7200(var1);
         }

         var3 = this;
      }

      var3.method_7196();
   }

   // $FF: renamed from: b (ko) void
   public void method_7187(class_1351 var1) {
      super.method_7187(var1);
      class_1627 var10000 = this.field_6949.method_2383();
      class_305 var10001 = new class_305;
      var10001.method_1737(var1, 0);
      var10000.method_8889(var10001);
      this.method_7196();
   }

   // $FF: renamed from: c (ko) void
   public void method_7188(class_1351 var1) {
      super.method_7188(var1);
      class_1627 var10000 = this.field_6949.method_2383();
      class_305 var10001 = new class_305;
      var10001.method_1737(var1, 2);
      var10000.method_8889(var10001);
      this.method_7196();
   }

   // $FF: renamed from: d (ko) void
   public void method_7189(class_1351 var1) {
      super.method_7189(var1);
      class_1627 var10000 = this.field_6949.method_2383();
      class_305 var10001 = new class_305;
      var10001.method_1737(var1, 1);
      var10000.method_8889(var10001);
      this.method_7196();
   }

   // $FF: renamed from: b (jR) void
   public void method_7195(class_1295 var1) {
      this.field_6951 = var1;
   }

   // $FF: renamed from: f () void
   protected void method_7196() {
      String[] var1 = class_752.method_4253();
      class_1295 var10000 = this.field_6951;
      if(var1 != null) {
         if(this.field_6951 == null) {
            return;
         }

         var10000 = this.field_6951;
      }

      var10000.method_6771();
   }

   // $FF: renamed from: f (kh) java.util.List
   public List method_7197(class_1344 var1) {
      ArrayList var3 = new ArrayList();
      String[] var10000 = class_752.method_4253();
      class_306 var10002 = new class_306;
      var10002.method_1748(var1, 0);
      var3.add(var10002);
      int var4 = 0;
      String[] var2 = var10000;

      class_1349 var7;
      while(true) {
         if(var4 < 3) {
            var7 = this;
            if(var2 == null) {
               break;
            }

            if(this.method_7172(var4) == var1) {
               class_313 var10001 = new class_313;
               var10001.method_1784(var4, var1);
               var3.add(var10001);
            }

            ++var4;
            if(var2 != null) {
               continue;
            }
         }

         var7 = this;
         break;
      }

      Iterator var6 = var7.method_7164(var1).iterator();

      ArrayList var8;
      while(true) {
         if(var6.hasNext()) {
            class_1345 var5 = (class_1345)var6.next();
            var8 = var3;
            if(var2 == null) {
               break;
            }

            class_341 var9 = new class_341;
            var9.method_1930(var5, 0);
            var3.add(var9);
            if(var2 != null) {
               continue;
            }
         }

         var8 = var3;
         break;
      }

      return var8;
   }

   // $FF: renamed from: g (kh) void
   public void method_7198(class_1344 var1) {
      String[] var10000 = class_752.method_4253();
      List var3 = this.method_7197(var1);
      String[] var2 = var10000;
      Iterator var4 = this.field_6949.method_2383().field_8456.iterator();

      label29:
      while(true) {
         if(var4.hasNext()) {
            class_793 var5 = (class_793)var4.next();
            if(var2 == null) {
               break;
            }

            Iterator var6 = var3.iterator();

            while(var6.hasNext()) {
               class_250 var7 = (class_250)var6.next();
               var5.field_3654.method_9291(var7);
               if(var2 == null) {
                  continue label29;
               }

               if(var2 == null) {
                  break;
               }
            }

            if(var2 != null) {
               continue;
            }
         }

         this.field_6950.add(var1);
         break;
      }

   }

   // $FF: renamed from: h (kh) java.util.List
   public List method_7199(class_1344 var1) {
      String[] var10000 = class_752.method_4253();
      ArrayList var3 = new ArrayList();
      class_306 var10002 = new class_306;
      var10002.method_1748(var1, 1);
      var3.add(var10002);
      String[] var2 = var10000;
      int var4 = 0;

      while(var4 < 3) {
         if(this.method_7172(var4) == var1) {
            class_313 var10001 = new class_313;
            var10001.method_1784(var4, var1);
            var3.add(var10001);
         }

         ++var4;
         if(var2 == null) {
            break;
         }
      }

      return var3;
   }

   // $FF: renamed from: i (kh) void
   public void method_7200(class_1344 var1) {
      String[] var10000 = class_752.method_4253();
      List var3 = this.method_7199(var1);
      String[] var2 = var10000;
      Iterator var4 = this.field_6949.method_2383().field_8456.iterator();

      label29:
      while(true) {
         if(var4.hasNext()) {
            class_793 var5 = (class_793)var4.next();
            if(var2 == null) {
               break;
            }

            Iterator var6 = var3.iterator();

            while(var6.hasNext()) {
               class_250 var7 = (class_250)var6.next();
               var5.field_3654.method_9291(var7);
               if(var2 == null) {
                  continue label29;
               }

               if(var2 == null) {
                  break;
               }
            }

            if(var2 != null) {
               continue;
            }
         }

         this.field_6950.remove(var1);
         break;
      }

   }

   // $FF: renamed from: j (kh) int
   public int method_7201(class_1344 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;
      int var4 = 0;

      while(var4 < 3) {
         if(this.method_7172(var4) == var1) {
            ++var3;
         }

         ++var4;
         if(var2 == null) {
            break;
         }
      }

      return var3;
   }
}
