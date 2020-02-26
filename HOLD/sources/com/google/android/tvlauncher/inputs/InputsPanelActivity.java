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
    private cvv c;

    public InputsPanelActivity() {
        super("InputsPanel", dhs.o);
    }

    public final void finish() {
        a(new cvo(this));
    }

    public final /* synthetic */ void a() {
        super.finish();
    }

    public final /* synthetic */ void b(int i) {
        cvv cvv = this.c;
        if (cvv != null) {
            cvm.a(cvv.h).a(i);
        }
        super.finish();
    }

    public final void a(Bundle bundle) {
        if (bundle == null) {
            getFragmentManager().beginTransaction().add(16908290, new cvr(), "inputs_fragment").commit();
            TransitionManager.go(new Scene((ViewGroup) findViewById(16908290)), new Slide(8388613));
        }
    }

    public final void a(int i) {
        a(new cvn(this, i));
    }

    public final void a(cvv cvv) {
        this.c = cvv;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        dcy.a((Activity) this);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        if (!isFinishing()) {
            super.finish();
        }
    }

    private final void a(Runnable runnable) {
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
