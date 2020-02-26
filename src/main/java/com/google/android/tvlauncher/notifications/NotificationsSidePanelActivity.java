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

    /* renamed from: a */
    public cyc f6668a;

    /* renamed from: c */
    public NotificationsPanelView f6669c;

    /* renamed from: d */
    public View f6670d;

    public NotificationsSidePanelActivity() {
        super(dhs.f8557u);
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
        this.f6668a = new cyc(this.f5439b);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(new cyq(this, viewGroup));
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new CursorLoader(this, cya.f7902a, cyy.f7936a, null, null, null);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Cursor cursor = (Cursor) obj;
        this.f6668a.mo3956a(cursor);
        if (cursor == null || cursor.getCount() <= 0) {
            this.f6669c.setVisibility(8);
            this.f6670d.setVisibility(0);
            return;
        }
        this.f6670d.setVisibility(8);
        this.f6669c.setVisibility(0);
    }

    public final void onLoaderReset(Loader loader) {
        this.f6668a.mo3956a((Cursor) null);
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.f6668a.mo2794a() > 1) {
            this.f6669c.mo5619k(0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        dcy.m6187a((Activity) this);
    }
}
