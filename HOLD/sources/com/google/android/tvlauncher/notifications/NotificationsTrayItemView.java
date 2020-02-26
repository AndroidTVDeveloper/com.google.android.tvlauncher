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
    public ImageView a;
    public ImageView b;
    public View c;
    public TextView d;
    public TextView e;
    public NotificationTrayButton f;
    public NotificationTrayButton g;
    public cyy h;
    public String i;
    public cfp j;
    private final ViewTreeObserver.OnGlobalFocusChangeListener k = new cyu(this);

    public NotificationsTrayItemView(Context context) {
        super(context);
    }

    public NotificationsTrayItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NotificationsTrayItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        if (hasFocus() || !(i2 == 33 || i2 == 130 || i2 == 17)) {
            super.addFocusables(arrayList, i2, i3);
        } else if (this.g.getVisibility() == 0) {
            this.g.addFocusables(arrayList, i2, i3);
        } else {
            this.f.addFocusables(arrayList, i2, i3);
        }
    }

    public final void a(int i2) {
        cfs cfs = new cfs(i2, (byte) 0);
        cfs.b(dhs.s);
        dja e2 = cfs.e();
        String str = this.h.c;
        if (e2.b) {
            e2.b();
            e2.b = false;
        }
        dmu dmu = (dmu) e2.a;
        dmu dmu2 = dmu.e;
        str.getClass();
        dmu.a |= 1;
        dmu.b = str;
        int c2 = cfs.c(this.h.i);
        if (e2.b) {
            e2.b();
            e2.b = false;
        }
        dmu dmu3 = (dmu) e2.a;
        if (c2 != 0) {
            dmu3.d = c2;
            dmu3.a |= 4;
            if (!TextUtils.isEmpty(this.h.d)) {
                dja e3 = cfs.e();
                String str2 = this.h.d;
                if (e3.b) {
                    e3.b();
                    e3.b = false;
                }
                dmu dmu4 = (dmu) e3.a;
                str2.getClass();
                dmu4.a |= 2;
                dmu4.c = str2;
            }
            this.j.a(cfs);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.k);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.k);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.big_picture);
        this.b = (ImageView) findViewById(R.id.small_icon);
        this.d = (TextView) findViewById(R.id.notif_title);
        this.e = (TextView) findViewById(R.id.notif_text);
        this.f = (NotificationTrayButton) findViewById(R.id.tray_dismiss);
        this.g = (NotificationTrayButton) findViewById(R.id.tray_see_more);
        this.c = findViewById(R.id.now_playing_bars);
        setClipToOutline(true);
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (this.g.getVisibility() == 0) {
            this.g.requestFocus();
            return true;
        }
        this.f.requestFocus();
        return true;
    }
}
