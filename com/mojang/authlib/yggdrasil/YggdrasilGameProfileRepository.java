package com.mojang.authlib.yggdrasil;

import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import org.apache.logging.log4j.Logger;

public class YggdrasilGameProfileRepository implements GameProfileRepository {

   private static final Logger LOGGER;
   private static final String SEARCH_PAGE_URL;
   private static final int ENTRIES_PER_PAGE = 2;
   private static final int MAX_FAIL_COUNT = 3;
   private static final int DELAY_BETWEEN_PAGES = 100;
   private static final int DELAY_BETWEEN_FAILURES = 750;
   private final YggdrasilAuthenticationService authenticationService;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7561;


   // $FF: renamed from: <init> (com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService) void
   public void method_7760(YggdrasilAuthenticationService var1) {
      super();
      this.authenticationService = var1;
   }

   public void findProfilesByNames(String[] param1, Agent param2, ProfileLookupCallback param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_7761() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.InterruptedException) java.lang.InterruptedException
   private static InterruptedException method_7762(InterruptedException var0) {
      return var0;
   }
}
