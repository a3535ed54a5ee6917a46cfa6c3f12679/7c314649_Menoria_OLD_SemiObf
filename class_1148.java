import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

// $FF: renamed from: gY
public class class_1148 implements class_25 {

   // $FF: renamed from: b ahb
   private ahb field_5907;
   // $FF: renamed from: c java.util.Random
   private Random field_5908;
   // $FF: renamed from: d aji[]
   private final aji[] field_5909;
   // $FF: renamed from: e byte[]
   private final byte[] field_5910;
   // $FF: renamed from: f hQ
   private final class_1198 field_5911;
   // $FF: renamed from: g java.util.List
   private final List field_5912;
   // $FF: renamed from: h boolean
   private final boolean field_5913;
   // $FF: renamed from: i boolean
   private final boolean field_5914;
   // $FF: renamed from: j hE
   private class_1187 field_5915;
   // $FF: renamed from: k hE
   private class_1187 field_5916;
   // $FF: renamed from: l java.lang.String[]
   private static final String[] field_5917;


   // $FF: renamed from: <init> (ahb, long, boolean, java.lang.String) void
   public void method_6337(ahb var1, long var2, boolean var4, String var5) {
      super();
      String[] var6 = class_752.method_4253();
      this.field_5909 = new aji[256];
      this.field_5910 = new byte[256];
      this.field_5912 = new ArrayList();
      this.field_5907 = var1;
      this.field_5908 = new Random(var2);
      this.field_5911 = class_1198.method_6444(var5);
      boolean var10000 = var4;
      String[] var10;
      Map var19;
      if(var6 != null) {
         label91: {
            if(var4) {
               Map var7 = this.field_5911.method_6439();
               var10 = field_5917;
               var10000 = var7.containsKey("village");
               List var15;
               if(var6 != null) {
                  if(var10000) {
                     Map var8 = (Map)var7.get("village");
                     var10000 = var8.containsKey("size");
                     if(var6 != null) {
                        if(!var10000) {
                           var8.put("size", "1");
                        }

                        var15 = this.field_5912;
                        class_1053 var10001 = new class_1053;
                        var10001.method_5976(var8);
                        var15.add(var10001);
                     }
                  }

                  var10 = field_5917;
                  var10000 = var7.containsKey("biome_1");
               }

               if(var6 != null) {
                  if(var10000) {
                     var15 = this.field_5912;
                     class_1055 var16 = new class_1055;
                     var10 = field_5917;
                     var16.method_5978((Map)var7.get("biome_1"));
                     var15.add(var16);
                  }

                  var10 = field_5917;
                  var10000 = var7.containsKey("mineshaft");
               }

               if(var6 != null) {
                  if(var10000) {
                     var15 = this.field_5912;
                     class_1057 var17 = new class_1057;
                     var10 = field_5917;
                     var17.method_5982((Map)var7.get("mineshaft"));
                     var15.add(var17);
                  }

                  var10 = field_5917;
                  var10000 = var7.containsKey("stronghold");
               }

               if(var6 == null) {
                  break label91;
               }

               if(var10000) {
                  var15 = this.field_5912;
                  class_1054 var18 = new class_1054;
                  var10 = field_5917;
                  var18.method_5977((Map)var7.get("stronghold"));
                  var15.add(var18);
               }
            }

            var19 = this.field_5911.method_6439();
            var10 = field_5917;
            this.field_5913 = var19.containsKey("decoration");
            var10000 = this.field_5911.method_6439().containsKey("lake");
         }
      }

      class_1198 var11;
      label97: {
         class_1187 var20;
         if(var6 != null) {
            if(var10000) {
               var20 = new class_1187;
               var20.method_6406(class_1192.field_6034);
               this.field_5915 = var20;
            }

            var11 = this.field_5911;
            if(var6 == null) {
               break label97;
            }

            Map var12 = this.field_5911.method_6439();
            var10 = field_5917;
            var10000 = var12.containsKey("lava_lake");
         }

         if(var10000) {
            var20 = new class_1187;
            var20.method_6406(class_1192.field_6036);
            this.field_5916 = var20;
         }

         var19 = this.field_5911.method_6439();
         String[] var10002 = field_5917;
         this.field_5914 = var19.containsKey("dungeon");
         var11 = this.field_5911;
      }

      Iterator var13 = var11.method_6440().iterator();

      label71:
      while(var13.hasNext()) {
         class_1205 var14 = (class_1205)var13.next();
         int var9 = var14.method_6474();

         while(var9 < var14.method_6474() + var14.method_6471()) {
            this.field_5909[var9] = var14.method_6472();
            this.field_5910[var9] = (byte)var14.method_6473();
            ++var9;
            if(var6 == null) {
               continue label71;
            }

            if(var6 == null) {
               break;
            }
         }

         if(var6 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d (int, int) gI
   public class_1069 method_105(int var1, int var2) {
      return this.method_104(var1, var2);
   }

   // $FF: renamed from: c (int, int) gI
   public class_1069 method_104(int var1, int var2) {
      class_1069 var10000 = new class_1069;
      var10000.method_6013(this.field_5907, var1, var2);
      class_1069 var4 = var10000;
      String[] var15 = class_752.method_4253();
      int var5 = 0;
      String[] var3 = var15;

      int var7;
      label84:
      while(true) {
         int var16 = var5;

         label81:
         while(var16 < this.field_5909.length) {
            aji var6 = this.field_5909[var5];
            if(var3 == null) {
               break label84;
            }

            if(var6 != null) {
               var7 = var5 >> 4;
               class_1072 var8 = var4.method_6019()[var7];
               if(var8 == null) {
                  class_1072 var17 = new class_1072;
                  var17.method_6072(var5, !this.field_5907.field_1820.field_5736);
                  var8 = var17;
                  var4.method_6019()[var7] = var8;
               }

               int var9 = 0;

               while(var9 < 16) {
                  var16 = 0;
                  if(var3 == null) {
                     continue label81;
                  }

                  int var10 = 0;

                  while(true) {
                     if(var10 < 16) {
                        var8.method_6074(var9, var5 & 15, var10, var6);
                        var8.method_6076(var9, var5 & 15, var10, this.field_5910[var5]);
                        ++var10;
                        if(var3 == null) {
                           break;
                        }

                        if(var3 != null) {
                           continue;
                        }
                     }

                     ++var9;
                     break;
                  }

                  if(var3 == null) {
                     break;
                  }
               }
            }

            ++var5;
            if(var3 != null) {
               continue label84;
            }
            break;
         }

         var4.method_6021();
         break;
      }

      class_985[] var11 = this.field_5907.method_2041().method_5541((class_985[])null, var1 * 16, var2 * 16, 16, 16);
      byte[] var12 = var4.method_6060();
      var7 = 0;

      while(var7 < var12.length) {
         var12[var7] = (byte)var11[var7].field_5050;
         ++var7;
         if(var3 == null) {
            break;
         }
      }

      Iterator var13 = this.field_5912.iterator();

      while(true) {
         if(var13.hasNext()) {
            class_1051 var14 = (class_1051)var13.next();
            var14.method_5961(this, this.field_5907, var1, var2, (aji[])null);
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         var4.method_6021();
         break;
      }

      return var4;
   }

   // $FF: renamed from: b (int, int) boolean
   public boolean method_103(int var1, int var2) {
      return true;
   }

   // $FF: renamed from: b (gG, int, int) void
   public void method_106(class_25 var1, int var2, int var3) {
      int var5 = var2 * 16;
      String[] var10000 = class_752.method_4253();
      int var6 = var3 * 16;
      class_985 var7 = this.field_5907.method_35(var5 + 16, var6 + 16);
      String[] var4 = var10000;
      int var8 = 0;
      this.field_5908.setSeed(this.field_5907.method_2183());
      long var9 = this.field_5908.nextLong() / 2L * 2L + 1L;
      long var11 = this.field_5908.nextLong() / 2L * 2L + 1L;
      this.field_5908.setSeed((long)var2 * var9 + (long)var3 * var11 ^ this.field_5907.method_2183());
      Iterator var13 = this.field_5912.iterator();

      int var17;
      int var18;
      int var19;
      int var20;
      while(true) {
         if(var13.hasNext()) {
            class_1052 var14 = (class_1052)var13.next();
            byte var15 = var14.method_5964(this.field_5907, this.field_5908, var2, var3);
            var20 = var14 instanceof class_1053;
            if(var4 == null) {
               break;
            }

            label103: {
               if(var4 != null) {
                  if(var20 == 0) {
                     break label103;
                  }

                  var20 = var8 | var15;
               }

               var8 = var20;
            }

            if(var4 != null) {
               continue;
            }
         }

         class_1148 var22;
         label114: {
            class_1187 var21 = this.field_5915;
            if(var4 != null) {
               label71: {
                  if(this.field_5915 != null) {
                     label69: {
                        var20 = var8;
                        if(var4 != null) {
                           if(var8 != 0) {
                              break label69;
                           }

                           var22 = this;
                           if(var4 == null) {
                              break label71;
                           }

                           var20 = this.field_5908.nextInt(4);
                        }

                        if(var20 == 0) {
                           var17 = var5 + this.field_5908.nextInt(16) + 8;
                           var18 = this.field_5908.nextInt(256);
                           var19 = var6 + this.field_5908.nextInt(16) + 8;
                           this.field_5915.method_6351(this.field_5907, this.field_5908, var17, var18, var19);
                        }
                     }
                  }

                  var22 = this;
               }

               if(var4 == null) {
                  break label114;
               }

               var21 = var22.field_5916;
            }

            if(var21 != null) {
               var20 = var8;
               if(var4 == null) {
                  break;
               }

               if(var8 == 0) {
                  var20 = this.field_5908.nextInt(8);
                  if(var4 == null) {
                     break;
                  }

                  if(var20 == 0) {
                     var17 = var5 + this.field_5908.nextInt(16) + 8;
                     var18 = this.field_5908.nextInt(this.field_5908.nextInt(248) + 8);
                     var19 = var6 + this.field_5908.nextInt(16) + 8;
                     if(var4 != null) {
                        label80: {
                           if(var18 >= 63) {
                              var20 = this.field_5908.nextInt(10);
                              if(var4 == null) {
                                 break;
                              }

                              if(var20 != 0) {
                                 break label80;
                              }
                           }

                           this.field_5916.method_6351(this.field_5907, this.field_5908, var17, var18, var19);
                        }
                     }
                  }
               }
            }

            var22 = this;
         }

         var20 = var22.field_5914;
         break;
      }

      if(var4 != null) {
         if(var20 != 0) {
            var17 = 0;

            while(var17 < 8) {
               var18 = var5 + this.field_5908.nextInt(16) + 8;
               var19 = this.field_5908.nextInt(256);
               int var16 = var6 + this.field_5908.nextInt(16) + 8;
               class_1184 var23 = new class_1184;
               var23.method_6349();
               var23.method_6351(this.field_5907, this.field_5908, var18, var19, var16);
               ++var17;
               if(var4 == null) {
                  return;
               }

               if(var4 == null) {
                  break;
               }
            }
         }

         var20 = this.field_5913;
      }

      if(var20 != 0) {
         var7.method_5714(this.field_5907, this.field_5908, var5, var6);
      }

   }

   // $FF: renamed from: b (boolean, vu) boolean
   public boolean method_107(boolean var1, class_81 var2) {
      return true;
   }

   // $FF: renamed from: e () void
   public void method_115() {}

   // $FF: renamed from: a () boolean
   public boolean method_108() {
      return false;
   }

   // $FF: renamed from: b () boolean
   public boolean method_109() {
      return true;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_110() {
      String[] var10000 = field_5917;
      return "FlatLevelSource";
   }

   // $FF: renamed from: b (as, int, int, int) java.util.List
   public List method_111(class_922 var1, int var2, int var3, int var4) {
      class_985 var5 = this.field_5907.method_35(var2, var4);
      return var5.method_5706(var1);
   }

   // $FF: renamed from: b (ahb, java.lang.String, int, int, int) dd
   public class_1034 method_112(ahb var1, String var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      String[] var10000 = field_5917;
      if("Stronghold".equals(var2)) {
         Iterator var7 = this.field_5912.iterator();

         while(var7.hasNext()) {
            class_1052 var8 = (class_1052)var7.next();
            class_1052 var9 = var8;
            if(var6 != null) {
               if(!(var8 instanceof class_1054)) {
                  if(var6 == null) {
                     break;
                  }
                  continue;
               }

               var9 = var8;
            }

            return var9.method_5968(var1, var3, var4, var5);
         }
      }

      return null;
   }

   // $FF: renamed from: d () int
   public int method_113() {
      return 0;
   }

   // $FF: renamed from: f (int, int) void
   public void method_114(int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      Iterator var4 = this.field_5912.iterator();
      String[] var3 = var10000;

      while(var4.hasNext()) {
         class_1052 var5 = (class_1052)var4.next();
         var5.method_5961(this, this.field_5907, var1, var2, (aji[])null);
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_6338() {
      // $FF: Couldn't be decompiled
   }
}
