import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: bi
public class class_957 {

   // $FF: renamed from: b java.util.regex.Pattern
   private static final Pattern field_4840;
   // $FF: renamed from: c java.util.regex.Pattern
   private static final Pattern field_4841;
   // $FF: renamed from: d java.util.regex.Pattern
   private static final Pattern field_4842;
   // $FF: renamed from: e java.lang.String
   private static final String field_4843;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_4844;


   // $FF: renamed from: <init> () void
   public void method_5515() {
      super();
   }

   // $FF: renamed from: b (bh, java.lang.String) xi
   public static class_793 method_5516(class_20 var0, String var1) {
      class_793 var5;
      label31: {
         String[] var10000 = class_752.method_4253();
         class_793[] var3 = method_5518(var0, var1);
         String[] var2 = var10000;
         class_793[] var4 = var3;
         if(var2 != null) {
            if(var3 == null) {
               break label31;
            }

            var4 = var3;
         }

         if(var2 != null) {
            if(var4.length != 1) {
               break label31;
            }

            var4 = var3;
         }

         var5 = var4[0];
         return var5;
      }

      var5 = null;
      return var5;
   }

   // $FF: renamed from: c (bh, java.lang.String) rV
   public static class_66 method_5517(class_20 var0, String var1) {
      String[] var10000 = class_752.method_4253();
      class_793[] var3 = method_5518(var0, var1);
      String[] var2 = var10000;
      class_793[] var6 = var3;
      if(var2 != null) {
         if(var3 == null) {
            return null;
         }

         var6 = var3;
      }

      int var7 = var6.length;
      if(var2 != null) {
         if(var7 == 0) {
            return null;
         }

         var7 = var3.length;
      }

      class_66[] var4 = new class_66[var7];
      int var5 = 0;

      class_66[] var8;
      while(true) {
         if(var5 < var4.length) {
            var8 = var4;
            if(var2 == null) {
               break;
            }

            var4[var5] = var3[var5].method_65();
            ++var5;
            if(var2 != null) {
               continue;
            }
         }

         var8 = var4;
         break;
      }

      return class_1790.method_9852(var8);
   }

   // $FF: renamed from: d (bh, java.lang.String) xi[]
   public static class_793[] method_5518(class_20 var0, String var1) {
      String[] var10000 = class_752.method_4253();
      Matcher var3 = field_4840.matcher(var1);
      String[] var2 = var10000;
      Matcher var20 = var3;
      if(var2 != null) {
         if(!var3.matches()) {
            return null;
         }

         var20 = var3;
      }

      Map var4 = method_5528(var20.group(2));
      String var5 = var3.group(1);
      int var6 = method_5523(var5);
      int var7 = method_5524(var5);
      int var8 = method_5526(var5);
      int var9 = method_5525(var5);
      int var10 = method_5527(var5);
      int var11 = class_94.field_44.method_443();
      class_1661 var12 = var0.method_68();
      Map var13 = method_5519(var4);
      String var14 = null;
      String var15 = null;
      boolean var16 = false;
      String[] var19 = field_4844;
      boolean var21 = var4.containsKey("rm");
      if(var2 != null) {
         if(var21) {
            var6 = class_1715.method_9581((String)var4.get("rm"), var6);
            var16 = true;
         }

         var21 = var4.containsKey("r");
      }

      if(var2 != null) {
         if(var21) {
            var7 = class_1715.method_9581((String)var4.get("r"), var7);
            var16 = true;
         }

         var19 = field_4844;
         var21 = var4.containsKey("lm");
      }

      if(var2 != null) {
         if(var21) {
            var19 = field_4844;
            var8 = class_1715.method_9581((String)var4.get("lm"), var8);
         }

         var21 = var4.containsKey("l");
      }

      if(var2 != null) {
         if(var21) {
            var9 = class_1715.method_9581((String)var4.get("l"), var9);
         }

         var21 = var4.containsKey("x");
      }

      if(var2 != null) {
         if(var21) {
            var12.field_8646 = class_1715.method_9581((String)var4.get("x"), var12.field_8646);
            var16 = true;
         }

         var21 = var4.containsKey("y");
      }

      if(var2 != null) {
         if(var21) {
            var12.field_8647 = class_1715.method_9581((String)var4.get("y"), var12.field_8647);
            var16 = true;
         }

         var21 = var4.containsKey("z");
      }

      if(var2 != null) {
         if(var21) {
            var12.field_8648 = class_1715.method_9581((String)var4.get("z"), var12.field_8648);
            var16 = true;
         }

         var21 = var4.containsKey("m");
      }

      if(var2 != null) {
         if(var21) {
            var11 = class_1715.method_9581((String)var4.get("m"), var11);
         }

         var21 = var4.containsKey("c");
      }

      String var10001;
      Map var22;
      label142: {
         label158: {
            if(var2 != null) {
               if(var21) {
                  var10 = class_1715.method_9581((String)var4.get("c"), var10);
               }

               var22 = var4;
               var19 = field_4844;
               var10001 = "team";
               if(var2 == null) {
                  break label158;
               }

               var21 = var4.containsKey("team");
            }

            if(!var21) {
               break label142;
            }

            var22 = var4;
            var19 = field_4844;
            var10001 = "team";
         }

         var15 = (String)var22.get(var10001);
      }

      label131: {
         var22 = var4;
         var19 = field_4844;
         var10001 = "name";
         if(var2 != null) {
            if(!var4.containsKey("name")) {
               break label131;
            }

            var22 = var4;
            var10001 = "name";
         }

         var14 = (String)var22.get(var10001);
      }

      ahb var17;
      List var18;
      List var23;
      class_793[] var24;
      label170: {
         var17 = var16?var0.method_69():null;
         var21 = var5.equals("p");
         if(var2 != null) {
            if(var21) {
               break label170;
            }

            var21 = var5.equals("a");
         }

         if(var2 != null) {
            if(var21) {
               break label170;
            }

            var21 = var5.equals("r");
         }

         if(!var21) {
            return null;
         }

         var18 = MinecraftServer.method_2348().method_2383().method_8901(var12, var6, var7, 0, var11, var8, var9, var13, var14, var15, var17);
         Collections.shuffle(var18);
         var18 = var18.subList(0, Math.min(var10, var18.size()));
         var23 = var18;
         if(var2 != null) {
            if(var18.isEmpty()) {
               var24 = new class_793[0];
               return var24;
            }

            var23 = var18;
         }

         var24 = (class_793[])((class_793[])var23.toArray(new class_793[var18.size()]));
         return var24;
      }

      var18 = MinecraftServer.method_2348().method_2383().method_8901(var12, var6, var7, var10, var11, var8, var9, var13, var14, var15, var17);
      var23 = var18;
      if(var2 != null) {
         if(var18.isEmpty()) {
            var24 = new class_793[0];
            return var24;
         }

         var23 = var18;
      }

      var24 = (class_793[])((class_793[])var23.toArray(new class_793[var18.size()]));
      return var24;
   }

   // $FF: renamed from: b (java.util.Map) java.util.Map
   public static Map method_5519(Map var0) {
      String[] var10000 = class_752.method_4253();
      HashMap var2 = new HashMap();
      String[] var1 = var10000;
      Iterator var3 = var0.keySet().iterator();

      while(var3.hasNext()) {
         label28: {
            String var4;
            String var8;
            label36: {
               var4 = (String)var3.next();
               String[] var6 = field_4844;
               int var7 = var4.startsWith("score_");
               if(var1 != null) {
                  if(var7 == 0) {
                     break label28;
                  }

                  var8 = var4;
                  if(var1 == null) {
                     break label36;
                  }

                  var7 = var4.length();
               }

               var6 = field_4844;
               if(var7 <= "score_".length()) {
                  break label28;
               }

               var8 = var4.substring("score_".length());
            }

            String var5 = var8;
            var2.put(var5, Integer.valueOf(class_1715.method_9581((String)var0.get(var4), 1)));
         }

         if(var1 == null) {
            break;
         }
      }

      return var2;
   }

   // $FF: renamed from: b (java.lang.String) boolean
   public static boolean method_5520(String var0) {
      String[] var10000 = class_752.method_4253();
      Matcher var2 = field_4840.matcher(var0);
      String[] var1 = var10000;
      boolean var6 = var2.matches();
      if(var1 != null) {
         if(var6) {
            Map var3 = method_5528(var2.group(2));
            String var4 = var2.group(1);
            int var5 = method_5527(var4);
            int var7 = var3.containsKey("c");
            if(var1 != null) {
               if(var7 != 0) {
                  var5 = class_1715.method_9581((String)var3.get("c"), var5);
               }

               var7 = var5;
            }

            if(var1 != null) {
               var7 = var7 != 1?1:0;
            }

            return (boolean)var7;
         }

         var6 = false;
      }

      return var6;
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) boolean
   public static boolean method_5521(String var0, String var1) {
      String[] var10000 = class_752.method_4253();
      Matcher var3 = field_4840.matcher(var0);
      String[] var2 = var10000;
      boolean var5 = var3.matches();
      if(var2 != null) {
         if(var5) {
            label32: {
               String var4 = var3.group(1);
               String var6 = var1;
               if(var2 != null) {
                  if(var1 == null) {
                     break label32;
                  }

                  var6 = var1;
               }

               var5 = var6.equals(var4);
               if(var2 == null) {
                  return var5;
               }

               if(!var5) {
                  var5 = false;
                  return var5;
               }
            }

            var5 = true;
            return var5;
         }

         var5 = false;
      }

      return var5;
   }

   // $FF: renamed from: c (java.lang.String) boolean
   public static boolean method_5522(String var0) {
      return method_5521(var0, (String)null);
   }

   // $FF: renamed from: d (java.lang.String) int
   private static final int method_5523(String var0) {
      return 0;
   }

   // $FF: renamed from: e (java.lang.String) int
   private static final int method_5524(String var0) {
      return 0;
   }

   // $FF: renamed from: f (java.lang.String) int
   private static final int method_5525(String var0) {
      return Integer.MAX_VALUE;
   }

   // $FF: renamed from: g (java.lang.String) int
   private static final int method_5526(String var0) {
      return 0;
   }

   // $FF: renamed from: h (java.lang.String) int
   private static final int method_5527(String var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0.equals("a");
      if(var1 != null) {
         var10000 = var10000 != 0?0:1;
      }

      return var10000;
   }

   // $FF: renamed from: i (java.lang.String) java.util.Map
   private static Map method_5528(String var0) {
      String[] var10000 = class_752.method_4253();
      HashMap var2 = new HashMap();
      String[] var1 = var10000;
      if(var0 == null) {
         return var2;
      } else {
         Matcher var3 = field_4841.matcher(var0);
         int var4 = 0;
         int var5 = -1;

         int var7;
         while(true) {
            if(var3.find()) {
               String var6 = null;
               var7 = var4++;
               if(var1 == null) {
                  break;
               }

               switch(var7) {
               case 0:
                  var6 = "x";
                  break;
               case 1:
                  var6 = "y";
                  break;
               case 2:
                  var6 = "z";
                  break;
               case 3:
                  var6 = "r";
               }

               label65: {
                  label75: {
                     String var8 = var6;
                     if(var1 != null) {
                        if(var6 == null) {
                           break label75;
                        }

                        var8 = var3.group(1);
                     }

                     var7 = var8.length();
                     if(var1 == null) {
                        break label65;
                     }

                     if(var7 > 0) {
                        var2.put(var6, var3.group(1));
                     }
                  }

                  var7 = var3.end();
               }

               var5 = var7;
               if(var1 != null) {
                  continue;
               }
            }

            var7 = var5;
            break;
         }

         HashMap var9;
         if(var7 < var0.length()) {
            var3 = field_4842.matcher(var5 == -1?var0:var0.substring(var5));

            while(var3.find()) {
               var9 = var2;
               if(var1 == null) {
                  return var9;
               }

               var2.put(var3.group(1), var3.group(2));
               if(var1 == null) {
                  break;
               }
            }
         }

         var9 = var2;
         return var9;
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_5529() {
      // $FF: Couldn't be decompiled
   }
}
