import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

// $FF: renamed from: o4
public class class_1404 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_7457;
   // $FF: renamed from: c o_
   private static final class_1418 field_7458;
   // $FF: renamed from: d o4
   private static class_1404 field_7459;
   // $FF: renamed from: e int
   private static int field_7460;
   // $FF: renamed from: f boolean
   private static boolean field_7461;
   // $FF: renamed from: g java.util.Map
   private final Map field_7462;
   // $FF: renamed from: h java.util.List
   private final List field_7463;
   // $FF: renamed from: i java.util.List
   private final List field_7464;
   // $FF: renamed from: j java.util.List
   private final List field_7465;
   // $FF: renamed from: k java.util.List
   private final List field_7466;
   // $FF: renamed from: l java.util.Map
   private final Map field_7467;
   // $FF: renamed from: m int
   private final int field_7468;
   // $FF: renamed from: n java.lang.String
   private final String field_7469;
   // $FF: renamed from: o boolean
   private final boolean field_7470;
   // $FF: renamed from: p boolean
   private boolean field_7471;
   // $FF: renamed from: q o3
   private final class_1402 field_7472;
   // $FF: renamed from: r java.util.List
   private final List field_7473;
   // $FF: renamed from: s java.util.List
   private final List field_7474;
   // $FF: renamed from: t o7
   private final class_1411 field_7475;
   // $FF: renamed from: u o7
   private final class_1411 field_7476;
   // $FF: renamed from: v java.lang.String
   private static final String field_7477;
   // $FF: renamed from: w java.lang.String[]
   private static final String[] field_7478;


   // $FF: renamed from: <init> (bqy, java.lang.String) void
   public void method_7649(bqy param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () void
   public void method_7650() {
      class_1414.method_7718().method_7720(this);
   }

   // $FF: renamed from: c () void
   public void method_7651() {
      String[] var10000 = class_752.method_4253();
      buu.method_9050(0);
      String[] var1 = var10000;
      field_7460 = -1;
      field_7459 = null;
      field_7461 = true;
      int var2 = 0;

      while(var2 < this.field_7464.size()) {
         if(this.field_7462.get(this.field_7463.get(var2)) != null) {
            GL13.glActiveTexture('\u84c0' + var2);
            GL11.glBindTexture(3553, 0);
         }

         ++var2;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d () void
   public void method_7652() {
      String[] var1;
      int var7;
      int var10001;
      label106: {
         String[] var10000 = class_752.method_4253();
         this.field_7471 = false;
         field_7459 = this;
         var1 = var10000;
         this.field_7472.method_7641();
         var7 = this.field_7468;
         var10001 = field_7460;
         if(var1 != null) {
            if(this.field_7468 != field_7460) {
               buu.method_9050(this.field_7468);
               field_7460 = this.field_7468;
            }

            var7 = field_7461;
            if(var1 == null) {
               break label106;
            }

            var10001 = this.field_7470;
         }

         if(var7 != var10001) {
            label95: {
               field_7461 = this.field_7470;
               short var8 = this.field_7470;
               if(var1 != null) {
                  if(this.field_7470) {
                     GL11.glEnable(2884);
                     if(var1 != null) {
                        break label95;
                     }
                  }

                  var8 = 2884;
               }

               GL11.glDisable(var8);
            }
         }

         var7 = 0;
      }

      int var2 = var7;

      class_1404 var9;
      while(true) {
         if(var2 < this.field_7464.size()) {
            var9 = this;
            if(var1 == null) {
               break;
            }

            label109: {
               Object var10 = this.field_7462.get(this.field_7463.get(var2));
               if(var1 != null) {
                  if(var10 == null) {
                     break label109;
                  }

                  GL13.glActiveTexture('\u84c0' + var2);
                  GL11.glEnable(3553);
                  var10 = this.field_7462.get(this.field_7463.get(var2));
               }

               int var4;
               label76: {
                  label110: {
                     Object var3 = var10;
                     var4 = -1;
                     var7 = var3 instanceof bmg;
                     if(var1 != null) {
                        if(var7 != 0) {
                           var4 = ((bmg)var3).field_7291;
                           if(var1 != null) {
                              break label110;
                           }
                        }

                        var7 = var3 instanceof bqh;
                     }

                     if(var1 != null) {
                        if(var7 != 0) {
                           var4 = ((bqh)var3).method_222();
                           if(var1 != null) {
                              break label110;
                           }
                        }

                        var7 = var3 instanceof Integer;
                     }

                     if(var1 == null) {
                        break label76;
                     }

                     if(var7 != 0) {
                        var4 = ((Integer)var3).intValue();
                     }
                  }

                  var7 = var4;
               }

               var10001 = -1;
               if(var1 != null) {
                  if(var7 == -1) {
                     break label109;
                  }

                  GL11.glBindTexture(3553, var4);
                  var7 = buu.method_9054(this.field_7468, (CharSequence)this.field_7463.get(var2));
                  var10001 = var2;
               }

               buu.method_9056(var7, var10001);
            }

            ++var2;
            if(var1 != null) {
               continue;
            }
         }

         var9 = this;
         break;
      }

      Iterator var5 = var9.field_7465.iterator();

      while(var5.hasNext()) {
         class_1417 var6 = (class_1417)var5.next();
         var6.method_7746();
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: e () void
   public void method_7653() {
      this.field_7471 = true;
   }

   // $FF: renamed from: b (java.lang.String) o9
   public class_1417 method_7654(String var1) {
      String[] var2 = class_752.method_4253();
      Map var10000 = this.field_7467;
      String var10001 = var1;
      class_1417 var3;
      if(var2 != null) {
         if(!this.field_7467.containsKey(var1)) {
            var3 = null;
            return var3;
         }

         var10000 = this.field_7467;
         var10001 = var1;
      }

      var3 = (class_1417)var10000.get(var10001);
      return var3;
   }

   // $FF: renamed from: c (java.lang.String) o9
   public class_1417 method_7655(String var1) {
      String[] var2 = class_752.method_4253();
      Map var10000 = this.field_7467;
      String var10001 = var1;
      Object var3;
      if(var2 != null) {
         if(!this.field_7467.containsKey(var1)) {
            var3 = field_7458;
            return (class_1417)var3;
         }

         var10000 = this.field_7467;
         var10001 = var1;
      }

      var3 = (class_1417)var10000.get(var10001);
      return (class_1417)var3;
   }

   // $FF: renamed from: f () void
   private void method_7656() {
      int var2 = 0;
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var1 = var10000;

      String var3;
      int var4;
      String[] var7;
      class_1404 var8;
      Logger var9;
      StringBuilder var10001;
      while(true) {
         if(var2 < this.field_7463.size()) {
            var3 = (String)this.field_7463.get(var2);
            var8 = this;
            if(var1 == null) {
               break;
            }

            var4 = buu.method_9054(this.field_7468, var3);
            if(var1 != null) {
               label43: {
                  if(var4 == -1) {
                     var9 = field_7457;
                     var10001 = new StringBuilder();
                     var7 = field_7478;
                     var9.warn(var10001.append("Shader ").append(this.field_7469).append("could not find sampler named ").append(var3).append(" in the specified shader program.").toString());
                     this.field_7462.remove(var3);
                     this.field_7463.remove(var5);
                     --var5;
                     if(var1 != null) {
                        break label43;
                     }
                  }

                  this.field_7464.add(Integer.valueOf(var4));
               }
            }

            ++var2;
            ++var5;
            if(var1 != null) {
               continue;
            }
         }

         var8 = this;
         break;
      }

      Iterator var10 = var8.field_7465.iterator();

      while(var10.hasNext()) {
         label31: {
            class_1417 var6 = (class_1417)var10.next();
            var3 = var6.method_7736();
            var4 = buu.method_9054(this.field_7468, var3);
            if(var1 != null) {
               if(var4 == -1) {
                  var9 = field_7457;
                  var10001 = new StringBuilder();
                  var7 = field_7478;
                  var9.warn(var10001.append("Could not find uniform named ").append(var3).append(" in the specified").append(" shader program.").toString());
                  if(var1 != null) {
                     break label31;
                  }
               }

               this.field_7466.add(Integer.valueOf(var4));
            }

            var6.method_7735(var4);
            this.field_7467.put(var3, var6);
         }

         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (com.google.gson.JsonElement) void
   private void method_7657(JsonElement var1) {
      String[] var10000 = class_752.method_4253();
      String[] var5 = field_7478;
      JsonObject var3 = class_1702.method_9448(var1, "sampler");
      String[] var2 = var10000;
      String var4 = class_1702.method_9437(var3, "name");
      boolean var6 = class_1702.method_9431(var3, "file");
      if(var2 != null) {
         if(!var6) {
            this.field_7462.put(var4, (Object)null);
            this.field_7463.add(var4);
            if(var2 != null) {
               return;
            }
         }

         this.field_7463.add(var4);
      }

   }

   // $FF: renamed from: b (java.lang.String, java.lang.Object) void
   public void method_7658(String var1, Object var2) {
      String[] var3 = class_752.method_4253();
      Map var10000 = this.field_7462;
      String var10001 = var1;
      if(var3 != null) {
         if(this.field_7462.containsKey(var1)) {
            this.field_7462.remove(var1);
         }

         var10000 = this.field_7462;
         var10001 = var1;
      }

      var10000.put(var10001, var2);
      this.method_7653();
   }

   // $FF: renamed from: c (com.google.gson.JsonElement) void
   private void method_7659(JsonElement param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g () o7
   public class_1411 method_7660() {
      return this.field_7475;
   }

   // $FF: renamed from: h () o7
   public class_1411 method_7661() {
      return this.field_7476;
   }

   // $FF: renamed from: i () int
   public int method_7662() {
      return this.field_7468;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7663() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_7664(Exception var0) {
      return var0;
   }
}
