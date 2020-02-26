package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.tvlauncher.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: dad  reason: default package */
/* compiled from: PG */
public final class dad {
    public final LinkedHashMap a = new LinkedHashMap();
    public final SparseArray b = new SparseArray();
    public final int c;
    public final int d;
    public final int e;
    public dav f;
    public dau g;
    public boolean h;
    private final LinearLayout i;
    private final Activity j;
    private final PopupWindow k;
    private final int l;
    private final int m;
    private final int n;
    private final dax o;
    private final ViewOutlineProvider p;
    private final View.OnFocusChangeListener q = new czx();

    public dad(Activity activity) {
        this.j = activity;
        Resources resources = activity.getResources();
        this.i = (LinearLayout) ((LayoutInflater) this.j.getSystemService("layout_inflater")).inflate((int) R.layout.accessibility_context_menu_container, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(this.i, -1, -2);
        this.k = popupWindow;
        popupWindow.setFocusable(true);
        this.k.setOnDismissListener(new czy(this));
        this.l = resources.getDimensionPixelSize(R.dimen.accessibility_context_menu_item_height);
        this.m = resources.getDimensionPixelSize(R.dimen.accessibility_context_menu_item_width);
        this.n = resources.getDimensionPixelSize(R.dimen.accessibility_context_menu_item_margin_end);
        this.c = resources.getDimensionPixelSize(R.dimen.accessibility_context_menu_item_corner_radius);
        this.d = this.j.getColor(R.color.accessibility_context_menu_background_enabled_color);
        this.e = this.j.getColor(R.color.accessibility_context_menu_background_disabled_color);
        this.p = new czz(this);
        this.o = new daa(this);
    }

    public final void a(day day) {
        this.a.put(Integer.valueOf(day.a), day);
    }

    public final void b() {
        this.k.dismiss();
    }

    public final day a(int i2) {
        return (day) this.a.get(Integer.valueOf(i2));
    }

    public final void a() {
        int i2;
        LayoutInflater layoutInflater = (LayoutInflater) this.j.getSystemService("layout_inflater");
        this.i.removeAllViews();
        for (Map.Entry value : this.a.entrySet()) {
            day day = (day) value.getValue();
            day.g = this.o;
            LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate((int) R.layout.accessibility_context_menu_item, (ViewGroup) null);
            linearLayout.setOutlineProvider(this.p);
            linearLayout.setClipToOutline(true);
            ((TextView) linearLayout.findViewById(R.id.title)).setText(day.b);
            ImageView imageView = (ImageView) linearLayout.findViewById(R.id.icon);
            imageView.setImageTintList(linearLayout.getContext().getResources().getColorStateList(R.color.context_menu_icon_enabled_color, null));
            imageView.setImageDrawable(day.c);
            linearLayout.setEnabled(day.d);
            if (!day.d) {
                i2 = this.e;
            } else {
                i2 = this.d;
            }
            linearLayout.setBackgroundColor(i2);
            linearLayout.setOnFocusChangeListener(this.q);
            linearLayout.setOnClickListener(new dac(this, day));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.m, this.l);
            layoutParams.setMarginEnd(this.n);
            this.b.put(day.a, linearLayout);
            this.i.addView(linearLayout, layoutParams);
        }
        this.i.setAccessibilityDelegate(new dab(this));
        this.k.showAtLocation(this.j.getWindow().getDecorView().getRootView(), 80, 0, 0);
        this.h = true;
    }
}
