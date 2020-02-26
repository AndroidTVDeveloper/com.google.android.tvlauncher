package com.google.android.tvlauncher.notifications;

import android.app.Activity;
import android.app.LoaderManager;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
public class NotificationsSidePanelActivity extends cfu implements LoaderManager.LoaderCallbacks {
    public cyc a;
    public NotificationsPanelView c;
    public View d;

    public NotificationsSidePanelActivity() {
        super(dhs.u);
    }

    public final void finish() {
        Scene scene = new Scene((ViewGroup) findViewById(16908290));
        scene.setEnterAction(new cyr(this));
        Slide slide = new Slide(8388613);
        slide.addListener(new cys(this));
        TransitionManager.go(scene, slide);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        this.a = new cyc(this.b);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(new cyq(this, viewGroup));
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new CursorLoader(this, cya.a, cyy.a, null, null, null);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Cursor cursor = (Cursor) obj;
        this.a.a(cursor);
        if (cursor == null || cursor.getCount() <= 0) {
            this.c.setVisibility(8);
            this.d.setVisibility(0);
            return;
        }
        this.d.setVisibility(8);
        this.c.setVisibility(0);
    }

    public final void onLoaderReset(Loader loader) {
        this.a.a((Cursor) null);
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.a.a() > 1) {
            this.c.k(0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        dcy.a((Activity) this);
    }
}
