package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.tvlauncher.R;

/* renamed from: gm */
/* compiled from: PG */
final class C0177gm extends C0197hf implements C0181gq {

    /* renamed from: a */
    public final /* synthetic */ C0180gp f9401a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0177gm(C0180gp gpVar, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f9401a = gpVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        akr.m788a(this, getContentDescription());
        setOnTouchListener(new C0176gl(this, this));
    }

    /* renamed from: d */
    public final boolean mo751d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo752e() {
        return false;
    }

    public final boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.f9401a.mo5073e();
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
            C0045bq.m3944a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
