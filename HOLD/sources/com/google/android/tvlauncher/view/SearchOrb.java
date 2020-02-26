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
    public View a;
    public int b;
    private float c;
    private ImageView d;
    private int e;

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
        this.a = inflate.findViewById(R.id.button_background);
        this.d = (ImageView) inflate.findViewById(R.id.search_icon);
        this.c = resources.getFraction(R.fraction.lb_search_orb_focused_zoom, 1, 1);
        this.e = bg.b(context, R.color.search_orb_bg_dim_color);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (hasFocus()) {
            this.a.setBackgroundColor(this.b);
            setScaleX(this.c);
            setScaleY(this.c);
            return;
        }
        this.a.setBackgroundColor(this.e);
        setScaleX(1.0f);
        setScaleY(1.0f);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a.setOutlineProvider(new ddo());
        this.a.setClipToOutline(true);
    }

    public final void a(Drawable drawable) {
        this.d.setImageDrawable(drawable);
    }
}
