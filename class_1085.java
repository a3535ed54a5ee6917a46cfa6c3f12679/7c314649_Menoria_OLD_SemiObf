import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: gS
public class class_1085 implements class_26, class_33 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_5716;
   // $FF: renamed from: c java.util.List
   private List field_5717;
   // $FF: renamed from: d java.util.Set
   private Set field_5718;
   // $FF: renamed from: e java.lang.Object
   private Object field_5719;
   // $FF: renamed from: f java.io.File
   private final File field_5720;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5721;


   // $FF: renamed from: <init> (java.io.File) void
   public void method_6146(File var1) {
      super();
      this.field_5717 = new ArrayList();
      this.field_5718 = new HashSet();
      this.field_5719 = new Object();
      this.field_5720 = var1;
   }

   // $FF: renamed from: b (ahb, int, int) gI
   public class_1069 method_116(ahb var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      class_1583 var5 = null;
      String[] var4 = var10000;
      class_1035 var11 = new class_1035;
      var11.method_5856(var2, var3);
      class_1035 var6 = var11;
      Object var7 = this.field_5719;
      synchronized(this.field_5719) {
         label58: {
            byte var12 = this.field_5718.contains(var6);
            if(var4 != null) {
               if(var12 == 0) {
                  break label58;
               }

               var12 = 0;
            }

            int var8 = var12;

            while(var8 < this.field_5717.size()) {
               class_1087 var13 = (class_1087)this.field_5717.get(var8);
               if(var4 != null) {
                  if(!var13.field_5726.equals(var6)) {
                     ++var8;
                     continue;
                  }

                  var13 = (class_1087)this.field_5717.get(var8);
               }

               var5 = var13.field_5727;
               break;
            }
         }
      }

      if(var5 == null) {
         DataInputStream var14 = class_1083.method_6139(this.field_5720, var2, var3);
         DataInputStream var15 = var14;
         if(var4 != null) {
            if(var14 == null) {
               return null;
            }

            var15 = var14;
         }

         var5 = class_1569.method_8616(var15);
         if(var4 != null) {
            return this.method_6147(var1, var2, var3, var5);
         } else {
            return null;
         }
      } else {
         return this.method_6147(var1, var2, var3, var5);
      }
   }

   // $FF: renamed from: b (ahb, int, int, ro) gI
   protected class_1069 method_6147(ahb var1, int var2, int var3, class_1583 var4) {
      String[] var5 = class_752.method_4253();
      String[] var7 = field_5721;
      boolean var10000 = var4.initGui8("Level", 10);
      if(var5 != null) {
         if(!var10000) {
            field_5716.error("Chunk file at " + var2 + "," + var3 + " is missing level data, skipping");
            return null;
         }

         var7 = field_5721;
         var10000 = var4.method_8688("Level").initGui8("Sections", 9);
      }

      if(!var10000) {
         Logger var9 = field_5716;
         StringBuilder var10001 = new StringBuilder();
         var7 = field_5721;
         var9.error(var10001.append("Chunk file at ").append(var2).append(",").append(var3).append(" is missing block data, skipping").toString());
         return null;
      } else {
         var7 = field_5721;
         class_1069 var6 = this.method_6151(var1, var4.method_8688("Level"));
         class_1069 var8 = var6;
         if(var5 != null) {
            if(!var6.method_6016(var2, var3)) {
               field_5716.error("Chunk file at " + var2 + "," + var3 + " is in the wrong location; relocating. (Expected " + var2 + ", " + var3 + ", got " + var6.fontRendererObj1 + ", " + var6.fontRendererObj2 + ")");
               var4.method_8667("xPos", var2);
               var4.method_8667("zPos", var3);
               var6 = this.method_6151(var1, var4.method_8688("Level"));
            }

            var8 = var6;
         }

         return var8;
      }
   }

   // $FF: renamed from: b (ahb, gI) void
   public void method_117(ahb var1, class_1069 var2) {
      var1.method_2181();

      try {
         class_1583 var10000 = new class_1583;
         var10000.method_8628();
         class_1583 var3 = var10000;
         var10000 = new class_1583;
         var10000.method_8628();
         class_1583 var4 = var10000;
         String[] var10001 = field_5721;
         var3.method_8664("Level", var4);
         this.method_6150(var2, var1, var4);
         this.method_6148(var2.method_6055(), var3);
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   // $FF: renamed from: b (de, ro) void
   protected void method_6148(class_1035 var1, class_1583 var2) {
      String[] var10000 = class_752.method_4253();
      Object var4 = this.field_5719;
      synchronized(this.field_5719){}
      String[] var3 = var10000;

      try {
         boolean var9 = this.field_5718.contains(var1);
         if(var3 != null) {
            label79: {
               List var10;
               if(var9) {
                  int var5 = 0;

                  while(var5 < this.field_5717.size()) {
                     var10 = this.field_5717;
                     int var10001 = var5;
                     if(var3 != null) {
                        var9 = ((class_1087)this.field_5717.get(var5)).field_5726.equals(var1);
                        if(var3 == null) {
                           break label79;
                        }

                        if(!var9) {
                           ++var5;
                           if(var3 == null) {
                              break;
                           }
                           continue;
                        }

                        var10 = this.field_5717;
                        var10001 = var5;
                     }

                     class_1087 var10002 = new class_1087;
                     var10002.method_6156(var1, var2);
                     var10.set(var10001, var10002);
                     return;
                  }
               }

               var10 = this.field_5717;
               class_1087 var11 = new class_1087;
               var11.method_6156(var1, var2);
               var10.add(var11);
               this.field_5718.add(var1);
            }
         }

         class_1342.field_6903.method_7089(this);
      } finally {
         ;
      }
   }

   // $FF: renamed from: a () boolean
   public boolean method_153() {
      String[] var10000 = class_752.method_4253();
      class_1087 var2 = null;
      Object var3 = this.field_5719;
      synchronized(this.field_5719){}
      String[] var1 = var10000;
      boolean var7 = false;

      try {
         label62: {
            var7 = true;
            boolean var10 = this.field_5717.isEmpty();
            if(var1 != null) {
               if(!var10) {
                  var2 = (class_1087)this.field_5717.remove(0);
                  this.field_5718.remove(var2.field_5726);
                  var7 = false;
                  break label62;
               }

               var10 = false;
            }

            return var10;
         }
      } finally {
         if(var7) {
            ;
         }
      }

      if(var2 != null) {
         try {
            this.method_6149(var2);
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }

      return true;
   }

   // $FF: renamed from: b (gT) void
   private void method_6149(class_1087 var1) {
      DataOutputStream var2 = class_1083.method_6140(this.field_5720, var1.field_5726.field_5475, var1.field_5726.field_5476);
      class_1569.method_8618(var1.field_5727, var2);
      var2.close();
   }

   // $FF: renamed from: c (ahb, gI) void
   public void method_118(ahb var1, class_1069 var2) {}

   // $FF: renamed from: b () void
   public void method_119() {}

   // $FF: renamed from: c () void
   public void method_120() {
      String[] var1 = class_752.method_4253();

      while(this.method_153() && var1 != null) {
         ;
      }

   }

   // $FF: renamed from: b (gI, ahb, ro) void
   private void method_6150(class_1069 var1, ahb var2, class_1583 var3) {
      var3.method_8665("V", (byte)1);
      String[] var10000 = class_752.method_4253();
      String[] var17 = field_5721;
      var3.method_8667("xPos", var1.fontRendererObj1);
      var3.method_8667("zPos", var1.fontRendererObj2);
      var3.method_8668("LastUpdate", var2.method_2184());
      var3.initGui3("HeightMap", var1.fontRendererObj0);
      var3.initGui4("TerrainPopulated", var1.fontRendererObj6);
      String[] var4 = var10000;
      var3.initGui4("LightPopulated", var1.fontRendererObj7);
      var3.method_8668("InhabitedTime", var1.field_5644);
      class_1072[] var5 = var1.method_6019();
      class_1580 var25 = new class_1580;
      var25.method_8628();
      class_1580 var6 = var25;
      boolean var26 = var2.field_1820.field_5736;
      if(var4 != null) {
         var26 = !var2.field_1820.field_5736;
      }

      boolean var7 = var26;
      class_1072[] var8 = var5;
      int var9 = var5.length;
      int var10 = 0;

      class_1583 var12;
      class_1583 var27;
      while(true) {
         if(var10 < var9) {
            class_1072 var11 = var8[var10];
            if(var4 == null) {
               break;
            }

            if(var11 != null || var4 == null) {
               label116: {
                  String var10001;
                  byte[] var10002;
                  label132: {
                     var27 = new class_1583;
                     var27.method_8628();
                     var12 = var27;
                     var12.method_8665("Y", (byte)(var11.method_6079() >> 4 & 255));
                     var17 = field_5721;
                     var12.initGui2("Blocks", var11.method_6085());
                     if(var4 != null) {
                        if(var11.method_6087() != null) {
                           var12.initGui2("Add", var11.method_6087().field_5619);
                        }

                        var17 = field_5721;
                        var12.initGui2("Data", var11.method_6088().field_5619);
                        var27 = var12;
                        var10001 = "BlockLight";
                        var10002 = var11.method_6089().field_5619;
                        if(var4 == null) {
                           break label132;
                        }

                        var12.initGui2("BlockLight", var10002);
                     }

                     if(var7) {
                        var17 = field_5721;
                        var12.initGui2("SkyLight", var11.method_6090().field_5619);
                        if(var4 != null) {
                           break label116;
                        }
                     }

                     var27 = var12;
                     var17 = field_5721;
                     var10001 = "SkyLight";
                     var10002 = new byte[var11.method_6089().field_5619.length];
                  }

                  var27.initGui2(var10001, var10002);
               }

               var6.method_8650(var12);
            }

            ++var10;
            if(var4 != null) {
               continue;
            }
         }

         var17 = field_5721;
         var3.method_8664("Sections", var6);
         var3.initGui2("Biomes", var1.method_6060());
         var1.field_5640 = false;
         break;
      }

      var25 = new class_1580;
      var25.method_8628();
      class_1580 var18 = var25;
      var9 = 0;

      Iterator var20;
      label100:
      while(true) {
         int var29 = var9;

         label97:
         while(var29 < var1.fontRendererObj5.length) {
            if(var4 == null) {
               break label100;
            }

            var20 = var1.fontRendererObj5[var9].iterator();

            while(var20.hasNext()) {
               label91: {
                  class_689 var22 = (class_689)var20.next();
                  var27 = new class_1583;
                  var27.method_8628();
                  var12 = var27;
                  if(var4 != null) {
                     var29 = var22.method_3903(var12);
                     if(var4 == null) {
                        continue label97;
                     }

                     if(var29 == 0) {
                        break label91;
                     }

                     var1.field_5640 = true;
                  }

                  var18.method_8650(var12);
               }

               if(var4 == null) {
                  break;
               }
            }

            ++var9;
            if(var4 != null) {
               continue label100;
            }
            break;
         }

         var17 = field_5721;
         var3.method_8664("Entities", var18);
         break;
      }

      var25 = new class_1580;
      var25.method_8628();
      class_1580 var19 = var25;
      var20 = var1.fontRendererObj4.values().iterator();

      while(true) {
         if(var20.hasNext()) {
            class_580 var23 = (class_580)var20.next();
            var27 = new class_1583;
            var27.method_8628();
            var12 = var27;
            var23.getBlock93(var12);
            var19.method_8650(var12);
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var17 = field_5721;
         var3.method_8664("TileEntities", var19);
         break;
      }

      List var21 = var2.method_2154(var1, false);
      if(var21 != null) {
         long var24 = var2.method_2184();
         var25 = new class_1580;
         var25.method_8628();
         class_1580 var13 = var25;
         Iterator var14 = var21.iterator();

         while(true) {
            if(var14.hasNext()) {
               class_1050 var15 = (class_1050)var14.next();
               var27 = new class_1583;
               var27.method_8628();
               class_1583 var16 = var27;
               var16.method_8667("i", aji.method_2415(var15.method_5956()));
               var16.method_8667("x", var15.field_5556);
               var16.method_8667("y", var15.field_5557);
               var16.method_8667("z", var15.field_5558);
               var16.method_8667("t", (int)(var15.field_5559 - var24));
               var16.method_8667("p", var15.field_5560);
               var13.method_8650(var16);
               if(var4 == null) {
                  break;
               }

               if(var4 != null) {
                  continue;
               }
            }

            String[] var28 = field_5721;
            var3.method_8664("TileTicks", var13);
            break;
         }
      }

   }

   // $FF: renamed from: b (ahb, ro) gI
   private class_1069 method_6151(ahb var1, class_1583 var2) {
      String[] var18 = field_5721;
      int var4 = var2.method_8681("xPos");
      int var5 = var2.method_8681("zPos");
      class_1069 var10000 = new class_1069;
      var10000.method_6013(var1, var4, var5);
      class_1069 var6 = var10000;
      String[] var30 = class_752.method_4253();
      var6.fontRendererObj0 = var2.method_8687("HeightMap");
      var6.fontRendererObj6 = var2.method_8690("TerrainPopulated");
      var6.fontRendererObj7 = var2.method_8690("LightPopulated");
      var6.field_5644 = var2.method_8682("InhabitedTime");
      class_1580 var7 = var2.method_8689("Sections", 10);
      byte var8 = 16;
      String[] var3 = var30;
      class_1072[] var9 = new class_1072[var8];
      boolean var31 = var1.field_1820.field_5736;
      if(var3 != null) {
         var31 = !var1.field_1820.field_5736;
      }

      boolean var10 = var31;
      int var11 = 0;

      byte var10002;
      String var33;
      class_1583 var34;
      label153: {
         while(true) {
            if(var11 < var7.method_8658()) {
               class_1583 var12 = var7.method_8653(var11);
               byte var13 = var12.initGui9("Y");
               class_1072 var32 = new class_1072;
               var32.method_6072(var13 << 4, var10);
               class_1072 var14 = var32;
               var18 = field_5721;
               var14.method_6091(var12.method_8686("Blocks"));
               var31 = var12.initGui8("Add", 7);
               if(var3 == null) {
                  break;
               }

               label156: {
                  class_1068 var10001;
                  if(var3 != null) {
                     if(var31) {
                        var10001 = new class_1068;
                        var10001.method_6010(var12.method_8686("Add"), 4);
                        var14.method_6092(var10001);
                     }

                     var10001 = new class_1068;
                     var18 = field_5721;
                     var10001.method_6010(var12.method_8686("Data"), 4);
                     var14.method_6093(var10001);
                     var10001 = new class_1068;
                     var10001.method_6010(var12.method_8686("BlockLight"), 4);
                     var14.method_6094(var10001);
                     if(var3 == null) {
                        break label156;
                     }

                     var31 = var10;
                  }

                  if(var31) {
                     var10001 = new class_1068;
                     var18 = field_5721;
                     var10001.method_6010(var12.method_8686("SkyLight"), 4);
                     var14.method_6095(var10001);
                  }

                  var14.method_6084();
                  var9[var13] = var14;
                  ++var11;
               }

               if(var3 != null) {
                  continue;
               }
            }

            var6.method_6057(var9);
            var34 = var2;
            var18 = field_5721;
            var33 = "Biomes";
            var10002 = 7;
            if(var3 == null) {
               break label153;
            }

            var31 = var2.initGui8("Biomes", 7);
            break;
         }

         if(var31) {
            var18 = field_5721;
            var6.method_6061(var2.method_8686("Biomes"));
         }

         var34 = var2;
         var18 = field_5721;
         var33 = "Entities";
         var10002 = 10;
      }

      class_1580 var19 = var34.method_8689(var33, var10002);
      class_1580 var35 = var19;
      if(var3 != null) {
         label128: {
            if(var19 != null) {
               int var20 = 0;

               while(var20 < var19.method_8658()) {
                  class_1583 var22 = var19.method_8653(var20);
                  var34 = var22;
                  if(var3 == null) {
                     break label128;
                  }

                  class_689 var25 = class_1775.method_9755(var22, var1);
                  var6.field_5640 = true;
                  if(var3 != null) {
                     class_689 var36 = var25;

                     label113:
                     while(var36 != null) {
                        var6.method_6035(var25);
                        class_689 var15 = var25;
                        class_1583 var16 = var22;

                        while(true) {
                           var18 = field_5721;
                           if(!var16.initGui8("Riding", 10)) {
                              break label113;
                           }

                           class_689 var17 = class_1775.method_9755(var16.method_8688("Riding"), var1);
                           var36 = var17;
                           if(var3 == null) {
                              break;
                           }

                           if(var3 != null) {
                              if(var17 != null) {
                                 var6.method_6035(var17);
                                 var15.method_3925(var17);
                              }

                              var36 = var17;
                           }

                           var15 = var36;
                           var18 = field_5721;
                           var16 = var16.method_8688("Riding");
                           if(var3 == null) {
                              break label113;
                           }
                        }
                     }

                     ++var20;
                  }

                  if(var3 == null) {
                     break;
                  }
               }
            }

            var34 = var2;
         }

         var18 = field_5721;
         var35 = var34.method_8689("TileEntities", 10);
      }

      class_1580 var21 = var35;
      if(var21 != null) {
         int var23 = 0;

         while(var23 < var21.method_8658()) {
            class_1583 var26 = var21.method_8653(var23);
            class_580 var28 = class_580.getBlock95(var26);
            if(var3 == null) {
               return var6;
            }

            if(var3 != null) {
               if(var28 != null) {
                  var6.method_6040(var28);
               }

               ++var23;
            }

            if(var3 == null) {
               break;
            }
         }
      }

      var34 = var2;
      var18 = field_5721;
      var33 = "TileTicks";
      var10002 = 9;
      if(var3 != null) {
         if(!var2.initGui8("TileTicks", 9)) {
            return var6;
         }

         var34 = var2;
         var33 = "TileTicks";
         var10002 = 10;
      }

      class_1580 var24 = var34.method_8689(var33, var10002);
      if(var24 != null) {
         int var27 = 0;

         while(var27 < var24.method_8658()) {
            class_1583 var29 = var24.method_8653(var27);
            var1.method_2112(var29.method_8681("x"), var29.method_8681("y"), var29.method_8681("z"), aji.method_2416(var29.method_8681("i")), var29.method_8681("t"), var29.method_8681("p"));
            ++var27;
            if(var3 == null) {
               break;
            }
         }
      }

      return var6;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6152() {
      // $FF: Couldn't be decompiled
   }
}
