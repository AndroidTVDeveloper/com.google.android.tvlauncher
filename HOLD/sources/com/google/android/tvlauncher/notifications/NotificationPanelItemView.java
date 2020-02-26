package com.google.android.tvlauncher.notifications;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class NotificationPanelItemView extends LinearLayout {
    public RectF a;
    public int b;
    public int c;
    public ImageView d;
    public TextView e;
    public TextView f;
    public View g;
    public String h;
    public cyy i;
    public cfp j;
    public int k;
    public int l;
    public boolean m;
    public NotificationDismissButton n;
    public View o;
    public int p;
    private Paint q;
    private Paint r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;

    public NotificationPanelItemView(Context context) {
        super(context);
    }

    public NotificationPanelItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final View focusSearch(View view, int i2) {
        int layoutDirection = getResources().getConfiguration().getLayoutDirection();
        if (this.z) {
            if (view.getId() == R.id.main_container && this.m && i2 == 130) {
                return this.n;
            }
            if (view.getId() == R.id.dismiss_button && i2 == 33) {
                this.n.clearFocus();
                return this.g;
            }
        } else if (view.getId() == R.id.dismiss_button && ((layoutDirection == 1 && i2 == 66) || (layoutDirection != 1 && i2 == 17))) {
            return this.g;
        } else {
            if (view.getId() == R.id.main_container && (((layoutDirection == 1 && i2 == 17) || (layoutDirection != 1 && i2 == 66)) && this.m)) {
                return this.n;
            }
        }
        return super.focusSearch(view, i2);
    }

    public final void a(int i2) {
        cfs cfs = new cfs(i2, (byte) 0);
        cfs.b(dhs.s);
        dja e2 = cfs.e();
        String str = this.i.c;
        if (e2.b) {
            e2.b();
            e2.b = false;
        }
        dmu dmu = (dmu) e2.a;
        dmu dmu2 = dmu.e;
        str.getClass();
        dmu.a |= 1;
        dmu.b = str;
        int c2 = cfs.c(this.i.i);
        if (e2.b) {
            e2.b();
            e2.b = false;
        }
        dmu dmu3 = (dmu) e2.a;
        if (c2 != 0) {
            dmu3.d = c2;
            dmu3.a |= 4;
            if (!TextUtils.isEmpty(this.i.d)) {
                dja e3 = cfs.e();
                String str2 = this.i.d;
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
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i2 = this.c;
        if (i2 != 0) {
            float f2 = (((float) this.b) * 360.0f) / ((float) i2);
            if (!this.y) {
                canvas.drawArc(this.a, -90.0f, f2, false, this.q);
                canvas.drawArc(this.a, f2 - 0.049804688f, 360.0f - f2, false, this.r);
                return;
            }
            canvas.drawArc(this.a, -90.0f, -f2, false, this.q);
            canvas.drawArc(this.a, -90.0f, 360.0f - f2, false, this.r);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        boolean z2;
        super.onFinishInflate();
        this.d = (ImageView) findViewById(R.id.notification_icon);
        this.e = (TextView) findViewById(R.id.notification_title);
        this.f = (TextView) findViewById(R.id.notification_text);
        this.g = findViewById(R.id.main_container);
        this.o = findViewById(R.id.item_container);
        this.n = (NotificationDismissButton) findViewById(R.id.dismiss_button);
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.y = z2;
        this.z = dcy.b(getContext());
        Resources resources = getResources();
        this.s = resources.getDimensionPixelSize(R.dimen.notification_progress_stroke_width);
        this.w = resources.getColor(R.color.notification_progress_stroke_color, null);
        this.x = resources.getColor(R.color.notification_progress_stroke_max_color, null);
        this.t = resources.getDimensionPixelSize(R.dimen.notification_progress_circle_size);
        this.v = resources.getDimensionPixelOffset(R.dimen.notification_progress_circle_padding_top);
        this.u = resources.getDimensionPixelOffset(R.dimen.notification_progress_circle_padding_start);
        Paint paint = new Paint();
        this.q = paint;
        paint.setAntiAlias(true);
        this.q.setStyle(Paint.Style.STROKE);
        this.q.setColor(this.w);
        this.q.setStrokeWidth((float) this.s);
        this.k = resources.getDimensionPixelSize(R.dimen.notification_panel_item_text_width);
        Paint paint2 = new Paint();
        this.r = paint2;
        paint2.setAntiAlias(true);
        this.r.setStyle(Paint.Style.STROKE);
        this.r.setColor(this.x);
        this.r.setStrokeWidth((float) this.s);
        this.p = resources.getDimensionPixelSize(R.dimen.notification_panel_item_dismiss_focus_margin_start);
        this.g.setOnClickListener(new cxy(this));
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        super.onLayout(z2, i2, i3, i4, i5);
        RectF rectF = this.a;
        if (rectF != null) {
            int i8 = this.v;
            int i9 = this.t;
            int i10 = i8 + i9;
            if (this.y) {
                i6 = i4 - this.u;
                i7 = i6 - i9;
            } else {
                int i11 = this.u;
                int i12 = i11;
                i6 = i9 + i11;
                i7 = i12;
            }
            rectF.set((float) i7, (float) i8, (float) i6, (float) i10);
        }
    }
}
