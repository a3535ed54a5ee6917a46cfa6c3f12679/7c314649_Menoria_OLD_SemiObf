
// $FF: renamed from: Ay
public class class_673 extends class_671 {

   // $FF: renamed from: i gl
   private class_595 field_2884;
   // $FF: renamed from: l aR
   private final class_492 field_2885;
   // $FF: renamed from: m int
   private int field_2886;
   // $FF: renamed from: n java.lang.String
   private static final String field_2887 = "CL_00001737";


   // $FF: renamed from: <init> (Af, gl) void
   public void method_3684(class_666 var1, class_595 var2) {
      String[] var10000 = class_752.method_4253();
      super.method_3645();
      String[] var3 = var10000;
      this.field_2884 = var2;
      class_499 var10001 = new class_499;
      var10001.method_2896(var1.field_2848, var2, 0, 56, 46);
      this.method_3646(var10001);
      var10001 = new class_499;
      var10001.method_2896(var1.field_2848, var2, 1, 79, 53);
      this.method_3646(var10001);
      var10001 = new class_499;
      var10001.method_2896(var1.field_2848, var2, 2, 102, 46);
      this.method_3646(var10001);
      class_500 var10002 = new class_500;
      var10002.method_2899(this, var2, 3, 79, 17);
      this.field_2885 = this.method_3646(var10002);
      int var4 = 0;

      byte var6;
      class_492 var7;
      while(true) {
         if(var4 < 3) {
            var6 = 0;
            if(var3 == null) {
               break;
            }

            int var5 = 0;

            while(true) {
               if(var5 < 9) {
                  var7 = new class_492;
                  var7.method_2869(var1, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18);
                  this.method_3646(var7);
                  ++var5;
                  if(var3 == null) {
                     break;
                  }

                  if(var3 != null) {
                     continue;
                  }
               }

               ++var4;
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         var6 = 0;
         break;
      }

      var4 = var6;

      while(var4 < 9) {
         var7 = new class_492;
         var7.method_2869(var1, var4, 8 + var4 * 18, 142);
         this.method_3646(var7);
         ++var4;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (aN) void
   public void method_3647(class_16 var1) {
      super.method_3647(var1);
      var1.method_52(this, 0, this.field_2884.method_3168());
   }

   // $FF: renamed from: c () void
   public void method_3650() {
      String[] var10000 = class_752.method_4253();
      super.method_3650();
      String[] var1 = var10000;
      int var2 = 0;

      class_673 var4;
      while(true) {
         if(var2 < this.field_2875.size()) {
            class_16 var3 = (class_16)this.field_2875.get(var2);
            if(var1 != null) {
               var4 = this;
               if(var1 == null) {
                  break;
               }

               if(this.field_2886 != this.field_2884.method_3168()) {
                  var3.method_52(this, 0, this.field_2884.method_3168());
               }

               ++var2;
            }

            if(var1 != null) {
               continue;
            }
         }

         var4 = this;
         break;
      }

      var4.field_2886 = this.field_2884.method_3168();
   }

   // $FF: renamed from: a (int, int) void
   public void method_3662(int var1, int var2) {
      if(var1 == 0) {
         this.field_2884.method_3172(var2);
      }

   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3666(class_792 var1) {
      return this.field_2884.method_92(var1);
   }

   // $FF: renamed from: c (yz, int) add
   public add method_3654(class_792 var1, int var2) {
      String[] var10000 = class_752.method_4253();
      add var4 = null;
      String[] var3 = var10000;
      class_492 var5 = (class_492)this.field_2869.get(var2);
      class_492 var7 = var5;
      if(var3 != null) {
         if(var5 == null) {
            return var4;
         }

         var7 = var5;
      }

      if(var3 != null) {
         if(!var7.method_2876()) {
            return var4;
         }

         var7 = var5;
      }

      add var6;
      int var8;
      label135: {
         label149: {
            label133: {
               label150: {
                  var6 = var7.method_2875();
                  var4 = var6.method_3754();
                  var8 = var2;
                  if(var3 != null) {
                     if(var2 >= 0) {
                        var8 = var2;
                        if(var3 == null) {
                           break label133;
                        }

                        if(var2 <= 2) {
                           break label150;
                        }
                     }

                     var8 = var2;
                  }

                  if(var3 == null) {
                     break label133;
                  }

                  if(var8 != 3) {
                     var8 = this.field_2885.method_2876();
                     if(var3 != null) {
                        label117: {
                           if(var8 == 0) {
                              var8 = this.field_2885.method_2874(var6);
                              if(var3 == null) {
                                 break label117;
                              }

                              if(var8 != 0) {
                                 var8 = this.method_3667(var6, 3, 4, false);
                                 if(var3 == null) {
                                    break label135;
                                 }

                                 if(var8 == 0) {
                                    return null;
                                 }
                                 break label149;
                              }
                           }

                           var8 = class_499.method_2897(var4);
                        }
                     }

                     if(var3 != null) {
                        if(var8 != 0) {
                           var8 = this.method_3667(var6, 0, 3, false);
                           if(var3 == null) {
                              break label135;
                           }

                           if(var8 == 0) {
                              return null;
                           }
                           break label149;
                        }

                        var8 = var2;
                     }

                     label152: {
                        byte var10001 = 4;
                        if(var3 != null) {
                           label153: {
                              if(var8 >= 4) {
                                 var8 = var2;
                                 var10001 = 31;
                                 if(var3 == null) {
                                    break label153;
                                 }

                                 if(var2 < 31) {
                                    var8 = this.method_3667(var6, 31, 40, false);
                                    if(var3 == null) {
                                       break label135;
                                    }

                                    if(var8 == 0) {
                                       return null;
                                    }
                                    break label149;
                                 }
                              }

                              var8 = var2;
                              if(var3 == null) {
                                 break label152;
                              }

                              var10001 = 31;
                           }
                        }

                        if(var8 >= var10001) {
                           var8 = var2;
                           if(var3 == null) {
                              break label152;
                           }

                           if(var2 < 40) {
                              var8 = this.method_3667(var6, 4, 31, false);
                              if(var3 == null) {
                                 break label135;
                              }

                              if(var8 == 0) {
                                 return null;
                              }
                              break label149;
                           }
                        }

                        var8 = this.method_3667(var6, 4, 40, false);
                     }

                     if(var3 == null) {
                        break label135;
                     }

                     if(var8 == 0) {
                        return null;
                     }
                     break label149;
                  }
               }

               var8 = this.method_3667(var6, 4, 40, true);
            }

            if(var8 == 0) {
               return null;
            }

            var5.method_2870(var6, var4);
         }

         var8 = var6.field_2958;
      }

      label74: {
         if(var8 == 0) {
            var5.method_2877((add)null);
            if(var3 != null) {
               break label74;
            }
         }

         var5.method_2878();
      }

      if(var6.field_2958 == var4.field_2958) {
         return null;
      } else {
         var5.method_2873(var1, var6);
         return var4;
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_3678() {
      boolean var10000 = true;
      char[] var10003 = "Ú5URG:¨N9".toCharArray();
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
            field_2887 = (new String((char[])var4)).intern();
            String var2 = field_2887;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 25;
            break;
         case 1:
            var10009 = 249;
            break;
         case 2:
            var10009 = 138;
            break;
         case 3:
            var10009 = 167;
            break;
         case 4:
            var10009 = 226;
            break;
         case 5:
            var10009 = 247;
            break;
         default:
            var10009 = 138;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
