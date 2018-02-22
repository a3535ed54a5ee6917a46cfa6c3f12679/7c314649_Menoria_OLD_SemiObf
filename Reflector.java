import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflector {

   public static ReflectorClass ModLoader;
   public static ReflectorMethod ModLoader_renderWorldBlock;
   public static ReflectorMethod ModLoader_renderInvBlock;
   public static ReflectorMethod ModLoader_renderBlockIsItemFull3D;
   public static ReflectorMethod ModLoader_registerServer;
   public static ReflectorMethod ModLoader_getCustomAnimationLogic;
   public static ReflectorClass FMLRenderAccessLibrary;
   public static ReflectorMethod FMLRenderAccessLibrary_renderWorldBlock;
   public static ReflectorMethod FMLRenderAccessLibrary_renderInventoryBlock;
   public static ReflectorMethod FMLRenderAccessLibrary_renderItemAsFull3DBlock;
   public static ReflectorClass LightCache;
   public static class_891 LightCache_cache;
   public static ReflectorMethod LightCache_clear;
   public static ReflectorClass BlockCoord;
   public static ReflectorMethod BlockCoord_resetPool;
   public static ReflectorClass MinecraftForge;
   public static class_891 MinecraftForge_EVENT_BUS;
   public static ReflectorClass ForgeHooks;
   public static ReflectorMethod ForgeHooks_onLivingSetAttackTarget;
   public static ReflectorMethod ForgeHooks_onLivingUpdate;
   public static ReflectorMethod ForgeHooks_onLivingAttack;
   public static ReflectorMethod ForgeHooks_onLivingHurt;
   public static ReflectorMethod ForgeHooks_onLivingDeath;
   public static ReflectorMethod ForgeHooks_onLivingDrops;
   public static ReflectorMethod ForgeHooks_onLivingFall;
   public static ReflectorMethod ForgeHooks_onLivingJump;
   public static ReflectorClass MinecraftForgeClient;
   public static ReflectorMethod MinecraftForgeClient_getRenderPass;
   public static ReflectorMethod MinecraftForgeClient_getItemRenderer;
   public static ReflectorClass ForgeHooksClient;
   public static ReflectorMethod ForgeHooksClient_onDrawBlockHighlight;
   public static ReflectorMethod ForgeHooksClient_orientBedCamera;
   public static ReflectorMethod ForgeHooksClient_renderEquippedItem;
   public static ReflectorMethod ForgeHooksClient_dispatchRenderLast;
   public static ReflectorMethod ForgeHooksClient_onTextureLoadPre;
   public static ReflectorMethod ForgeHooksClient_setRenderPass;
   public static ReflectorMethod ForgeHooksClient_onTextureStitchedPre;
   public static ReflectorMethod ForgeHooksClient_onTextureStitchedPost;
   public static ReflectorMethod ForgeHooksClient_renderFirstPersonHand;
   public static ReflectorMethod ForgeHooksClient_setWorldRendererRB;
   public static ReflectorMethod ForgeHooksClient_onPreRenderWorld;
   public static ReflectorMethod ForgeHooksClient_onPostRenderWorld;
   public static ReflectorClass FMLCommonHandler;
   public static ReflectorMethod FMLCommonHandler_instance;
   public static ReflectorMethod FMLCommonHandler_handleServerStarting;
   public static ReflectorMethod FMLCommonHandler_handleServerAboutToStart;
   public static ReflectorClass FMLClientHandler;
   public static ReflectorMethod FMLClientHandler_instance;
   public static ReflectorMethod FMLClientHandler_isLoading;
   public static ReflectorClass ItemRenderType;
   public static class_891 ItemRenderType_EQUIPPED;
   public static ReflectorClass ForgeWorldProvider;
   public static ReflectorMethod ForgeWorldProvider_getSkyRenderer;
   public static ReflectorMethod ForgeWorldProvider_getCloudRenderer;
   public static ReflectorMethod ForgeWorldProvider_getWeatherRenderer;
   public static ReflectorClass IRenderHandler;
   public static ReflectorMethod IRenderHandler_render;
   public static ReflectorClass DimensionManager;
   public static ReflectorMethod DimensionManager_getStaticDimensionIDs;
   public static ReflectorClass WorldEvent_Load;
   public static ReflectorConstructor WorldEvent_Load_Constructor;
   public static ReflectorClass DrawScreenEvent_Pre;
   public static ReflectorConstructor DrawScreenEvent_Pre_Constructor;
   public static ReflectorClass DrawScreenEvent_Post;
   public static ReflectorConstructor DrawScreenEvent_Post_Constructor;
   public static ReflectorClass EntityViewRenderEvent_FogColors;
   public static ReflectorConstructor EntityViewRenderEvent_FogColors_Constructor;
   public static class_891 EntityViewRenderEvent_FogColors_red;
   public static class_891 EntityViewRenderEvent_FogColors_green;
   public static class_891 EntityViewRenderEvent_FogColors_blue;
   public static ReflectorClass EntityViewRenderEvent_FogDensity;
   public static ReflectorConstructor EntityViewRenderEvent_FogDensity_Constructor;
   public static class_891 EntityViewRenderEvent_FogDensity_density;
   public static ReflectorClass EventBus;
   public static ReflectorMethod EventBus_post;
   public static ReflectorClass ChunkWatchEvent_UnWatch;
   public static ReflectorConstructor ChunkWatchEvent_UnWatch_Constructor;
   public static ReflectorClass ForgeBlock;
   public static ReflectorMethod ForgeBlock_getBedDirection;
   public static ReflectorMethod ForgeBlock_isBedFoot;
   public static ReflectorMethod ForgeBlock_canRenderInPass;
   public static ReflectorMethod ForgeBlock_hasTileEntity;
   public static ReflectorClass ForgeEntity;
   public static class_891 ForgeEntity_captureDrops;
   public static class_891 ForgeEntity_capturedDrops;
   public static ReflectorMethod ForgeEntity_shouldRenderInPass;
   public static ReflectorMethod ForgeEntity_canRiderInteract;
   public static ReflectorClass ForgeTileEntity;
   public static ReflectorMethod ForgeTileEntity_shouldRenderInPass;
   public static ReflectorMethod ForgeTileEntity_getRenderBoundingBox;
   public static ReflectorClass ForgeItem;
   public static ReflectorMethod ForgeItem_onEntitySwing;
   public static ReflectorClass ForgePotionEffect;
   public static ReflectorMethod ForgePotionEffect_isCurativeItem;
   public static ReflectorClass ForgeItemStack;
   public static ReflectorMethod ForgeItemStack_hasEffect;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_1377;


   // $FF: renamed from: <init> () void
   public void method_1443() {
      super();
   }

   public static void callVoid(ReflectorMethod var0, Object ... var1) {
      String[] var2 = class_752.method_4253();

      try {
         Method var3 = var0.getTargetMethod();

         try {
            if(var2 == null) {
               return;
            }

            if(var3 == null) {
               return;
            }
         } catch (Throwable var4) {
            throw method_1445(var4);
         }

         var3.invoke((Object)null, var1);
      } catch (Throwable var5) {
         handleException(var5, (Object)null, var0, var1);
      }

   }

   public static boolean callBoolean(ReflectorMethod var0, Object ... var1) {
      String[] var2 = class_752.method_4253();

      try {
         Method var3 = var0.getTargetMethod();

         Object var10000;
         label27: {
            try {
               var10000 = var3;
               if(var2 == null) {
                  break label27;
               }

               if(var3 == null) {
                  return false;
               }
            } catch (Throwable var5) {
               throw method_1445(var5);
            }

            var10000 = var3.invoke((Object)null, var1);
         }

         Boolean var4 = (Boolean)var10000;
         return var4.booleanValue();
      } catch (Throwable var6) {
         handleException(var6, (Object)null, var0, var1);
         return false;
      }
   }

   public static int callInt(ReflectorMethod var0, Object ... var1) {
      String[] var2 = class_752.method_4253();

      try {
         Method var3 = var0.getTargetMethod();

         Object var10000;
         label27: {
            try {
               var10000 = var3;
               if(var2 == null) {
                  break label27;
               }

               if(var3 == null) {
                  return 0;
               }
            } catch (Throwable var5) {
               throw method_1445(var5);
            }

            var10000 = var3.invoke((Object)null, var1);
         }

         Integer var4 = (Integer)var10000;
         return var4.intValue();
      } catch (Throwable var6) {
         handleException(var6, (Object)null, var0, var1);
         return 0;
      }
   }

   public static float callFloat(ReflectorMethod var0, Object ... var1) {
      String[] var2 = class_752.method_4253();

      try {
         Method var3 = var0.getTargetMethod();

         Object var10000;
         label27: {
            try {
               var10000 = var3;
               if(var2 == null) {
                  break label27;
               }

               if(var3 == null) {
                  return 0.0F;
               }
            } catch (Throwable var5) {
               throw method_1445(var5);
            }

            var10000 = var3.invoke((Object)null, var1);
         }

         Float var4 = (Float)var10000;
         return var4.floatValue();
      } catch (Throwable var6) {
         handleException(var6, (Object)null, var0, var1);
         return 0.0F;
      }
   }

   public static String callString(ReflectorMethod var0, Object ... var1) {
      String[] var2 = class_752.method_4253();

      try {
         Method var3 = var0.getTargetMethod();

         Object var10000;
         label27: {
            try {
               var10000 = var3;
               if(var2 == null) {
                  break label27;
               }

               if(var3 == null) {
                  return null;
               }
            } catch (Throwable var5) {
               throw method_1445(var5);
            }

            var10000 = var3.invoke((Object)null, var1);
         }

         String var4 = (String)var10000;
         return var4;
      } catch (Throwable var6) {
         handleException(var6, (Object)null, var0, var1);
         return null;
      }
   }

   public static Object call(ReflectorMethod var0, Object ... var1) {
      String[] var2 = class_752.method_4253();

      try {
         Method var3 = var0.getTargetMethod();

         Object var10000;
         label27: {
            try {
               var10000 = var3;
               if(var2 == null) {
                  break label27;
               }

               if(var3 == null) {
                  return null;
               }
            } catch (Throwable var5) {
               throw method_1445(var5);
            }

            var10000 = var3.invoke((Object)null, var1);
         }

         Object var4 = var10000;
         return var4;
      } catch (Throwable var6) {
         handleException(var6, (Object)null, var0, var1);
         return null;
      }
   }

   public static void callVoid(Object var0, ReflectorMethod var1, Object ... var2) {
      String[] var3 = class_752.method_4253();

      try {
         if(var0 == null) {
            return;
         }

         Method var4 = var1.getTargetMethod();

         try {
            if(var3 == null) {
               return;
            }

            if(var4 == null) {
               return;
            }
         } catch (Throwable var5) {
            throw method_1445(var5);
         }

         var4.invoke(var0, var2);
      } catch (Throwable var6) {
         handleException(var6, var0, var1, var2);
      }

   }

   public static boolean callBoolean(Object var0, ReflectorMethod var1, Object ... var2) {
      String[] var3 = class_752.method_4253();

      try {
         Method var4 = var1.getTargetMethod();

         Object var10000;
         label27: {
            try {
               var10000 = var4;
               if(var3 == null) {
                  break label27;
               }

               if(var4 == null) {
                  return false;
               }
            } catch (Throwable var6) {
               throw method_1445(var6);
            }

            var10000 = var4.invoke(var0, var2);
         }

         Boolean var5 = (Boolean)var10000;
         return var5.booleanValue();
      } catch (Throwable var7) {
         handleException(var7, var0, var1, var2);
         return false;
      }
   }

   public static int callInt(Object var0, ReflectorMethod var1, Object ... var2) {
      String[] var3 = class_752.method_4253();

      try {
         Method var4 = var1.getTargetMethod();

         Object var10000;
         label27: {
            try {
               var10000 = var4;
               if(var3 == null) {
                  break label27;
               }

               if(var4 == null) {
                  return 0;
               }
            } catch (Throwable var6) {
               throw method_1445(var6);
            }

            var10000 = var4.invoke(var0, var2);
         }

         Integer var5 = (Integer)var10000;
         return var5.intValue();
      } catch (Throwable var7) {
         handleException(var7, var0, var1, var2);
         return 0;
      }
   }

   public static float callFloat(Object var0, ReflectorMethod var1, Object ... var2) {
      String[] var3 = class_752.method_4253();

      try {
         Method var4 = var1.getTargetMethod();

         Object var10000;
         label27: {
            try {
               var10000 = var4;
               if(var3 == null) {
                  break label27;
               }

               if(var4 == null) {
                  return 0.0F;
               }
            } catch (Throwable var6) {
               throw method_1445(var6);
            }

            var10000 = var4.invoke(var0, var2);
         }

         Float var5 = (Float)var10000;
         return var5.floatValue();
      } catch (Throwable var7) {
         handleException(var7, var0, var1, var2);
         return 0.0F;
      }
   }

   public static String callString(Object var0, ReflectorMethod var1, Object ... var2) {
      String[] var3 = class_752.method_4253();

      try {
         Method var4 = var1.getTargetMethod();

         Object var10000;
         label27: {
            try {
               var10000 = var4;
               if(var3 == null) {
                  break label27;
               }

               if(var4 == null) {
                  return null;
               }
            } catch (Throwable var6) {
               throw method_1445(var6);
            }

            var10000 = var4.invoke(var0, var2);
         }

         String var5 = (String)var10000;
         return var5;
      } catch (Throwable var7) {
         handleException(var7, var0, var1, var2);
         return null;
      }
   }

   public static Object call(Object var0, ReflectorMethod var1, Object ... var2) {
      String[] var3 = class_752.method_4253();

      try {
         Method var4 = var1.getTargetMethod();

         Object var10000;
         label27: {
            try {
               var10000 = var4;
               if(var3 == null) {
                  break label27;
               }

               if(var4 == null) {
                  return null;
               }
            } catch (Throwable var6) {
               throw method_1445(var6);
            }

            var10000 = var4.invoke(var0, var2);
         }

         Object var5 = var10000;
         return var5;
      } catch (Throwable var7) {
         handleException(var7, var0, var1, var2);
         return null;
      }
   }

   public static Object getFieldValue(class_891 var0) {
      return getFieldValue((Object)null, var0);
   }

   public static Object getFieldValue(Object var0, class_891 var1) {
      String[] var2 = class_752.method_4253();

      try {
         Field var3 = var1.method_5181();

         Object var10000;
         label27: {
            try {
               var10000 = var3;
               if(var2 == null) {
                  break label27;
               }

               if(var3 == null) {
                  return null;
               }
            } catch (Throwable var5) {
               throw method_1445(var5);
            }

            var10000 = var3.get(var0);
         }

         Object var4 = var10000;
         return var4;
      } catch (Throwable var6) {
         var6.printStackTrace();
         return null;
      }
   }

   public static float getFieldValueFloat(Object param0, class_891 param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   public static void setFieldValue(class_891 var0, Object var1) {
      setFieldValue((Object)null, var0, var1);
   }

   public static void setFieldValue(Object var0, class_891 var1, Object var2) {
      String[] var3 = class_752.method_4253();

      try {
         Field var4 = var1.method_5181();

         Field var10000;
         label28: {
            try {
               var10000 = var4;
               if(var3 == null) {
                  break label28;
               }

               if(var4 == null) {
                  return;
               }
            } catch (Throwable var5) {
               throw method_1445(var5);
            }

            var10000 = var4;
         }

         var10000.set(var0, var2);
      } catch (Throwable var6) {
         var6.printStackTrace();
      }

   }

   public static boolean postForgeBusEvent(ReflectorConstructor param0, Object ... param1) {
      // $FF: Couldn't be decompiled
   }

   public static boolean postForgeBusEvent(Object param0) {
      // $FF: Couldn't be decompiled
   }

   public static Object newInstance(ReflectorConstructor param0, Object ... param1) {
      // $FF: Couldn't be decompiled
   }

   public static boolean matchesTypes(Class[] var0, Class[] var1) {
      try {
         if(var0.length != var1.length) {
            return false;
         }
      } catch (IllegalArgumentException var6) {
         throw method_1445(var6);
      }

      for(int var2 = 0; var2 < var1.length; ++var2) {
         Class var3 = var0[var2];
         Class var4 = var1[var2];

         try {
            if(var3 != var4) {
               return false;
            }
         } catch (IllegalArgumentException var5) {
            throw method_1445(var5);
         }
      }

      return true;
   }

   private static void dbgCall(boolean var0, String var1, ReflectorMethod var2, Object[] var3, Object var4) {
      String[] var10000 = class_752.method_4253();
      String var6 = var2.getTargetMethod().getDeclaringClass().getName();
      String var7 = var2.getTargetMethod().getName();
      String var8 = "";
      String[] var5 = var10000;

      label20: {
         try {
            if(var5 == null) {
               return;
            }

            if(!var0) {
               break label20;
            }
         } catch (IllegalArgumentException var10) {
            throw method_1445(var10);
         }

         String[] var9 = field_1377;
         var8 = " static";
      }

      StringBuilder var11 = (new StringBuilder()).append(var1).append(var8).append(" ").append(var6).append(".").append(var7).append("(").append(Config.arrayToString(var3));
      String[] var10001 = field_1377;
      Config.dbg(var11.append(") => ").append(var4).toString());
   }

   private static void dbgCallVoid(boolean var0, String var1, ReflectorMethod var2, Object[] var3) {
      String var5 = var2.getTargetMethod().getDeclaringClass().getName();
      String[] var10000 = class_752.method_4253();
      String var6 = var2.getTargetMethod().getName();
      String[] var4 = var10000;
      String var7 = "";

      label20: {
         try {
            if(var4 == null) {
               return;
            }

            if(!var0) {
               break label20;
            }
         } catch (IllegalArgumentException var8) {
            throw method_1445(var8);
         }

         var10000 = field_1377;
         var7 = " static";
      }

      Config.dbg(var1 + var7 + " " + var5 + "." + var6 + "(" + Config.arrayToString(var3) + ")");
   }

   private static void dbgFieldValue(boolean var0, String var1, class_891 var2, Object var3) {
      String[] var10000 = class_752.method_4253();
      String var5 = var2.method_5181().getDeclaringClass().getName();
      String[] var4 = var10000;
      String var6 = var2.method_5181().getName();
      String var7 = "";

      label20: {
         try {
            if(var4 == null) {
               return;
            }

            if(!var0) {
               break label20;
            }
         } catch (IllegalArgumentException var9) {
            throw method_1445(var9);
         }

         String[] var8 = field_1377;
         var7 = " static";
      }

      StringBuilder var10 = (new StringBuilder()).append(var1).append(var7).append(" ").append(var5).append(".").append(var6);
      String[] var10001 = field_1377;
      Config.dbg(var10.append(" => ").append(var3).toString());
   }

   private static void handleException(Throwable param0, Object param1, ReflectorMethod param2, Object[] param3) {
      // $FF: Couldn't be decompiled
   }

   private static void handleException(Throwable param0, ReflectorConstructor param1, Object[] param2) {
      // $FF: Couldn't be decompiled
   }

   private static Object[] getClasses(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static Field getFieldByType(Class var0, Class var1) {
      try {
         Field[] var2 = var0.getDeclaredFields();

         for(int var3 = 0; var3 < var2.length; ++var3) {
            Field var4 = var2[var3];
            if(var4.getType() == var1) {
               var4.setAccessible(true);
               return var4;
            }
         }

         return null;
      } catch (Exception var5) {
         return null;
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_1444() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_1445(Throwable var0) {
      return var0;
   }
}
