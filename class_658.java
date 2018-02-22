import java.util.ArrayList;

// $FF: renamed from: AV
public class class_658 extends ArrayList {

   // $FF: renamed from: h java.lang.String
   private static final String field_2822 = "Recipes";


   // $FF: renamed from: <init> () void
   public void method_3563() {
      super();
   }

   // $FF: renamed from: <init> (ro) void
   public void method_3564(class_1583 var1) {
      super();
      this.method_3569(var1);
   }

   // $FF: renamed from: b (add, add, int) c6
   public class_924 method_3565(add var1, add var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var3;
      add var8;
      if(var4 != null) {
         label134: {
            if(var3 > 0) {
               var10000 = var3;
               if(var4 == null) {
                  break label134;
               }

               if(var3 < this.size()) {
                  class_924 var5 = (class_924)this.get(var3);
                  var8 = var1;
                  if(var4 != null) {
                     if(var1.method_3730() != var5.method_5418().method_3730()) {
                        return null;
                     }

                     var8 = var2;
                  }

                  label87: {
                     label86: {
                        label139: {
                           if(var8 == null) {
                              var10000 = var5.method_5420();
                              if(var4 == null) {
                                 break label87;
                              }

                              if(var10000 == 0) {
                                 break label139;
                              }
                           }

                           if(!var5.method_5420()) {
                              return null;
                           }

                           var8 = var2;
                           if(var4 != null) {
                              if(var2 == null) {
                                 return null;
                              }

                              var8 = var5.method_5419();
                           }

                           if(var4 == null) {
                              break label86;
                           }

                           if(var8.method_3730() != var2.method_3730()) {
                              return null;
                           }
                        }

                        var8 = var1;
                     }

                     var10000 = var8.field_2958;
                  }

                  class_924 var9;
                  if(var4 != null) {
                     if(var10000 < var5.method_5418().field_2958) {
                        return null;
                     }

                     var9 = var5;
                     if(var4 == null) {
                        return var9;
                     }

                     var10000 = var5.method_5420();
                  }

                  if(var10000 != 0 && var2.field_2958 < var5.method_5419().field_2958) {
                     return null;
                  }

                  var9 = var5;
                  return var9;
               }
            }

            var10000 = 0;
         }
      }

      int var7 = var10000;

      while(true) {
         if(var7 < this.size()) {
            class_924 var6 = (class_924)this.get(var7);
            if(var4 != null) {
               if(var1.method_3730() == var6.method_5418().method_3730()) {
                  label160: {
                     var10000 = var1.field_2958;
                     if(var4 != null) {
                        if(var1.field_2958 < var6.method_5418().field_2958) {
                           break label160;
                        }

                        var10000 = var6.method_5420();
                     }

                     if(var4 != null) {
                        if(var10000 == 0 && var2 == null) {
                           return var6;
                        }

                        var10000 = var6.method_5420();
                     }

                     if(var10000 != 0) {
                        var8 = var2;
                        if(var4 != null) {
                           if(var2 == null) {
                              break label160;
                           }

                           var8 = var6.method_5419();
                        }

                        if(var4 != null) {
                           if(var8.method_3730() != var2.method_3730()) {
                              break label160;
                           }

                           var8 = var2;
                        }

                        if(var8.field_2958 >= var6.method_5419().field_2958) {
                           return var6;
                        }
                     }
                  }
               }

               ++var7;
            }

            if(var4 != null) {
               continue;
            }
         }

         return null;
      }
   }

   // $FF: renamed from: b (c6) void
   public void method_3566(class_924 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(true) {
         if(var3 < this.size()) {
            class_924 var4 = (class_924)this.get(var3);
            if(var2 != null) {
               boolean var5 = var1.method_5422(var4);
               if(var2 == null) {
                  break;
               }

               if(var5) {
                  if(var2 != null && var1.method_5423(var4)) {
                     this.set(var3, var1);
                  }

                  return;
               }

               ++var3;
            }

            if(var2 != null) {
               continue;
            }
         }

         this.add(var1);
         break;
      }

   }

   // $FF: renamed from: b (d) void
   public void method_3567(class_112 var1) {
      var1.writeByte((byte)(this.size() & 255));
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < this.size()) {
         class_924 var4 = (class_924)this.get(var3);
         var1.method_522(var4.method_5418());
         var1.method_522(var4.method_5421());
         add var5 = var4.method_5419();
         var1.writeBoolean(var5 != null);
         if(var2 != null) {
            if(var5 != null) {
               var1.method_522(var5);
            }

            var1.writeBoolean(var4.method_5426());
            ++var3;
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (d) AV
   public static class_658 method_3568(class_112 var0) {
      class_658 var10000 = new class_658;
      var10000.method_3563();
      class_658 var2 = var10000;
      String[] var1 = class_752.method_4253();
      int var3 = var0.readByte() & 255;
      int var4 = 0;

      while(var4 < var3) {
         add var5;
         add var6;
         add var7;
         label27: {
            var5 = var0.method_523();
            var6 = var0.method_523();
            var7 = null;
            class_112 var10 = var0;
            if(var1 != null) {
               if(!var0.readBoolean()) {
                  break label27;
               }

               var10 = var0;
            }

            var7 = var10.method_523();
         }

         boolean var8 = var0.readBoolean();
         class_924 var11 = new class_924;
         var11.method_5415(var5, var7, var6);
         class_924 var9 = var11;
         if(var1 != null) {
            if(var8) {
               var9.method_5427();
            }

            var2.add(var9);
         }

         ++var4;
         if(var1 == null) {
            break;
         }
      }

      return var2;
   }

   // $FF: renamed from: b (ro) void
   public void method_3569(class_1583 var1) {
      class_1580 var3 = var1.method_8689("Recipes", 10);
      String[] var10000 = class_752.method_4253();
      int var4 = 0;
      String[] var2 = var10000;

      while(var4 < var3.method_8658()) {
         class_1583 var5 = var3.method_8653(var4);
         class_924 var10001 = new class_924;
         var10001.method_5414(var5);
         this.add(var10001);
         ++var4;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b () ro
   public class_1583 method_3570() {
      class_1583 var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var2 = var10000;
      String[] var6 = class_752.method_4253();
      class_1580 var10001 = new class_1580;
      var10001.method_8628();
      class_1580 var3 = var10001;
      String[] var1 = var6;
      int var4 = 0;

      while(true) {
         if(var4 < this.size()) {
            class_924 var5 = (class_924)this.get(var4);
            var3.method_8650(var5.method_5429());
            ++var4;
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         var2.method_8664("Recipes", var3);
         break;
      }

      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3571() {
      boolean var10000 = true;
      char[] var10003 = "´|n@Ä".toCharArray();
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
            field_2822 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 137;
            break;
         case 1:
            var10009 = 19;
            break;
         case 2:
            var10009 = 25;
            break;
         case 3:
            var10009 = 122;
            break;
         case 4:
            var10009 = 113;
            break;
         case 5:
            var10009 = 74;
            break;
         default:
            var10009 = 216;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
