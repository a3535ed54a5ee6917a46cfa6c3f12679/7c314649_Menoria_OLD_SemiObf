import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// $FF: renamed from: jQ
public class class_1296 extends class_1293 {

   // $FF: renamed from: c int
   public int field_6651;
   // $FF: renamed from: d int
   public int field_6652;
   // $FF: renamed from: e byte
   public byte field_6653;
   // $FF: renamed from: f byte
   public byte field_6654;
   // $FF: renamed from: g byte[]
   public byte[] field_6655;
   // $FF: renamed from: h java.util.List
   public List field_6656;
   // $FF: renamed from: j java.util.Map
   private Map field_6657;
   // $FF: renamed from: k java.util.Map
   public Map field_6658;
   // $FF: renamed from: l java.lang.String
   private static final String field_6659;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_6660;


   // $FF: renamed from: <init> (java.lang.String) void
   public void method_6768(String var1) {
      super.method_6768(var1);
      this.field_6655 = new byte[16384];
      this.field_6656 = new ArrayList();
      this.field_6657 = new HashMap();
      this.field_6658 = new LinkedHashMap();
   }

   // $FF: renamed from: b (ro) void
   public void method_6769(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      String[] var12 = field_6660;
      this.field_6653 = var1.initGui9("dimension");
      this.field_6651 = var1.method_8681("xCenter");
      this.field_6652 = var1.method_8681("zCenter");
      String[] var2 = var10000;
      this.field_6654 = var1.initGui9("scale");
      short var13 = this.field_6654;
      if(var2 != null) {
         if(this.field_6654 < 0) {
            this.field_6654 = 0;
         }

         var13 = this.field_6654;
      }

      if(var2 != null) {
         if(var13 > 4) {
            this.field_6654 = 4;
         }

         var12 = field_6660;
         var13 = var1.method_8680("width");
      }

      short var3;
      short var4;
      label83: {
         var3 = var13;
         var12 = field_6660;
         var4 = var1.method_8680("height");
         var13 = var3;
         short var10001 = 128;
         if(var2 != null) {
            if(var3 != 128) {
               break label83;
            }

            var13 = var4;
            var10001 = 128;
         }

         if(var13 == var10001) {
            var12 = field_6660;
            this.field_6655 = var1.method_8686("colors");
            if(var2 != null) {
               return;
            }
         }
      }

      String[] var14 = field_6660;
      byte[] var5 = var1.method_8686("colors");
      this.field_6655 = new byte[16384];
      int var6 = (128 - var3) / 2;
      int var7 = (128 - var4) / 2;
      int var8 = 0;

      do {
         int var15 = var8;

         label71:
         while(true) {
            if(var15 >= var4) {
               return;
            }

            int var9 = var8 + var7;
            var15 = var9;
            if(var2 != null) {
               label67: {
                  if(var9 < 0) {
                     var15 = var9;
                     if(var2 == null) {
                        break label67;
                     }

                     if(var9 >= 128) {
                        break;
                     }
                  }

                  var15 = 0;
               }
            }

            int var10 = var15;

            while(true) {
               if(var10 >= var3) {
                  break label71;
               }

               int var11 = var10 + var6;
               var15 = var11;
               if(var2 == null) {
                  break;
               }

               label58: {
                  label57: {
                     if(var2 != null) {
                        if(var11 >= 0) {
                           break label57;
                        }

                        var15 = var11;
                     }

                     if(var15 >= 128) {
                        break label58;
                     }
                  }

                  this.field_6655[var11 + var9 * 128] = var5[var10 + var8 * var3];
               }

               ++var10;
               if(var2 == null) {
                  break label71;
               }
            }
         }

         ++var8;
      } while(var2 != null);

   }

   // $FF: renamed from: c (ro) void
   public void method_6770(class_1583 var1) {
      String[] var2 = field_6660;
      var1.method_8665("dimension", this.field_6653);
      var1.method_8667("xCenter", this.field_6651);
      var1.method_8667("zCenter", this.field_6652);
      var1.method_8665("scale", this.field_6654);
      var1.method_8666("width", (short)128);
      var1.method_8666("height", (short)128);
      var1.initGui2("colors", this.field_6655);
   }

   // $FF: renamed from: b (yz, add) void
   public void method_6801(class_792 var1, add var2) {
      String[] var3 = class_752.method_4253();
      byte var10000 = this.field_6657.containsKey(var1);
      if(var3 != null) {
         if(var10000 == 0) {
            class_1291 var7 = new class_1291;
            var7.method_6763(this, var1);
            class_1291 var4 = var7;
            this.field_6657.put(var1, var4);
            this.field_6656.add(var4);
         }

         var10000 = var1.field_3616.method_3618(var2);
      }

      if(var3 != null) {
         if(var10000 == 0) {
            this.field_6658.remove(var1.method_64());
         }

         var10000 = 0;
      }

      int var6 = var10000;

      boolean var8;
      while(true) {
         if(var6 < this.field_6656.size()) {
            class_1291 var5 = (class_1291)this.field_6656.get(var6);
            var8 = var5.field_6622.field_3012;
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               label65: {
                  if(!var5.field_6622.field_3012) {
                     label77: {
                        int var9 = var5.field_6622.field_3616.method_3618(var2);
                        if(var3 != null) {
                           if(var9 == 0) {
                              var8 = var2.method_3782();
                              if(var3 == null) {
                                 break label65;
                              }

                              if(!var8) {
                                 break label77;
                              }
                           }

                           var9 = var2.method_3782();
                        }

                        if(var3 != null) {
                           if(var9 != 0) {
                              break label65;
                           }

                           var9 = var5.field_6622.field_3051;
                        }

                        if(var9 != this.field_6653) {
                           break label65;
                        }

                        this.method_6802(0, var5.field_6622.field_2990, var5.field_6622.method_64(), var5.field_6622.field_2994, var5.field_6622.field_2996, (double)var5.field_6622.field_3000);
                        if(var3 != null) {
                           break label65;
                        }
                     }
                  }

                  this.field_6657.remove(var5.field_6622);
                  this.field_6656.remove(var5);
               }
            }

            ++var6;
            if(var3 != null) {
               continue;
            }
         }

         var8 = var2.method_3782();
         break;
      }

      if(var8) {
         ahb var10002 = var1.field_2990;
         StringBuilder var10003 = new StringBuilder();
         String[] var10004 = field_6660;
         this.method_6802(1, var10002, var10003.append("frame-").append(var2.method_3784().method_3845()).toString(), (double)var2.method_3784().field_3295, (double)var2.method_3784().field_3297, (double)(var2.method_3784().field_3294 * 90));
      }

   }

   // $FF: renamed from: b (int, ahb, java.lang.String, double, double, double) void
   private void method_6802(int var1, ahb var2, String var3, double var4, double var6, double var8) {
      byte var14;
      int var15;
      int var17;
      label100: {
         int var11 = 1 << this.field_6654;
         float var12 = (float)(var4 - (double)this.field_6651) / (float)var11;
         String[] var10000 = class_752.method_4253();
         float var13 = (float)(var6 - (double)this.field_6652) / (float)var11;
         var14 = (byte)((int)((double)(var12 * 2.0F) + 0.5D));
         String[] var10 = var10000;
         var15 = (byte)((int)((double)(var13 * 2.0F) + 0.5D));
         byte var16 = 63;
         float var21;
         int var20 = (var21 = var12 - (float)(-var16)) == 0.0F?0:(var21 < 0.0F?-1:1);
         if(var10 != null) {
            label95: {
               if(var20 >= 0) {
                  float var22;
                  var20 = (var22 = var13 - (float)(-var16)) == 0.0F?0:(var22 < 0.0F?-1:1);
                  if(var10 == null) {
                     break label95;
                  }

                  if(var20 >= 0) {
                     float var23;
                     var20 = (var23 = var12 - (float)var16) == 0.0F?0:(var23 < 0.0F?-1:1);
                     if(var10 == null) {
                        break label95;
                     }

                     if(var20 <= 0) {
                        float var24;
                        var20 = (var24 = var13 - (float)var16) == 0.0F?0:(var24 < 0.0F?-1:1);
                        if(var10 == null) {
                           break label95;
                        }

                        if(var20 <= 0) {
                           double var10001 = var8;
                           if(var10 != null) {
                              var10001 = var8 < 0.0D?-8.0D:8.0D;
                           }

                           var8 += var10001;
                           var17 = (byte)((int)(var8 * 16.0D / 360.0D));
                           if(var10 == null) {
                              return;
                           }

                           if(this.field_6653 >= 0) {
                              break label100;
                           }

                           int var18 = (int)(var2.method_2195().method_6841() / 10L);
                           var17 = (byte)(var18 * var18 * 34187121 + var18 * 121 >> 15 & 15);
                           if(var10 != null) {
                              break label100;
                           }
                        }
                     }
                  }
               }

               float var25;
               var20 = (var25 = Math.abs(var12) - 320.0F) == 0.0F?0:(var25 < 0.0F?-1:1);
            }
         }

         label74: {
            label102: {
               if(var10 != null) {
                  if(var20 >= 0) {
                     break label102;
                  }

                  float var26;
                  var20 = (var26 = Math.abs(var13) - 320.0F) == 0.0F?0:(var26 < 0.0F?-1:1);
               }

               if(var10 == null) {
                  break label74;
               }

               if(var20 < 0) {
                  var1 = 6;
                  var20 = 0;
                  break label74;
               }
            }

            this.field_6658.remove(var3);
            return;
         }

         var17 = var20;
         float var27;
         var20 = (var27 = var12 - (float)(-var16)) == 0.0F?0:(var27 < 0.0F?-1:1);
         if(var10 != null) {
            if(var20 <= 0) {
               var14 = (byte)((int)((double)(var16 * 2) + 2.5D));
            }

            float var28;
            var20 = (var28 = var13 - (float)(-var16)) == 0.0F?0:(var28 < 0.0F?-1:1);
         }

         if(var10 != null) {
            if(var20 <= 0) {
               var15 = (byte)((int)((double)(var16 * 2) + 2.5D));
            }

            float var29;
            var20 = (var29 = var12 - (float)var16) == 0.0F?0:(var29 < 0.0F?-1:1);
         }

         if(var10 != null) {
            if(var20 >= 0) {
               var14 = (byte)(var16 * 2 + 1);
            }

            float var30;
            var20 = (var30 = var13 - (float)var16) == 0.0F?0:(var30 < 0.0F?-1:1);
         }

         if(var10 != null) {
            if(var20 < 0) {
               break label100;
            }

            var20 = (byte)(var16 * 2 + 1);
         }

         var15 = var20;
      }

      Map var19 = this.field_6658;
      class_1292 var10002 = new class_1292;
      var10002.method_6766(this, (byte)var1, var14, (byte)var15, (byte)var17);
      var19.put(var3, var10002);
   }

   // $FF: renamed from: b (add, ahb, yz) byte[]
   public byte[] method_6803(add var1, ahb var2, class_792 var3) {
      String[] var10000 = class_752.method_4253();
      class_1291 var5 = (class_1291)this.field_6657.get(var3);
      String[] var4 = var10000;
      class_1291 var6 = var5;
      byte[] var7;
      if(var4 != null) {
         if(var5 == null) {
            var7 = null;
            return var7;
         }

         var6 = var5;
      }

      var7 = var6.method_6764(var1);
      return var7;
   }

   // $FF: renamed from: b (int, int, int) void
   public void method_6804(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      super.method_6771();
      int var5 = 0;
      String[] var4 = var10000;

      while(var5 < this.field_6656.size()) {
         label45: {
            int var10001;
            int[] var7;
            label53: {
               class_1291 var6;
               int var8;
               label54: {
                  label42: {
                     var6 = (class_1291)this.field_6656.get(var5);
                     var7 = var6.field_6623;
                     var10001 = var1;
                     if(var4 != null) {
                        if(var6.field_6623[var1] >= 0) {
                           var8 = var6.field_6623[var1];
                           if(var4 == null) {
                              break label54;
                           }

                           if(var8 <= var2) {
                              break label42;
                           }
                        }

                        var7 = var6.field_6623;
                        var10001 = var1;
                     }

                     var7[var10001] = var2;
                  }

                  var7 = var6.field_6624;
                  var10001 = var1;
                  if(var4 == null) {
                     break label53;
                  }

                  var8 = var6.field_6624[var1];
               }

               if(var8 >= 0) {
                  var7 = var6.field_6624;
                  var10001 = var1;
                  if(var4 == null) {
                     break label53;
                  }

                  if(var6.field_6624[var1] >= var3) {
                     break label45;
                  }
               }

               var7 = var6.field_6624;
               var10001 = var1;
            }

            var7[var10001] = var3;
         }

         ++var5;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (byte[]) void
   public void method_6805(byte[] var1) {
      String[] var2 = class_752.method_4253();
      byte var10000 = var1[0];
      int var3;
      if(var2 != null) {
         if(var10000 == 0) {
            var3 = var1[1] & 255;
            int var4 = var1[2] & 255;
            int var5 = 0;

            while(true) {
               if(var5 < var1.length - 3) {
                  this.field_6655[(var5 + var4) * 128 + var3] = var1[var5 + 3];
                  ++var5;
                  if(var2 == null) {
                     break;
                  }

                  if(var2 != null) {
                     continue;
                  }
               }

               this.method_6771();
               break;
            }

            if(var2 != null) {
               return;
            }
         }

         var10000 = var1[0];
      }

      byte var10001 = 1;
      if(var2 != null) {
         if(var10000 == 1) {
            this.field_6658.clear();
            var3 = 0;

            do {
               if(var3 >= (var1.length - 1) / 3) {
                  return;
               }

               byte var8 = (byte)(var1[var3 * 3 + 1] >> 4);
               byte var9 = var1[var3 * 3 + 2];
               byte var6 = var1[var3 * 3 + 3];
               byte var7 = (byte)(var1[var3 * 3 + 1] & 15);
               Map var10 = this.field_6658;
               StringBuilder var11 = new StringBuilder();
               String[] var10002 = field_6660;
               String var12 = var11.append("icon-").append(var3).toString();
               class_1292 var13 = new class_1292;
               var13.method_6766(this, var8, var9, var6, var7);
               var10.put(var12, var13);
               ++var3;
            } while(var2 != null);
         }

         var10000 = var1[0];
         var10001 = 2;
      }

      if(var10000 == var10001) {
         this.field_6654 = var1[1];
      }

   }

   // $FF: renamed from: b (yz) jM
   public class_1291 method_6806(class_792 var1) {
      String[] var10000 = class_752.method_4253();
      class_1291 var3 = (class_1291)this.field_6657.get(var1);
      String[] var2 = var10000;
      class_1291 var4 = var3;
      if(var2 != null) {
         if(var3 == null) {
            var4 = new class_1291;
            var4.method_6763(this, var1);
            var3 = var4;
            this.field_6657.put(var1, var3);
            this.field_6656.add(var3);
         }

         var4 = var3;
      }

      return var4;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6807() {
      // $FF: Couldn't be decompiled
   }
}
