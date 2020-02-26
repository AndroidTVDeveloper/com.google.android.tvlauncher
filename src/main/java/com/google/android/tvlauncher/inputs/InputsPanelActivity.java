package com.google.android.tvlauncher.inputs;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.ViewGroup;

/* compiled from: PG */
public class InputsPanelActivity extends cfc implements cvt {

    /* renamed from: c */
    private cvv f6594c;

    public InputsPanelActivity() {
        super("InputsPanel", dhs.f8551o);
    }

    public final void finish() {
        m5323a(new cvo(this));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo2743a() {
        super.finish();
    }

    /* renamed from: b */
    public final /* synthetic */ void mo3423b(int i) {
        cvv cvv = this.f6594c;
        if (cvv != null) {
            cvm.m5749a(cvv.f7700h).mo3803a(i);
        }
        super.finish();
    }

    /* renamed from: a */
    public final void mo2709a(Bundle bundle) {
        if (bundle == null) {
            getFragmentManager().beginTransaction().add(16908290, new cvr(), "inputs_fragment").commit();
            TransitionManager.go(new Scene((ViewGroup) findViewById(16908290)), new Slide(8388613));
        }
    }

    /* renamed from: a */
    public final void mo3421a(int i) {
        m5323a(new cvn(this, i));
    }

    /* renamed from: a */
    public final void mo3422a(cvv cvv) {
        this.f6594c = cvv;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        dcy.m6187a((Activity) this);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        if (!isFinishing()) {
            super.finish();
        }
    }

    /* renamed from: a */
    private final void m5323a(Runnable runnable) {
        Fragment findFragmentByTag = getFragmentManager().findFragmentByTag("inputs_fragment");
        if (findFragmentByTag == null || !findFragmentByTag.isResumed()) {
            runnable.run();
            return;
        }
        Scene scene = new Scene((ViewGroup) findViewById(16908290));
        scene.setEnterAction(new cvp(this, findFragmentByTag));
        Slide slide = new Slide(8388613);
        slide.addListener(new cvq(this, runnable));
        TransitionManager.go(scene, slide);
    }
}
