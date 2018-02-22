import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// $FF: renamed from: hQ
public class class_1198 {

   // $FF: renamed from: b java.util.List
   private final List field_6225;
   // $FF: renamed from: c java.util.Map
   private final Map field_6226;
   // $FF: renamed from: d int
   private int field_6227;
   // $FF: renamed from: e java.lang.String
   private static final String field_6228;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6229;


   // $FF: renamed from: <init> () void
   public void method_6436() {
      super();
      this.field_6225 = new ArrayList();
      this.field_6226 = new HashMap();
   }

   // $FF: renamed from: b () int
   public int method_6437() {
      return this.field_6227;
   }

   // $FF: renamed from: b (int) void
   public void method_6438(int var1) {
      this.field_6227 = var1;
   }

   // $FF: renamed from: c () java.util.Map
   public Map method_6439() {
      return this.field_6226;
   }

   // $FF: renamed from: d () java.util.List
   public List method_6440() {
      return this.field_6225;
   }

   // $FF: renamed from: e () void
   public void method_6441() {
      int var1 = 0;

      class_1205 var2;
      for(Iterator var3 = this.field_6225.iterator(); var3.hasNext(); var1 += var2.method_6471()) {
         var2 = (class_1205)var3.next();
         var2.method_6475(var1);
      }

   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(2);
      var1.append(";");

      int var2;
      for(var2 = 0; var2 < this.field_6225.size(); ++var2) {
         if(var2 > 0) {
            var1.append(",");
         }

         var1.append(((class_1205)this.field_6225.get(var2)).toString());
      }

      var1.append(";");
      var1.append(this.field_6227);
      if(!this.field_6226.isEmpty()) {
         var1.append(";");
         var2 = 0;
         Iterator var3 = this.field_6226.entrySet().iterator();

         while(var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            if(var2++ > 0) {
               var1.append(",");
            }

            var1.append(((String)var4.getKey()).toLowerCase());
            Map var5 = (Map)var4.getValue();
            if(!var5.isEmpty()) {
               var1.append("(");
               int var6 = 0;
               Iterator var7 = var5.entrySet().iterator();

               while(var7.hasNext()) {
                  Entry var8 = (Entry)var7.next();
                  if(var6++ > 0) {
                     var1.append(" ");
                  }

                  var1.append((String)var8.getKey());
                  var1.append("=");
                  var1.append((String)var8.getValue());
               }

               var1.append(")");
            }
         }
      } else {
         var1.append(";");
      }

      return var1.toString();
   }

   // $FF: renamed from: b (java.lang.String, int) hR
   private static class_1205 method_6442(String param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.String) java.util.List
   private static List method_6443(String var0) {
      String[] var1 = class_752.method_4253();
      String var10000 = var0;
      if(var1 != null) {
         if(var0 == null) {
            return null;
         }

         var10000 = var0;
      }

      if(var10000.length() >= 1) {
         ArrayList var2 = new ArrayList();
         String[] var3 = var0.split(",");
         int var4 = 0;
         String[] var5 = var3;
         int var6 = var3.length;
         int var7 = 0;

         while(var7 < var6) {
            String var8 = var5[var7];
            class_1205 var9 = method_6442(var8, var4);
            if(var1 != null) {
               if(var9 == null) {
                  return null;
               }

               var2.add(var9);
               var4 += var9.method_6471();
               ++var7;
            }

            if(var1 == null) {
               break;
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   // $FF: renamed from: b (java.lang.String) hQ
   public static class_1198 method_6444(String var0) {
      String[] var1 = class_752.method_4253();
      String var10000 = var0;
      if(var1 != null) {
         if(var0 == null) {
            return method_6445();
         }

         var10000 = var0;
      }

      String[] var2;
      int var20;
      label161: {
         var2 = var10000.split(";", -1);
         String[] var19 = var2;
         if(var1 != null) {
            if(var2.length == 1) {
               var20 = 0;
               break label161;
            }

            var19 = var2;
         }

         var20 = class_1715.method_9581(var19[0], 0);
      }

      int var3 = var20;
      var20 = var3;
      if(var1 != null) {
         if(var3 < 0) {
            return method_6445();
         }

         var20 = var3;
      }

      if(var20 <= 2) {
         class_1198 var22 = new class_1198;
         var22.method_6436();
         class_1198 var4 = var22;
         var20 = var2.length;
         if(var1 != null) {
            var20 = var20 == 1?0:1;
         }

         int var5 = var20;
         List var6 = method_6443(var2[var5++]);
         List var23 = var6;
         if(var1 != null) {
            if(var6 == null) {
               return method_6445();
            }

            var23 = var6;
         }

         var20 = var23.isEmpty();
         if(var1 != null) {
            if(var20 != 0) {
               return method_6445();
            }

            var4.method_6440().addAll(var6);
            var4.method_6441();
            var20 = class_985.field_4989.field_5050;
         }

         int var7 = var20;
         var20 = var3;
         if(var1 != null) {
            label168: {
               if(var3 > 0) {
                  var20 = var2.length;
                  if(var1 == null) {
                     break label168;
                  }

                  if(var20 > var5) {
                     var7 = class_1715.method_9581(var2[var5++], var7);
                  }
               }

               if(var1 == null) {
                  return var4;
               }

               var4.method_6438(var7);
               var20 = var3;
            }
         }

         if(var20 > 0) {
            if(var1 == null) {
               return var4;
            }

            if(var2.length > var5) {
               String[] var8 = var2[var5++].toLowerCase().split(",");
               String[] var9 = var8;
               int var10 = var8.length;
               int var11 = 0;

               label116:
               do {
                  var20 = var11;
                  int var10001 = var10;

                  label113:
                  while(true) {
                     if(var20 >= var10001) {
                        break label116;
                     }

                     String var12 = var9[var11];
                     String[] var18 = field_6229;
                     String[] var13 = var12.split("\\(", 2);
                     HashMap var14 = new HashMap();
                     if(var1 == null) {
                        return var4;
                     }

                     if(var1 == null) {
                        break;
                     }

                     if(var13[0].length() > 0) {
                        var4.method_6439().put(var13[0], var14);
                        if(var1 == null) {
                           break;
                        }

                        if(var13.length > 1) {
                           label172: {
                              label173: {
                                 var20 = var13[1].endsWith(")");
                                 if(var1 != null) {
                                    if(var20 == 0) {
                                       break label172;
                                    }

                                    var10000 = var13[1];
                                    if(var1 == null) {
                                       break label173;
                                    }

                                    var20 = var10000.length();
                                 }

                                 if(var20 <= 1) {
                                    break label172;
                                 }

                                 var10000 = var13[1].substring(0, var13[1].length() - 1);
                              }

                              String[] var15 = var10000.split(" ");
                              int var16 = 0;

                              while(var16 < var15.length) {
                                 String[] var17 = var15[var16].split("=", 2);
                                 if(var1 != null) {
                                    var20 = var17.length;
                                    var10001 = 2;
                                    if(var1 == null) {
                                       continue label113;
                                    }

                                    if(var20 == 2) {
                                       var14.put(var17[0], var17[1]);
                                    }

                                    ++var16;
                                 }

                                 if(var1 == null) {
                                    break;
                                 }
                              }
                           }
                        }
                     }

                     ++var11;
                     break;
                  }
               } while(var1 != null);

               if(var1 != null) {
                  return var4;
               }
            }
         }

         Map var24 = var4.method_6439();
         String[] var21 = field_6229;
         var24.put("village", new HashMap());
         return var4;
      } else {
         return method_6445();
      }
   }

   // $FF: renamed from: f () hQ
   public static class_1198 method_6445() {
      class_1198 var10000 = new class_1198;
      var10000.method_6436();
      class_1198 var0 = var10000;
      var0.method_6438(class_985.field_4989.field_5050);
      List var1 = var0.method_6440();
      class_1205 var10001 = new class_1205;
      var10001.method_6469(1, class_1192.field_6032);
      var1.add(var10001);
      var1 = var0.method_6440();
      var10001 = new class_1205;
      var10001.method_6469(2, class_1192.field_6028);
      var1.add(var10001);
      var1 = var0.method_6440();
      var10001 = new class_1205;
      var10001.method_6469(1, class_1192.field_6027);
      var1.add(var10001);
      var0.method_6441();
      Map var2 = var0.method_6439();
      String[] var3 = field_6229;
      var2.put("village", new HashMap());
      return var0;
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_6446(Throwable var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6447() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ûÄ ÈÌº°¼KÈÎáíåä ";
      int var4 = "ûÄ ÈÌº°¼KÈÎáíåä ".length();
      char var1 = 11;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_6229 = var5;
                  String[] var10 = field_6229;
                  field_6228 = "CL_00000440";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 124;
               break;
            case 1:
               var10009 = 76;
               break;
            case 2:
               var10009 = 187;
               break;
            case 3:
               var10009 = 60;
               break;
            case 4:
               var10009 = 56;
               break;
            case 5:
               var10009 = 78;
               break;
            default:
               var10009 = 68;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
