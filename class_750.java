import java.util.Iterator;
import java.util.List;

// $FF: renamed from: wE
public class class_750 extends class_748 {

   // $FF: renamed from: ay java.lang.String
   private static final String field_3302 = "CL_00001548";


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
   }

   // $FF: renamed from: <init> (ahb, int, int, int) void
   public void method_4148(ahb var1, int var2, int var3, int var4) {
      super.method_4139(var1, var2, var3, var4, 0);
      this.method_3854((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D);
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
   }

   // $FF: renamed from: j (int) void
   public void method_4140(int var1) {}

   // $FF: renamed from: f () int
   public int method_4143() {
      return 9;
   }

   // $FF: renamed from: i () int
   public int method_4144() {
      return 9;
   }

   // $FF: renamed from: a (double) boolean
   public boolean method_3901(double var1) {
      String[] var3 = class_752.method_4253();
      double var4;
      int var10000 = (var4 = var1 - 1024.0D) == 0.0D?0:(var4 < 0.0D?-1:1);
      if(var3 != null) {
         var10000 = var10000 < 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (sa) void
   public void method_4145(class_689 var1) {}

   // $FF: renamed from: d (ro) boolean
   public boolean method_3903(class_1583 var1) {
      return false;
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {}

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {}

   // $FF: renamed from: c (yz) boolean
   public boolean method_3919(class_792 var1) {
      String[] var2;
      boolean var4;
      double var5;
      List var7;
      Iterator var8;
      class_753 var9;
      boolean var11;
      Object var13;
      class_753 var14;
      label112: {
         ahb var12;
         label111: {
            label110: {
               add var3 = var1.method_4214();
               var2 = class_752.method_4253();
               var4 = false;
               add var10000 = var3;
               if(var2 != null) {
                  if(var3 == null) {
                     break label110;
                  }

                  var10000 = var3;
               }

               if(var10000.method_3730() == class_1010.field_5268) {
                  var11 = this.field_2990.field_1832;
                  if(var2 == null) {
                     break label112;
                  }

                  if(!this.field_2990.field_1832) {
                     var5 = 7.0D;
                     var12 = this.field_2990;
                     if(var2 == null) {
                        break label111;
                     }

                     var7 = this.field_2990.method_2157(class_753.class, class_1343.method_7093(this.field_2994 - var5, this.field_2995 - var5, this.field_2996 - var5, this.field_2994 + var5, this.field_2995 + var5, this.field_2996 + var5));
                     if(var7 != null) {
                        var8 = var7.iterator();

                        while(var8.hasNext()) {
                           label116: {
                              var9 = (class_753)var8.next();
                              var13 = var9;
                              if(var2 != null) {
                                 var11 = var9.method_4299();
                                 if(var2 == null) {
                                    break label112;
                                 }

                                 if(!var11) {
                                    continue;
                                 }

                                 var14 = var9;
                                 if(var2 == null) {
                                    break label116;
                                 }

                                 var13 = var9.method_4300();
                              }

                              if(var13 != var1) {
                                 continue;
                              }

                              var14 = var9;
                           }

                           var14.method_4301(this, true);
                           var4 = true;
                           if(var2 == null) {
                              break;
                           }
                        }
                     }
                  }
               }
            }

            var12 = this.field_2990;
         }

         var11 = var12.field_1832;
      }

      if(var2 != null) {
         if(!var11) {
            var11 = var4;
            if(var2 == null) {
               return var11;
            }

            if(!var4) {
               this.method_3851();
               var11 = var1.field_3640.field_2839;
               if(var2 == null) {
                  return var11;
               }

               if(var1.field_3640.field_2839) {
                  label118: {
                     var5 = 7.0D;
                     var7 = this.field_2990.method_2157(class_753.class, class_1343.method_7093(this.field_2994 - var5, this.field_2995 - var5, this.field_2996 - var5, this.field_2994 + var5, this.field_2995 + var5, this.field_2996 + var5));
                     List var10 = var7;
                     if(var2 != null) {
                        if(var7 == null) {
                           break label118;
                        }

                        var10 = var7;
                     }

                     var8 = var10.iterator();

                     while(var8.hasNext()) {
                        label120: {
                           var9 = (class_753)var8.next();
                           var13 = var9;
                           if(var2 != null) {
                              var11 = var9.method_4299();
                              if(var2 == null) {
                                 return var11;
                              }

                              if(!var11) {
                                 continue;
                              }

                              var14 = var9;
                              if(var2 == null) {
                                 break label120;
                              }

                              var13 = var9.method_4300();
                           }

                           if(var13 != this) {
                              continue;
                           }

                           var14 = var9;
                        }

                        var14.method_4297(true, false);
                        if(var2 == null) {
                           break;
                        }
                     }
                  }
               }
            }
         }

         var11 = true;
      }

      return var11;
   }

   // $FF: renamed from: a () boolean
   public boolean method_4142() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_2990.getBlock(this.field_3295, this.field_3296, this.field_3297).method_2436();
      if(var1 != null) {
         var10000 = var10000 == 11?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (ahb, int, int, int) wE
   public static class_750 method_4149(ahb var0, int var1, int var2, int var3) {
      class_750 var10000 = new class_750;
      var10000.method_4148(var0, var1, var2, var3);
      class_750 var4 = var10000;
      var4.field_2989 = true;
      var0.method_2089(var4);
      return var4;
   }

   // $FF: renamed from: c (ahb, int, int, int) wE
   public static class_750 method_4150(ahb var0, int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      List var5 = var0.method_2157(class_750.class, class_1343.method_7093((double)var1 - 1.0D, (double)var2 - 1.0D, (double)var3 - 1.0D, (double)var1 + 1.0D, (double)var2 + 1.0D, (double)var3 + 1.0D));
      String[] var4 = var10000;
      List var8 = var5;
      if(var4 != null) {
         if(var5 == null) {
            return null;
         }

         var8 = var5;
      }

      Iterator var6 = var8.iterator();

      while(var6.hasNext()) {
         label61: {
            class_750 var7 = (class_750)var6.next();
            int var9 = var7.field_3295;
            int var10001 = var1;
            if(var4 != null) {
               if(var7.field_3295 != var1) {
                  break label61;
               }

               var9 = var7.field_3296;
               var10001 = var2;
            }

            class_750 var10;
            if(var4 != null) {
               if(var9 != var10001) {
                  break label61;
               }

               var10 = var7;
               if(var4 == null) {
                  return var10;
               }

               var9 = var7.field_3297;
               var10001 = var3;
            }

            if(var9 == var10001) {
               var10 = var7;
               return var10;
            }
         }

         if(var4 == null) {
            break;
         }
      }

      return null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4146() {
      boolean var10000 = true;
      char[] var10003 = "/&Ø×Åx¬]_³ß".toCharArray();
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
            field_3302 = (new String((char[])var4)).intern();
            String var2 = field_3302;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 174;
            break;
         case 1:
            var10009 = 168;
            break;
         case 2:
            var10009 = 69;
            break;
         case 3:
            var10009 = 37;
            break;
         case 4:
            var10009 = 55;
            break;
         case 5:
            var10009 = 138;
            break;
         default:
            var10009 = 94;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
