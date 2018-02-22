import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.vecmath.Matrix4f;
import org.apache.commons.io.IOUtils;

// $FF: renamed from: o5
public class class_1406 {

   // $FF: renamed from: b bmg
   private final bmg field_7481;
   // $FF: renamed from: c bqy
   private final bqy field_7482;
   // $FF: renamed from: d java.lang.String
   private final String field_7483;
   // $FF: renamed from: e java.util.List
   private final List field_7484;
   // $FF: renamed from: f java.util.Map
   private final Map field_7485;
   // $FF: renamed from: g java.util.List
   private final List field_7486;
   // $FF: renamed from: h javax.vecmath.Matrix4f
   private Matrix4f field_7487;
   // $FF: renamed from: i int
   private int field_7488;
   // $FF: renamed from: j int
   private int field_7489;
   // $FF: renamed from: k float
   private float field_7490;
   // $FF: renamed from: l float
   private float field_7491;
   // $FF: renamed from: m java.lang.String
   private static final String field_7492;
   // $FF: renamed from: n java.lang.String[]
   private static final String[] field_7493;


   // $FF: renamed from: <init> (bqf, bqy, bmg, bqx) void
   public void method_7667(bqf var1, bqy var2, bmg var3, bqx var4) {
      super();
      this.field_7484 = Lists.newArrayList();
      this.field_7485 = Maps.newHashMap();
      this.field_7486 = Lists.newArrayList();
      this.field_7482 = var2;
      this.field_7481 = var3;
      this.field_7490 = 0.0F;
      this.field_7491 = 0.0F;
      this.field_7488 = var3.field_7287;
      this.field_7489 = var3.field_7288;
      this.field_7483 = var4.toString();
      this.method_7675();
      this.method_7668(var1, var4);
   }

   // $FF: renamed from: b (bqf, bqx) void
   public void method_7668(bqf var1, bqx var2) {
      JsonParser var4 = new JsonParser();
      String[] var10000 = class_752.method_4253();
      InputStream var5 = null;
      String[] var3 = var10000;
      boolean var23 = false;

      try {
         label187: {
            var23 = true;
            bqw var6 = this.field_7482.method_224(var2);
            var5 = var6.method_234();
            JsonObject var31 = var4.parse(IOUtils.toString(var5, Charsets.UTF_8)).getAsJsonObject();

            JsonArray var8;
            int var9;
            Iterator var10;
            JsonElement var11;
            class_129 var12;
            StringBuilder var10001;
            JsonObject var33;
            String var34;
            label178: {
               String[] var15;
               boolean var32;
               label177: {
                  label188: {
                     try {
                        var15 = field_7493;
                        var32 = class_1702.method_9433(var31, "targets");
                        if(var3 == null) {
                           break label177;
                        }

                        if(!var32) {
                           break label188;
                        }
                     } catch (Exception var28) {
                        throw method_7680(var28);
                     }

                     var15 = field_7493;
                     var8 = var31.getAsJsonArray("targets");
                     var9 = 0;
                     var10 = var8.iterator();

                     while(var10.hasNext()) {
                        var11 = (JsonElement)var10.next();

                        try {
                           this.method_7669(var11);
                        } catch (Exception var25) {
                           var12 = class_129.method_594(var25);
                           var10001 = new StringBuilder();
                           var15 = field_7493;
                           var12.method_592(var10001.append("targets[").append(var9).append("]").toString());
                           throw var12;
                        }

                        if(var3 == null) {
                           var23 = false;
                           return;
                        }

                        ++var9;
                        if(var3 == null) {
                           break;
                        }
                     }
                  }

                  try {
                     var33 = var31;
                     var15 = field_7493;
                     var34 = "passes";
                     if(var3 == null) {
                        break label178;
                     }

                     var32 = class_1702.method_9433(var31, "passes");
                  } catch (Exception var27) {
                     throw method_7680(var27);
                  }
               }

               try {
                  if(!var32) {
                     var23 = false;
                     break label187;
                  }

                  var33 = var31;
                  var15 = field_7493;
                  var34 = "passes";
               } catch (Exception var26) {
                  throw method_7680(var26);
               }
            }

            var8 = var33.getAsJsonArray(var34);
            var9 = 0;
            var10 = var8.iterator();

            while(true) {
               if(var10.hasNext()) {
                  var11 = (JsonElement)var10.next();

                  try {
                     this.method_7670(var1, var11);
                  } catch (Exception var24) {
                     var12 = class_129.method_594(var24);
                     var10001 = new StringBuilder();
                     String[] var10002 = field_7493;
                     var12.method_592(var10001.append("passes[").append(var9).append("]").toString());
                     throw var12;
                  }

                  if(var3 == null) {
                     var23 = false;
                     return;
                  }

                  ++var9;
                  if(var3 != null) {
                     continue;
                  }

                  var23 = false;
                  break;
               }

               var23 = false;
               break;
            }
         }
      } catch (Exception var29) {
         class_129 var7 = class_129.method_594(var29);
         var7.method_593(var2.method_8228());
         throw var7;
      } finally {
         if(var23) {
            IOUtils.closeQuietly(var5);
         }
      }

      IOUtils.closeQuietly(var5);
   }

   // $FF: renamed from: b (com.google.gson.JsonElement) void
   private void method_7669(JsonElement var1) {
      String[] var2 = class_752.method_4253();
      JsonElement var10000 = var1;
      if(var2 != null) {
         if(class_1702.method_9432(var1)) {
            this.method_7672(var1.getAsString(), this.field_7488, this.field_7489);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1;
      }

      String[] var7 = field_7493;
      JsonObject var3 = class_1702.method_9448(var10000, "target");
      String var4 = class_1702.method_9437(var3, "name");
      int var5 = class_1702.method_9447(var3, "width", this.field_7488);
      int var6 = class_1702.method_9447(var3, "height", this.field_7489);
      class_1406 var8 = this;
      if(var2 != null) {
         if(this.field_7485.containsKey(var4)) {
            class_129 var9 = new class_129;
            var9.method_590(var4 + " is already defined");
            throw var9;
         }

         var8 = this;
      }

      var8.method_7672(var4, var5, var6);
   }

   // $FF: renamed from: b (bqf, com.google.gson.JsonElement) void
   private void method_7670(bqf param1, JsonElement param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (com.google.gson.JsonElement) void
   private void method_7671(JsonElement param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String, int, int) void
   public void method_7672(String var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      bmg var10001 = new bmg;
      var10001.method_7484(var2, var3, true);
      bmg var5 = var10001;
      var5.method_7494(0.0F, 0.0F, 0.0F, 0.0F);
      String[] var4 = var10000;
      this.field_7485.put(var1, var5);
      int var6 = var2;
      int var7 = this.field_7488;
      if(var4 != null) {
         if(var2 != this.field_7488) {
            return;
         }

         var6 = var3;
         if(var4 == null) {
            return;
         }

         var7 = this.field_7489;
      }

      if(var6 == var7) {
         this.field_7486.add(var5);
      }

   }

   // $FF: renamed from: b () void
   public void method_7673() {
      String[] var10000 = class_752.method_4253();
      Iterator var2 = this.field_7485.values().iterator();
      String[] var1 = var10000;

      while(true) {
         if(var2.hasNext()) {
            bmg var3 = (bmg)var2.next();
            var3.method_7486();
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         var2 = this.field_7484.iterator();
         break;
      }

      while(true) {
         if(var2.hasNext()) {
            class_1409 var4 = (class_1409)var2.next();
            var4.method_7693();
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         this.field_7484.clear();
         break;
      }

   }

   // $FF: renamed from: b (java.lang.String, bmg, bmg) o6
   public class_1409 method_7674(String var1, bmg var2, bmg var3) {
      class_1409 var10000 = new class_1409;
      var10000.method_7692(this.field_7482, var1, var2, var3);
      class_1409 var4 = var10000;
      this.field_7484.add(this.field_7484.size(), var4);
      return var4;
   }

   // $FF: renamed from: d () void
   private void method_7675() {
      this.field_7487 = new Matrix4f();
      this.field_7487.setIdentity();
      this.field_7487.m00 = 2.0F / (float)this.field_7481.field_7285;
      this.field_7487.m11 = 2.0F / (float)(-this.field_7481.field_7286);
      this.field_7487.m22 = -0.0020001999F;
      this.field_7487.m33 = 1.0F;
      this.field_7487.m03 = -1.0F;
      this.field_7487.m13 = 1.0F;
      this.field_7487.m23 = -1.0001999F;
   }

   // $FF: renamed from: b (int, int) void
   public void method_7676(int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      this.field_7488 = this.field_7481.field_7285;
      String[] var3 = var10000;
      this.field_7489 = this.field_7481.field_7286;
      this.method_7675();
      Iterator var4 = this.field_7484.iterator();

      while(true) {
         if(var4.hasNext()) {
            class_1409 var5 = (class_1409)var4.next();
            var5.method_7696(this.field_7487);
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         var4 = this.field_7486.iterator();
         break;
      }

      while(var4.hasNext()) {
         bmg var6 = (bmg)var4.next();
         var6.method_7485(var1, var2);
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (float) void
   public void method_7677(float var1) {
      String[] var2;
      label41: {
         label40: {
            var2 = class_752.method_4253();
            if(var2 != null) {
               if(var1 >= this.field_7491) {
                  break label40;
               }

               this.field_7490 += 1.0F - this.field_7491;
               this.field_7490 += var1;
            }

            if(var2 != null) {
               break label41;
            }
         }

         this.field_7490 += var1 - this.field_7491;
      }

      this.field_7491 = var1;

      class_1406 var10000;
      while(true) {
         if(this.field_7490 > 20.0F) {
            var10000 = this;
            if(var2 == null) {
               break;
            }

            this.field_7490 -= 20.0F;
            if(var2 != null) {
               continue;
            }
         }

         var10000 = this;
         break;
      }

      Iterator var3 = var10000.field_7484.iterator();

      while(var3.hasNext()) {
         class_1409 var4 = (class_1409)var3.next();
         var4.method_7697(this.field_7490 / 20.0F);
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: e () java.lang.String
   public final String method_7678() {
      return this.field_7483;
   }

   // $FF: renamed from: b (java.lang.String) bmg
   private bmg method_7679(String var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = var1;
      bmg var3;
      if(var2 != null) {
         if(var1 == null) {
            var3 = null;
            return var3;
         }

         var10000 = var1;
      }

      if(var2 != null) {
         String[] var10001 = field_7493;
         if(((String)var10000).equals("minecraft:main")) {
            var3 = this.field_7481;
            return var3;
         }

         var10000 = this.field_7485.get(var1);
      }

      var3 = (bmg)var10000;
      return var3;
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_7680(Exception var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7681() {
      // $FF: Couldn't be decompiled
   }
}
