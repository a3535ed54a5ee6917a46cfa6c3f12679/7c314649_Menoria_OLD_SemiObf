import java.util.Random;

// $FF: renamed from: hv
public class class_1156 extends class_1151 {

   // $FF: renamed from: <init> () void
   public void method_6349() {
      super.method_6349();
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();

      int var10000;
      while(true) {
         if(var1.method_34(var3, var4, var5)) {
            var10000 = var4;
            if(var6 == null) {
               break;
            }

            if(var4 > 2) {
               --var4;
               if(var6 != null) {
                  continue;
               }
            }
         }

         if(var1.getBlock(var3, var4, var5) != class_1192.field_6037) {
            return false;
         }

         var10000 = -2;
         break;
      }

      int var7 = var10000;

      label232:
      while(true) {
         var10000 = var7;

         int var8;
         byte var10;
         label229:
         while(true) {
            if(var10000 <= 2) {
               var10 = -2;
               if(var6 == null) {
                  break;
               }

               var8 = -2;

               while(var8 <= 2) {
                  var10000 = var1.method_34(var3 + var7, var4 - 1, var5 + var8);
                  if(var6 == null) {
                     continue label229;
                  }

                  label249: {
                     if(var6 != null) {
                        if(var10000 == 0) {
                           break label249;
                        }

                        var10000 = var1.method_34(var3 + var7, var4 - 2, var5 + var8);
                     }

                     if(var6 != null) {
                        if(var10000 == 0) {
                           break label249;
                        }

                        var10000 = 0;
                     }

                     return (boolean)var10000;
                  }

                  ++var8;
                  if(var6 == null) {
                     break;
                  }
               }

               ++var7;
               if(var6 != null) {
                  continue label232;
               }
            }

            var10 = -1;
            break;
         }

         var7 = var10;

         label197:
         while(true) {
            var10000 = var7;

            label194:
            while(var10000 <= 0) {
               var10 = -2;
               if(var6 == null) {
                  break label197;
               }

               var8 = -2;

               while(var8 <= 2) {
                  var10000 = -2;
                  if(var6 == null) {
                     continue label194;
                  }

                  int var9 = -2;

                  while(true) {
                     if(var9 <= 2) {
                        var1.method_2054(var3 + var8, var4 + var7, var5 + var9, class_1192.field_6051, 0, 2);
                        ++var9;
                        if(var6 == null) {
                           break;
                        }

                        if(var6 != null) {
                           continue;
                        }
                     }

                     ++var8;
                     break;
                  }

                  if(var6 == null) {
                     break;
                  }
               }

               ++var7;
               if(var6 != null) {
                  continue label197;
               }
               break;
            }

            var1.method_2054(var3, var4, var5, class_1192.field_6033, 0, 2);
            var1.method_2054(var3 - 1, var4, var5, class_1192.field_6033, 0, 2);
            var1.method_2054(var3 + 1, var4, var5, class_1192.field_6033, 0, 2);
            var1.method_2054(var3, var4, var5 - 1, class_1192.field_6033, 0, 2);
            var1.method_2054(var3, var4, var5 + 1, class_1192.field_6033, 0, 2);
            var10 = -2;
            break;
         }

         var7 = var10;

         label166:
         while(true) {
            var10000 = var7;
            byte var10001 = 2;

            label163:
            while(var10000 <= var10001) {
               var10 = -2;
               if(var6 == null) {
                  break label166;
               }

               var8 = -2;

               while(var8 <= 2) {
                  var10000 = var7;
                  if(var6 != null) {
                     var10001 = -2;
                     if(var6 == null) {
                        continue label163;
                     }

                     if(var7 == -2 || var6 != null && (var7 == 2 || var6 != null && (var8 == -2 || var6 != null && var8 == 2))) {
                        var1.method_2054(var3 + var7, var4 + 1, var5 + var8, class_1192.field_6051, 0, 2);
                     }
                  }

                  ++var8;
                  if(var6 == null) {
                     break;
                  }
               }

               ++var7;
               if(var6 != null) {
                  continue label166;
               }
               break;
            }

            var1.method_2054(var3 + 2, var4 + 1, var5, class_1192.field_6071, 1, 2);
            var1.method_2054(var3 - 2, var4 + 1, var5, class_1192.field_6071, 1, 2);
            var1.method_2054(var3, var4 + 1, var5 + 2, class_1192.field_6071, 1, 2);
            var1.method_2054(var3, var4 + 1, var5 - 2, class_1192.field_6071, 1, 2);
            var10 = -1;
            break;
         }

         var7 = var10;

         label128:
         while(true) {
            var10000 = var7;

            label125:
            while(var10000 <= 1) {
               var10 = -1;
               if(var6 == null) {
                  break label128;
               }

               var8 = -1;

               while(var8 <= 1) {
                  var10000 = var7;
                  if(var6 == null) {
                     continue label125;
                  }

                  if(var6 != null) {
                     label117: {
                        if(var7 == 0) {
                           if(var6 == null) {
                              break label117;
                           }

                           if(var8 == 0) {
                              var1.method_2054(var3 + var7, var4 + 4, var5 + var8, class_1192.field_6051, 0, 2);
                              if(var6 != null) {
                                 break label117;
                              }
                           }
                        }

                        var1.method_2054(var3 + var7, var4 + 4, var5 + var8, class_1192.field_6071, 1, 2);
                     }
                  }

                  ++var8;
                  if(var6 == null) {
                     break;
                  }
               }

               ++var7;
               if(var6 != null) {
                  continue label128;
               }
               break;
            }

            var10 = 1;
            break;
         }

         var7 = var10;

         boolean var11;
         while(true) {
            if(var7 <= 3) {
               var1.method_2054(var3 - 1, var4 + var7, var5 - 1, class_1192.field_6051, 0, 2);
               var1.method_2054(var3 - 1, var4 + var7, var5 + 1, class_1192.field_6051, 0, 2);
               var1.method_2054(var3 + 1, var4 + var7, var5 - 1, class_1192.field_6051, 0, 2);
               var11 = var1.method_2054(var3 + 1, var4 + var7, var5 + 1, class_1192.field_6051, 0, 2);
               if(var6 == null) {
                  break;
               }

               ++var7;
               if(var6 != null) {
                  continue;
               }
            }

            var11 = true;
            break;
         }

         return var11;
      }
   }
}
