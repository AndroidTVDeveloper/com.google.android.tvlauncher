package com.google.android.tvlauncher.appsview;

import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.ViewGroup;

/* compiled from: PG */
public class AppsViewActivity extends cfc implements cgs {

    /* renamed from: c */
    private boolean f6391c = false;

    public AppsViewActivity() {
        super("Apps", dhs.f8538b);
    }

    public final void finish() {
        Fragment findFragmentByTag = getFragmentManager().findFragmentByTag("apps_view_fragment");
        if ((findFragmentByTag == null || !findFragmentByTag.isResumed()) && !this.f6391c) {
            super.finish();
            return;
        }
        Scene scene = new Scene((ViewGroup) findViewById(16908290));
        scene.setEnterAction(new cgm(this, findFragmentByTag));
        Slide slide = new Slide(8388613);
        slide.addListener(new cgn(this));
        TransitionManager.go(scene, slide);
        this.f6391c = false;
    }

    /* renamed from: a */
    public final void mo2709a(Bundle bundle) {
        if (bundle == null) {
            m5253a();
            TransitionManager.go(new Scene((ViewGroup) findViewById(16908290)), new Slide(8388613));
            return;
        }
        cgt cgt = (cgt) getFragmentManager().findFragmentByTag("apps_view_fragment");
        if (cgt == null) {
            m5253a();
        } else {
            cgt.f5483e = this;
        }
    }

    /* renamed from: a */
    public final void mo2766a(boolean z) {
        this.f6391c = z;
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        dcy.m6187a((Activity) this);
        if (!(getFragmentManager().findFragmentByTag("edit_mode_fragment") == null || getFragmentManager().getBackStackEntryCount() == 0)) {
            getFragmentManager().popBackStack();
        }
        sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        if (!this.f5394a && getIntent().getBooleanExtra("check_for_edit_mode", true)) {
            Intent intent = getIntent();
            cgt cgt = (cgt) getFragmentManager().findFragmentByTag("apps_view_fragment");
            if (!(intent == null || intent.getExtras() == null || cgt == null)) {
                if (intent.getBooleanExtra("extra_start_customize_apps", false)) {
                    cgt.mo2768a(0);
                } else if (intent.getBooleanExtra("extra_start_customize_games", false)) {
                    cgt.mo2768a(1);
                }
            }
            getIntent().putExtra("check_for_edit_mode", false);
        }
    }

    /* renamed from: a */
    private final void m5253a() {
        cgt cgt = new cgt();
        cgt.f5483e = this;
        getFragmentManager().beginTransaction().add(16908290, cgt, "apps_view_fragment").commit();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public static void m5255a(Integer num, Context context) {
        Intent intent = new Intent("android.intent.action.ALL_APPS");
        if (num != null && num.intValue() == 0) {
            intent.putExtra("extra_start_customize_apps", true);
        } else if (num != null && num.intValue() == 1) {
            intent.putExtra("extra_start_customize_games", true);
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("AppsViewActivity not found :  ");
            sb.append(valueOf);
            Log.e("AppsViewActivity", sb.toString());
        }
    }
}
