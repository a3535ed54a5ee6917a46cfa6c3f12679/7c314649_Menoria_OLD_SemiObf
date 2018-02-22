
// $FF: renamed from: a2
class class_502 extends class_492 {

   // $FF: renamed from: a java.lang.String
   private static final String field_2312 = "CL_00001734";
   // $FF: renamed from: g ahb
   final ahb field_2313;
   // $FF: renamed from: h int
   final int field_2314;
   // $FF: renamed from: i int
   final int field_2315;
   // $FF: renamed from: j int
   final int field_2316;
   // $FF: renamed from: k Aw
   final class_675 field_2317;


   // $FF: renamed from: <init> (Aw, vI, int, int, int, ahb, int, int, int) void
   void method_2903(class_675 var1, class_22 var2, int var3, int var4, int var5, ahb var6, int var7, int var8, int var9) {
      this.field_2317 = var1;
      this.field_2313 = var6;
      this.field_2314 = var7;
      this.field_2315 = var8;
      this.field_2316 = var9;
      super.method_2869(var2, var3, var4, var5);
   }

   // $FF: renamed from: b (add) boolean
   public boolean method_2874(add var1) {
      return false;
   }

   // $FF: renamed from: b (yz) boolean
   public boolean method_2883(class_792 var1) {
      int var10000;
      label38: {
         String[] var2 = class_752.method_4253();
         var10000 = var1.field_3640.field_2839;
         if(var2 != null) {
            label33: {
               if(!var1.field_3640.field_2839) {
                  var10000 = var1.field_3641;
                  if(var2 == null) {
                     break label33;
                  }

                  if(var1.field_3641 < this.field_2317.field_2901) {
                     break label38;
                  }
               }

               var10000 = this.field_2317.field_2901;
            }
         }

         if(var2 != null) {
            if(var10000 <= 0) {
               break label38;
            }

            var10000 = this.method_2876();
         }

         if(var2 == null) {
            return (boolean)var10000;
         }

         if(var10000 != 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: b (yz, add) void
   public void method_2873(class_792 var1, add var2) {
      int var10000;
      String[] var3;
      label99: {
         class_675 var8;
         label102: {
            var3 = class_752.method_4253();
            var10000 = var1.field_3640.field_2839;
            if(var3 != null) {
               if(!var1.field_3640.field_2839) {
                  var1.method_4620(-this.field_2317.field_2901);
               }

               class_675.method_3690(this.field_2317).method_87(0, (add)null);
               var8 = this.field_2317;
               if(var3 == null) {
                  break label102;
               }

               var10000 = class_675.method_3691(this.field_2317);
            }

            if(var10000 > 0) {
               label87: {
                  label104: {
                     add var4 = class_675.method_3690(this.field_2317).method_84(1);
                     add var9 = var4;
                     if(var3 != null) {
                        if(var4 == null) {
                           break label104;
                        }

                        var9 = var4;
                     }

                     if(var3 != null) {
                        if(var9.field_2958 <= class_675.method_3691(this.field_2317)) {
                           break label104;
                        }

                        var9 = var4;
                     }

                     var9.field_2958 -= class_675.method_3691(this.field_2317);
                     class_675.method_3690(this.field_2317).method_87(1, var4);
                     if(var3 != null) {
                        break label87;
                     }
                  }

                  class_675.method_3690(this.field_2317).method_87(1, (add)null);
               }

               if(var3 != null) {
                  break label99;
               }
            }

            var8 = this.field_2317;
         }

         class_675.method_3690(var8).method_87(1, (add)null);
      }

      ahb var10;
      label105: {
         this.field_2317.field_2901 = 0;
         var10000 = var1.field_3640.field_2839;
         if(var3 != null) {
            label106: {
               label69: {
                  if(!var1.field_3640.field_2839) {
                     var10000 = this.field_2313.field_1832;
                     if(var3 == null) {
                        break label106;
                     }

                     if(!this.field_2313.field_1832) {
                        var10 = this.field_2313;
                        if(var3 == null) {
                           break label69;
                        }

                        if(this.field_2313.getBlock(this.field_2314, this.field_2315, this.field_2316) == class_1192.field_6169) {
                           float var11;
                           var10000 = (var11 = var1.method_4165().nextFloat() - 0.12F) == 0.0F?0:(var11 < 0.0F?-1:1);
                           if(var3 == null) {
                              break label106;
                           }

                           if(var10000 < 0) {
                              label48: {
                                 int var7 = this.field_2313.method_33(this.field_2314, this.field_2315, this.field_2316);
                                 int var5 = var7 & 3;
                                 int var6 = var7 >> 2;
                                 ++var6;
                                 if(var3 != null) {
                                    if(var6 > 2) {
                                       this.field_2313.method_2056(this.field_2314, this.field_2315, this.field_2316);
                                       this.field_2313.method_2210(1020, this.field_2314, this.field_2315, this.field_2316, 0);
                                       if(var3 != null) {
                                          break label48;
                                       }
                                    }

                                    this.field_2313.method_2055(this.field_2314, this.field_2315, this.field_2316, var5 | var6 << 2, 2);
                                 }

                                 this.field_2313.method_2210(1021, this.field_2314, this.field_2315, this.field_2316, 0);
                              }

                              if(var3 != null) {
                                 return;
                              }
                           }
                        }
                     }
                  }

                  var10 = this.field_2313;
               }

               if(var3 == null) {
                  break label105;
               }

               var10000 = var10.field_1832;
            }
         }

         if(var10000 != 0) {
            return;
         }

         var10 = this.field_2313;
      }

      var10.method_2210(1021, this.field_2314, this.field_2315, this.field_2316, 0);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2904() {
      boolean var10000 = true;
      char[] var10003 = "ã7¼)LÐ".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_2312 = (new String((char[])var4)).intern();
            String var2 = field_2312;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 96;
            break;
         case 1:
            var10009 = 187;
            break;
         case 2:
            var10009 = 35;
            break;
         case 3:
            var10009 = 99;
            break;
         case 4:
            var10009 = 254;
            break;
         case 5:
            var10009 = 104;
            break;
         default:
            var10009 = 217;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
