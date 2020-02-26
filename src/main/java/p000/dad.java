package p000;

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

/* renamed from: dad */
/* compiled from: PG */
public final class dad {

    /* renamed from: a */
    public final LinkedHashMap f8017a = new LinkedHashMap();

    /* renamed from: b */
    public final SparseArray f8018b = new SparseArray();

    /* renamed from: c */
    public final int f8019c;

    /* renamed from: d */
    public final int f8020d;

    /* renamed from: e */
    public final int f8021e;

    /* renamed from: f */
    public dav f8022f;

    /* renamed from: g */
    public dau f8023g;

    /* renamed from: h */
    public boolean f8024h;

    /* renamed from: i */
    private final LinearLayout f8025i;

    /* renamed from: j */
    private final Activity f8026j;

    /* renamed from: k */
    private final PopupWindow f8027k;

    /* renamed from: l */
    private final int f8028l;

    /* renamed from: m */
    private final int f8029m;

    /* renamed from: n */
    private final int f8030n;

    /* renamed from: o */
    private final dax f8031o;

    /* renamed from: p */
    private final ViewOutlineProvider f8032p;

    /* renamed from: q */
    private final View.OnFocusChangeListener f8033q = new czx();

    public dad(Activity activity) {
        this.f8026j = activity;
        Resources resources = activity.getResources();
        this.f8025i = (LinearLayout) ((LayoutInflater) this.f8026j.getSystemService("layout_inflater")).inflate((int) R.layout.accessibility_context_menu_container, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(this.f8025i, -1, -2);
        this.f8027k = popupWindow;
        popupWindow.setFocusable(true);
        this.f8027k.setOnDismissListener(new czy(this));
        this.f8028l = resources.getDimensionPixelSize(R.dimen.accessibility_context_menu_item_height);
        this.f8029m = resources.getDimensionPixelSize(R.dimen.accessibility_context_menu_item_width);
        this.f8030n = resources.getDimensionPixelSize(R.dimen.accessibility_context_menu_item_margin_end);
        this.f8019c = resources.getDimensionPixelSize(R.dimen.accessibility_context_menu_item_corner_radius);
        this.f8020d = this.f8026j.getColor(R.color.accessibility_context_menu_background_enabled_color);
        this.f8021e = this.f8026j.getColor(R.color.accessibility_context_menu_background_disabled_color);
        this.f8032p = new czz(this);
        this.f8031o = new daa(this);
    }

    /* renamed from: a */
    public final void mo4030a(day day) {
        this.f8017a.put(Integer.valueOf(day.f8117a), day);
    }

    /* renamed from: b */
    public final void mo4031b() {
        this.f8027k.dismiss();
    }

    /* renamed from: a */
    public final day mo4028a(int i) {
        return (day) this.f8017a.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo4029a() {
        int i;
        LayoutInflater layoutInflater = (LayoutInflater) this.f8026j.getSystemService("layout_inflater");
        this.f8025i.removeAllViews();
        for (Map.Entry value : this.f8017a.entrySet()) {
            day day = (day) value.getValue();
            day.f8123g = this.f8031o;
            LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate((int) R.layout.accessibility_context_menu_item, (ViewGroup) null);
            linearLayout.setOutlineProvider(this.f8032p);
            linearLayout.setClipToOutline(true);
            ((TextView) linearLayout.findViewById(R.id.title)).setText(day.f8118b);
            ImageView imageView = (ImageView) linearLayout.findViewById(R.id.icon);
            imageView.setImageTintList(linearLayout.getContext().getResources().getColorStateList(R.color.context_menu_icon_enabled_color, null));
            imageView.setImageDrawable(day.f8119c);
            linearLayout.setEnabled(day.f8120d);
            if (!day.f8120d) {
                i = this.f8021e;
            } else {
                i = this.f8020d;
            }
            linearLayout.setBackgroundColor(i);
            linearLayout.setOnFocusChangeListener(this.f8033q);
            linearLayout.setOnClickListener(new dac(this, day));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f8029m, this.f8028l);
            layoutParams.setMarginEnd(this.f8030n);
            this.f8018b.put(day.f8117a, linearLayout);
            this.f8025i.addView(linearLayout, layoutParams);
        }
        this.f8025i.setAccessibilityDelegate(new dab(this));
        this.f8027k.showAtLocation(this.f8026j.getWindow().getDecorView().getRootView(), 80, 0, 0);
        this.f8024h = true;
    }
}
