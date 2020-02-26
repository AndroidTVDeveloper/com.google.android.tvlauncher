package com.google.android.tvlauncher.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class SearchOrb extends FrameLayout {

    /* renamed from: a */
    public View f6724a;

    /* renamed from: b */
    public int f6725b;

    /* renamed from: c */
    private float f6726c;

    /* renamed from: d */
    private ImageView f6727d;

    /* renamed from: e */
    private int f6728e;

    public SearchOrb(Context context) {
        this(context, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.tvlauncher.view.SearchOrb, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public SearchOrb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getContext().getResources();
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate((int) R.layout.search_orb_view, (ViewGroup) this, true);
        this.f6724a = inflate.findViewById(R.id.button_background);
        this.f6727d = (ImageView) inflate.findViewById(R.id.search_icon);
        this.f6726c = resources.getFraction(R.fraction.lb_search_orb_focused_zoom, 1, 1);
        this.f6728e = C0035bg.m3116b(context, R.color.search_orb_bg_dim_color);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3487a() {
        if (hasFocus()) {
            this.f6724a.setBackgroundColor(this.f6725b);
            setScaleX(this.f6726c);
            setScaleY(this.f6726c);
            return;
        }
        this.f6724a.setBackgroundColor(this.f6728e);
        setScaleX(1.0f);
        setScaleY(1.0f);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6724a.setOutlineProvider(new ddo());
        this.f6724a.setClipToOutline(true);
    }

    /* renamed from: a */
    public final void mo3488a(Drawable drawable) {
        this.f6727d.setImageDrawable(drawable);
    }
}
