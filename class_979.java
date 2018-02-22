import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: d2
public class class_979 {

   // $FF: renamed from: a ahb
   private ahb field_4938;
   // $FF: renamed from: b int
   private int field_4939;
   // $FF: renamed from: c int
   private int field_4940;
   // $FF: renamed from: d int
   private int field_4941;
   // $FF: renamed from: e boolean
   private final boolean field_4942;
   // $FF: renamed from: f java.util.List
   private List field_4943;
   // $FF: renamed from: g java.lang.String
   private static final String field_4944 = "CL_00000196";
   // $FF: renamed from: h eo
   final class_392 field_4945;


   // $FF: renamed from: <init> (eo, ahb, int, int, int) void
   public void method_5626(class_392 var1, ahb var2, int var3, int var4, int var5) {
      int var8;
      label17: {
         label16: {
            this.field_4945 = var1;
            super();
            this.field_4943 = new ArrayList();
            this.field_4938 = var2;
            this.field_4939 = var3;
            this.field_4940 = var4;
            this.field_4941 = var5;
            String[] var10000 = class_752.method_4253();
            aji var7 = var2.getBlock(var3, var4, var5);
            var8 = var2.method_33(var3, var4, var5);
            String[] var6 = var10000;
            int var9 = ((class_392)var7).field_2085;
            if(var6 != null) {
               if(!((class_392)var7).field_2085) {
                  break label16;
               }

               this.field_4942 = true;
               var9 = var8 & -9;
            }

            var8 = var9;
            if(var6 != null) {
               break label17;
            }
         }

         this.field_4942 = false;
      }

      this.method_5627(var8);
   }

   // $FF: renamed from: b (int) void
   private void method_5627(int var1) {
      String[] var10000 = class_752.method_4253();
      this.field_4943.clear();
      String[] var2 = var10000;
      int var3 = var1;
      class_1034 var10001;
      List var4;
      if(var2 != null) {
         if(var1 == 0) {
            var4 = this.field_4943;
            var10001 = new class_1034;
            var10001.method_5854(this.field_4939, this.field_4940, this.field_4941 - 1);
            var4.add(var10001);
            var4 = this.field_4943;
            var10001 = new class_1034;
            var10001.method_5854(this.field_4939, this.field_4940, this.field_4941 + 1);
            var4.add(var10001);
            if(var2 != null) {
               return;
            }
         }

         var3 = var1;
      }

      byte var5 = 1;
      if(var2 != null) {
         if(var3 == 1) {
            var4 = this.field_4943;
            var10001 = new class_1034;
            var10001.method_5854(this.field_4939 - 1, this.field_4940, this.field_4941);
            var4.add(var10001);
            var4 = this.field_4943;
            var10001 = new class_1034;
            var10001.method_5854(this.field_4939 + 1, this.field_4940, this.field_4941);
            var4.add(var10001);
            if(var2 != null) {
               return;
            }
         }

         var3 = var1;
         var5 = 2;
      }

      if(var2 != null) {
         if(var3 == var5) {
            var4 = this.field_4943;
            var10001 = new class_1034;
            var10001.method_5854(this.field_4939 - 1, this.field_4940, this.field_4941);
            var4.add(var10001);
            var4 = this.field_4943;
            var10001 = new class_1034;
            var10001.method_5854(this.field_4939 + 1, this.field_4940 + 1, this.field_4941);
            var4.add(var10001);
            if(var2 != null) {
               return;
            }
         }

         var3 = var1;
         var5 = 3;
      }

      if(var2 != null) {
         if(var3 == var5) {
            var4 = this.field_4943;
            var10001 = new class_1034;
            var10001.method_5854(this.field_4939 - 1, this.field_4940 + 1, this.field_4941);
            var4.add(var10001);
            var4 = this.field_4943;
            var10001 = new class_1034;
            var10001.method_5854(this.field_4939 + 1, this.field_4940, this.field_4941);
            var4.add(var10001);
            if(var2 != null) {
               return;
            }
         }

         var3 = var1;
         var5 = 4;
      }

      if(var2 != null) {
         if(var3 == var5) {
            var4 = this.field_4943;
            var10001 = new class_1034;
            var10001.method_5854(this.field_4939, this.field_4940 + 1, this.field_4941 - 1);
            var4.add(var10001);
            var4 = this.field_4943;
            var10001 = new class_1034;
            var10001.method_5854(this.field_4939, this.field_4940, this.field_4941 + 1);
            var4.add(var10001);
            if(var2 != null) {
               return;
            }
         }

         var3 = var1;
         var5 = 5;
      }

      if(var2 != null) {
         if(var3 == var5) {
            var4 = this.field_4943;
            var10001 = new class_1034;
            var10001.method_5854(this.field_4939, this.field_4940, this.field_4941 - 1);
            var4.add(var10001);
            var4 = this.field_4943;
            var10001 = new class_1034;
            var10001.method_5854(this.field_4939, this.field_4940 + 1, this.field_4941 + 1);
            var4.add(var10001);
            if(var2 != null) {
               return;
            }
         }

         var3 = var1;
         var5 = 6;
      }

      if(var2 != null) {
         if(var3 == var5) {
            var4 = this.field_4943;
            var10001 = new class_1034;
            var10001.method_5854(this.field_4939 + 1, this.field_4940, this.field_4941);
            var4.add(var10001);
            var4 = this.field_4943;
            var10001 = new class_1034;
            var10001.method_5854(this.field_4939, this.field_4940, this.field_4941 + 1);
            var4.add(var10001);
            if(var2 != null) {
               return;
            }
         }

         var3 = var1;
         var5 = 7;
      }

      if(var2 != null) {
         if(var3 == var5) {
            var4 = this.field_4943;
            var10001 = new class_1034;
            var10001.method_5854(this.field_4939 - 1, this.field_4940, this.field_4941);
            var4.add(var10001);
            var4 = this.field_4943;
            var10001 = new class_1034;
            var10001.method_5854(this.field_4939, this.field_4940, this.field_4941 + 1);
            var4.add(var10001);
            if(var2 != null) {
               return;
            }
         }

         var3 = var1;
         var5 = 8;
      }

      if(var2 != null) {
         if(var3 == var5) {
            var4 = this.field_4943;
            var10001 = new class_1034;
            var10001.method_5854(this.field_4939 - 1, this.field_4940, this.field_4941);
            var4.add(var10001);
            var4 = this.field_4943;
            var10001 = new class_1034;
            var10001.method_5854(this.field_4939, this.field_4940, this.field_4941 - 1);
            var4.add(var10001);
            if(var2 != null) {
               return;
            }
         }

         var3 = var1;
         if(var2 == null) {
            return;
         }

         var5 = 9;
      }

      if(var3 == var5) {
         var4 = this.field_4943;
         var10001 = new class_1034;
         var10001.method_5854(this.field_4939 + 1, this.field_4940, this.field_4941);
         var4.add(var10001);
         var4 = this.field_4943;
         var10001 = new class_1034;
         var10001.method_5854(this.field_4939, this.field_4940, this.field_4941 - 1);
         var4.add(var10001);
      }

   }

   // $FF: renamed from: a () void
   private void method_5628() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;

      while(var2 < this.field_4943.size()) {
         class_979 var3 = this.method_5630((class_1034)this.field_4943.get(var2));
         if(var1 != null) {
            label25: {
               if(var3 != null) {
                  if(var1 == null) {
                     break label25;
                  }

                  if(var3.method_5631(this)) {
                     List var4 = this.field_4943;
                     class_1034 var10002 = new class_1034;
                     var10002.method_5854(var3.field_4939, var3.field_4940, var3.field_4941);
                     var4.set(var2, var10002);
                     if(var1 != null) {
                        break label25;
                     }
                  }
               }

               this.field_4943.remove(var2--);
            }
         }

         ++var2;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (int, int, int) boolean
   private boolean method_5629(int var1, int var2, int var3) {
      boolean var10000;
      int var10001;
      int var10002;
      int var10003;
      ahb var5;
      label26: {
         String[] var4 = class_752.method_4253();
         var10000 = class_392.method_2612(this.field_4938, var1, var2, var3);
         if(var4 != null) {
            if(var10000) {
               var10000 = true;
               return var10000;
            }

            var5 = this.field_4938;
            var10001 = var1;
            var10002 = var2 + 1;
            var10003 = var3;
            if(var4 == null) {
               break label26;
            }

            var10000 = class_392.method_2612(this.field_4938, var1, var10002, var3);
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }

         var5 = this.field_4938;
         var10001 = var1;
         var10002 = var2 - 1;
         var10003 = var3;
      }

      var10000 = class_392.method_2612(var5, var10001, var10002, var10003);
      return var10000;
   }

   // $FF: renamed from: b (dd) d2
   private class_979 method_5630(class_1034 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = class_392.method_2612(this.field_4938, var1.field_5472, var1.field_5473, var1.field_5474);
      class_392 var10002;
      class_979 var3;
      if(var2 != null) {
         if(var10000) {
            var3 = new class_979;
            var10002 = this.field_4945;
            this.field_4945.getClass();
            var3.method_5626(var10002, this.field_4938, var1.field_5472, var1.field_5473, var1.field_5474);
            return var3;
         }

         var10000 = class_392.method_2612(this.field_4938, var1.field_5472, var1.field_5473 + 1, var1.field_5474);
      }

      if(var2 != null) {
         if(var10000) {
            var3 = new class_979;
            var10002 = this.field_4945;
            this.field_4945.getClass();
            var3.method_5626(var10002, this.field_4938, var1.field_5472, var1.field_5473 + 1, var1.field_5474);
            return var3;
         }

         var3 = this;
         if(var2 == null) {
            return var3;
         }

         var10000 = class_392.method_2612(this.field_4938, var1.field_5472, var1.field_5473 - 1, var1.field_5474);
      }

      if(var10000) {
         var3 = new class_979;
         var10002 = this.field_4945;
         this.field_4945.getClass();
         var3.method_5626(var10002, this.field_4938, var1.field_5472, var1.field_5473 - 1, var1.field_5474);
      } else {
         var3 = null;
      }

      return var3;
   }

   // $FF: renamed from: b (d2) boolean
   private boolean method_5631(class_979 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      int var5;
      while(true) {
         if(var3 < this.field_4943.size()) {
            class_1034 var4 = (class_1034)this.field_4943.get(var3);
            if(var2 != null) {
               var5 = var4.field_5472;
               if(var2 == null) {
                  break;
               }

               if(var4.field_5472 == var1.field_4939) {
                  label23: {
                     var5 = var4.field_5474;
                     if(var2 != null) {
                        if(var4.field_5474 != var1.field_4941) {
                           break label23;
                        }

                        var5 = 1;
                     }

                     return (boolean)var5;
                  }
               }

               ++var3;
            }

            if(var2 != null) {
               continue;
            }
         }

         var5 = 0;
         break;
      }

      return (boolean)var5;
   }

   // $FF: renamed from: c (int, int, int) boolean
   private boolean method_5632(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var4 = var10000;

      int var7;
      while(true) {
         if(var5 < this.field_4943.size()) {
            class_1034 var6 = (class_1034)this.field_4943.get(var5);
            if(var4 != null) {
               var7 = var6.field_5472;
               if(var4 == null) {
                  break;
               }

               if(var6.field_5472 == var1) {
                  label23: {
                     var7 = var6.field_5474;
                     if(var4 != null) {
                        if(var6.field_5474 != var3) {
                           break label23;
                        }

                        var7 = 1;
                     }

                     return (boolean)var7;
                  }
               }

               ++var5;
            }

            if(var4 != null) {
               continue;
            }
         }

         var7 = 0;
         break;
      }

      return (boolean)var7;
   }

   // $FF: renamed from: b () int
   protected int method_5633() {
      int var2 = 0;
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_5629(this.field_4939, this.field_4940, this.field_4941 - 1);
      if(var1 != null) {
         if(var10000 != 0) {
            ++var2;
         }

         var10000 = this.method_5629(this.field_4939, this.field_4940, this.field_4941 + 1);
      }

      if(var1 != null) {
         if(var10000 != 0) {
            ++var2;
         }

         var10000 = this.method_5629(this.field_4939 - 1, this.field_4940, this.field_4941);
      }

      if(var1 != null) {
         if(var10000 != 0) {
            ++var2;
         }

         var10000 = this.method_5629(this.field_4939 + 1, this.field_4940, this.field_4941);
      }

      if(var1 != null) {
         if(var10000 != 0) {
            ++var2;
         }

         var10000 = var2;
      }

      return var10000;
   }

   // $FF: renamed from: c (d2) boolean
   private boolean method_5634(class_979 var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.method_5631(var1);
      if(var2 != null) {
         if(var10000 != 0) {
            var10000 = 1;
            return (boolean)var10000;
         }

         var10000 = this.field_4943.size();
      }

      if(var2 != null) {
         if(var10000 == 2) {
            var10000 = 0;
            return (boolean)var10000;
         }

         var10000 = this.field_4943.isEmpty();
      }

      if(var2 != null) {
         var10000 = var10000 != 0?1:1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: d (d2) void
   private void method_5635(class_979 var1) {
      String[] var2;
      byte var3;
      byte var4;
      byte var5;
      byte var6;
      byte var7;
      byte var10;
      label204: {
         label203: {
            List var10000 = this.field_4943;
            class_1034 var10001 = new class_1034;
            var10001.method_5854(var1.field_4939, var1.field_4940, var1.field_4941);
            var10000.add(var10001);
            String[] var9 = class_752.method_4253();
            var3 = this.method_5632(this.field_4939, this.field_4940, this.field_4941 - 1);
            var4 = this.method_5632(this.field_4939, this.field_4940, this.field_4941 + 1);
            var2 = var9;
            var5 = this.method_5632(this.field_4939 - 1, this.field_4940, this.field_4941);
            var6 = this.method_5632(this.field_4939 + 1, this.field_4940, this.field_4941);
            var7 = -1;
            var10 = var3;
            if(var2 != null) {
               if(var3 == 0) {
                  var10 = var4;
                  if(var2 == null) {
                     break label204;
                  }

                  if(var4 == 0) {
                     break label203;
                  }
               }

               var10 = 0;
            }

            var7 = var10;
         }

         var10 = var5;
      }

      byte var11;
      label193: {
         label192: {
            if(var2 != null) {
               if(var10 == 0) {
                  var11 = var6;
                  if(var2 == null) {
                     break label193;
                  }

                  if(var6 == 0) {
                     break label192;
                  }
               }

               var10 = 1;
            }

            var7 = var10;
         }

         var11 = this.field_4942;
      }

      if(var2 != null) {
         label181: {
            if(var11 == 0) {
               var11 = var4;
               if(var2 != null) {
                  label212: {
                     if(var4 != 0) {
                        var11 = var6;
                        if(var2 == null) {
                           break label212;
                        }

                        if(var6 != 0) {
                           var11 = var3;
                           if(var2 == null) {
                              break label212;
                           }

                           if(var3 == 0) {
                              var11 = var5;
                              if(var2 == null) {
                                 break label212;
                              }

                              if(var5 == 0) {
                                 var7 = 6;
                              }
                           }
                        }
                     }

                     var11 = var4;
                  }
               }

               if(var2 != null) {
                  label213: {
                     if(var11 != 0) {
                        var11 = var5;
                        if(var2 == null) {
                           break label213;
                        }

                        if(var5 != 0) {
                           var11 = var3;
                           if(var2 == null) {
                              break label213;
                           }

                           if(var3 == 0) {
                              var11 = var6;
                              if(var2 == null) {
                                 break label213;
                              }

                              if(var6 == 0) {
                                 var7 = 7;
                              }
                           }
                        }
                     }

                     var11 = var3;
                  }
               }

               if(var2 != null) {
                  label135: {
                     if(var11 != 0) {
                        var11 = var5;
                        if(var2 == null) {
                           break label135;
                        }

                        if(var5 != 0) {
                           var11 = var4;
                           if(var2 == null) {
                              break label135;
                           }

                           if(var4 == 0) {
                              var11 = var6;
                              if(var2 == null) {
                                 break label135;
                              }

                              if(var6 == 0) {
                                 var7 = 8;
                              }
                           }
                        }
                     }

                     var11 = var3;
                  }
               }

               if(var2 == null) {
                  break label181;
               }

               if(var11 != 0) {
                  var11 = var6;
                  if(var2 == null) {
                     break label181;
                  }

                  if(var6 != 0) {
                     var11 = var4;
                     if(var2 == null) {
                        break label181;
                     }

                     if(var4 == 0) {
                        var11 = var5;
                        if(var2 == null) {
                           break label181;
                        }

                        if(var5 == 0) {
                           var7 = 9;
                        }
                     }
                  }
               }
            }

            var11 = var7;
         }
      }

      if(var2 != null) {
         label122: {
            if(var11 == 0) {
               var11 = class_392.method_2612(this.field_4938, this.field_4939, this.field_4940 + 1, this.field_4941 - 1);
               if(var2 != null) {
                  if(var11 != 0) {
                     var7 = 4;
                  }

                  var11 = class_392.method_2612(this.field_4938, this.field_4939, this.field_4940 + 1, this.field_4941 + 1);
               }

               if(var2 == null) {
                  break label122;
               }

               if(var11 != 0) {
                  var7 = 5;
               }
            }

            var11 = var7;
         }
      }

      if(var2 != null) {
         label114: {
            if(var11 == 1) {
               var11 = class_392.method_2612(this.field_4938, this.field_4939 + 1, this.field_4940 + 1, this.field_4941);
               if(var2 != null) {
                  if(var11 != 0) {
                     var7 = 2;
                  }

                  var11 = class_392.method_2612(this.field_4938, this.field_4939 - 1, this.field_4940 + 1, this.field_4941);
               }

               if(var2 == null) {
                  break label114;
               }

               if(var11 != 0) {
                  var7 = 3;
               }
            }

            var11 = var7;
         }
      }

      if(var2 != null) {
         if(var11 < 0) {
            var7 = 0;
         }

         var11 = var7;
      }

      int var8 = var11;
      if(var2 != null) {
         if(this.field_4942) {
            var8 = this.field_4938.method_33(this.field_4939, this.field_4940, this.field_4941) & 8 | var7;
         }

         this.field_4938.method_2055(this.field_4939, this.field_4940, this.field_4941, var8, 3);
      }

   }

   // $FF: renamed from: d (int, int, int) boolean
   private boolean method_5636(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      class_1034 var10002 = new class_1034;
      var10002.method_5854(var1, var2, var3);
      class_979 var5 = this.method_5630(var10002);
      String[] var4 = var10000;
      class_979 var6 = var5;
      if(var4 != null) {
         if(var5 == null) {
            return false;
         }

         var5.method_5628();
         var6 = var5;
      }

      return var6.method_5634(this);
   }

   // $FF: renamed from: b (boolean, boolean) void
   public void method_5637(boolean var1, boolean var2) {
      String[] var3;
      byte var4;
      byte var5;
      byte var6;
      byte var7;
      byte var8;
      byte var12;
      label436: {
         label439: {
            var4 = this.method_5636(this.field_4939, this.field_4940, this.field_4941 - 1);
            var5 = this.method_5636(this.field_4939, this.field_4940, this.field_4941 + 1);
            var6 = this.method_5636(this.field_4939 - 1, this.field_4940, this.field_4941);
            String[] var10000 = class_752.method_4253();
            var7 = this.method_5636(this.field_4939 + 1, this.field_4940, this.field_4941);
            var3 = var10000;
            var8 = -1;
            var12 = var4;
            if(var3 != null) {
               if(var4 == 0) {
                  var12 = var5;
                  if(var3 == null) {
                     break label436;
                  }

                  if(var5 == 0) {
                     break label439;
                  }
               }

               var12 = var6;
            }

            if(var3 == null) {
               break label436;
            }

            if(var12 == 0) {
               var12 = var7;
               if(var3 == null) {
                  break label436;
               }

               if(var7 == 0) {
                  var8 = 0;
               }
            }
         }

         var12 = var6;
      }

      label420: {
         label440: {
            if(var3 != null) {
               if(var12 == 0) {
                  var12 = var7;
                  if(var3 == null) {
                     break label420;
                  }

                  if(var7 == 0) {
                     break label440;
                  }
               }

               var12 = var4;
            }

            if(var3 == null) {
               break label420;
            }

            if(var12 == 0) {
               var12 = var5;
               if(var3 == null) {
                  break label420;
               }

               if(var5 == 0) {
                  var8 = 1;
               }
            }
         }

         var12 = this.field_4942;
      }

      if(var3 != null) {
         label403: {
            if(var12 == 0) {
               var12 = var5;
               if(var3 != null) {
                  label455: {
                     if(var5 != 0) {
                        var12 = var7;
                        if(var3 == null) {
                           break label455;
                        }

                        if(var7 != 0) {
                           var12 = var4;
                           if(var3 == null) {
                              break label455;
                           }

                           if(var4 == 0) {
                              var12 = var6;
                              if(var3 == null) {
                                 break label455;
                              }

                              if(var6 == 0) {
                                 var8 = 6;
                              }
                           }
                        }
                     }

                     var12 = var5;
                  }
               }

               if(var3 != null) {
                  label456: {
                     if(var12 != 0) {
                        var12 = var6;
                        if(var3 == null) {
                           break label456;
                        }

                        if(var6 != 0) {
                           var12 = var4;
                           if(var3 == null) {
                              break label456;
                           }

                           if(var4 == 0) {
                              var12 = var7;
                              if(var3 == null) {
                                 break label456;
                              }

                              if(var7 == 0) {
                                 var8 = 7;
                              }
                           }
                        }
                     }

                     var12 = var4;
                  }
               }

               if(var3 != null) {
                  label357: {
                     if(var12 != 0) {
                        var12 = var6;
                        if(var3 == null) {
                           break label357;
                        }

                        if(var6 != 0) {
                           var12 = var5;
                           if(var3 == null) {
                              break label357;
                           }

                           if(var5 == 0) {
                              var12 = var7;
                              if(var3 == null) {
                                 break label357;
                              }

                              if(var7 == 0) {
                                 var8 = 8;
                              }
                           }
                        }
                     }

                     var12 = var4;
                  }
               }

               if(var3 == null) {
                  break label403;
               }

               if(var12 != 0) {
                  var12 = var7;
                  if(var3 == null) {
                     break label403;
                  }

                  if(var7 != 0) {
                     var12 = var5;
                     if(var3 == null) {
                        break label403;
                     }

                     if(var5 == 0) {
                        var12 = var6;
                        if(var3 == null) {
                           break label403;
                        }

                        if(var6 == 0) {
                           var8 = 9;
                        }
                     }
                  }
               }
            }

            var12 = var8;
         }
      }

      if(var3 != null) {
         label344: {
            if(var12 == -1) {
               byte var13;
               label315: {
                  label314: {
                     var13 = var4;
                     if(var3 != null) {
                        if(var4 == 0) {
                           var13 = var5;
                           if(var3 == null) {
                              break label315;
                           }

                           if(var5 == 0) {
                              break label314;
                           }
                        }

                        var13 = 0;
                     }

                     var8 = var13;
                  }

                  var13 = var6;
               }

               label305: {
                  label304: {
                     if(var3 != null) {
                        if(var13 == 0) {
                           var12 = var7;
                           if(var3 == null) {
                              break label305;
                           }

                           if(var7 == 0) {
                              break label304;
                           }
                        }

                        var13 = 1;
                     }

                     var8 = var13;
                  }

                  var12 = this.field_4942;
               }

               if(var3 == null) {
                  break label344;
               }

               if(var12 == 0) {
                  label462: {
                     var12 = var1;
                     if(var3 != null) {
                        if(var1 != 0) {
                           var12 = var5;
                           if(var3 != null) {
                              label457: {
                                 if(var5 != 0) {
                                    var12 = var7;
                                    if(var3 == null) {
                                       break label457;
                                    }

                                    if(var7 != 0) {
                                       var8 = 6;
                                    }
                                 }

                                 var12 = var6;
                              }
                           }

                           if(var3 != null) {
                              label458: {
                                 if(var12 != 0) {
                                    var12 = var5;
                                    if(var3 == null) {
                                       break label458;
                                    }

                                    if(var5 != 0) {
                                       var8 = 7;
                                    }
                                 }

                                 var12 = var7;
                              }
                           }

                           if(var3 != null) {
                              label276: {
                                 if(var12 != 0) {
                                    var12 = var4;
                                    if(var3 == null) {
                                       break label276;
                                    }

                                    if(var4 != 0) {
                                       var8 = 9;
                                    }
                                 }

                                 var12 = var4;
                              }
                           }

                           if(var3 == null) {
                              break label344;
                           }

                           if(var12 == 0) {
                              break label462;
                           }

                           var12 = var6;
                           if(var3 == null) {
                              break label344;
                           }

                           if(var6 == 0) {
                              break label462;
                           }

                           var8 = 8;
                           if(var3 != null) {
                              break label462;
                           }
                        }

                        var12 = var4;
                     }

                     if(var3 != null) {
                        label459: {
                           if(var12 != 0) {
                              var12 = var6;
                              if(var3 == null) {
                                 break label459;
                              }

                              if(var6 != 0) {
                                 var8 = 8;
                              }
                           }

                           var12 = var7;
                        }
                     }

                     if(var3 != null) {
                        label460: {
                           if(var12 != 0) {
                              var12 = var4;
                              if(var3 == null) {
                                 break label460;
                              }

                              if(var4 != 0) {
                                 var8 = 9;
                              }
                           }

                           var12 = var6;
                        }
                     }

                     if(var3 != null) {
                        label252: {
                           if(var12 != 0) {
                              var12 = var5;
                              if(var3 == null) {
                                 break label252;
                              }

                              if(var5 != 0) {
                                 var8 = 7;
                              }
                           }

                           var12 = var5;
                        }
                     }

                     if(var3 == null) {
                        break label344;
                     }

                     if(var12 != 0) {
                        var12 = var7;
                        if(var3 == null) {
                           break label344;
                        }

                        if(var7 != 0) {
                           var8 = 6;
                        }
                     }
                  }
               }
            }

            var12 = var8;
         }
      }

      if(var3 != null) {
         label245: {
            if(var12 == 0) {
               var12 = class_392.method_2612(this.field_4938, this.field_4939, this.field_4940 + 1, this.field_4941 - 1);
               if(var3 != null) {
                  if(var12 != 0) {
                     var8 = 4;
                  }

                  var12 = class_392.method_2612(this.field_4938, this.field_4939, this.field_4940 + 1, this.field_4941 + 1);
               }

               if(var3 == null) {
                  break label245;
               }

               if(var12 != 0) {
                  var8 = 5;
               }
            }

            var12 = var8;
         }
      }

      if(var3 != null) {
         label237: {
            if(var12 == 1) {
               var12 = class_392.method_2612(this.field_4938, this.field_4939 + 1, this.field_4940 + 1, this.field_4941);
               if(var3 != null) {
                  if(var12 != 0) {
                     var8 = 2;
                  }

                  var12 = class_392.method_2612(this.field_4938, this.field_4939 - 1, this.field_4940 + 1, this.field_4941);
               }

               if(var3 == null) {
                  break label237;
               }

               if(var12 != 0) {
                  var8 = 3;
               }
            }

            var12 = var8;
         }
      }

      if(var3 != null) {
         if(var12 < 0) {
            var8 = 0;
         }

         this.method_5627(var8);
         var12 = var8;
      }

      int var9 = var12;
      int var14 = this.field_4942;
      if(var3 != null) {
         if(this.field_4942) {
            var9 = this.field_4938.method_33(this.field_4939, this.field_4940, this.field_4941) & 8 | var8;
         }

         var14 = var2;
      }

      if(var3 != null) {
         label225: {
            if(var14 == 0) {
               var14 = this.field_4938.method_33(this.field_4939, this.field_4940, this.field_4941);
               if(var3 == null) {
                  break label225;
               }

               if(var14 == var9) {
                  return;
               }
            }

            this.field_4938.method_2055(this.field_4939, this.field_4940, this.field_4941, var9, 3);
            var14 = 0;
         }
      }

      int var10 = var14;

      while(var10 < this.field_4943.size()) {
         class_979 var11 = this.method_5630((class_1034)this.field_4943.get(var10));
         if(var3 != null) {
            label213: {
               if(var11 != null) {
                  var11.method_5628();
                  if(var3 == null) {
                     break label213;
                  }

                  if(var11.method_5634(this)) {
                     var11.method_5635(this);
                  }
               }

               ++var10;
            }
         }

         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_5638() {
      boolean var10000 = true;
      char[] var10003 = "hóÉEàúõ".toCharArray();
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
            field_4944 = (new String((char[])var4)).intern();
            String var2 = field_4944;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 76;
            break;
         case 1:
            var10009 = 184;
            break;
         case 2:
            var10009 = 95;
            break;
         case 3:
            var10009 = 95;
            break;
         case 4:
            var10009 = 101;
            break;
         case 5:
            var10009 = 47;
            break;
         default:
            var10009 = 233;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
