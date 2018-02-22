
// $FF: renamed from: eq
public class class_394 extends class_392 {

   // $FF: renamed from: O vL
   protected IIcon field_2089;
   // $FF: renamed from: P java.lang.String
   private static final String field_2090 = "_powered";


   // $FF: renamed from: <init> () void
   protected void method_2619() {
      super.method_2614(true);
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      return (var2 & 8) == 0?this.field_2010:this.field_2089;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      super.method_2535(var1);
      this.field_2089 = var1.method_375(this.method_2533() + "_powered");
   }

   // $FF: renamed from: b (ahb, int, int, int, int, boolean, int) boolean
   protected boolean method_2620(ahb var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      String[] var8 = class_752.method_4253();
      int var10000 = var7;
      byte var10001 = 8;
      if(var8 != null) {
         if(var7 >= 8) {
            return false;
         }

         var10000 = var5;
         var10001 = 7;
      }

      int var9 = var10000 & var10001;
      byte var10 = 1;
      var10000 = var9;
      if(var8 != null) {
         byte var11;
         switch(var9) {
         case 0:
            if(var6 != 0) {
               ++var4;
               if(var8 != null) {
                  break;
               }
            }

            --var4;
            if(var8 != null) {
               break;
            }
         case 1:
            if(var6 != 0) {
               --var2;
               if(var8 != null) {
                  break;
               }
            }

            ++var2;
            if(var8 != null) {
               break;
            }
         case 2:
            label95: {
               var11 = var6;
               if(var8 != null) {
                  if(var6 != 0) {
                     --var2;
                     if(var8 != null) {
                        break label95;
                     }
                  }

                  ++var2;
                  ++var3;
                  var11 = 0;
               }

               var10 = var11;
            }

            var9 = 1;
            if(var8 != null) {
               break;
            }
         case 3:
            label89: {
               label88: {
                  var11 = var6;
                  if(var8 != null) {
                     if(var6 == 0) {
                        break label88;
                     }

                     --var2;
                     ++var3;
                     var11 = 0;
                  }

                  var10 = var11;
                  if(var8 != null) {
                     break label89;
                  }
               }

               ++var2;
            }

            var9 = 1;
            if(var8 != null) {
               break;
            }
         case 4:
            label81: {
               var11 = var6;
               if(var8 != null) {
                  if(var6 != 0) {
                     ++var4;
                     if(var8 != null) {
                        break label81;
                     }
                  }

                  --var4;
                  ++var3;
                  var11 = 0;
               }

               var10 = var11;
            }

            var9 = 0;
            if(var8 != null) {
               break;
            }
         case 5:
            label74: {
               label73: {
                  var11 = var6;
                  if(var8 != null) {
                     if(var6 == 0) {
                        break label73;
                     }

                     ++var4;
                     ++var3;
                     var11 = 0;
                  }

                  var10 = var11;
                  if(var8 != null) {
                     break label74;
                  }
               }

               --var4;
            }

            var9 = 0;
         }

         var10000 = this.method_2621(var1, var2, var3, var4, (boolean)var6, var7, var9);
      }

      if(var8 != null) {
         if(var10000 != 0) {
            return true;
         }

         var10000 = var10;
      }

      if(var8 != null) {
         if(var10000 != 0) {
            var10000 = this.method_2621(var1, var2, var3 - 1, var4, (boolean)var6, var7, var9);
            if(var8 == null) {
               return (boolean)var10000;
            }

            if(var10000 != 0) {
               return true;
            }
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (ahb, int, int, int, boolean, int, int) boolean
   protected boolean method_2621(ahb var1, int var2, int var3, int var4, boolean var5, int var6, int var7) {
      aji var9 = var1.getBlock(var2, var3, var4);
      String[] var8 = class_752.method_4253();
      int var10000;
      if(var9 == this) {
         int var10 = var1.method_33(var2, var3, var4);
         int var11 = var10 & 7;
         var10000 = var7;
         if(var8 != null) {
            label73: {
               if(var7 == 1) {
                  label71: {
                     var10000 = var11;
                     if(var8 != null) {
                        if(var11 != 0) {
                           var10000 = var11;
                           if(var8 == null) {
                              return (boolean)var10000;
                           }

                           if(var11 != 4) {
                              var10000 = var11;
                              if(var8 == null) {
                                 break label73;
                              }

                              if(var11 != 5) {
                                 break label71;
                              }
                           }
                        }

                        var10000 = 0;
                     }

                     return (boolean)var10000;
                  }
               }

               var10000 = var7;
            }
         }

         if(var8 != null) {
            byte var10001;
            label56: {
               if(var10000 == 0) {
                  label54: {
                     var10000 = var11;
                     if(var8 != null) {
                        if(var11 != 1) {
                           var10000 = var11;
                           if(var8 == null) {
                              return (boolean)var10000;
                           }

                           if(var11 != 2) {
                              var10000 = var11;
                              var10001 = 3;
                              if(var8 == null) {
                                 break label56;
                              }

                              if(var11 != 3) {
                                 break label54;
                              }
                           }
                        }

                        var10000 = 0;
                     }

                     return (boolean)var10000;
                  }
               }

               var10000 = var10;
               var10001 = 8;
            }

            var10000 &= var10001;
         }

         if(var8 == null) {
            return (boolean)var10000;
         }

         if(var10000 != 0) {
            boolean var12 = var1.method_2172(var2, var3, var4);
            if(var8 != null) {
               if(var12) {
                  return true;
               }

               var12 = this.method_2620(var1, var2, var3, var4, var10, var5, var6 + 1);
            }

            return var12;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: b (ahb, int, int, int, int, int, aji) void
   protected void method_2616(ahb var1, int var2, int var3, int var4, int var5, int var6, aji var7) {
      String[] var10000 = class_752.method_4253();
      byte var9 = var1.method_2172(var2, var3, var4);
      String[] var8 = var10000;
      byte var11 = var9;
      if(var8 != null) {
         label90: {
            if(var9 == 0) {
               var11 = this.method_2620(var1, var2, var3, var4, var5, true, 0);
               if(var8 == null) {
                  break label90;
               }

               if(var11 == 0) {
                  var11 = this.method_2620(var1, var2, var3, var4, var5, false, 0);
                  if(var8 == null) {
                     break label90;
                  }

                  if(var11 == 0) {
                     var11 = 0;
                     break label90;
                  }
               }
            }

            var11 = 1;
         }
      }

      int var13;
      label80: {
         byte var10;
         label94: {
            var9 = var11;
            var10 = 0;
            var13 = var9;
            if(var8 != null) {
               label77: {
                  if(var9 != 0) {
                     var13 = var5 & 8;
                     if(var8 == null) {
                        break label77;
                     }

                     if(var13 == 0) {
                        var1.method_2055(var2, var3, var4, var6 | 8, 3);
                        var10 = 1;
                        if(var8 != null) {
                           break label94;
                        }
                     }
                  }

                  var13 = var9;
               }
            }

            if(var8 == null) {
               break label80;
            }

            if(var13 == 0) {
               var13 = var5 & 8;
               if(var8 == null) {
                  break label80;
               }

               if(var13 != 0) {
                  var1.method_2055(var2, var3, var4, var6, 3);
                  var10 = 1;
               }
            }
         }

         var13 = var10;
      }

      ahb var14;
      int var10001;
      int var10002;
      int var10003;
      class_394 var10004;
      label95: {
         if(var8 != null) {
            if(var13 == 0) {
               return;
            }

            var14 = var1;
            var10001 = var2;
            var10002 = var3 - 1;
            var10003 = var4;
            var10004 = this;
            if(var8 == null) {
               break label95;
            }

            var1.method_2063(var2, var10002, var4, this);
            var13 = var6;
         }

         if(var13 != 2) {
            label97: {
               var13 = var6;
               byte var12 = 3;
               if(var8 != null) {
                  if(var6 == 3) {
                     break label97;
                  }

                  var13 = var6;
                  var12 = 4;
               }

               if(var8 != null) {
                  if(var13 == var12) {
                     break label97;
                  }

                  var13 = var6;
                  var12 = 5;
               }

               if(var13 != var12) {
                  return;
               }
            }
         }

         var14 = var1;
         var10001 = var2;
         var10002 = var3 + 1;
         var10003 = var4;
         var10004 = this;
      }

      var14.method_2063(var10001, var10002, var10003, var10004);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "<¿Ç¹".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_2090 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 188;
            break;
         case 1:
            var10009 = 16;
            break;
         case 2:
            var10009 = 178;
            break;
         case 3:
            var10009 = 61;
            break;
         case 4:
            var10009 = 56;
            break;
         case 5:
            var10009 = 106;
            break;
         default:
            var10009 = 3;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
