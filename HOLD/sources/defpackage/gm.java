package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.tvlauncher.R;

/* renamed from: gm  reason: default package */
/* compiled from: PG */
final class gm extends hf implements gq {
    public final /* synthetic */ gp a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gm(gp gpVar, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.a = gpVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        akr.a(this, getContentDescription());
        setOnTouchListener(new gl(this, this));
    }

    public final boolean d() {
        return false;
    }

    public final boolean e() {
        return false;
    }

    public final boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.a.e();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            bq.a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
