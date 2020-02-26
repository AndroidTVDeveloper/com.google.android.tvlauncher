package com.google.android.tvlauncher.notifications;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.tvlauncher.R;
import java.util.ArrayList;

/* compiled from: PG */
public class NotificationsTrayItemView extends LinearLayout {

    /* renamed from: a */
    public ImageView f6671a;

    /* renamed from: b */
    public ImageView f6672b;

    /* renamed from: c */
    public View f6673c;

    /* renamed from: d */
    public TextView f6674d;

    /* renamed from: e */
    public TextView f6675e;

    /* renamed from: f */
    public NotificationTrayButton f6676f;

    /* renamed from: g */
    public NotificationTrayButton f6677g;

    /* renamed from: h */
    public cyy f6678h;

    /* renamed from: i */
    public String f6679i;

    /* renamed from: j */
    public cfp f6680j;

    /* renamed from: k */
    private final ViewTreeObserver.OnGlobalFocusChangeListener f6681k = new cyu(this);

    public NotificationsTrayItemView(Context context) {
        super(context);
    }

    public NotificationsTrayItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NotificationsTrayItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (hasFocus() || !(i == 33 || i == 130 || i == 17)) {
            super.addFocusables(arrayList, i, i2);
        } else if (this.f6677g.getVisibility() == 0) {
            this.f6677g.addFocusables(arrayList, i, i2);
        } else {
            this.f6676f.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: a */
    public final void mo3451a(int i) {
        cfs cfs = new cfs(i, (byte) 0);
        cfs.mo2729b(dhs.f8555s);
        dja e = cfs.mo2732e();
        String str = this.f6678h.f7938c;
        if (e.f8673b) {
            e.mo4505b();
            e.f8673b = false;
        }
        dmu dmu = (dmu) e.f8672a;
        dmu dmu2 = dmu.f8870e;
        str.getClass();
        dmu.f8871a |= 1;
        dmu.f8872b = str;
        int c = cfs.m4665c(this.f6678h.f7944i);
        if (e.f8673b) {
            e.mo4505b();
            e.f8673b = false;
        }
        dmu dmu3 = (dmu) e.f8672a;
        if (c != 0) {
            dmu3.f8874d = c;
            dmu3.f8871a |= 4;
            if (!TextUtils.isEmpty(this.f6678h.f7939d)) {
                dja e2 = cfs.mo2732e();
                String str2 = this.f6678h.f7939d;
                if (e2.f8673b) {
                    e2.mo4505b();
                    e2.f8673b = false;
                }
                dmu dmu4 = (dmu) e2.f8672a;
                str2.getClass();
                dmu4.f8871a |= 2;
                dmu4.f8873c = str2;
            }
            this.f6680j.mo2714a(cfs);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.f6681k);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.f6681k);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6671a = (ImageView) findViewById(R.id.big_picture);
        this.f6672b = (ImageView) findViewById(R.id.small_icon);
        this.f6674d = (TextView) findViewById(R.id.notif_title);
        this.f6675e = (TextView) findViewById(R.id.notif_text);
        this.f6676f = (NotificationTrayButton) findViewById(R.id.tray_dismiss);
        this.f6677g = (NotificationTrayButton) findViewById(R.id.tray_see_more);
        this.f6673c = findViewById(R.id.now_playing_bars);
        setClipToOutline(true);
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (this.f6677g.getVisibility() == 0) {
            this.f6677g.requestFocus();
            return true;
        }
        this.f6676f.requestFocus();
        return true;
    }
}
