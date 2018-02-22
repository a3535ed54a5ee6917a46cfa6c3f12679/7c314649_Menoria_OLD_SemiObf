import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Map.Entry;
import net.minecraft.item.ItemSuperBow;

public final class add {

   // $FF: renamed from: a java.text.DecimalFormat
   public static final DecimalFormat field_2957;
   // $FF: renamed from: b int
   public int field_2958;
   // $FF: renamed from: c int
   public int field_2959;
   // $FF: renamed from: e adb
   private adb field_2960;
   // $FF: renamed from: d ro
   public class_1583 field_2961;
   // $FF: renamed from: f int
   private int field_2962;
   // $FF: renamed from: g st
   private class_751 field_2963;
   private static final String __OBFID;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2964;


   // $FF: renamed from: <init> (aji) void
   public void method_3721(aji var1) {
      this.method_3722(var1, 1);
   }

   // $FF: renamed from: <init> (aji, int) void
   public void method_3722(aji var1, int var2) {
      this.method_3723(var1, var2, 0);
   }

   // $FF: renamed from: <init> (aji, int, int) void
   public void method_3723(aji var1, int var2, int var3) {
      this.method_3726(adb.method_2920(var1), var2, var3);
   }

   // $FF: renamed from: <init> (adb) void
   public void method_3724(adb var1) {
      this.method_3725(var1, 1);
   }

   // $FF: renamed from: <init> (adb, int) void
   public void method_3725(adb var1, int var2) {
      this.method_3726(var1, var2, 0);
   }

   // $FF: renamed from: <init> (adb, int, int) void
   public void method_3726(adb var1, int var2, int var3) {
      super();
      this.field_2960 = var1;
      this.field_2958 = var2;
      this.field_2962 = var3;
      if(this.field_2962 < 0) {
         this.field_2962 = 0;
      }

   }

   // $FF: renamed from: a (ro) add
   public static add method_3727(class_1583 var0) {
      String[] var10000 = class_752.method_4253();
      add var10001 = new add;
      var10001.method_3728();
      add var2 = var10001;
      String[] var1 = var10000;
      var2.method_3738(var0);
      add var3 = var2;
      if(var1 != null) {
         var3 = var2.method_3730() != null?var2:null;
      }

      return var3;
   }

   // $FF: renamed from: <init> () void
   private void method_3728() {
      super();
   }

   // $FF: renamed from: a (int) add
   public add method_3729(int var1) {
      String[] var10000 = class_752.method_4253();
      add var10001 = new add;
      var10001.method_3726(this.field_2960, var1, this.field_2962);
      add var3 = var10001;
      String[] var2 = var10000;
      add var4 = this;
      if(var2 != null) {
         if(this.field_2961 != null) {
            var3.field_2961 = (class_1583)this.field_2961.method_8633();
         }

         this.field_2958 -= var1;
         var4 = var3;
      }

      return var4;
   }

   // $FF: renamed from: b () adb
   public adb method_3730() {
      return this.field_2960;
   }

   // $FF: renamed from: c () vL
   public class_73 method_3731() {
      return this.method_3730().method_2925(this);
   }

   // $FF: renamed from: d () int
   public int method_3732() {
      return this.method_3730().getSpriteNumber();
   }

   // $FF: renamed from: a (yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_3733(class_792 var1, ahb var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9) {
      String[] var10000 = class_752.method_4253();
      boolean var11 = this.method_3730().method_2926(this, var1, var2, var3, var4, var5, var6, var7, var8, var9);
      String[] var10 = var10000;
      boolean var12 = var11;
      if(var10 != null) {
         if(var11) {
            var1.method_4615(class_1698.field_8910[adb.method_2918(this.field_2960)], 1);
         }

         var12 = var11;
      }

      return var12;
   }

   // $FF: renamed from: a (aji) float
   public float method_3734(aji var1) {
      return this.method_3730().method_2927(this, var1);
   }

   // $FF: renamed from: a (ahb, yz) add
   public add method_3735(ahb var1, class_792 var2) {
      return this.method_3730().method_2928(this, var1, var2);
   }

   // $FF: renamed from: b (ahb, yz) add
   public add method_3736(ahb var1, class_792 var2) {
      return this.method_3730().method_2929(this, var1, var2);
   }

   // $FF: renamed from: b (ro) ro
   public class_1583 method_3737(class_1583 var1) {
      String[] var3 = field_2964;
      var1.method_8666("id", (short)adb.method_2918(this.field_2960));
      String[] var10000 = class_752.method_4253();
      var1.method_8665("Count", (byte)this.field_2958);
      var1.method_8666("Damage", (short)this.field_2962);
      String[] var2 = var10000;
      class_1583 var4 = this.field_2961;
      if(var2 != null) {
         if(this.field_2961 != null) {
            var1.method_8664("tag", this.field_2961);
         }

         var4 = var1;
      }

      return var4;
   }

   // $FF: renamed from: c (ro) void
   public void method_3738(class_1583 var1) {
      String[] var3 = field_2964;
      this.field_2960 = adb.method_2919(var1.method_8680("id"));
      String[] var10000 = class_752.method_4253();
      this.field_2958 = var1.initGui9("Count");
      String[] var2 = var10000;
      this.field_2962 = var1.method_8680("Damage");
      int var4 = this.field_2962;
      if(var2 != null) {
         if(this.field_2962 < 0) {
            this.field_2962 = 0;
         }

         var3 = field_2964;
         var4 = var1.initGui8("tag", 10);
      }

      if(var4 != 0) {
         String[] var10002 = field_2964;
         this.field_2961 = var1.method_8688("tag");
      }

   }

   // $FF: renamed from: e () int
   public int method_3739() {
      return this.method_3730().method_2930();
   }

   // $FF: renamed from: f () boolean
   public boolean method_3740() {
      int var10000;
      label40: {
         String[] var1 = class_752.method_4253();
         var10000 = this.method_3739();
         if(var1 != null) {
            if(var10000 <= 1) {
               break label40;
            }

            var10000 = this.method_3741();
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 != 0) {
            var10000 = this.method_3743();
            if(var1 == null) {
               return (boolean)var10000;
            }

            if(var10000 != 0) {
               break label40;
            }
         }

         var10000 = 1;
         return (boolean)var10000;
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: g () boolean
   public boolean method_3741() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_2960.method_2934();
      if(var1 != null) {
         if(var10000 <= 0) {
            var10000 = 0;
            return (boolean)var10000;
         }

         var10000 = this.method_3766();
      }

      if(var1 != null) {
         if(var10000 != 0) {
            class_1583 var2 = this.method_3767();
            String[] var10001 = field_2964;
            var10000 = var2.method_8690("Unbreakable");
            if(var1 == null) {
               return (boolean)var10000;
            }

            if(var10000 != 0) {
               var10000 = 0;
               return (boolean)var10000;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: h () boolean
   public boolean method_3742() {
      return this.field_2960.method_2932();
   }

   // $FF: renamed from: i () boolean
   public boolean method_3743() {
      int var10000;
      label24: {
         String[] var1 = class_752.method_4253();
         var10000 = this.method_3741();
         if(var1 != null) {
            if(var10000 == 0) {
               break label24;
            }

            var10000 = this.field_2962;
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 > 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: j () int
   public int method_3744() {
      return this.field_2962;
   }

   // $FF: renamed from: k () int
   public int method_3745() {
      return this.field_2962;
   }

   // $FF: renamed from: b (int) void
   public void method_3746(int var1) {
      String[] var10000 = class_752.method_4253();
      this.field_2962 = var1;
      String[] var2 = var10000;
      add var3 = this;
      if(var2 != null) {
         if(this.field_2962 >= 0) {
            return;
         }

         var3 = this;
      }

      var3.field_2962 = 0;
   }

   // $FF: renamed from: l () int
   public int method_3747() {
      return this.field_2960.method_2934();
   }

   // $FF: renamed from: a (int, java.util.Random) boolean
   public boolean method_3748(int var1, Random var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.method_3741();
      if(var3 != null) {
         if(var10000 == 0) {
            return false;
         }

         var10000 = var1;
      }

      if(var3 != null) {
         label54: {
            if(var10000 > 0) {
               int var4 = class_980.method_5640(class_940.field_4800.field_4808, this);
               int var5 = 0;
               int var6 = 0;

               int var10001;
               while(true) {
                  if(var4 > 0) {
                     var10000 = var6;
                     var10001 = var1;
                     if(var3 == null || var3 == null) {
                        break;
                     }

                     if(var6 < var1) {
                        if(class_951.method_5509(this, var4, var2)) {
                           ++var5;
                        }

                        ++var6;
                        if(var3 != null) {
                           continue;
                        }
                     }
                  }

                  var10000 = var1;
                  var10001 = var5;
                  break;
               }

               var1 = var10000 - var10001;
               var10000 = var1;
               if(var3 == null) {
                  break label54;
               }

               if(var1 <= 0) {
                  return false;
               }
            }

            this.field_2962 += var1;
            var10000 = this.field_2962;
         }
      }

      if(var3 != null) {
         var10000 = var10000 > this.method_3747()?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (int, sv) void
   public void method_3749(int var1, class_752 var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var2 instanceof class_792;
      if(var3 != null) {
         label72: {
            if(var10000 != 0) {
               var10000 = ((class_792)var2).field_3640.field_2839;
               if(var3 == null) {
                  break label72;
               }

               if(((class_792)var2).field_3640.field_2839) {
                  return;
               }
            }

            var10000 = this.method_3741();
         }
      }

      if(var3 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = this.method_3748(var1, var2.method_4165());
      }

      if(var3 != null) {
         if(var10000 == 0) {
            return;
         }

         var2.method_4189(this);
         --this.field_2958;
         var10000 = var2 instanceof class_792;
      }

      add var5;
      label77: {
         if(var3 != null) {
            label78: {
               if(var10000 != 0) {
                  class_792 var4 = (class_792)var2;
                  var4.method_4615(class_1698.field_8911[adb.method_2918(this.field_2960)], 1);
                  var10000 = this.field_2958;
                  if(var3 == null) {
                     break label78;
                  }

                  if(this.field_2958 == 0) {
                     label48: {
                        label79: {
                           var10000 = this.method_3730() instanceof class_573;
                           if(var3 != null) {
                              if(var10000 != 0) {
                                 break label79;
                              }

                              var10000 = this.method_3730() instanceof ItemSuperBow;
                           }

                           if(var3 == null) {
                              break label78;
                           }

                           if(var10000 == 0) {
                              break label48;
                           }
                        }

                        var4.method_4594();
                     }
                  }
               }

               var5 = this;
               if(var3 == null) {
                  break label77;
               }

               var10000 = this.field_2958;
            }
         }

         if(var10000 < 0) {
            this.field_2958 = 0;
         }

         var5 = this;
      }

      var5.field_2962 = 0;
   }

   // $FF: renamed from: a (sv, yz) void
   public void method_3750(class_752 var1, class_792 var2) {
      boolean var3 = this.field_2960.method_2937(this, var1, var2);
      if(var3) {
         var2.method_4615(class_1698.field_8910[adb.method_2918(this.field_2960)], 1);
      }

   }

   // $FF: renamed from: a (ahb, aji, int, int, int, yz) void
   public void method_3751(ahb var1, aji var2, int var3, int var4, int var5, class_792 var6) {
      boolean var7 = this.field_2960.method_2938(this, var1, var2, var3, var4, var5, var6);
      if(var7) {
         var6.method_4615(class_1698.field_8910[adb.method_2918(this.field_2960)], 1);
      }

   }

   // $FF: renamed from: b (aji) boolean
   public boolean method_3752(aji var1) {
      return this.field_2960.method_2939(var1);
   }

   // $FF: renamed from: a (yz, sv) boolean
   public boolean method_3753(class_792 var1, class_752 var2) {
      return this.field_2960.method_2940(this, var1, var2);
   }

   // $FF: renamed from: m () add
   public add method_3754() {
      add var10000 = new add;
      var10000.method_3726(this.field_2960, this.field_2958, this.field_2962);
      add var1 = var10000;
      if(this.field_2961 != null) {
         var1.field_2961 = (class_1583)this.field_2961.method_8633();
      }

      return var1;
   }

   // $FF: renamed from: a (add, add) boolean
   public static boolean method_3755(add var0, add var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = var0;
      boolean var3;
      if(var2 != null) {
         label69: {
            if(var0 == null) {
               var10000 = var1;
               if(var2 == null) {
                  break label69;
               }

               if(var1 == null) {
                  var3 = true;
                  return var3;
               }
            }

            var10000 = var0;
         }
      }

      label91: {
         if(var2 != null) {
            if(var10000 == null) {
               break label91;
            }

            var10000 = var1;
         }

         if(var2 != null) {
            if(var10000 == null) {
               break label91;
            }

            var10000 = var0;
         }

         class_1583 var4 = var10000.field_2961;
         if(var2 != null) {
            label48: {
               if(var4 == null) {
                  var4 = var1.field_2961;
                  if(var2 == null) {
                     break label48;
                  }

                  if(var1.field_2961 != null) {
                     var3 = false;
                     return var3;
                  }
               }

               var4 = var0.field_2961;
            }
         }

         label75: {
            if(var2 != null) {
               if(var4 == null) {
                  break label75;
               }

               var4 = var0.field_2961;
            }

            var3 = var4.equals(var1.field_2961);
            if(var2 == null) {
               return var3;
            }

            if(!var3) {
               var3 = false;
               return var3;
            }
         }

         var3 = true;
         return var3;
      }

      var3 = false;
      return var3;
   }

   // $FF: renamed from: b (add, add) boolean
   public static boolean method_3756(add var0, add var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = var0;
      boolean var3;
      if(var2 != null) {
         label37: {
            if(var0 == null) {
               var10000 = var1;
               if(var2 == null) {
                  break label37;
               }

               if(var1 == null) {
                  var3 = true;
                  return var3;
               }
            }

            var10000 = var0;
         }
      }

      label50: {
         if(var2 != null) {
            if(var10000 == null) {
               break label50;
            }

            var10000 = var1;
         }

         if(var2 != null) {
            if(var10000 == null) {
               break label50;
            }

            var10000 = var0;
         }

         var3 = var10000.method_3757(var1);
         return var3;
      }

      var3 = false;
      return var3;
   }

   // $FF: renamed from: d (add) boolean
   private boolean method_3757(add var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = this;
      boolean var4;
      if(var2 != null) {
         if(this.field_2958 != var1.field_2958) {
            var4 = false;
            return var4;
         }

         var10000 = this;
      }

      if(var2 != null) {
         if(var10000.field_2960 != var1.field_2960) {
            var4 = false;
            return var4;
         }

         var10000 = this;
      }

      if(var2 != null) {
         if(var10000.field_2962 != var1.field_2962) {
            var4 = false;
            return var4;
         }

         var10000 = this;
      }

      class_1583 var3 = var10000.field_2961;
      if(var2 != null) {
         label47: {
            if(var3 == null) {
               var3 = var1.field_2961;
               if(var2 == null) {
                  break label47;
               }

               if(var1.field_2961 != null) {
                  var4 = false;
                  return var4;
               }
            }

            var3 = this.field_2961;
         }
      }

      label67: {
         if(var2 != null) {
            if(var3 == null) {
               break label67;
            }

            var3 = this.field_2961;
         }

         var4 = var3.equals(var1.field_2961);
         if(var2 == null) {
            return var4;
         }

         if(!var4) {
            var4 = false;
            return var4;
         }
      }

      var4 = true;
      return var4;
   }

   // $FF: renamed from: a (add) boolean
   public boolean method_3758(add var1) {
      int var3;
      label24: {
         String[] var2 = class_752.method_4253();
         add var10000 = this;
         if(var2 != null) {
            if(this.field_2960 != var1.field_2960) {
               break label24;
            }

            var10000 = this;
         }

         var3 = var10000.field_2962;
         if(var2 == null) {
            return (boolean)var3;
         }

         if(var3 == var1.field_2962) {
            var3 = 1;
            return (boolean)var3;
         }
      }

      var3 = 0;
      return (boolean)var3;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_3759() {
      return this.field_2960.getUnlocalizedName(this);
   }

   // $FF: renamed from: b (add) add
   public static add method_3760(add var0) {
      String[] var1 = class_752.method_4253();
      add var10000 = var0;
      if(var1 != null) {
         if(var0 == null) {
            var10000 = null;
            return var10000;
         }

         var10000 = var0;
      }

      var10000 = var10000.method_3754();
      return var10000;
   }

   public String toString() {
      return this.field_2958 + "x" + this.field_2960.getUnlocalizedName() + "@" + this.field_2962;
   }

   // $FF: renamed from: a (ahb, sa, int, boolean) void
   public void method_3761(ahb var1, class_689 var2, int var3, boolean var4) {
      String[] var5 = class_752.method_4253();
      add var10000 = this;
      if(var5 != null) {
         if(this.field_2959 > 0) {
            --this.field_2959;
         }

         var10000 = this;
      }

      var10000.field_2960.method_2954(this, var1, var2, var3, var4);
   }

   // $FF: renamed from: a (ahb, yz, int) void
   public void method_3762(ahb var1, class_792 var2, int var3) {
      var2.method_4615(class_1698.field_8909[adb.method_2918(this.field_2960)], var3);
      this.field_2960.method_2955(this, var1, var2);
   }

   // $FF: renamed from: n () int
   public int method_3763() {
      return this.method_3730().method_2958(this);
   }

   // $FF: renamed from: o () A
   public class_92 method_3764() {
      return this.method_3730().method_2957(this);
   }

   // $FF: renamed from: b (ahb, yz, int) void
   public void method_3765(ahb var1, class_792 var2, int var3) {
      this.method_3730().method_2959(this, var1, var2, var3);
   }

   // $FF: renamed from: p () boolean
   public boolean method_3766() {
      return this.field_2961 != null;
   }

   // $FF: renamed from: q () ro
   public class_1583 method_3767() {
      return this.field_2961;
   }

   // $FF: renamed from: r () rr
   public class_1580 method_3768() {
      String[] var1 = class_752.method_4253();
      class_1583 var10000 = this.field_2961;
      class_1580 var2;
      if(var1 != null) {
         if(this.field_2961 == null) {
            var2 = null;
            return var2;
         }

         var10000 = this.field_2961;
      }

      String[] var10001 = field_2964;
      var2 = var10000.method_8689("ench", 10);
      return var2;
   }

   // $FF: renamed from: d (ro) void
   public void method_3769(class_1583 var1) {
      this.field_2961 = var1;
   }

   // $FF: renamed from: s () java.lang.String
   public String method_3770() {
      String[] var10000 = class_752.method_4253();
      String var2 = this.method_3730().method_2964(this);
      String[] var1 = var10000;
      class_1583 var5 = this.field_2961;
      if(var1 != null) {
         if(this.field_2961 == null) {
            return var2;
         }

         var5 = this.field_2961;
      }

      String[] var4 = field_2964;
      String var10001 = "display";
      if(var1 != null) {
         if(!var5.initGui8("display", 10)) {
            return var2;
         }

         var5 = this.field_2961;
         var10001 = "display";
      }

      class_1583 var3 = var5.method_8688(var10001);
      var5 = var3;
      var4 = field_2964;
      var10001 = "Name";
      if(var1 != null) {
         if(!var3.initGui8("Name", 8)) {
            return var2;
         }

         var5 = var3;
         var10001 = "Name";
      }

      var2 = var5.method_8685(var10001);
      return var2;
   }

   // $FF: renamed from: c (java.lang.String) add
   public add method_3771(String var1) {
      String[] var2 = class_752.method_4253();
      class_1583 var10000 = this.field_2961;
      if(var2 != null) {
         if(this.field_2961 == null) {
            class_1583 var10001 = new class_1583;
            var10001.method_8628();
            this.field_2961 = var10001;
         }

         var10000 = this.field_2961;
      }

      String[] var3 = field_2964;
      String var4 = "display";
      if(var2 != null) {
         if(!var10000.initGui8("display", 10)) {
            var10000 = this.field_2961;
            class_1583 var10002 = new class_1583;
            var10002.method_8628();
            var10000.method_8664("display", var10002);
         }

         var3 = field_2964;
         var10000 = this.field_2961.method_8688("display");
         var4 = "Name";
      }

      var10000.initGui1(var4, var1);
      return this;
   }

   // $FF: renamed from: t () void
   public void method_3772() {
      String[] var1 = class_752.method_4253();
      class_1583 var10000 = this.field_2961;
      if(var1 != null) {
         if(this.field_2961 == null) {
            return;
         }

         var10000 = this.field_2961;
      }

      String[] var3 = field_2964;
      String var10001 = "display";
      if(var1 != null) {
         if(!var10000.initGui8("display", 10)) {
            return;
         }

         var10000 = this.field_2961;
         var10001 = "display";
      }

      add var5;
      label41: {
         class_1583 var2 = var10000.method_8688(var10001);
         var3 = field_2964;
         var2.method_8691("Name");
         boolean var4 = var2.method_8692();
         if(var1 != null) {
            if(!var4) {
               return;
            }

            this.field_2961.method_8691("display");
            var5 = this;
            if(var1 == null) {
               break label41;
            }

            var4 = this.field_2961.method_8692();
         }

         if(!var4) {
            return;
         }

         var5 = this;
      }

      var5.method_3769((class_1583)null);
   }

   // $FF: renamed from: u () boolean
   public boolean method_3773() {
      String[] var1 = class_752.method_4253();
      class_1583 var10000 = this.field_2961;
      boolean var3;
      if(var1 != null) {
         if(this.field_2961 == null) {
            var3 = false;
            return var3;
         }

         var10000 = this.field_2961;
      }

      String[] var2 = field_2964;
      String var10001 = "display";
      byte var10002 = 10;
      if(var1 != null) {
         if(!var10000.initGui8("display", 10)) {
            var3 = false;
            return var3;
         }

         var2 = field_2964;
         var10000 = this.field_2961.method_8688("display");
         var10001 = "Name";
         var10002 = 8;
      }

      var3 = var10000.initGui8(var10001, var10002);
      return var3;
   }

   // $FF: renamed from: a (yz, boolean) java.util.List
   public List method_3774(class_792 var1, boolean var2) {
      ArrayList var4 = new ArrayList();
      String[] var10000 = class_752.method_4253();
      String var5 = this.method_3770();
      String[] var3 = var10000;
      boolean var23 = this.method_3773();
      if(var3 != null) {
         if(var23) {
            var5 = class_130.field_296 + var5 + class_130.field_297;
         }

         var23 = var2;
      }

      String[] var15;
      StringBuilder var10001;
      int var24;
      add var29;
      class_1583 var30;
      label245: {
         int var6;
         label246: {
            adb var28;
            label239: {
               label247: {
                  StringBuilder var26;
                  if(var3 != null) {
                     if(var23) {
                        String var7 = "";
                        var24 = var5.length();
                        if(var3 != null) {
                           if(var24 > 0) {
                              var26 = (new StringBuilder()).append(var5);
                              var15 = field_2964;
                              var5 = var26.append(" (").toString();
                              var7 = ")";
                           }

                           var24 = adb.method_2918(this.field_2960);
                        }

                        label220: {
                           label219: {
                              var6 = var24;
                              if(var3 != null) {
                                 if(!this.method_3742()) {
                                    break label219;
                                 }

                                 var26 = (new StringBuilder()).append(var5);
                                 var15 = field_2964;
                                 var5 = var26.append(String.format("#%04d/%d%s", new Object[]{Integer.valueOf(var6), Integer.valueOf(this.field_2962), var7})).toString();
                              }

                              if(var3 != null) {
                                 break label220;
                              }
                           }

                           var26 = (new StringBuilder()).append(var5);
                           var15 = field_2964;
                           var5 = var26.append(String.format("#%04d%s", new Object[]{Integer.valueOf(var6), var7})).toString();
                        }

                        if(var3 != null) {
                           break label247;
                        }
                     }

                     var23 = this.method_3773();
                  }

                  if(var3 == null) {
                     break label246;
                  }

                  if(!var23) {
                     var28 = this.field_2960;
                     if(var3 == null) {
                        break label239;
                     }

                     if(this.field_2960 == class_1010.field_5215) {
                        var26 = (new StringBuilder()).append(var5);
                        var15 = field_2964;
                        var5 = var26.append(" #").append(this.field_2962).toString();
                     }
                  }
               }

               var4.add(var5);
               var28 = this.field_2960;
            }

            var28.method_2963(this, var1, var4, var2);
            var29 = this;
            if(var3 == null) {
               break label245;
            }

            var23 = this.method_3766();
         }

         if(var23) {
            label249: {
               class_1580 var16 = this.method_3768();
               if(var16 != null) {
                  var6 = 0;

                  while(var6 < var16.method_8658()) {
                     var30 = var16.method_8653(var6);
                     var15 = field_2964;
                     short var8 = var30.method_8680("id");
                     short var9 = var16.method_8653(var6).method_8680("lvl");
                     if(var3 == null) {
                        break label249;
                     }

                     if(var3 != null) {
                        if(class_940.field_4782[var8] != null) {
                           var4.add(class_940.field_4782[var8].method_5490(var9));
                        }

                        ++var6;
                     }

                     if(var3 == null) {
                        break;
                     }
                  }
               }

               var29 = this;
               if(var3 == null) {
                  break label245;
               }

               var15 = field_2964;
               if(this.field_2961.initGui8("display", 10)) {
                  label251: {
                     String var25;
                     label252: {
                        class_1583 var17 = this.field_2961.method_8688("display");
                        byte var31 = var17.initGui8("color", 3);
                        if(var3 != null) {
                           if(var31 != 0 && var3 != null) {
                              label181: {
                                 if(var2) {
                                    var4.add("Color: #" + Integer.toHexString(var17.method_8681("color")).toUpperCase());
                                    if(var3 != null) {
                                       break label181;
                                    }
                                 }

                                 var10001 = (new StringBuilder()).append(class_130.field_296);
                                 var15 = field_2964;
                                 var4.add(var10001.append(class_1563.method_8581("item.dyed")).toString());
                              }
                           }

                           var30 = var17;
                           var15 = field_2964;
                           var25 = "Lore";
                           if(var3 == null) {
                              break label252;
                           }

                           var31 = var17.initGui6("Lore");
                        }

                        if(var31 != 9) {
                           break label251;
                        }

                        var30 = var17;
                        var15 = field_2964;
                        var25 = "Lore";
                     }

                     class_1580 var20 = var30.method_8689(var25, 8);
                     var24 = var20.method_8658();
                     if(var3 != null) {
                        if(var24 <= 0) {
                           break label251;
                        }

                        var24 = 0;
                     }

                     int var10 = var24;

                     while(var10 < var20.method_8658()) {
                        var4.add(class_130.field_281 + "" + class_130.field_296 + var20.method_8657(var10));
                        ++var10;
                        if(var3 == null) {
                           break;
                        }
                     }
                  }
               }
            }
         }

         var29 = this;
      }

      label165: {
         label254: {
            Multimap var18 = var29.method_3787();
            var23 = var18.isEmpty();
            if(var3 != null) {
               if(!var23) {
                  var4.add("");
                  Iterator var19 = var18.entries().iterator();

                  while(var19.hasNext()) {
                     Entry var21 = (Entry)var19.next();
                     class_1716 var22 = (class_1716)var21.getValue();
                     double var11 = var22.method_9597();
                     if(var3 == null) {
                        break label254;
                     }

                     class_1716 var32 = var22;
                     if(var3 != null) {
                        if(var22.method_9594() == adb.field_2330) {
                           var11 += (double)class_980.method_5648(this, class_923.field_4663);
                        }

                        var32 = var22;
                     }

                     double var13;
                     label142: {
                        label141: {
                           var24 = var32.method_9596();
                           byte var27 = 1;
                           if(var3 != null) {
                              if(var24 == 1) {
                                 break label141;
                              }

                              var24 = var22.method_9596();
                              var27 = 2;
                           }

                           if(var24 != var27) {
                              var13 = var11;
                              if(var3 != null) {
                                 break label142;
                              }
                           }
                        }

                        var13 = var11 * 100.0D;
                     }

                     label256: {
                        double var33;
                        var24 = (var33 = var11 - 0.0D) == 0.0D?0:(var33 < 0.0D?-1:1);
                        StringBuilder var10002;
                        if(var3 != null) {
                           if(var24 > 0) {
                              var10001 = (new StringBuilder()).append(class_130.field_285);
                              var10002 = new StringBuilder();
                              var15 = field_2964;
                              var4.add(var10001.append(class_1563.method_8582(var10002.append("attribute.modifier.plus.").append(var22.method_9596()).toString(), new Object[]{field_2957.format(var13), class_1563.method_8581("attribute.name." + (String)var21.getKey())})).toString());
                              if(var3 != null) {
                                 break label256;
                              }
                           }

                           double var34;
                           var24 = (var34 = var11 - 0.0D) == 0.0D?0:(var34 < 0.0D?-1:1);
                        }

                        if(var3 != null && var24 < 0) {
                           var13 *= -1.0D;
                           var10001 = (new StringBuilder()).append(class_130.field_288);
                           var10002 = new StringBuilder();
                           var15 = field_2964;
                           var4.add(var10001.append(class_1563.method_8582(var10002.append("attribute.modifier.take.").append(var22.method_9596()).toString(), new Object[]{field_2957.format(var13), class_1563.method_8581("attribute.name." + (String)var21.getKey())})).toString());
                        }
                     }

                     if(var3 == null) {
                        break;
                     }
                  }
               }

               var23 = this.method_3766();
            }

            if(var3 == null) {
               break label165;
            }

            if(var23) {
               var30 = this.method_3767();
               var15 = field_2964;
               var23 = var30.method_8690("Unbreakable");
               if(var3 == null) {
                  break label165;
               }

               if(var23) {
                  var4.add(class_130.field_285 + class_1563.method_8581("item.unbreakable"));
               }
            }
         }

         var23 = var2;
      }

      if(var3 != null) {
         if(!var23) {
            return var4;
         }

         var23 = this.method_3743();
      }

      if(var3 != null && var23) {
         var10001 = new StringBuilder();
         var15 = field_2964;
         var4.add(var10001.append("Durability: ").append(this.method_3747() - this.method_3744()).append(" / ").append(this.method_3747()).toString());
      }

      return var4;
   }

   // $FF: renamed from: v () boolean
   public boolean method_3775() {
      return this.method_3730().method_2965(this);
   }

   // $FF: renamed from: w () z
   public class_134 method_3776() {
      return this.method_3730().method_2966(this);
   }

   // $FF: renamed from: x () boolean
   public boolean method_3777() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.method_3730().method_2967(this);
      if(var1 != null) {
         if(!var10000) {
            var10000 = false;
            return var10000;
         }

         var10000 = this.method_3779();
      }

      if(var1 != null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   // $FF: renamed from: a (cH, int) void
   public void method_3778(class_940 var1, int var2) {
      String[] var3 = class_752.method_4253();
      class_1583 var10000 = this.field_2961;
      if(var3 != null) {
         if(this.field_2961 == null) {
            class_1583 var10001 = new class_1583;
            var10001.method_8628();
            this.method_3769(var10001);
         }

         var10000 = this.field_2961;
      }

      String[] var6 = field_2964;
      String var7 = "ench";
      byte var10002 = 9;
      if(var3 != null) {
         if(!var10000.initGui8("ench", 9)) {
            var10000 = this.field_2961;
            class_1580 var8 = new class_1580;
            var8.method_8628();
            var10000.method_8664("ench", var8);
         }

         var10000 = this.field_2961;
         var6 = field_2964;
         var7 = "ench";
         var10002 = 10;
      }

      class_1580 var4 = var10000.method_8689(var7, var10002);
      var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var5 = var10000;
      var6 = field_2964;
      var5.method_8666("id", (short)var1.field_4808);
      var5.method_8666("lvl", (short)((byte)var2));
      var4.method_8650(var5);
   }

   // $FF: renamed from: y () boolean
   public boolean method_3779() {
      boolean var2;
      label24: {
         String[] var1 = class_752.method_4253();
         class_1583 var10000 = this.field_2961;
         if(var1 != null) {
            if(this.field_2961 == null) {
               break label24;
            }

            var10000 = this.field_2961;
         }

         String[] var10001 = field_2964;
         var2 = var10000.initGui8("ench", 9);
         if(var1 == null) {
            return var2;
         }

         if(var2) {
            var2 = true;
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   // $FF: renamed from: a (java.lang.String, rm) void
   public void method_3780(String var1, class_1571 var2) {
      String[] var3 = class_752.method_4253();
      class_1583 var10000 = this.field_2961;
      if(var3 != null) {
         if(this.field_2961 == null) {
            class_1583 var10001 = new class_1583;
            var10001.method_8628();
            this.method_3769(var10001);
         }

         var10000 = this.field_2961;
      }

      var10000.method_8664(var1, var2);
   }

   // $FF: renamed from: z () boolean
   public boolean method_3781() {
      return this.method_3730().method_2975();
   }

   // $FF: renamed from: A () boolean
   public boolean method_3782() {
      return this.field_2963 != null;
   }

   // $FF: renamed from: a (st) void
   public void method_3783(class_751 var1) {
      this.field_2963 = var1;
   }

   // $FF: renamed from: B () st
   public class_751 method_3784() {
      return this.field_2963;
   }

   // $FF: renamed from: C () int
   public int method_3785() {
      int var10000;
      label24: {
         String[] var1 = class_752.method_4253();
         var10000 = this.method_3766();
         if(var1 != null) {
            if(var10000 == 0) {
               break label24;
            }

            String[] var2 = field_2964;
            var10000 = this.field_2961.initGui8("RepairCost", 3);
         }

         if(var1 == null) {
            return var10000;
         }

         if(var10000 != 0) {
            String[] var10001 = field_2964;
            var10000 = this.field_2961.method_8681("RepairCost");
            return var10000;
         }
      }

      var10000 = 0;
      return var10000;
   }

   // $FF: renamed from: c (int) void
   public void method_3786(int var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = this;
      if(var2 != null) {
         if(!this.method_3766()) {
            class_1583 var10001 = new class_1583;
            var10001.method_8628();
            this.field_2961 = var10001;
         }

         var10000 = this;
      }

      class_1583 var3 = var10000.field_2961;
      String[] var4 = field_2964;
      var3.method_8667("RepairCost", var1);
   }

   // $FF: renamed from: D () com.google.common.collect.Multimap
   public Multimap method_3787() {
      String[] var1 = class_752.method_4253();
      add var10000 = this;
      Object var2;
      if(var1 != null) {
         label48: {
            if(this.method_3766()) {
               var10000 = this;
               if(var1 == null) {
                  break label48;
               }

               String[] var7 = field_2964;
               if(this.field_2961.initGui8("AttributeModifiers", 9)) {
                  var2 = HashMultimap.create();
                  class_1580 var3 = this.field_2961.method_8689("AttributeModifiers", 10);
                  int var4 = 0;

                  while(var4 < var3.method_8658()) {
                     class_1583 var5 = var3.method_8653(var4);
                     class_1716 var6 = class_1840.method_9956(var5);
                     if(var1 == null) {
                        return (Multimap)var2;
                     }

                     if(var1 != null) {
                        if(var6.method_9594().getLeastSignificantBits() != 0L && var1 != null && var6.method_9594().getMostSignificantBits() != 0L) {
                           Multimap var8 = (Multimap)var2;
                           String[] var10002 = field_2964;
                           var8.put(var5.method_8685("AttributeName"), var6);
                        }

                        ++var4;
                     }

                     if(var1 == null) {
                        break;
                     }
                  }

                  if(var1 != null) {
                     return (Multimap)var2;
                  }
               }
            }

            var10000 = this;
         }
      }

      var2 = var10000.method_3730().method_2978();
      return (Multimap)var2;
   }

   // $FF: renamed from: a (adb) void
   public void method_3788(adb var1) {
      this.field_2960 = var1;
   }

   // $FF: renamed from: E () rV
   public class_66 method_3789() {
      class_1082 var10000 = new class_1082;
      var10000.method_6134("[");
      class_66 var1 = var10000.method_339(this.method_3770()).method_339("]");
      if(this.field_2960 != null) {
         class_1583 var3 = new class_1583;
         var3.method_8628();
         class_1583 var2 = var3;
         this.method_3737(var2);
         class_1560 var4 = var1.method_338();
         class_1558 var10001 = new class_1558;
         class_912 var10003 = class_912.field_4591;
         class_1082 var10004 = new class_1082;
         var10004.method_6134(var2.toString());
         var10001.method_8508(var10003, var10004);
         var4.method_8531(var10001);
         var1.method_338().method_8524(this.method_3776().field_354);
      }

      return var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3790() {
      // $FF: Couldn't be decompiled
   }
}
