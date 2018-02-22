import java.util.Iterator;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: xq
public class class_699 extends class_689 {

   // $FF: renamed from: at org.apache.logging.log4j.Logger
   private static final Logger field_3091;
   // $FF: renamed from: au int
   public int field_3092;
   // $FF: renamed from: av int
   public int field_3093;
   // $FF: renamed from: aw int
   private int field_3094;
   // $FF: renamed from: ax java.lang.String
   private String field_3095;
   // $FF: renamed from: ay java.lang.String
   private String field_3096;
   // $FF: renamed from: az float
   public float field_3097;
   // $FF: renamed from: aA java.lang.String
   private static final String field_3098;
   // $FF: renamed from: db java.lang.String[]
   private static final String[] field_3099;


   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_4024(ahb var1, double var2, double var4, double var6) {
      super.method_3847(var1);
      this.field_3094 = 5;
      this.field_3097 = (float)(Math.random() * 3.141592653589793D * 2.0D);
      this.method_3852(0.25F, 0.25F);
      this.field_3013 = this.field_3015 / 2.0F;
      this.method_3854(var2, var4, var6);
      this.field_3000 = (float)(Math.random() * 360.0D);
      this.field_2997 = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
      this.field_2998 = 0.20000000298023224D;
      this.field_2999 = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
   }

   // $FF: renamed from: <init> (ahb, double, double, double, add) void
   public void method_4025(ahb var1, double var2, double var4, double var6, add var8) {
      this.method_4024(var1, var2, var4, var6);
      this.method_4031(var8);
   }

   // $FF: renamed from: g_ () boolean
   protected boolean method_3869() {
      return false;
   }

   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3094 = 5;
      this.field_3097 = (float)(Math.random() * 3.141592653589793D * 2.0D);
      this.method_3852(0.25F, 0.25F);
      this.field_3013 = this.field_3015 / 2.0F;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      this.method_3849().method_9498(10, 5);
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var1 = class_752.method_4253();
      class_699 var10000 = this;
      if(var1 != null) {
         if(this.method_4030() == null) {
            this.method_3851();
            if(var1 != null) {
               return;
            }
         }

         super.method_3856();
         var10000 = this;
      }

      int var5 = var10000.field_3093;
      if(var1 != null) {
         if(var10000.field_3093 > 0) {
            --this.field_3093;
         }

         this.field_2991 = this.field_2994;
         this.field_2992 = this.field_2995;
         this.field_2993 = this.field_2996;
         this.field_2998 -= 0.03999999910593033D;
         this.field_3026 = this.method_3953(this.field_2994, (this.field_3004.field_6910 + this.field_3004.field_6913) / 2.0D, this.field_2996);
         this.method_3864(this.field_2997, this.field_2998, this.field_2999);
         var5 = (int)this.field_2991;
      }

      if(var1 != null) {
         label105: {
            if(var5 == (int)this.field_2994) {
               var5 = (int)this.field_2992;
               if(var1 == null) {
                  break label105;
               }

               if(var5 == (int)this.field_2995) {
                  var5 = (int)this.field_2993;
                  if(var1 == null) {
                     break label105;
                  }

                  if(var5 == (int)this.field_2996) {
                     var5 = 0;
                     break label105;
                  }
               }
            }

            var5 = 1;
         }
      }

      label117: {
         label94: {
            label93: {
               int var2 = var5;
               var5 = var2;
               if(var1 != null) {
                  if(var2 != 0) {
                     break label93;
                  }

                  var10000 = this;
                  if(var1 == null) {
                     break label94;
                  }

                  var5 = this.field_3029 % 25;
               }

               if(var5 != 0) {
                  break label117;
               }
            }

            var10000 = this;
         }

         label119: {
            ahb var4 = var10000.field_2990;
            if(var1 != null) {
               if(var10000.field_2990.getBlock(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996)).method_2424() == awt.field_4178) {
                  this.field_2998 = 0.20000000298023224D;
                  this.field_2997 = (double)((this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.2F);
                  this.field_2999 = (double)((this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.2F);
                  String[] var10001 = field_3099;
                  this.method_3868("random.fizz", 0.4F, 2.0F + this.field_3028.nextFloat() * 0.4F);
               }

               var10000 = this;
               if(var1 == null) {
                  break label119;
               }

               var4 = this.field_2990;
            }

            if(var4.field_1832) {
               break label117;
            }

            var10000 = this;
         }

         var10000.method_4026();
      }

      float var3 = 0.98F;
      var5 = this.field_3005;
      if(var1 != null) {
         if(this.field_3005) {
            var3 = this.field_2990.getBlock(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_3004.field_6910) - 1, class_1715.method_9561(this.field_2996)).field_2008 * 0.98F;
         }

         this.field_2997 *= (double)var3;
         this.field_2998 *= 0.9800000190734863D;
         this.field_2999 *= (double)var3;
         var5 = this.field_3005;
      }

      if(var1 != null) {
         if(var5 != 0) {
            this.field_2998 *= -0.5D;
         }

         ++this.field_3092;
         var5 = this.field_2990.field_1832;
      }

      label121: {
         if(var1 != null) {
            if(var5 != 0) {
               return;
            }

            var10000 = this;
            if(var1 == null) {
               break label121;
            }

            var5 = this.field_3092;
         }

         if(var5 < 6000) {
            return;
         }

         var10000 = this;
      }

      var10000.method_3851();
   }

   // $FF: renamed from: a () void
   private void method_4026() {
      String[] var10000 = class_752.method_4253();
      Iterator var2 = this.field_2990.method_2157(class_699.class, this.field_3004.method_7097(0.5D, 0.0D, 0.5D)).iterator();
      String[] var1 = var10000;

      while(var2.hasNext()) {
         class_699 var3 = (class_699)var2.next();
         this.method_4027(var3);
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (xq) boolean
   public boolean method_4027(class_699 var1) {
      String[] var2 = class_752.method_4253();
      class_699 var10000 = var1;
      if(var2 != null) {
         if(var1 == this) {
            return false;
         }

         var10000 = var1;
      }

      boolean var7 = var10000.method_3917();
      if(var2 != null) {
         if(var7) {
            var7 = this.method_3917();
            if(var2 == null) {
               return var7;
            }

            if(var7) {
               add var3 = this.method_4030();
               add var4 = var1.method_4030();
               add var8 = var4;
               if(var2 != null) {
                  if(var4.method_3730() != var3.method_3730()) {
                     return false;
                  }

                  var8 = var4;
               }

               label103: {
                  var7 = var8.method_3766() ^ var3.method_3766();
                  if(var2 != null) {
                     if(var7) {
                        return false;
                     }

                     var8 = var4;
                     if(var2 == null) {
                        break label103;
                     }

                     var7 = var4.method_3766();
                  }

                  if(var7) {
                     var8 = var4;
                     if(var2 == null) {
                        break label103;
                     }

                     if(!var4.method_3767().equals(var3.method_3767())) {
                        return false;
                     }
                  }

                  var8 = var4;
               }

               adb var5 = var8.method_3730();
               if(var2 != null) {
                  if(var5 == null) {
                     return false;
                  }

                  var5 = var4.method_3730();
               }

               int var10001;
               int var6;
               label76: {
                  var6 = var5.method_2932();
                  if(var2 != null) {
                     if(var6 != 0) {
                        var6 = var4.method_3745();
                        var10001 = var3.method_3745();
                        if(var2 == null) {
                           break label76;
                        }

                        if(var6 != var10001) {
                           return false;
                        }
                     }

                     var6 = var4.field_2958;
                  }

                  var10001 = var3.field_2958;
               }

               if(var2 != null) {
                  if(var6 < var10001) {
                     return var1.method_4027(this);
                  }

                  var6 = var4.field_2958 + var3.field_2958;
                  if(var2 == null) {
                     return (boolean)var6;
                  }

                  var10001 = var4.method_3739();
               }

               if(var6 > var10001) {
                  return false;
               }

               var4.field_2958 += var3.field_2958;
               var1.field_3093 = Math.max(var1.field_3093, this.field_3093);
               var1.field_3092 = Math.min(var1.field_3092, this.field_3092);
               var1.method_4031(var4);
               this.method_3851();
               var6 = 1;
               return (boolean)var6;
            }
         }

         var7 = false;
      }

      return var7;
   }

   // $FF: renamed from: b () void
   public void method_4028() {
      this.field_3092 = 4800;
   }

   // $FF: renamed from: N () boolean
   public boolean method_3877() {
      return this.field_2990.method_2122(this.field_3004, awt.field_4177, this);
   }

   // $FF: renamed from: f (int) void
   protected void method_3872(int var1) {
      this.method_3896(class_1691.field_8830, (float)var1);
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      class_699 var10000 = this;
      if(var3 != null) {
         if(this.method_3961()) {
            return false;
         }

         var10000 = this;
      }

      int var4;
      label40: {
         if(var3 != null) {
            label38: {
               if(var10000.method_4030() != null) {
                  var10000 = this;
                  if(var3 == null) {
                     break label38;
                  }

                  if(this.method_4030().method_3730() == class_1010.field_5255) {
                     var4 = var1.method_9337();
                     if(var3 == null) {
                        break label40;
                     }

                     if(var4 != 0) {
                        return false;
                     }
                  }
               }

               this.method_3895();
               this.field_3094 = (int)((float)this.field_3094 - var2);
               var10000 = this;
            }
         }

         var4 = var10000.field_3094;
      }

      if(var3 != null) {
         if(var4 <= 0) {
            this.method_3851();
         }

         var4 = 0;
      }

      return (boolean)var4;
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      class_699 var5;
      label28: {
         String[] var10000 = class_752.method_4253();
         String[] var3 = field_3099;
         var1.method_8666("Health", (short)((byte)this.field_3094));
         String[] var2 = var10000;
         var1.method_8666("Age", (short)this.field_3092);
         String var4 = this.method_4034();
         if(var2 != null) {
            if(var4 != null) {
               var1.initGui1("Thrower", this.field_3095);
            }

            var5 = this;
            if(var2 == null) {
               break label28;
            }

            var4 = this.method_4032();
         }

         if(var4 != null) {
            var3 = field_3099;
            var1.initGui1("Owner", this.field_3096);
         }

         var5 = this;
      }

      if(var5.method_4030() != null) {
         String[] var10001 = field_3099;
         add var10002 = this.method_4030();
         class_1583 var10003 = new class_1583;
         var10003.method_8628();
         var1.method_8664("Item", var10002.method_3737(var10003));
      }

   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      String var10001;
      String[] var2;
      class_1583 var6;
      label34: {
         String[] var4 = field_3099;
         this.field_3094 = var1.method_8680("Health") & 255;
         String[] var10000 = class_752.method_4253();
         this.field_3092 = var1.method_8680("Age");
         var2 = var10000;
         boolean var5 = var1.initGui7("Owner");
         if(var2 != null) {
            if(var5) {
               this.field_3096 = var1.method_8685("Owner");
            }

            var6 = var1;
            var4 = field_3099;
            var10001 = "Thrower";
            if(var2 == null) {
               break label34;
            }

            var5 = var1.initGui7("Thrower");
         }

         if(var5) {
            var4 = field_3099;
            this.field_3095 = var1.method_8685("Thrower");
         }

         var6 = var1;
         String[] var7 = field_3099;
         var10001 = "Item";
      }

      class_1583 var3 = var6.method_8688(var10001);
      this.method_4031(add.method_3727(var3));
      class_699 var8 = this;
      if(var2 != null) {
         if(this.method_4030() != null) {
            return;
         }

         var8 = this;
      }

      var8.method_3851();
   }

   // $FF: renamed from: b_ (yz) void
   public void method_3892(class_792 var1) {
      String[] var2 = class_752.method_4253();
      class_699 var10000 = this;
      if(var2 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var10000 = this;
      }

      add var3 = var10000.method_4030();
      int var4 = var3.field_2958;
      var10000 = this;
      if(var2 != null) {
         if(this.field_3093 != 0) {
            return;
         }

         var10000 = this;
      }

      int var9;
      label110: {
         if(var10000.field_3096 != null) {
            var9 = 6000 - this.field_3092;
            if(var2 == null) {
               break label110;
            }

            if(var9 > 200) {
               var9 = this.field_3096.equals(var1.method_64());
               if(var2 == null) {
                  break label110;
               }

               if(var9 == 0) {
                  return;
               }
            }
         }

         var9 = var1.field_3616.method_3607(var3);
      }

      if(var9 != 0) {
         adb var10 = var3.method_3730();
         adb var10001 = adb.method_2920(class_1192.field_6042);
         if(var2 != null) {
            if(var10 == var10001) {
               var1.method_4614(class_1600.field_8331);
            }

            var10 = var3.method_3730();
            var10001 = adb.method_2920(class_1192.field_6043);
         }

         if(var2 != null) {
            if(var10 == var10001) {
               var1.method_4614(class_1600.field_8331);
            }

            var10 = var3.method_3730();
            var10001 = class_1010.field_5192;
         }

         if(var2 != null) {
            if(var10 == var10001) {
               var1.method_4614(class_1600.field_8344);
            }

            var10 = var3.method_3730();
            var10001 = class_1010.field_5122;
         }

         if(var2 != null) {
            if(var10 == var10001) {
               var1.method_4614(class_1600.field_8347);
            }

            var10 = var3.method_3730();
            var10001 = class_1010.field_5226;
         }

         label125: {
            add var6;
            label126: {
               if(var2 != null) {
                  if(var10 == var10001) {
                     var1.method_4614(class_1600.field_8351);
                  }

                  var6 = var3;
                  if(var2 == null) {
                     break label126;
                  }

                  var10 = var3.method_3730();
                  var10001 = class_1010.field_5122;
               }

               class_792 var7;
               label128: {
                  label83: {
                     if(var10 == var10001) {
                        var10000 = this;
                        if(var2 == null) {
                           break label83;
                        }

                        if(this.method_4034() != null) {
                           class_792 var5 = this.field_2990.method_2178(this.method_4034());
                           var7 = var5;
                           if(var2 == null) {
                              break label128;
                           }

                           if(var5 != null) {
                              var7 = var5;
                              if(var2 == null) {
                                 break label128;
                              }

                              if(var5 != var1) {
                                 var5.method_4614(class_1600.field_8348);
                              }
                           }
                        }
                     }

                     var10000 = this;
                  }

                  if(var2 == null) {
                     break label125;
                  }

                  ahb var8 = var10000.field_2990;
                  String[] var10002 = field_3099;
                  var8.method_2082(var1, "random.pop", 0.2F, ((this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.7F + 1.0F) * 2.0F);
                  var7 = var1;
               }

               var7.method_4238(this, var4);
               var6 = var3;
            }

            if(var6.field_2958 > 0) {
               return;
            }

            var10000 = this;
         }

         var10000.method_3851();
      }

   }

   // $FF: renamed from: b_ () java.lang.String
   public String method_4029() {
      StringBuilder var10000 = new StringBuilder();
      String[] var10001 = field_3099;
      return class_1563.method_8581(var10000.append("item.").append(this.method_4030().method_3759()).toString());
   }

   // $FF: renamed from: av () boolean
   public boolean method_3959() {
      return false;
   }

   // $FF: renamed from: b (int) void
   public void method_3964(int var1) {
      String[] var10000 = class_752.method_4253();
      super.method_3964(var1);
      String[] var2 = var10000;
      class_699 var3 = this;
      if(var2 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var3 = this;
      }

      var3.method_4026();
   }

   // $FF: renamed from: d () add
   public add method_4030() {
      String[] var10000 = class_752.method_4253();
      add var2 = this.method_3849().method_9504(10);
      String[] var1 = var10000;
      add var3 = var2;
      if(var1 != null) {
         if(var2 == null) {
            var3 = new add;
            var3.method_3721(class_1192.field_6026);
         } else {
            var3 = var2;
         }
      }

      return var3;
   }

   // $FF: renamed from: b (add) void
   public void method_4031(add var1) {
      this.method_3849().method_9506(10, var1);
      this.method_3849().method_9507(10);
   }

   // $FF: renamed from: e () java.lang.String
   public String method_4032() {
      return this.field_3096;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_4033(String var1) {
      this.field_3096 = var1;
   }

   // $FF: renamed from: f () java.lang.String
   public String method_4034() {
      return this.field_3095;
   }

   // $FF: renamed from: c (java.lang.String) void
   public void method_4035(String var1) {
      this.field_3095 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4036() {
      // $FF: Couldn't be decompiled
   }
}
