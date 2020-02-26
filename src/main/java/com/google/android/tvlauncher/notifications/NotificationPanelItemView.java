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

    /* renamed from: a */
    public RectF f6611a;

    /* renamed from: b */
    public int f6612b;

    /* renamed from: c */
    public int f6613c;

    /* renamed from: d */
    public ImageView f6614d;

    /* renamed from: e */
    public TextView f6615e;

    /* renamed from: f */
    public TextView f6616f;

    /* renamed from: g */
    public View f6617g;

    /* renamed from: h */
    public String f6618h;

    /* renamed from: i */
    public cyy f6619i;

    /* renamed from: j */
    public cfp f6620j;

    /* renamed from: k */
    public int f6621k;

    /* renamed from: l */
    public int f6622l;

    /* renamed from: m */
    public boolean f6623m;

    /* renamed from: n */
    public NotificationDismissButton f6624n;

    /* renamed from: o */
    public View f6625o;

    /* renamed from: p */
    public int f6626p;

    /* renamed from: q */
    private Paint f6627q;

    /* renamed from: r */
    private Paint f6628r;

    /* renamed from: s */
    private int f6629s;

    /* renamed from: t */
    private int f6630t;

    /* renamed from: u */
    private int f6631u;

    /* renamed from: v */
    private int f6632v;

    /* renamed from: w */
    private int f6633w;

    /* renamed from: x */
    private int f6634x;

    /* renamed from: y */
    private boolean f6635y;

    /* renamed from: z */
    private boolean f6636z;

    public NotificationPanelItemView(Context context) {
        super(context);
    }

    public NotificationPanelItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final View focusSearch(View view, int i) {
        int layoutDirection = getResources().getConfiguration().getLayoutDirection();
        if (this.f6636z) {
            if (view.getId() == R.id.main_container && this.f6623m && i == 130) {
                return this.f6624n;
            }
            if (view.getId() == R.id.dismiss_button && i == 33) {
                this.f6624n.clearFocus();
                return this.f6617g;
            }
        } else if (view.getId() == R.id.dismiss_button && ((layoutDirection == 1 && i == 66) || (layoutDirection != 1 && i == 17))) {
            return this.f6617g;
        } else {
            if (view.getId() == R.id.main_container && (((layoutDirection == 1 && i == 17) || (layoutDirection != 1 && i == 66)) && this.f6623m)) {
                return this.f6624n;
            }
        }
        return super.focusSearch(view, i);
    }

    /* renamed from: a */
    public final void mo3436a(int i) {
        cfs cfs = new cfs(i, (byte) 0);
        cfs.mo2729b(dhs.f8555s);
        dja e = cfs.mo2732e();
        String str = this.f6619i.f7938c;
        if (e.f8673b) {
            e.mo4505b();
            e.f8673b = false;
        }
        dmu dmu = (dmu) e.f8672a;
        dmu dmu2 = dmu.f8870e;
        str.getClass();
        dmu.f8871a |= 1;
        dmu.f8872b = str;
        int c = cfs.m4665c(this.f6619i.f7944i);
        if (e.f8673b) {
            e.mo4505b();
            e.f8673b = false;
        }
        dmu dmu3 = (dmu) e.f8672a;
        if (c != 0) {
            dmu3.f8874d = c;
            dmu3.f8871a |= 4;
            if (!TextUtils.isEmpty(this.f6619i.f7939d)) {
                dja e2 = cfs.mo2732e();
                String str2 = this.f6619i.f7939d;
                if (e2.f8673b) {
                    e2.mo4505b();
                    e2.f8673b = false;
                }
                dmu dmu4 = (dmu) e2.f8672a;
                str2.getClass();
                dmu4.f8871a |= 2;
                dmu4.f8873c = str2;
            }
            this.f6620j.mo2714a(cfs);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f6613c;
        if (i != 0) {
            float f = (((float) this.f6612b) * 360.0f) / ((float) i);
            if (!this.f6635y) {
                canvas.drawArc(this.f6611a, -90.0f, f, false, this.f6627q);
                canvas.drawArc(this.f6611a, f - 0.049804688f, 360.0f - f, false, this.f6628r);
                return;
            }
            canvas.drawArc(this.f6611a, -90.0f, -f, false, this.f6627q);
            canvas.drawArc(this.f6611a, -90.0f, 360.0f - f, false, this.f6628r);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        boolean z;
        super.onFinishInflate();
        this.f6614d = (ImageView) findViewById(R.id.notification_icon);
        this.f6615e = (TextView) findViewById(R.id.notification_title);
        this.f6616f = (TextView) findViewById(R.id.notification_text);
        this.f6617g = findViewById(R.id.main_container);
        this.f6625o = findViewById(R.id.item_container);
        this.f6624n = (NotificationDismissButton) findViewById(R.id.dismiss_button);
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f6635y = z;
        this.f6636z = dcy.m6193b(getContext());
        Resources resources = getResources();
        this.f6629s = resources.getDimensionPixelSize(R.dimen.notification_progress_stroke_width);
        this.f6633w = resources.getColor(R.color.notification_progress_stroke_color, null);
        this.f6634x = resources.getColor(R.color.notification_progress_stroke_max_color, null);
        this.f6630t = resources.getDimensionPixelSize(R.dimen.notification_progress_circle_size);
        this.f6632v = resources.getDimensionPixelOffset(R.dimen.notification_progress_circle_padding_top);
        this.f6631u = resources.getDimensionPixelOffset(R.dimen.notification_progress_circle_padding_start);
        Paint paint = new Paint();
        this.f6627q = paint;
        paint.setAntiAlias(true);
        this.f6627q.setStyle(Paint.Style.STROKE);
        this.f6627q.setColor(this.f6633w);
        this.f6627q.setStrokeWidth((float) this.f6629s);
        this.f6621k = resources.getDimensionPixelSize(R.dimen.notification_panel_item_text_width);
        Paint paint2 = new Paint();
        this.f6628r = paint2;
        paint2.setAntiAlias(true);
        this.f6628r.setStyle(Paint.Style.STROKE);
        this.f6628r.setColor(this.f6634x);
        this.f6628r.setStrokeWidth((float) this.f6629s);
        this.f6626p = resources.getDimensionPixelSize(R.dimen.notification_panel_item_dismiss_focus_margin_start);
        this.f6617g.setOnClickListener(new cxy(this));
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.f6611a;
        if (rectF != null) {
            int i7 = this.f6632v;
            int i8 = this.f6630t;
            int i9 = i7 + i8;
            if (this.f6635y) {
                i5 = i3 - this.f6631u;
                i6 = i5 - i8;
            } else {
                int i10 = this.f6631u;
                int i11 = i10;
                i5 = i8 + i10;
                i6 = i11;
            }
            rectF.set((float) i6, (float) i7, (float) i5, (float) i9);
        }
    }
}
