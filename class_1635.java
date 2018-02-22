import com.google.common.collect.Maps;
import java.awt.Color;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;

// $FF: renamed from: v0
public class class_1635 {

   // $FF: renamed from: b v0[]
   public static final class_1635[] field_8489;
   // $FF: renamed from: c v0
   public static final class_1635 field_8490;
   // $FF: renamed from: d v0
   public static final class_1635 field_8491;
   // $FF: renamed from: e v0
   public static final class_1635 field_8492;
   // $FF: renamed from: f v0
   public static final class_1635 field_8493;
   // $FF: renamed from: g v0
   public static final class_1635 field_8494;
   // $FF: renamed from: h v0
   public static final class_1635 field_8495;
   // $FF: renamed from: i v0
   public static final class_1635 field_8496;
   // $FF: renamed from: j v0
   public static final class_1635 field_8497;
   // $FF: renamed from: k v0
   public static final class_1635 field_8498;
   // $FF: renamed from: l v0
   public static final class_1635 field_8499;
   // $FF: renamed from: m v0
   public static final class_1635 field_8500;
   // $FF: renamed from: n v0
   public static final class_1635 field_8501;
   // $FF: renamed from: o v0
   public static final class_1635 field_8502;
   // $FF: renamed from: p v0
   public static final class_1635 field_8503;
   // $FF: renamed from: q v0
   public static final class_1635 field_8504;
   // $FF: renamed from: r v0
   public static final class_1635 field_8505;
   // $FF: renamed from: s v0
   public static final class_1635 field_8506;
   // $FF: renamed from: t v0
   public static final class_1635 field_8507;
   // $FF: renamed from: u v0
   public static final class_1635 field_8508;
   // $FF: renamed from: v v0
   public static final class_1635 field_8509;
   // $FF: renamed from: w v0
   public static final class_1635 field_8510;
   // $FF: renamed from: x v0
   public static final class_1635 field_8511;
   // $FF: renamed from: y v0
   public static final class_1635 field_8512;
   // $FF: renamed from: z v0
   public static final class_1635 field_8513;
   // $FF: renamed from: A java.awt.Color
   public static Color field_8514;
   // $FF: renamed from: B v0
   public static final class_1635 field_8515;
   // $FF: renamed from: C java.awt.Color
   public static Color field_8516;
   // $FF: renamed from: D v0
   public static final class_1635 field_8517;
   // $FF: renamed from: E v0
   public static final class_1635 field_8518;
   // $FF: renamed from: F v0
   public static final class_1635 field_8519;
   // $FF: renamed from: G v0
   public static final class_1635 field_8520;
   // $FF: renamed from: H v0
   public static final class_1635 field_8521;
   // $FF: renamed from: I v0
   public static final class_1635 field_8522;
   // $FF: renamed from: J v0
   public static final class_1635 field_8523;
   // $FF: renamed from: K v0
   public static final class_1635 field_8524;
   // $FF: renamed from: L v0
   public static final class_1635 field_8525;
   // $FF: renamed from: M int
   public final int field_8526;
   // $FF: renamed from: N java.util.Map
   private final Map field_8527;
   // $FF: renamed from: O boolean
   private final boolean field_8528;
   // $FF: renamed from: P int
   private final int field_8529;
   // $FF: renamed from: Q java.lang.String
   private String field_8530;
   // $FF: renamed from: R int
   private int field_8531;
   // $FF: renamed from: S double
   private double field_8532;
   // $FF: renamed from: T boolean
   private boolean field_8533;
   // $FF: renamed from: U java.lang.String
   private static final String field_8534;
   // $FF: renamed from: V java.lang.String[]
   private static final String[] field_8535;


   // $FF: renamed from: <init> (int, boolean, int) void
   protected void method_8964(int var1, boolean var2, int var3) {
      super();
      this.field_8527 = Maps.newHashMap();
      this.field_8530 = "";
      this.field_8531 = -1;
      this.field_8526 = var1;
      field_8489[var1] = this;
      this.field_8528 = var2;
      if(var2) {
         this.field_8532 = 0.5D;
      } else {
         this.field_8532 = 1.0D;
      }

      this.field_8529 = var3;
   }

   // $FF: renamed from: a (int, int) v0
   protected class_1635 method_8965(int var1, int var2) {
      this.field_8531 = var1 + var2 * 8;
      return this;
   }

   // $FF: renamed from: a () int
   public int method_8966() {
      return this.field_8526;
   }

   // $FF: renamed from: b (sv, int) void
   public void method_8967(class_752 var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.field_8526;
      int var10001 = field_8500.field_8526;
      class_752 var5;
      if(var3 != null) {
         if(this.field_8526 == field_8500.field_8526) {
            var5 = var1;
            if(var3 != null) {
               if(var1.method_406() >= var1.method_405()) {
                  return;
               }

               var5 = var1;
            }

            var5.method_4187(1.0F);
            if(var3 != null) {
               return;
            }
         }

         var10000 = this.field_8526;
         var10001 = field_8509.field_8526;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            float var6;
            var10000 = (var6 = var1.method_406() - 1.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
            if(var3 != null) {
               if(var10000 <= 0) {
                  return;
               }

               var1.method_3896(class_1691.field_8840, 1.0F);
            }

            if(var3 != null) {
               return;
            }
         }

         var10000 = this.field_8526;
         var10001 = field_8510.field_8526;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var1.method_3896(class_1691.field_8841, 1.0F);
            if(var3 != null) {
               return;
            }
         }

         var10000 = this.field_8526;
         var10001 = field_8507.field_8526;
      }

      if(var3 != null) {
         label127: {
            if(var10000 == var10001) {
               var10000 = var1 instanceof class_792;
               if(var3 == null) {
                  break label127;
               }

               if(var10000 != 0) {
                  ((class_792)var1).method_4622(0.025F * (float)(var2 + 1));
                  if(var3 != null) {
                     return;
                  }
               }
            }

            var10000 = this.field_8526;
         }

         var10001 = field_8513.field_8526;
      }

      if(var3 != null) {
         label116: {
            if(var10000 == var10001) {
               var10000 = var1 instanceof class_792;
               if(var3 == null) {
                  break label116;
               }

               if(var10000 != 0) {
                  var5 = var1;
                  if(var3 != null) {
                     if(var1.field_2990.field_1832) {
                        return;
                     }

                     var5 = var1;
                  }

                  ((class_792)var5).method_4623().method_3632(var2 + 1, 1.0F);
                  if(var3 != null) {
                     return;
                  }
               }
            }

            var10000 = this.field_8526;
         }

         var10001 = field_8496.field_8526;
      }

      label103: {
         label159: {
            if(var3 != null) {
               if(var10000 == var10001) {
                  var5 = var1;
                  if(var3 == null) {
                     break label103;
                  }

                  if(!var1.method_4181()) {
                     break label159;
                  }
               }

               var10000 = this.field_8526;
               var10001 = field_8497.field_8526;
            }

            if(var3 != null) {
               if(var10000 == var10001) {
                  var5 = var1;
                  if(var3 == null) {
                     break label103;
                  }

                  if(var1.method_4181()) {
                     break label159;
                  }
               }

               var10000 = this.field_8526;
               var10001 = field_8497.field_8526;
            }

            label84: {
               label160: {
                  label161: {
                     if(var3 != null) {
                        if(var10000 == var10001) {
                           boolean var4 = var1.method_4181();
                           if(var3 == null) {
                              break label84;
                           }

                           if(!var4) {
                              break label160;
                           }
                        }

                        var10000 = this.field_8526;
                        if(var3 == null) {
                           break label161;
                        }

                        var10001 = field_8496.field_8526;
                     }

                     if(var10000 != var10001) {
                        return;
                     }

                     var10000 = var1.method_4181();
                  }

                  if(var3 == null) {
                     break label84;
                  }

                  if(var10000 == 0) {
                     return;
                  }
               }

               var1.method_3896(class_1691.field_8840, (float)(6 << var2));
            }

            if(var3 != null) {
               return;
            }
         }

         var5 = var1;
      }

      var5.method_4187((float)Math.max(4 << var2, 0));
   }

   // $FF: renamed from: b (sv, sv, int, double) void
   public void method_8968(class_752 var1, class_752 var2, int var3, double var4) {
      int var10000;
      int var7;
      label77: {
         label80: {
            String[] var6 = class_752.method_4253();
            var10000 = this.field_8526;
            int var10001 = field_8496.field_8526;
            if(var6 != null) {
               if(this.field_8526 == field_8496.field_8526) {
                  var10000 = var2.method_4181();
                  if(var6 == null) {
                     break label77;
                  }

                  if(var10000 == 0) {
                     break label80;
                  }
               }

               var10000 = this.field_8526;
               var10001 = field_8497.field_8526;
            }

            if(var6 != null) {
               if(var10000 == var10001) {
                  var10000 = var2.method_4181();
                  if(var6 == null) {
                     break label77;
                  }

                  if(var10000 != 0) {
                     break label80;
                  }
               }

               var10000 = this.field_8526;
               var10001 = field_8497.field_8526;
            }

            label58: {
               label81: {
                  label82: {
                     if(var6 != null) {
                        if(var10000 == var10001) {
                           var10000 = var2.method_4181();
                           if(var6 == null) {
                              break label58;
                           }

                           if(var10000 == 0) {
                              break label81;
                           }
                        }

                        var10000 = this.field_8526;
                        if(var6 == null) {
                           break label82;
                        }

                        var10001 = field_8496.field_8526;
                     }

                     if(var10000 != var10001) {
                        return;
                     }

                     var10000 = var2.method_4181();
                  }

                  if(var6 == null) {
                     break label58;
                  }

                  if(var10000 == 0) {
                     return;
                  }
               }

               var10000 = (int)(var4 * (double)(6 << var3) + 0.5D);
            }

            var7 = var10000;
            class_752 var8 = var1;
            if(var6 != null) {
               if(var1 == null) {
                  var2.method_3896(class_1691.field_8840, (float)var7);
                  if(var6 != null) {
                     return;
                  }
               }

               var8 = var2;
            }

            var8.method_3896(class_1691.method_9332(var2, var1), (float)var7);
            if(var6 != null) {
               return;
            }
         }

         var10000 = (int)(var4 * (double)(4 << var3) + 0.5D);
      }

      var7 = var10000;
      var2.method_4187((float)var7);
   }

   // $FF: renamed from: c () boolean
   public boolean method_8969() {
      return false;
   }

   // $FF: renamed from: b (int, int) boolean
   public boolean method_8970(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.field_8526;
      int var10001 = field_8500.field_8526;
      int var4;
      if(var3 != null) {
         if(this.field_8526 == field_8500.field_8526) {
            var4 = 50 >> var2;
            var10000 = var4;
            if(var3 != null) {
               if(var4 <= 0) {
                  var10000 = 1;
                  return (boolean)var10000;
               }

               var10000 = var1 % var4;
            }

            if(var3 != null) {
               var10000 = var10000 == 0?1:0;
            }

            return (boolean)var10000;
         }

         var10000 = this.field_8526;
         var10001 = field_8509.field_8526;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var4 = 25 >> var2;
            var10000 = var4;
            if(var3 != null) {
               if(var4 <= 0) {
                  var10000 = 1;
                  return (boolean)var10000;
               }

               var10000 = var1 % var4;
            }

            if(var3 != null) {
               var10000 = var10000 == 0?1:0;
            }

            return (boolean)var10000;
         }

         var10000 = this.field_8526;
         var10001 = field_8510.field_8526;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var4 = 40 >> var2;
            var10000 = var4;
            if(var3 != null) {
               if(var4 <= 0) {
                  var10000 = 1;
                  return (boolean)var10000;
               }

               var10000 = var1 % var4;
            }

            if(var3 != null) {
               var10000 = var10000 == 0?1:0;
            }

            return (boolean)var10000;
         }

         var10000 = this.field_8526;
         if(var3 == null) {
            return (boolean)var10000;
         }

         var10001 = field_8507.field_8526;
      }

      var10000 = var10000 == var10001?1:0;
      return (boolean)var10000;
   }

   // $FF: renamed from: a (java.lang.String) v0
   public class_1635 method_8971(String var1) {
      this.field_8530 = var1;
      return this;
   }

   // $FF: renamed from: d () java.lang.String
   public String method_8972() {
      return this.field_8530;
   }

   // $FF: renamed from: e () boolean
   public boolean method_8973() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_8531;
      if(var1 != null) {
         var10000 = this.field_8531 >= 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: f () int
   public int method_8974() {
      return this.field_8531;
   }

   // $FF: renamed from: g () boolean
   public boolean method_8975() {
      return this.field_8528;
   }

   // $FF: renamed from: b (v5) java.lang.String
   public static String method_8976(class_1645 var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0.method_9028();
      if(var1 != null) {
         if(var10000 != 0) {
            String[] var3 = field_8535;
            return "**:**";
         }

         var10000 = var0.method_9017();
      }

      int var2 = var10000;
      return class_1723.method_9628(var2);
   }

   // $FF: renamed from: b (double) v0
   protected class_1635 method_8977(double var1) {
      this.field_8532 = var1;
      return this;
   }

   // $FF: renamed from: h () double
   public double method_8978() {
      return this.field_8532;
   }

   // $FF: renamed from: j () boolean
   public boolean method_8979() {
      return this.field_8533;
   }

   // $FF: renamed from: k () int
   public int method_8980() {
      return this.field_8529;
   }

   // $FF: renamed from: b (x3, java.lang.String, double, int) v0
   public class_1635 method_8981(class_79 var1, String var2, double var3, int var5) {
      class_1716 var10000 = new class_1716;
      var10000.method_9593(UUID.fromString(var2), this.method_8972(), var3, var5);
      class_1716 var6 = var10000;
      this.field_8527.put(var1, var6);
      return this;
   }

   // $FF: renamed from: l () java.util.Map
   public Map method_8982() {
      return this.field_8527;
   }

   // $FF: renamed from: b (sv, x8, int) void
   public void method_8983(class_752 var1, class_1721 var2, int var3) {
      String[] var10000 = class_752.method_4253();
      Iterator var5 = this.field_8527.entrySet().iterator();
      String[] var4 = var10000;

      while(var5.hasNext()) {
         label19: {
            Entry var6 = (Entry)var5.next();
            class_80 var7 = var2.method_9615((class_79)var6.getKey());
            class_80 var8 = var7;
            if(var4 != null) {
               if(var7 == null) {
                  break label19;
               }

               var8 = var7;
            }

            var8.method_394((class_1716)var6.getValue());
         }

         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (sv, x8, int) void
   public void method_8984(class_752 var1, class_1721 var2, int var3) {
      String[] var10000 = class_752.method_4253();
      Iterator var5 = this.field_8527.entrySet().iterator();
      String[] var4 = var10000;

      while(var5.hasNext()) {
         label19: {
            Entry var6 = (Entry)var5.next();
            class_80 var7 = var2.method_9615((class_79)var6.getKey());
            Object var9 = var7;
            if(var4 != null) {
               if(var7 == null) {
                  break label19;
               }

               var9 = var6.getValue();
            }

            class_1716 var8 = (class_1716)var9;
            var7.method_394(var8);
            class_1716 var10001 = new class_1716;
            var10001.method_9593(var8.method_9594(), this.method_8972() + " " + var3, this.method_8985(var3, var8), var8.method_9596());
            var7.method_393(var10001);
         }

         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (int, x5) double
   public double method_8985(int var1, class_1716 var2) {
      return var2.method_9597() * (double)(var1 + 1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_8986() {
      // $FF: Couldn't be decompiled
   }
}
