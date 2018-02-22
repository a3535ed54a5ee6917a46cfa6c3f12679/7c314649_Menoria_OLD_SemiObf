import com.google.common.collect.Sets;
import java.util.Set;

// $FF: renamed from: bJ
public class class_541 extends class_539 {

   // $FF: renamed from: r java.util.Set
   private static final Set field_2397;


   // $FF: renamed from: <init> (y) void
   protected void getBlock16(class_133 var1) {
      super.getBlock12(2.0F, var1, field_2397);
   }

   // $FF: renamed from: b (aji) boolean
   public boolean method_2939(aji var1) {
      String[] var2 = class_752.method_4253();
      aji var10000 = var1;
      aji var10001 = class_1192.field_6076;
      int var5;
      if(var2 != null) {
         if(var1 == class_1192.field_6076) {
            var5 = this.field_2394.method_631();
            if(var2 != null) {
               var5 = var5 == 3?1:0;
            }

            return (boolean)var5;
         }

         var10000 = var1;
         var10001 = class_1192.field_6084;
      }

      label205: {
         if(var2 != null) {
            if(var10000 == var10001) {
               break label205;
            }

            var10000 = var1;
            var10001 = class_1192.field_6083;
         }

         if(var2 != null) {
            if(var10000 == var10001) {
               break label205;
            }

            var10000 = var1;
            var10001 = class_1192.field_6153;
         }

         label206: {
            if(var2 != null) {
               if(var10000 == var10001) {
                  break label206;
               }

               var10000 = var1;
               var10001 = class_1192.field_6157;
            }

            if(var2 != null) {
               if(var10000 == var10001) {
                  break label206;
               }

               var10000 = var1;
               var10001 = class_1192.field_6068;
            }

            label207: {
               if(var2 != null) {
                  if(var10000 == var10001) {
                     break label207;
                  }

                  var10000 = var1;
                  var10001 = class_1192.field_6039;
               }

               if(var2 != null) {
                  if(var10000 == var10001) {
                     break label207;
                  }

                  var10000 = var1;
                  var10001 = class_1192.field_6069;
               }

               label208: {
                  if(var2 != null) {
                     if(var10000 == var10001) {
                        break label208;
                     }

                     var10000 = var1;
                     var10001 = class_1192.field_6040;
                  }

                  if(var2 != null) {
                     if(var10000 == var10001) {
                        break label208;
                     }

                     var10000 = var1;
                     var10001 = class_1192.field_6049;
                  }

                  label209: {
                     if(var2 != null) {
                        if(var10000 == var10001) {
                           break label209;
                        }

                        var10000 = var1;
                        var10001 = class_1192.field_6048;
                     }

                     if(var2 != null) {
                        if(var10000 == var10001) {
                           break label209;
                        }

                        var10000 = var1;
                        var10001 = class_1192.field_6099;
                     }

                     label210: {
                        label211: {
                           if(var2 != null) {
                              if(var10000 == var10001) {
                                 break label210;
                              }

                              var10000 = var1;
                              if(var2 == null) {
                                 break label211;
                              }

                              var10001 = class_1192.field_6100;
                           }

                           if(var10000 == var10001) {
                              break label210;
                           }

                           var10000 = var1;
                        }

                        awt var3 = var10000.method_2424();
                        awt var4 = awt.field_4174;
                        if(var2 != null) {
                           if(var3 == awt.field_4174) {
                              return true;
                           }

                           var3 = var1.method_2424();
                           var4 = awt.field_4175;
                        }

                        if(var2 != null) {
                           if(var3 == var4) {
                              return true;
                           }

                           var3 = var1.method_2424();
                           var4 = awt.field_4176;
                        }

                        if(var3 == var4) {
                           return true;
                        }

                        return false;
                     }

                     var5 = this.field_2394.method_631();
                     if(var2 != null) {
                        var5 = var5 >= 2?1:0;
                     }

                     return (boolean)var5;
                  }

                  var5 = this.field_2394.method_631();
                  if(var2 != null) {
                     var5 = var5 >= 1?1:0;
                  }

                  return (boolean)var5;
               }

               var5 = this.field_2394.method_631();
               if(var2 != null) {
                  var5 = var5 >= 1?1:0;
               }

               return (boolean)var5;
            }

            var5 = this.field_2394.method_631();
            if(var2 != null) {
               var5 = var5 >= 2?1:0;
            }

            return (boolean)var5;
         }

         var5 = this.field_2394.method_631();
         if(var2 != null) {
            var5 = var5 >= 2?1:0;
         }

         return (boolean)var5;
      }

      var5 = this.field_2394.method_631();
      if(var2 != null) {
         var5 = var5 >= 2?1:0;
      }

      return (boolean)var5;
   }

   // $FF: renamed from: a (add, aji) float
   public float method_2927(add var1, aji var2) {
      String[] var3 = class_752.method_4253();
      awt var10000 = var2.method_2424();
      awt var10001 = awt.field_4175;
      if(var3 != null) {
         if(var10000 == awt.field_4175) {
            return this.field_2392;
         }

         var10000 = var2.method_2424();
         var10001 = awt.field_4176;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            return this.field_2392;
         }

         var10000 = var2.method_2424();
         var10001 = awt.field_4174;
      }

      if(var10000 != var10001) {
         return super.method_2927(var1, var2);
      } else {
         return this.field_2392;
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      field_2397 = Sets.newHashSet(new aji[]{class_1192.field_6029, class_1192.field_6070, class_1192.field_6071, class_1192.field_6026, class_1192.field_6051, class_1192.field_6075, class_1192.field_6040, class_1192.field_6069, class_1192.field_6041, class_1192.field_6068, class_1192.field_6039, class_1192.field_6083, class_1192.field_6084, class_1192.field_6105, class_1192.field_6113, class_1192.field_6048, class_1192.field_6049, class_1192.field_6099, class_1192.field_6100, class_1192.field_6092, class_1192.field_6055, class_1192.field_6054, class_1192.field_6181});
   }
}
