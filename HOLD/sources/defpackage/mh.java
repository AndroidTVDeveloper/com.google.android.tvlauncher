package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

@Deprecated
/* renamed from: mh  reason: default package */
/* compiled from: PG */
public abstract class mh extends ma {
    public mh() {
        int i = Build.VERSION.SDK_INT;
        atc.a(this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = this.d.obtainStyledAttributes(null, rm.h, bg.a(this.d, (int) R.attr.preferenceFragmentStyle, 16844038), 0);
        this.e = obtainStyledAttributes.getResourceId(0, this.e);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(this.d);
        View inflate = cloneInContext.inflate(this.e, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView a = a(cloneInContext, viewGroup2);
            if (a != null) {
                this.c = a;
                a.a(this.a);
                qt qtVar = this.a;
                if (drawable != null) {
                    qtVar.b = drawable.getIntrinsicHeight();
                } else {
                    qtVar.b = 0;
                }
                qtVar.a = drawable;
                qtVar.d.c.p();
                if (dimensionPixelSize != -1) {
                    qt qtVar2 = this.a;
                    qtVar2.b = dimensionPixelSize;
                    qtVar2.d.c.p();
                }
                this.a.c = z;
                if (this.c.getParent() == null) {
                    viewGroup2.addView(this.c);
                }
                this.f.post(this.g);
                View inflate2 = LayoutInflater.from(inflate.getContext()).inflate((int) R.layout.leanback_preference_fragment, viewGroup, false);
                ViewGroup viewGroup3 = (ViewGroup) inflate2.findViewById(R.id.main_frame);
                if (inflate != null) {
                    viewGroup3.addView(inflate);
                }
                return inflate2;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        super.onViewCreated(view, bundle);
        CharSequence charSequence = b().q;
        View view2 = getView();
        if (view2 != null) {
            textView = (TextView) view2.findViewById(R.id.decor_title);
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
