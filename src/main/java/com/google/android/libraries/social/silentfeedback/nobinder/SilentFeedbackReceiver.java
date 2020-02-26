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
        boo a = buv.m4266a(context);
        buw buw = new buw((byte) 0);
        if (intent == null) {
            bux = buw.mo2456a();
        } else {
            buw.f4866b = " ";
            buw.f4868d = intent.getBooleanExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.excludePii", true);
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.exceptionMessage")) {
                buw.f4869e.crashInfo.exceptionMessage = intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.exceptionMessage");
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.exceptionClass")) {
                buw.f4869e.crashInfo.exceptionClassName = intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.exceptionClass");
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.stackTrace")) {
                buw.f4869e.crashInfo.stackTrace = intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.stackTrace");
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingClass")) {
                buw.f4869e.crashInfo.throwClassName = intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingClass");
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingFile")) {
                buw.f4869e.crashInfo.throwFileName = intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingFile");
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingLine")) {
                buw.f4869e.crashInfo.throwLineNumber = intent.getIntExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingLine", -1);
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingMethod")) {
                buw.f4869e.crashInfo.throwMethodName = intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingMethod");
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.categoryTag")) {
                buw.f4867c = intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.categoryTag");
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.psdBundle") && (bundleExtra = intent.getBundleExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.psdBundle")) != null) {
                buw.f4865a.putAll(bundleExtra);
            }
            bux = buw.mo2456a();
        }
        try {
            if (((Boolean) bvi.f4902a.mo2541a()).booleanValue()) {
                bsb bsb = new bsb(bux);
                bxe bxe = new bxe();
                bri bri = a.f4521g;
                bpg bpg = new bpg(bsb, bxe);
                Handler handler = bri.f4697l;
                handler.sendMessage(handler.obtainMessage(4, new brt(bpg, bri.f4695j.get(), a)));
                bxh = bxe.f4974a;
                bxh.mo2511a(new ceu(goAsync)).mo2512a(new cet());
            }
        } catch (SecurityException e) {
            Log.e("fb_FeedbackClient", e.getMessage());
        }
        bou a2 = buv.m4267a(a.f4520f, bux);
        bxe bxe2 = new bxe();
        a2.mo2249a(new btz(a2, bxe2));
        bxh = bxe2.f4974a;
        bxh.mo2511a(new ceu(goAsync)).mo2512a(new cet());
    }
}
