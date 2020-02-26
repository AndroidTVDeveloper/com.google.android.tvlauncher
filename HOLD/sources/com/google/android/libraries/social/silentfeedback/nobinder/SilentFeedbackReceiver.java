package com.google.android.libraries.social.silentfeedback.nobinder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

/* compiled from: PG */
public final class SilentFeedbackReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        bux bux;
        bxh bxh;
        Bundle bundleExtra;
        BroadcastReceiver.PendingResult goAsync = goAsync();
        boo a = buv.a(context);
        buw buw = new buw((byte) 0);
        if (intent == null) {
            bux = buw.a();
        } else {
            buw.b = " ";
            buw.d = intent.getBooleanExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.excludePii", true);
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.exceptionMessage")) {
                buw.e.crashInfo.exceptionMessage = intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.exceptionMessage");
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.exceptionClass")) {
                buw.e.crashInfo.exceptionClassName = intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.exceptionClass");
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.stackTrace")) {
                buw.e.crashInfo.stackTrace = intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.stackTrace");
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingClass")) {
                buw.e.crashInfo.throwClassName = intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingClass");
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingFile")) {
                buw.e.crashInfo.throwFileName = intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingFile");
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingLine")) {
                buw.e.crashInfo.throwLineNumber = intent.getIntExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingLine", -1);
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingMethod")) {
                buw.e.crashInfo.throwMethodName = intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingMethod");
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.categoryTag")) {
                buw.c = intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.categoryTag");
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.psdBundle") && (bundleExtra = intent.getBundleExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.psdBundle")) != null) {
                buw.a.putAll(bundleExtra);
            }
            bux = buw.a();
        }
        try {
            if (((Boolean) bvi.a.a()).booleanValue()) {
                bsb bsb = new bsb(bux);
                bxe bxe = new bxe();
                bri bri = a.g;
                bpg bpg = new bpg(bsb, bxe);
                Handler handler = bri.l;
                handler.sendMessage(handler.obtainMessage(4, new brt(bpg, bri.j.get(), a)));
                bxh = bxe.a;
                bxh.a(new ceu(goAsync)).a(new cet());
            }
        } catch (SecurityException e) {
            Log.e("fb_FeedbackClient", e.getMessage());
        }
        bou a2 = buv.a(a.f, bux);
        bxe bxe2 = new bxe();
        a2.a(new btz(a2, bxe2));
        bxh = bxe2.a;
        bxh.a(new ceu(goAsync)).a(new cet());
    }
}
