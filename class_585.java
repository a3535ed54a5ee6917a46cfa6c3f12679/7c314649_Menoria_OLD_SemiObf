import java.util.List;

// $FF: renamed from: gv
public class class_585 extends class_580 implements class_24 {

   // $FF: renamed from: m add[]
   private add[] field_2489;
   // $FF: renamed from: n java.lang.String
   private String field_2490;
   // $FF: renamed from: o int
   private int field_2491;
   // $FF: renamed from: p java.lang.String
   private static final String field_2492;
   // $FF: renamed from: q java.lang.String[]
   private static final String[] field_2493;


   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super.getBlock88();
      this.field_2489 = new add[5];
      this.field_2491 = -1;
   }

   // $FF: renamed from: b (ro) void
   public void getBlock92(class_1583 var1) {
      super.getBlock92(var1);
      String[] var7 = field_2493;
      class_1580 var3 = var1.method_8689("Items", 10);
      this.field_2489 = new add[this.method_83()];
      String[] var2 = class_752.method_4253();
      byte var10000 = var1.initGui8("CustomName", 8);
      if(var2 != null) {
         if(var10000 != 0) {
            this.field_2490 = var1.method_8685("CustomName");
         }

         var7 = field_2493;
         this.field_2491 = var1.method_8681("TransferCooldown");
         var10000 = 0;
      }

      int var4 = var10000;

      while(var4 < var3.method_8658()) {
         class_1583 var5 = var3.method_8653(var4);
         String[] var10001 = field_2493;
         byte var6 = var5.initGui9("Slot");
         if(var2 != null) {
            if(var6 >= 0 && var6 < this.field_2489.length) {
               this.field_2489[var6] = add.method_3727(var5);
            }

            ++var4;
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (ro) void
   public void getBlock93(class_1583 var1) {
      super.getBlock93(var1);
      class_1580 var10000 = new class_1580;
      var10000.method_8628();
      class_1580 var3 = var10000;
      String[] var7 = class_752.method_4253();
      int var4 = 0;
      String[] var2 = var7;

      class_1583 var9;
      String var10001;
      class_585 var10002;
      label36: {
         class_585 var8;
         while(true) {
            String[] var6;
            if(var4 < this.field_2489.length) {
               var8 = this;
               if(var2 == null) {
                  break;
               }

               if(this.field_2489[var4] != null) {
                  var9 = new class_1583;
                  var9.method_8628();
                  class_1583 var5 = var9;
                  var6 = field_2493;
                  var5.method_8665("Slot", (byte)var4);
                  this.field_2489[var4].method_3737(var5);
                  var3.method_8650(var5);
               }

               ++var4;
               if(var2 != null) {
                  continue;
               }
            }

            var6 = field_2493;
            var1.method_8664("Items", var3);
            var9 = var1;
            var10001 = "TransferCooldown";
            var10002 = this;
            if(var2 == null) {
               break label36;
            }

            var1.method_8667("TransferCooldown", this.field_2491);
            var8 = this;
            break;
         }

         if(!var8.method_89()) {
            return;
         }

         var9 = var1;
         String[] var10 = field_2493;
         var10001 = "CustomName";
         var10002 = this;
      }

      var9.initGui1(var10001, var10002.field_2490);
   }

   // $FF: renamed from: l () void
   public void method_91() {
      super.method_91();
   }

   // $FF: renamed from: f () int
   public int method_83() {
      return this.field_2489.length;
   }

   // $FF: renamed from: c (int) add
   public add method_84(int var1) {
      return this.field_2489[var1];
   }

   // $FF: renamed from: b (int, int) add
   public add method_85(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      add var10000 = this.field_2489[var1];
      if(var3 != null) {
         if(var10000 == null) {
            return null;
         }

         var10000 = this.field_2489[var1];
      }

      add var4;
      if(var3 != null) {
         if(var10000.field_2958 <= var2) {
            var4 = this.field_2489[var1];
            this.field_2489[var1] = null;
            return var4;
         }

         var10000 = this.field_2489[var1].method_3729(var2);
      }

      var4 = var10000;
      var10000 = this.field_2489[var1];
      if(var3 != null) {
         if(var10000.field_2958 == 0) {
            this.field_2489[var1] = null;
         }

         var10000 = var4;
      }

      return var10000;
   }

   // $FF: renamed from: j (int) add
   public add method_86(int var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = this.field_2489[var1];
      if(var2 != null) {
         if(var10000 == null) {
            return null;
         }

         var10000 = this.field_2489[var1];
      }

      add var3 = var10000;
      this.field_2489[var1] = null;
      return var3;
   }

   // $FF: renamed from: b (int, add) void
   public void method_87(int var1, add var2) {
      this.field_2489[var1] = var2;
      String[] var3 = class_752.method_4253();
      add var10000 = var2;
      if(var3 != null) {
         if(var2 == null) {
            return;
         }

         var10000 = var2;
      }

      if(var3 != null) {
         if(var10000.field_2958 <= this.method_90()) {
            return;
         }

         var10000 = var2;
      }

      var10000.field_2958 = this.method_90();
   }

   // $FF: renamed from: i () java.lang.String
   public String method_88() {
      String[] var1 = class_752.method_4253();
      class_585 var10000 = this;
      String var2;
      if(var1 != null) {
         if(!this.method_89()) {
            String[] var3 = field_2493;
            var2 = "container.hopper";
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.field_2490;
      return var2;
   }

   // $FF: renamed from: j () boolean
   public boolean method_89() {
      int var2;
      label24: {
         String[] var1 = class_752.method_4253();
         String var10000 = this.field_2490;
         if(var1 != null) {
            if(this.field_2490 == null) {
               break label24;
            }

            var10000 = this.field_2490;
         }

         var2 = var10000.length();
         if(var1 == null) {
            return (boolean)var2;
         }

         if(var2 > 0) {
            var2 = 1;
            return (boolean)var2;
         }
      }

      var2 = 0;
      return (boolean)var2;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_3124(String var1) {
      this.field_2490 = var1;
   }

   // $FF: renamed from: k () int
   public int method_90() {
      return 64;
   }

   // $FF: renamed from: b (yz) boolean
   public boolean method_92(class_792 var1) {
      String[] var2 = class_752.method_4253();
      int var10000;
      if(this.field_2464.method_31(this.field_2465, this.field_2466, this.field_2467) != this) {
         var10000 = 0;
      } else {
         double var3;
         var10000 = (var3 = var1.method_3889((double)this.field_2465 + 0.5D, (double)this.field_2466 + 0.5D, (double)this.field_2467 + 0.5D) - 64.0D) == 0.0D?0:(var3 < 0.0D?-1:1);
         if(var2 != null) {
            var10000 = var10000 <= 0?1:0;
         }
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: m () void
   public void method_93() {}

   // $FF: renamed from: n () void
   public void method_94() {}

   // $FF: renamed from: d (int, add) boolean
   public boolean method_95(int var1, add var2) {
      return true;
   }

   // $FF: renamed from: g () void
   public void getBlock94() {
      String[] var1 = class_752.method_4253();
      ahb var10000 = this.field_2464;
      if(var1 != null) {
         if(this.field_2464 == null) {
            return;
         }

         var10000 = this.field_2464;
      }

      boolean var2 = var10000.field_1832;
      if(var1 != null) {
         if(var2) {
            return;
         }

         --this.field_2491;
         var2 = this.method_3144();
      }

      if(var1 != null && !var2) {
         this.method_3143(0);
         this.method_3125();
      }

   }

   // $FF: renamed from: r () boolean
   public boolean method_3125() {
      boolean var3;
      label73: {
         String[] var1 = class_752.method_4253();
         ahb var10000 = this.field_2464;
         if(var1 != null) {
            if(this.field_2464 == null) {
               break label73;
            }

            var10000 = this.field_2464;
         }

         var3 = var10000.field_1832;
         if(var1 == null) {
            return var3;
         }

         if(!var3) {
            var3 = this.method_3144();
            if(var1 != null) {
               if(!var3) {
                  var3 = class_480.method_2839(this.getBlock96());
                  if(var1 == null) {
                     return var3;
                  }

                  if(var3) {
                     boolean var2 = false;
                     var3 = this.method_3126();
                     if(var1 != null) {
                        if(!var3) {
                           var2 = this.method_3128();
                        }

                        var3 = this.method_3127();
                     }

                     if(var1 != null) {
                        if(!var3) {
                           var3 = method_3131(this);
                           if(var1 != null) {
                              label44: {
                                 if(!var3) {
                                    var3 = var2;
                                    if(var1 == null) {
                                       break label44;
                                    }

                                    if(!var2) {
                                       var3 = false;
                                       break label44;
                                    }
                                 }

                                 var3 = true;
                              }
                           }

                           var2 = var3;
                        }

                        var3 = var2;
                     }

                     if(var1 == null) {
                        return var3;
                     }

                     if(var3) {
                        this.method_3143(8);
                        this.method_91();
                        return true;
                     }
                  }
               }

               var3 = false;
            }

            return var3;
         }
      }

      var3 = false;
      return var3;
   }

   // $FF: renamed from: x () boolean
   private boolean method_3126() {
      String[] var10000 = class_752.method_4253();
      add[] var2 = this.field_2489;
      String[] var1 = var10000;
      int var3 = var2.length;
      int var4 = 0;

      while(var4 < var3) {
         add var5 = var2[var4];
         if(var1 != null) {
            if(var5 != null) {
               return false;
            }

            ++var4;
         }

         if(var1 == null) {
            break;
         }
      }

      return true;
   }

   // $FF: renamed from: y () boolean
   private boolean method_3127() {
      add[] var2 = this.field_2489;
      String[] var1 = class_752.method_4253();
      int var3 = var2.length;
      int var4 = 0;

      while(true) {
         if(var4 < var3) {
            int var6;
            label34: {
               add var5 = var2[var4];
               add var10000 = var5;
               if(var1 != null) {
                  if(var5 == null) {
                     break label34;
                  }

                  var10000 = var5;
               }

               var6 = var10000.field_2958;
               if(var1 == null) {
                  return (boolean)var6;
               }

               if(var10000.field_2958 == var5.method_3739()) {
                  ++var4;
                  if(var1 != null) {
                     continue;
                  }

                  return true;
               }
            }

            var6 = 0;
            return (boolean)var6;
         }

         return true;
      }
   }

   // $FF: renamed from: z () boolean
   private boolean method_3128() {
      String[] var10000 = class_752.method_4253();
      class_22 var2 = this.method_3138();
      String[] var1 = var10000;
      if(var2 == null) {
         return false;
      } else {
         int var3 = class_1707.field_8946[class_480.method_2838(this.getBlock96())];
         byte var7 = this.method_3129(var2, var3);
         if(var1 != null) {
            if(var7 != 0) {
               return false;
            }

            var7 = 0;
         }

         int var4 = var7;

         while(true) {
            if(var4 < this.method_83()) {
               label58: {
                  add var8 = this.method_84(var4);
                  if(var1 != null) {
                     if(var8 == null) {
                        break label58;
                     }

                     var8 = this.method_84(var4).method_3754();
                  }

                  add var5 = var8;
                  add var6 = method_3134(var2, this.method_85(var4, 1), var3);
                  int var9;
                  if(var1 != null) {
                     if(var6 != null) {
                        var9 = var6.field_2958;
                        if(var1 == null) {
                           return (boolean)var9;
                        }

                        if(var6.field_2958 != 0) {
                           this.method_87(var4, var5);
                           break label58;
                        }
                     }

                     var2.method_91();
                  }

                  var9 = 1;
                  return (boolean)var9;
               }

               ++var4;
               if(var1 != null) {
                  continue;
               }
            }

            return false;
         }
      }
   }

   // $FF: renamed from: b (vI, int) boolean
   private boolean method_3129(class_22 var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1 instanceof class_23;
      add var10;
      if(var3 != null) {
         label78: {
            if(var10000 != 0) {
               var10000 = var2;
               if(var3 == null) {
                  break label78;
               }

               if(var2 > -1) {
                  class_23 var4 = (class_23)var1;
                  int[] var5 = var4.method_96(var2);
                  int var6 = 0;

                  while(var6 < var5.length) {
                     add var7 = var4.method_84(var5[var6]);
                     if(var3 == null) {
                        return true;
                     }

                     label85: {
                        var10 = var7;
                        if(var3 != null) {
                           if(var7 == null) {
                              break label85;
                           }

                           var10 = var7;
                        }

                        var10000 = var10.field_2958;
                        if(var3 == null) {
                           return (boolean)var10000;
                        }

                        if(var10.field_2958 == var7.method_3739()) {
                           ++var6;
                           if(var3 == null) {
                              break;
                           }
                           continue;
                        }
                     }

                     var10000 = 0;
                     return (boolean)var10000;
                  }

                  if(var3 != null) {
                     return true;
                  }
               }
            }

            var10000 = var1.method_83();
         }
      }

      int var8 = var10000;
      int var9 = 0;

      while(var9 < var8) {
         label87: {
            add var11 = var1.method_84(var9);
            var10 = var11;
            if(var3 != null) {
               if(var11 == null) {
                  break label87;
               }

               var10 = var11;
            }

            var10000 = var10.field_2958;
            if(var3 == null) {
               return (boolean)var10000;
            }

            if(var10.field_2958 == var11.method_3739()) {
               ++var9;
               if(var3 == null) {
                  break;
               }
               continue;
            }
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      return true;
   }

   // $FF: renamed from: c (vI, int) boolean
   private static boolean method_3130(class_22 var0, int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var0 instanceof class_23;
      if(var2 != null) {
         label48: {
            if(var10000 != 0) {
               var10000 = var1;
               if(var2 == null) {
                  break label48;
               }

               if(var1 > -1) {
                  class_23 var3 = (class_23)var0;
                  int[] var4 = var3.method_96(var1);
                  int var5 = 0;

                  while(var5 < var4.length) {
                     if(var2 == null) {
                        return true;
                     }

                     if(var3.method_84(var4[var5]) != null) {
                        return false;
                     }

                     ++var5;
                     if(var2 == null) {
                        break;
                     }
                  }

                  if(var2 != null) {
                     return true;
                  }
               }
            }

            var10000 = var0.method_83();
         }
      }

      int var6 = var10000;
      int var7 = 0;

      while(var7 < var6) {
         if(var0.method_84(var7) != null) {
            return false;
         }

         ++var7;
         if(var2 == null) {
            break;
         }
      }

      return true;
   }

   // $FF: renamed from: b (gF) boolean
   public static boolean method_3131(class_24 var0) {
      boolean var11;
      label85: {
         String[] var10000 = class_752.method_4253();
         class_22 var2 = method_3139(var0);
         String[] var1 = var10000;
         if(var2 != null) {
            byte var3 = 0;
            int var10 = method_3130(var2, var3);
            if(var1 != null) {
               if(var10 != 0) {
                  return false;
               }

               var10 = var2 instanceof class_23;
            }

            label89: {
               if(var1 != null) {
                  label77: {
                     if(var10 != 0) {
                        var10 = var3;
                        if(var1 == null) {
                           break label77;
                        }

                        if(var3 > -1) {
                           class_23 var4 = (class_23)var2;
                           int[] var5 = var4.method_96(var3);
                           int var6 = 0;

                           while(var6 < var5.length) {
                              var11 = method_3132(var0, var2, var5[var6], var3);
                              if(var1 == null) {
                                 return var11;
                              }

                              if(var1 != null) {
                                 if(!var11) {
                                    ++var6;
                                    if(var1 == null) {
                                       break;
                                    }
                                    continue;
                                 }

                                 var11 = true;
                              }

                              return var11;
                           }

                           if(var1 != null) {
                              break label89;
                           }
                        }
                     }

                     var10 = var2.method_83();
                  }
               }

               int var8 = var10;
               int var9 = 0;

               while(var9 < var8) {
                  var11 = method_3132(var0, var2, var9, var3);
                  if(var1 == null) {
                     return var11;
                  }

                  if(var1 != null) {
                     if(!var11) {
                        ++var9;
                        if(var1 == null) {
                           break;
                        }
                        continue;
                     }

                     var11 = true;
                  }

                  return var11;
               }
            }

            if(var1 != null) {
               break label85;
            }
         }

         class_699 var7 = method_3140(var0.method_99(), var0.method_100(), var0.method_101() + 1.0D, var0.method_102());
         if(var7 != null) {
            return method_3133(var0, var7);
         }
      }

      var11 = false;
      return var11;
   }

   // $FF: renamed from: b (gF, vI, int, int) boolean
   private static boolean method_3132(class_24 var0, class_22 var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      add var5 = var1.method_84(var2);
      String[] var4 = var10000;
      boolean var8;
      if(var5 != null) {
         var8 = method_3136(var1, var5, var2, var3);
         if(var4 == null) {
            return var8;
         }

         if(var8) {
            label42: {
               add var6 = var5.method_3754();
               add var7 = method_3134(var0, var1.method_85(var2, 1), -1);
               int var9;
               if(var4 != null) {
                  if(var7 != null) {
                     var9 = var7.field_2958;
                     if(var4 == null) {
                        return (boolean)var9;
                     }

                     if(var7.field_2958 != 0) {
                        var1.method_87(var2, var6);
                        break label42;
                     }
                  }

                  var1.method_91();
               }

               var9 = 1;
               return (boolean)var9;
            }
         }
      }

      var8 = false;
      return var8;
   }

   // $FF: renamed from: b (vI, xq) boolean
   public static boolean method_3133(class_22 var0, class_699 var1) {
      int var3 = 0;
      String[] var2 = class_752.method_4253();
      class_699 var10000 = var1;
      if(var2 != null) {
         if(var1 == null) {
            return false;
         }

         var10000 = var1;
      }

      add var4 = var10000.method_4030().method_3754();
      add var5 = method_3134(var0, var4, -1);
      if(var2 != null) {
         int var6;
         label27: {
            if(var5 != null) {
               var6 = var5.field_2958;
               if(var2 == null) {
                  break label27;
               }

               if(var5.field_2958 != 0) {
                  var1.method_4031(var5);
                  if(var2 != null) {
                     return (boolean)var3;
                  }
               }
            }

            var6 = 1;
         }

         var3 = var6;
      }

      var1.method_3851();
      return (boolean)var3;
   }

   // $FF: renamed from: b (vI, add, int) add
   public static add method_3134(class_22 var0, add var1, int var2) {
      String[] var3;
      add var9;
      label88: {
         label91: {
            var3 = class_752.method_4253();
            int var10000 = var0 instanceof class_23;
            if(var3 != null) {
               label85: {
                  if(var10000 != 0) {
                     var10000 = var2;
                     if(var3 == null) {
                        break label85;
                     }

                     if(var2 > -1) {
                        class_23 var4 = (class_23)var0;
                        int[] var5 = var4.method_96(var2);
                        int var6 = 0;

                        while(var6 < var5.length) {
                           var9 = var1;
                           if(var3 == null) {
                              break label88;
                           }

                           if(var3 != null) {
                              if(var1 == null) {
                                 break;
                              }

                              var9 = var1;
                           }

                           if(var3 != null) {
                              if(var9.field_2958 <= 0) {
                                 break;
                              }

                              var9 = method_3137(var0, var1, var5[var6], var2);
                           }

                           var1 = var9;
                           ++var6;
                           if(var3 == null) {
                              break;
                           }
                        }

                        if(var3 != null) {
                           break label91;
                        }
                     }
                  }

                  var10000 = var0.method_83();
               }
            }

            int var7 = var10000;
            int var8 = 0;

            while(var8 < var7) {
               var9 = var1;
               if(var3 == null || var3 == null) {
                  break label88;
               }

               if(var1 == null) {
                  break;
               }

               var9 = var1;
               if(var3 == null) {
                  break label88;
               }

               if(var1.field_2958 <= 0) {
                  break;
               }

               var1 = method_3137(var0, var1, var8, var2);
               ++var8;
               if(var3 == null) {
                  break;
               }
            }
         }

         var9 = var1;
      }

      if(var3 != null) {
         if(var9 != null) {
            var9 = var1;
            if(var3 == null) {
               return var9;
            }

            if(var1.field_2958 == 0) {
               var1 = null;
            }
         }

         var9 = var1;
      }

      return var9;
   }

   // $FF: renamed from: b (vI, add, int, int) boolean
   private static boolean method_3135(class_22 var0, add var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      boolean var10000 = var0.method_95(var2, var1);
      if(var4 != null) {
         if(!var10000) {
            var10000 = false;
            return var10000;
         }

         var10000 = var0 instanceof class_23;
      }

      if(var4 != null) {
         if(var10000) {
            var10000 = ((class_23)var0).method_97(var2, var1, var3);
            if(var4 == null) {
               return var10000;
            }

            if(!var10000) {
               var10000 = false;
               return var10000;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: c (vI, add, int, int) boolean
   private static boolean method_3136(class_22 var0, add var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      boolean var10000 = var0 instanceof class_23;
      if(var4 != null) {
         if(var10000) {
            var10000 = ((class_23)var0).method_98(var2, var1, var3);
            if(var4 == null) {
               return var10000;
            }

            if(!var10000) {
               var10000 = false;
               return var10000;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: d (vI, add, int, int) add
   private static add method_3137(class_22 var0, add var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      add var5 = var0.method_84(var2);
      String[] var4 = var10000;
      byte var9 = method_3135(var0, var1, var2, var3);
      if(var4 != null) {
         if(var9 == 0) {
            return var1;
         }

         var9 = 0;
      }

      int var11;
      label52: {
         int var6;
         label61: {
            var6 = var9;
            add var10 = var5;
            if(var4 != null) {
               if(var5 == null) {
                  var0.method_87(var2, var1);
                  var1 = null;
                  var6 = 1;
                  break label61;
               }

               var10 = var5;
            }

            var11 = method_3142(var10, var1);
            if(var4 == null) {
               break label52;
            }

            if(var11 != 0) {
               int var7 = var1.method_3739() - var5.field_2958;
               int var8 = Math.min(var1.field_2958, var7);
               var1.field_2958 -= var8;
               var5.field_2958 += var8;
               var11 = var8;
               if(var4 != null) {
                  var11 = var8 > 0?1:0;
               }

               var6 = var11;
            }
         }

         var11 = var6;
      }

      class_22 var12;
      label62: {
         if(var4 != null) {
            if(var11 == 0) {
               return var1;
            }

            var12 = var0;
            if(var4 == null) {
               break label62;
            }

            var11 = var0 instanceof class_585;
         }

         if(var11 != 0) {
            ((class_585)var0).method_3143(8);
            var0.method_91();
         }

         var12 = var0;
      }

      var12.method_91();
      return var1;
   }

   // $FF: renamed from: A () vI
   private class_22 method_3138() {
      int var1 = class_480.method_2838(this.getBlock96());
      return method_3141(this.method_99(), (double)(this.field_2465 + class_1707.field_8947[var1]), (double)(this.field_2466 + class_1707.field_8948[var1]), (double)(this.field_2467 + class_1707.field_8949[var1]));
   }

   // $FF: renamed from: c (gF) vI
   public static class_22 method_3139(class_24 var0) {
      return method_3141(var0.method_99(), var0.method_100(), var0.method_101() + 1.0D, var0.method_102());
   }

   // $FF: renamed from: b (ahb, double, double, double) xq
   public static class_699 method_3140(ahb var0, double var1, double var3, double var5) {
      String[] var10000 = class_752.method_4253();
      List var8 = var0.method_2158(class_699.class, class_1343.method_7093(var1, var3, var5, var1 + 1.0D, var3 + 1.0D, var5 + 1.0D), class_82.field_9);
      String[] var7 = var10000;
      Object var9 = var8;
      class_699 var10;
      if(var7 != null) {
         if(var8.size() <= 0) {
            var10 = null;
            return var10;
         }

         var9 = var8.get(0);
      }

      var10 = (class_699)var9;
      return var10;
   }

   // $FF: renamed from: c (ahb, double, double, double) vI
   public static class_22 method_3141(ahb var0, double var1, double var3, double var5) {
      String[] var7;
      class_22 var8;
      class_22 var16;
      label61: {
         label64: {
            var8 = null;
            String[] var10000 = class_752.method_4253();
            int var9 = class_1715.method_9561(var1);
            int var10 = class_1715.method_9561(var3);
            int var11 = class_1715.method_9561(var5);
            var7 = var10000;
            class_580 var12 = var0.method_31(var9, var10, var11);
            class_580 var15 = var12;
            if(var7 != null) {
               if(var12 == null) {
                  break label64;
               }

               var15 = var12;
            }

            if(var7 != null) {
               if(!(var15 instanceof class_22)) {
                  break label64;
               }

               var15 = var12;
            }

            var8 = (class_22)var15;
            var16 = var8;
            if(var7 == null) {
               break label61;
            }

            if(var8 instanceof class_594) {
               label46: {
                  aji var13 = var0.getBlock(var9, var10, var11);
                  aji var17 = var13;
                  if(var7 != null) {
                     if(!(var13 instanceof class_488)) {
                        break label46;
                     }

                     var17 = var13;
                  }

                  var8 = ((class_488)var17).method_2856(var0, var9, var10, var11);
               }
            }
         }

         var16 = var8;
      }

      if(var7 != null) {
         if(var16 == null) {
            label65: {
               List var14 = var0.method_2156((class_689)null, class_1343.method_7093(var1, var3, var5, var1 + 1.0D, var3 + 1.0D, var5 + 1.0D), class_82.field_11);
               Object var18 = var14;
               if(var7 != null) {
                  if(var14 == null) {
                     break label65;
                  }

                  var18 = var14;
               }

               if(var7 != null) {
                  if(((List)var18).size() <= 0) {
                     break label65;
                  }

                  var18 = var14.get(var0.field_1819.nextInt(var14.size()));
               }

               var8 = (class_22)var18;
            }
         }

         var16 = var8;
      }

      return var16;
   }

   // $FF: renamed from: b (add, add) boolean
   private static boolean method_3142(add var0, add var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = var0;
      boolean var4;
      if(var2 != null) {
         if(var0.method_3730() != var1.method_3730()) {
            var4 = false;
            return var4;
         }

         var10000 = var0;
      }

      label36: {
         int var3 = var10000.method_3745();
         int var10001 = var1.method_3745();
         if(var2 != null) {
            if(var3 != var10001) {
               var4 = false;
               return var4;
            }

            var10000 = var0;
            if(var2 == null) {
               break label36;
            }

            var3 = var0.field_2958;
            var10001 = var0.method_3739();
         }

         if(var3 > var10001) {
            var4 = false;
            return var4;
         }

         var10000 = var0;
      }

      var4 = add.method_3755(var10000, var1);
      return var4;
   }

   // $FF: renamed from: b () double
   public double method_100() {
      return (double)this.field_2465;
   }

   // $FF: renamed from: d () double
   public double method_101() {
      return (double)this.field_2466;
   }

   // $FF: renamed from: e () double
   public double method_102() {
      return (double)this.field_2467;
   }

   // $FF: renamed from: a (int) void
   public void method_3143(int var1) {
      this.field_2491 = var1;
   }

   // $FF: renamed from: B () boolean
   public boolean method_3144() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_2491;
      if(var1 != null) {
         var10000 = this.field_2491 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3108() {
      // $FF: Couldn't be decompiled
   }
}
